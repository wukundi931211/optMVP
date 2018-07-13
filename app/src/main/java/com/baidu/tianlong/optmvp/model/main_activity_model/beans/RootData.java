package com.baidu.tianlong.optmvp.model.main_activity_model.beans;

import java.util.List;

public class RootData<T> {

    /**
     * status : 200
     * message : 获取餐馆评论成功
     * data : [{"user_id":619,"id":47,"user_name":"liqingyi","avatar":"http://i.waimai.meituan.com/static/img/default-avatar.png","restaurant_id":32,"restaurant":"5ac5af803714cc2d644f4615","comment_data":"好吃","order_id":1124,"food_score":5,"delivery_score":4,"pic_url":["http://p3d0ne50u.bkt.clouddn.com/Fqf4rSKo6G1jztqSjartcu32XGIB"],"add_comment_list":[],"comment_time":"2018-06-22T07:28:12.115Z","__v":0},{"user_id":619,"id":49,"user_name":"liqingyi","avatar":"http://p3d0ne50u.bkt.clouddn.com/FgvpNPVOwELIkOJ483m-QOL1DhES","restaurant_id":32,"restaurant":"5ac5af803714cc2d644f4615","comment_data":"口味特别好，下次还来","order_id":1209,"food_score":4,"delivery_score":4,"pic_url":["http://p3d0ne50u.bkt.clouddn.com/FmImU7t-oQPPVAk8LLJPuf28Hk85","http://p3d0ne50u.bkt.clouddn.com/FoxlpA3TlhlufRtMzU0A9g9clQIq","http://p3d0ne50u.bkt.clouddn.com/FmpDDnDvJm7xkjoOXgqmoZSeDuP2"],"add_comment_list":[],"comment_time":"2018-06-22T07:28:12.115Z","__v":0},{"user_id":227,"id":29,"user_name":"jjjjj","avatar":"http://i.waimai.meituan.com/static/img/default-avatar.png","restaurant_id":32,"restaurant":"5ac5af803714cc2d644f4615","comment_data":"摸摸","order_id":375,"food_score":4,"delivery_score":4,"pic_url":["http://p3d0ne50u.bkt.clouddn.com/FrmvnNe2aXy7iMKLMeuK1JxnDwXT"],"add_comment_list":[],"comment_time":"2018-04-10T04:42:51.012Z","__v":0},{"user_id":324,"id":30,"user_name":"18037166365","avatar":"http://i.waimai.meituan.com/static/img/default-avatar.png","restaurant_id":32,"restaurant":"5ac5af803714cc2d644f4615","comment_data":"九年级可能加","order_id":471,"food_score":4,"delivery_score":4,"pic_url":[],"add_comment_list":[],"comment_time":"2018-04-10T04:42:51.012Z","__v":0},{"user_id":448,"id":32,"user_name":"993986077","avatar":"http://i.waimai.meituan.com/static/img/default-avatar.png","restaurant_id":32,"restaurant":"5ac5af803714cc2d644f4615","comment_data":"日发的方式发的撒饭阿萨","order_id":647,"food_score":5,"delivery_score":5,"pic_url":[],"add_comment_list":[],"comment_time":"2018-04-10T04:42:51.012Z","__v":0},{"user_id":360,"id":33,"user_name":"kkjh","avatar":"http://p3d0ne50u.bkt.clouddn.com/Fo0_vp5C4EThie4WBm9z9QMACC0A","restaurant_id":32,"restaurant":"5ac5af803714cc2d644f4615","comment_data":"损公肥私","order_id":656,"food_score":3,"delivery_score":5,"pic_url":["http://p3d0ne50u.bkt.clouddn.com/Fo0_vp5C4EThie4WBm9z9QMACC0A"],"add_comment_list":[],"comment_time":"2018-04-10T04:42:51.012Z","__v":0},{"user_id":483,"id":36,"user_name":"liuluwei","avatar":"http://i.waimai.meituan.com/static/img/default-avatar.png","restaurant_id":32,"restaurant":"5ac5af803714cc2d644f4615","comment_data":"好吃","order_id":716,"food_score":5,"delivery_score":5,"pic_url":[],"add_comment_list":[],"comment_time":"2018-04-10T04:42:51.012Z","__v":0},{"user_id":522,"id":42,"user_name":"admin666","avatar":"http://p3d0ne50u.bkt.clouddn.com/Fpw9yx-RhaMU6iXVGu07WIGzL0IM","restaurant_id":32,"restaurant":"5ac5af803714cc2d644f4615","comment_data":"666","order_id":850,"food_score":5,"delivery_score":5,"pic_url":[],"add_comment_list":[],"comment_time":"2018-04-10T04:42:51.012Z","__v":0},{"id":820,"user_id":1,"user_name":"匿名用户","avatar":"http://p0.meituan.net/aichequan/8632d93a19c8883727301f82cc88501d4301.png","restaurant_id":32,"comment_data":"不错，而且送餐超快，很不错","order_id":1,"food_score":5,"delivery_score":4,"quality_score":0,"pack_score":0,"pic_url":[],"add_comment_list":[],"comment_time":"2018-04-05T05:08:44.558Z","__v":0},{"id":821,"user_id":1,"user_name":"ohY785798809","avatar":"http://p0.meituan.net/aichequan/8632d93a19c8883727301f82cc88501d4301.png","restaurant_id":32,"comment_data":"挺好吃的 包装也挺好的 外送小哥也挺好的 满意","order_id":1,"food_score":5,"delivery_score":4,"quality_score":0,"pack_score":0,"pic_url":[],"add_comment_list":[],"comment_time":"2018-04-05T05:08:44.558Z","__v":0}]
     */

    public int status;
    public String message;
    public List<T> data;


    @Override
    public String toString() {
        return "RootData{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
