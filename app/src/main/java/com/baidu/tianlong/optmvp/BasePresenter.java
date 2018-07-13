package com.baidu.tianlong.optmvp;

public interface BasePresenter {
    /**
     * 开始执行
     */
    void start();

    /**
     * 销毁正在的操作，防止内存泄漏
     */
    void onDestory();
}
