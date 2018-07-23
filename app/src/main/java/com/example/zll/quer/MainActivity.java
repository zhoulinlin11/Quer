package com.example.zll.quer;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.zll.quer.fragment.FunFragment;
import com.example.zll.quer.fragment.RecomFragment;
import com.example.zll.quer.fragment.VideoFragment;
import com.example.zll.quer.ui.cross.CrossFragment;


public class MainActivity extends AppCompatActivity {

    /**
     * 推荐
     */
    private TextView mTitle;
    private FrameLayout mFragment;
    private SlidingMenuView smv;
    /**
     * 推荐
     */
    private RadioButton mRecom;
    /**
     * 段子
     */
    private RadioButton mCross;
    /**
     * 视频
     */
    private RadioButton mVideo;
    /**
     * 趣图
     */
    private RadioButton mFunny;
    private RadioGroup mGroup;
    private ImageView xia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        inageback();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new RecomFragment()).commit();
        mGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.recom:
                        inageback();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new RecomFragment()).commit();

                        break;
                    case R.id.cross:
                        inageback();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new CrossFragment()).commit();

                        break;
                    case R.id.video:
                        inageback();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new VideoFragment()).commit();

                        break;
                    case R.id.funny:
                        inageback();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new FunFragment()).commit();

                        break;
                }
            }
        });

    }

    private void inageback() {
        //推荐
        if (mRecom.isChecked()){
            Drawable recommendDrawable = getResources().getDrawable( R.mipmap.raw_1500085367 );
            recommendDrawable.setBounds( 0, 5, 50, 55 );
            mRecom.setCompoundDrawables(null, recommendDrawable, null, null);
        }else{
            Drawable recommendDrawable = getResources().getDrawable( R.mipmap.raw_1500083878);
            recommendDrawable.setBounds( 0, 5, 50, 55 );
            mRecom.setCompoundDrawables(null, recommendDrawable, null, null);
        }
        //段子
        if (mCross.isChecked()){
            Drawable recommendDrawable = getResources().getDrawable( R.mipmap.raw_1500085899 );
            recommendDrawable.setBounds( 0, 5, 50, 55 );
            mCross.setCompoundDrawables(null, recommendDrawable, null, null);
        }else{
            Drawable recommendDrawable = getResources().getDrawable( R.mipmap.raw_1500085327 );
            recommendDrawable.setBounds( 0, 5, 50, 55 );
            mCross.setCompoundDrawables(null, recommendDrawable, null, null);
        }
        //视频
        if (mVideo.isChecked()){
            Drawable recommendDrawable = getResources().getDrawable( R.mipmap.raw_1500086067 );
            recommendDrawable.setBounds( 0, 5, 50, 55 );
            mVideo.setCompoundDrawables(null, recommendDrawable, null, null);
        }else{
            Drawable recommendDrawable = getResources().getDrawable( R.mipmap.raw_1500083686);
            recommendDrawable.setBounds( 0, 5, 50, 55 );
            mVideo.setCompoundDrawables(null, recommendDrawable, null, null);
        }
        //趣闻
        if (mFunny.isChecked()){
            Drawable recommendDrawable = getResources().getDrawable( R.mipmap.pic2 );
            recommendDrawable.setBounds( 0, 5, 50, 55 );
            mFunny.setCompoundDrawables(null, recommendDrawable, null, null);
        }else{
            Drawable recommendDrawable = getResources().getDrawable( R.mipmap.pic );
            recommendDrawable.setBounds( 0, 5, 50, 55 );
            mFunny.setCompoundDrawables(null, recommendDrawable, null, null);
        }

    }

    private void initView() {
        mTitle = (TextView) findViewById(R.id.title);
        mFragment = (FrameLayout) findViewById(R.id.fragment);
        mRecom = (RadioButton) findViewById(R.id.recom);
        mCross = (RadioButton) findViewById(R.id.cross);
        mVideo = (RadioButton) findViewById(R.id.video);
        mFunny = (RadioButton) findViewById(R.id.funny);
        mGroup = (RadioGroup) findViewById(R.id.group);
        smv = (SlidingMenuView) findViewById(R.id.smv_test);
        xia = (ImageView) findViewById(R.id.xia);
        xia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),WriteActivity.class);
                startActivity(intent);

            }
        });
    }
    public void onToggle(View v) {
        smv.toggle();
    }
}

