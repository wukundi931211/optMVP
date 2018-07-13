package com.baidu.tianlong.optmvp.view.main_activity;

import com.baidu.tianlong.optmvp.BaseView;
import com.baidu.tianlong.optmvp.model.main_activity_model.beans.Comment;
import com.baidu.tianlong.optmvp.presenter.main_activity_presenter.p_main_fangfa.CommentPresenter;

import java.util.List;

public interface ICommentView extends BaseView<CommentPresenter>{
    /**
     * 主要起到展示数据的作用
     */
    void showData(List<Comment> list);

    /**
     * 展示失败
     */
    void showerror(String string);
}
