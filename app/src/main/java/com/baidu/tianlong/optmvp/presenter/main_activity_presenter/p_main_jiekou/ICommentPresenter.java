package com.baidu.tianlong.optmvp.presenter.main_activity_presenter.p_main_jiekou;

import com.baidu.tianlong.optmvp.BasePresenter;

/**
 * P层处理接口  继承处理接口的  泛型的内存溢出
 */
public interface ICommentPresenter extends BasePresenter{
    //处理接口的业务
        void getCommentList();
}
