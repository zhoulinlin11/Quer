package com.example.zll.quer;

import com.example.zll.quer.ui.video1.pop1.PopFragment;
import com.example.zll.quer.module.HttpModule;
import com.example.zll.quer.ui.cross.CrossFragment;
import com.example.zll.quer.ui.recom.hot.HotFragment;

import dagger.Component;

/**
 * Created by zll on 2018/7/17.
 */
@Component(modules = HttpModule.class)
public interface Penoent {
    void inject(HotFragment hotFragment);
    void inject(CrossFragment crossFragment);
    void inject(PopFragment popFragment);
}
