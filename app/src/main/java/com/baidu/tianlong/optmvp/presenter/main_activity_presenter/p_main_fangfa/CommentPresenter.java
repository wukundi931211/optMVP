package com.baidu.tianlong.optmvp.presenter.main_activity_presenter.p_main_fangfa;


import com.baidu.tianlong.optmvp.model.main_activity_model.beans.Comment;
import com.baidu.tianlong.optmvp.model.main_activity_model.fangfa.CommentTask;
import com.baidu.tianlong.optmvp.model.main_activity_model.jiekou.ICallBack;
import com.baidu.tianlong.optmvp.presenter.main_activity_presenter.p_main_jiekou.ICommentPresenter;
import com.baidu.tianlong.optmvp.view.main_activity.CommentActivity;
import com.baidu.tianlong.optmvp.view.main_activity.ICommentView;

import java.util.List;

public class CommentPresenter implements ICommentPresenter{
    /**
     * 实现p层中的接口是为了时间   获得数据请求的方法 并且处理内存溢出
     */

    /**
     * 注入model 注入方法包中的 CommentTask的类 此类是为了解析
     */
    CommentTask task;

    /**
     * 注入view层中的接口
     */
    ICommentView view;


    public CommentPresenter(CommentActivity activity) {
        task = new CommentTask();
        view = activity;
    }

    /**
     * 获得评论列表
     */
    @Override
    public void getCommentList() {
        task.getCommentList("http://39.108.3.12:3000/v1/comment?restaurant_id=32&offset=0&limit=10", new ICallBack() {
            @Override
            public void success(List<Comment> data) {
                //判断视图
                if (view !=null){
                    view.showData(data);
                }
            }

            @Override
            public void error(String msg) {
                if (view!=null){
                    view.showerror(msg);
                }
            }
        });
    }

    @Override
    public void start() {

    }

    @Override
    public void onDestory() {
        view=null;
    }
}
