package com.example.zll.quer;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;

/**
 * Created by zll on 2018/7/23.
 */

public class SlidingMenuView extends ViewGroup {
    private View leftMenu;
    private View mainContent;
    private int leftMenu_width;
    private int dx;
    private float mDownX;
    private boolean isOpenLeftMenu = false;
    //左侧菜单打开状态
    private Scroller scroller;
    private float downX;
    private float downY;

    public SlidingMenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        scroller = new Scroller(getContext());
    }

    public SlidingMenuView(Context context) {
        this(context, null);
    }

    //布局解析完成的回调
    @Override
    protected void onFinishInflate() {
        //取到子控件 根据索引获取
        leftMenu = getChildAt(0);
        mainContent = getChildAt(1);

        //获得左侧菜单的宽度
        leftMenu_width =  leftMenu.getLayoutParams().width; //布局参数
        super.onFinishInflate();
    }

    // 测量并设置控件宽高
    //widthMeasureSpec当前控件(smv)宽度测量规则
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //主内容的测量
        mainContent.measure(widthMeasureSpec, heightMeasureSpec);

        //测量左面板的宽高    宽度是不带模式的值
        //宽是固定值200
        int leftMenuWidthmakeMeasureSpec = MeasureSpec.makeMeasureSpec(leftMenu_width, MeasureSpec.EXACTLY);//尺寸  模式精确测量
        leftMenu.measure(leftMenuWidthmakeMeasureSpec, heightMeasureSpec);

        //设置view的宽高  两个参数不带模式  只要大小
        setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.getSize(heightMeasureSpec));
    }

    // 布局子控件
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        dx = 0; //测试屏幕 平移长度

        //摆放主内容的位置
        int mainLeft = 0 + dx;
        int mainTop = 0;
        int mainRight = mainContent.getMeasuredWidth() + dx;
        int mainBottom = mainContent.getMeasuredHeight();
        mainContent.layout(mainLeft, mainTop, mainRight, mainBottom);

        //摆放左侧菜单的位置
        int menuLeft = - leftMenu.getMeasuredWidth() + dx;
        int menuTop = 0;
        int menuRight = 0 + dx;
        int menuBottom = leftMenu.getMeasuredHeight();
        leftMenu.layout(menuLeft, menuTop, menuRight, menuBottom);
    }

    // 绘制
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    //分发事件
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downX = ev.getX();
                downY = ev.getY();
                break;
            case MotionEvent.ACTION_UP:
                float upX = ev.getX();
                float upY = ev.getY();
                if((Math.abs(downX - upX) < 5) && (Math.abs(downY - upY) < 5)){
                    //是点击 不是滑动
                    //如果左侧菜单是打开的 则关闭左侧菜单
                    if (isOpenLeftMenu && upY>65 && upX>leftMenu.getMeasuredWidth()){
                        isOpenLeftMenu = false;
                        animationTo();
                        return true; // 不分发事件
                    }
                    //条件不成立分发事件
                }

                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    //拦截事件
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//		 如果是横向滑动 拦截左侧菜单孩子的事件  纵向滑动不拦截
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downX = ev.getX();
                downY = ev.getY();
                mDownX = downX;
                break;

            case MotionEvent.ACTION_MOVE:
                float moveX = ev.getX();
                float moveY = ev.getY();
                //判断是横向还是纵向滑动
                if(Math.abs(moveX - downX) > Math.abs(moveY - downY)){ //横向移动长度大于纵向移动长度就是横向移动
                    //横向滑动  拦截子控件的事件
                    return true;
                }
            default:
                break;
        }
        return false;//纵向移动不拦截子控件的事件
    }

    //触摸事件
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN://按下
                mDownX = event.getX();
                break;
            case MotionEvent.ACTION_MOVE:{//滑动
                float mMoveX = event.getX();//当前坐标
                int dx = Math.round(mMoveX - mDownX); //四舍五入  滑动的长度
                int screenX = getScrollX(); //获得当前屏幕的左边 位置  left

                //左边越界的判断
                if(screenX + -dx < -leftMenu.getMeasuredWidth()){
                    //左侧菜单完全显示
                    scrollTo(-leftMenu.getMeasuredWidth() , 0);
                }
                //右边界的判断
                else if(screenX + -dx > 0){
                    scrollTo(0 , 0);
                }
                else{
                    scrollBy(-dx,0); //因为往右滑 屏幕要往左移  往左是负的x轴 要取反
                }
                mDownX = mMoveX; //更新按下坐标
//			scrollTo(x, y); //绝对值
//			scrollBy(x,y);  //相对值
                break;

            }
            case MotionEvent.ACTION_UP://抬起
                int screenX = getScrollX();
                //判断screenX在左侧菜单的哪一半
                //左半 显示菜单
                if(screenX < -leftMenu.getMeasuredWidth() / 2){
                    isOpenLeftMenu = true;
//				scrollTo(-leftMenu.getMeasuredWidth() , 0);
                }
                //右半(包含) 不显示菜单
                else if(screenX >= -leftMenu.getMeasuredWidth() / 2){
                    isOpenLeftMenu = false;
//				scrollTo(0 , 0);
                }
                animationTo();
                break;
            default:
                break;
        }

        return true; // 消费
    }

    //弹性滑动   避免生硬的效果
    private void animationTo(){
        int startX = getScrollX(); //开始位置 当前位置
        int startY = 0;
        int endX = 0;
        if(isOpenLeftMenu){
            endX = -leftMenu.getMeasuredWidth();
        }else{
            endX = 0;
        }
        int dx = endX - startX; //平移长度
        int dy = 0;
        int duration = 500;
        scroller.startScroll(startX, startY, dx, dy, duration);
        invalidate(); //刷新界面 调用draw
        //必须重写computeScroll方法 才能实现弹性滑动
    }

    //必须实现  才能实现弹性滑动
    @Override
    public void computeScroll() {
        if(scroller.computeScrollOffset()){
            int currX = scroller.getCurrX();
            //让屏幕不停地移动到currX
            scrollTo(currX, 0);
            invalidate();//调用draw 刷新界面
        }
    }

    //提供点击图片开关的方法
    public void toggle() {
        //取反 如果开就关 关就开
        isOpenLeftMenu = !isOpenLeftMenu;
        animationTo();
    }
}
