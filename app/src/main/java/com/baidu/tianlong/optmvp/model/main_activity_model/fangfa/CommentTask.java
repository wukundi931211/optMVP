package com.baidu.tianlong.optmvp.model.main_activity_model.fangfa;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.baidu.tianlong.optmvp.App;
import com.baidu.tianlong.optmvp.model.main_activity_model.beans.Comment;
import com.baidu.tianlong.optmvp.model.main_activity_model.beans.RootData;
import com.baidu.tianlong.optmvp.model.main_activity_model.jiekou.ICallBack;
import com.baidu.tianlong.optmvp.model.main_activity_model.jiekou.ICommentTask;
import com.google.gson.Gson;

import java.lang.reflect.Type;

import ikidou.reflect.TypeBuilder;

public class CommentTask implements ICommentTask {
    /**
     * 实现接口是为了 获得此接口的中的方法 进行解析
     * @param url
     * @param callBack
     */
    @Override
    public void getCommentList(String url, final ICallBack callBack) {
        //添加队列
        RequestQueue queue = Volley.newRequestQueue(App.context);
        //请求解析的方法
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            //成功的方法
            @Override
            public void onResponse(String response) {
                /**
                 * fromJsonArray() 解析泛型数据
                 */
                RootData<Comment> data = fromJsonArray(response,Comment.class);
                callBack.success(data.data);
            }


            //失败的方法
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.error(error.getMessage());
            }
        });

        //队列添加结果
        queue.add(request);
    }

    /**
     * 解析泛型类
     * @param reader
     * @param clazz
     * @param <T>
     * @return
     */
    private static  <T> RootData<T> fromJsonArray(String reader , Class<T> clazz) {
        Type type = TypeBuilder
                .newInstance(RootData.class)
                .addTypeParam(clazz)
                .build();

        return new Gson().fromJson(reader,type);
    }
}
