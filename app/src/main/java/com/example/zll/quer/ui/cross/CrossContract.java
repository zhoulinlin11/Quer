package com.example.zll.quer.ui.cross;

import com.example.zll.quer.bean.CrossBean;
import com.example.zll.quer.ui.base.BaseContract;

/**
 * Created by zll on 2018/7/18.
 */

public interface CrossContract {
    interface View extends BaseContract.BaseView{
        void getCrossView(CrossBean crossBean);
    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void getCrossPresenter();
    }
}
