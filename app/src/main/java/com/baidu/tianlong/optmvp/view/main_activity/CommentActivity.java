package com.baidu.tianlong.optmvp.view.main_activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.baidu.tianlong.optmvp.R;
import com.baidu.tianlong.optmvp.model.main_activity_model.beans.Comment;
import com.baidu.tianlong.optmvp.presenter.main_activity_presenter.p_main_fangfa.CommentPresenter;
import com.baidu.tianlong.optmvp.view.main_activity.adapter.CommentAdapter;

import java.util.List;

public class CommentActivity extends AppCompatActivity implements ICommentView{
    //实例化p层的类
    CommentPresenter presenter;
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        //实例化类
       setPresenter(new CommentPresenter(this));
       presenter.getCommentList();
    }

    @Override
    public void showData(List<Comment> list) {
        //TODO  处理列表

        CommentAdapter adapter = new CommentAdapter(CommentActivity.this);
    }

    /**
     *网络请求错误的时候执行
     * @param string
     */
    @Override
    public void showerror(String string) {
        //TODO 弹出错误信息
    }

    /**
     * 注入p层是为了处理数据
     * @param presenter
     */
    @Override
    public void setPresenter(CommentPresenter presenter) {
        this.presenter = presenter;
    }
}
