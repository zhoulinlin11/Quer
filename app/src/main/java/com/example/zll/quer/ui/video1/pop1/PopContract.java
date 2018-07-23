package com.example.zll.quer.ui.video1.pop1;

import com.example.zll.quer.bean.PopBean;
import com.example.zll.quer.ui.base.BaseContract;

/**
 * Created by zll on 2018/7/19.
 */

public interface PopContract {
    interface View extends BaseContract.BaseView{
        void popview(PopBean popBean);
    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void popPresenter();
    }
}
