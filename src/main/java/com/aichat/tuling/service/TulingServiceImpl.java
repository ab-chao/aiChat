package com.aichat.tuling.service;


import com.aichat.tuling.inputEntity.TulingEntity;
import com.aichat.tuling.inputEntity.UserInfoEntity;
import com.alibaba.fastjson.JSON;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 调用图灵机器人API服务
 * 调用图灵机器人API服务
 * @author chaoyalong
 * @date 2018-5-28 14:42
 */
@Service
public class TulingServiceImpl implements TulingService{

    @Value("${tuling.url}")
    private String url;
    @Value("${tuling.apiKey}")
    private String apiKey;      //机器人标识
    @Value("${tuling.userId}")
    private String userId;      //用户唯一标识


    @Override
    public Object getResponse(TulingEntity tuling) {
        Object o = null;
        try {
            tuling.setUserInfo(new UserInfoEntity(getApiKey(),getUserId()));
            o = doPost(JSON.toJSONString(tuling));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSON(o);
    }


    public Object doPost(String data) throws Exception {
        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;
        String result = "";
        try {
            client = HttpClients.createDefault();
            HttpPost post = new HttpPost(getUrl());
            StringEntity stringentity = new StringEntity(data, ContentType.create("text/json", "UTF-8"));
            post.setEntity(stringentity);
            response = client.execute(post);
            result = EntityUtils.toString(response.getEntity(),"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != client) {
                client.close();
            }
            if (null != response) {
                response.close();
            }
        }
        return result;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
