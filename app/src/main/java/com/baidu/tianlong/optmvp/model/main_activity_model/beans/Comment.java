package com.baidu.tianlong.optmvp.model.main_activity_model.beans;

import java.util.List;

public class Comment {

        /**
         * user_id : 619
         * id : 47
         * user_name : liqingyi
         * avatar : http://i.waimai.meituan.com/static/img/default-avatar.png
         * restaurant_id : 32
         * restaurant : 5ac5af803714cc2d644f4615
         * comment_data : 好吃
         * order_id : 1124
         * food_score : 5
         * delivery_score : 4
         * pic_url : ["http://p3d0ne50u.bkt.clouddn.com/Fqf4rSKo6G1jztqSjartcu32XGIB"]
         * add_comment_list : []
         * comment_time : 2018-06-22T07:28:12.115Z
         * __v : 0
         * quality_score : 0
         * pack_score : 0
         */
        public int user_id;
        public int id;
        public String user_name;
        public String avatar;
        public int restaurant_id;
        public String restaurant;
        public String comment_data;
        public int order_id;
        public int food_score;
        public int delivery_score;
        public String comment_time;
        public int __v;
        public List<String> pic_url;


        @Override
        public String toString() {
                return "Comment{" +
                        "user_id=" + user_id +
                        ", id=" + id +
                        ", user_name='" + user_name + '\'' +
                        ", avatar='" + avatar + '\'' +
                        ", restaurant_id=" + restaurant_id +
                        ", restaurant='" + restaurant + '\'' +
                        ", comment_data='" + comment_data + '\'' +
                        ", order_id=" + order_id +
                        ", food_score=" + food_score +
                        ", delivery_score=" + delivery_score +
                        ", comment_time='" + comment_time + '\'' +
                        ", __v=" + __v +
                        ", pic_url=" + pic_url +
                        '}';
        }
}
