package com.example.zll.quer.ui.recom.hot;

import com.example.zll.quer.bean.RecomBean;
import com.example.zll.quer.ui.base.BaseContract;

/**
 * Created by zll on 2018/7/17.
 */

public interface HotContract {
    interface View extends BaseContract.BaseView{
        void hotView(RecomBean recomBean);
    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void hotPresenter();
    }
}
