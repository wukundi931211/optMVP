package com.baidu.tianlong.optmvp.contract;

import com.baidu.tianlong.optmvp.BasePresenter;
import com.baidu.tianlong.optmvp.BaseView;
import com.baidu.tianlong.optmvp.model.main_activity_model.beans.Comment;
import com.baidu.tianlong.optmvp.presenter.main_activity_presenter.p_main_fangfa.CommentPresenter;

import java.util.List;
/**
 *  一个合约
 */
public interface CommentContract  {

    //p层获得 m层的方法 并继承基类
    public interface ICommentPresenter extends BasePresenter{
        void getCommentList();
    }




    //view层的接口获得基类
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
}
