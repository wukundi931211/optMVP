package com.baidu.tianlong.optmvp.view.main_activity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.baidu.tianlong.optmvp.model.main_activity_model.beans.Comment;
import com.baidu.tianlong.optmvp.view.main_activity.CommentActivity;

import java.util.ArrayList;
import java.util.List;

public class CommentAdapter extends BaseAdapter {

    private List<Comment> comments;
    private Context context;
    //定义条目类型
    private static final int TYPR_TEXT = 0;
    private static final int TYPR_TEXT_IMAGE = 1;
    //条目类型总数
    private static final int TYPR_COUNT = 2;


    //

    public CommentAdapter(Context context) {
       comments = new ArrayList<>();
        this.context = context;
    }

    @Override
    public int getCount() {
        return comments.size();
    }

    @Override
    public Comment getItem(int i) {
        return comments.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }


    /**
     * 定义只是文字的的 条目 TYPR_TEXT
     */
    static class ViewHolder{

    }
}
