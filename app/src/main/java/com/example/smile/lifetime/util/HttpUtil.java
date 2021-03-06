package com.example.smile.lifetime.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lly54 on 2017/3/27.
 */

/*    发起一条HTTP请求只需要调用sendOkHttpRequest()方法，传入请求地址，并注册一个回调来处理服务器响应就可以了  */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();   //创建一个OKHttp对象
        Request request = new Request.Builder().url(address).build();   //向传入的URL地址发送一个请求
        client.newCall(request).enqueue(callback);  //将最终请求结果回调到于Callback callback当中
    }

}
