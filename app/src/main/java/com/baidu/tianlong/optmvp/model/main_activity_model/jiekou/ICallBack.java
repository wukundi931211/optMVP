package com.baidu.tianlong.optmvp.model.main_activity_model.jiekou;

import com.baidu.tianlong.optmvp.model.main_activity_model.beans.Comment;

import java.util.List;

public interface ICallBack {
    /**
     * 数据请求成功
     */
        void success(List<Comment> data);
    /**
     * 数据请求失败
      */
        void error(String msg);
}
