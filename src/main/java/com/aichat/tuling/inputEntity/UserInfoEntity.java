package com.aichat.tuling.inputEntity;

import java.io.Serializable;

/**
* 用户参数
* 用户参数
* @author chaoyalong
* @date 2018-5-20 1:42
*/
public class UserInfoEntity implements Serializable {

    private String apiKey;      //机器人标识
    private String userId;      //用户唯一标识
    private String groupId;     //群聊唯一标识
    private String userIdName;  //群内用户昵称

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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserIdName() {
        return userIdName;
    }

    public void setUserIdName(String userIdName) {
        this.userIdName = userIdName;
    }

    public UserInfoEntity() {
    }

    public UserInfoEntity(String apiKey, String userId) {
        this.apiKey = apiKey;
        this.userId = userId;
    }
}
