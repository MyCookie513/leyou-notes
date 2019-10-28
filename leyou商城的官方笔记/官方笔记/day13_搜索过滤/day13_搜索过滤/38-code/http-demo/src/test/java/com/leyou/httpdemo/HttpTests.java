package com.leyou.httpdemo;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class HttpTests {

    CloseableHttpClient httpClient;

    @Before
    //相当于打开了一个浏览器
    public void init() {
        httpClient = HttpClients.createDefault();
    }

    @Test
    public void testGet() throws IOException {
        //创建请求条件，请求方式为get，参数为请求地址
        HttpGet request = new HttpGet("http://www.baidu.com");

        //由客户端执行请求（请求条件地址以及默认的响应处理器），并得到响应
        String response = this.httpClient.execute(request, new BasicResponseHandler());
        System.out.println(response);
    }

    @Test
    public void testPost() throws IOException {
        HttpGet request = new HttpGet("http://www.oschina.net/");
        request.setHeader("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
        String response = this.httpClient.execute(request, new BasicResponseHandler());
        System.out.println(response);
    }

    @Test
    public void testGetPojo() throws IOException {
        HttpGet request = new HttpGet("http://localhost/user/3");
        String response = this.httpClient.execute(request, new BasicResponseHandler());
        System.out.println(response);
    }
}
