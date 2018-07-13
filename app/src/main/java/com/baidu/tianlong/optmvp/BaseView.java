package com.baidu.tianlong.optmvp;

/**
 *
 */
public interface BaseView<T> {

    /**
     * 基类
     * P 注入V层
     * @param presenter
     */
    void setPresenter(T presenter);
}
