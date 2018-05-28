package com.aichat.tuling.inputEntity;

import java.io.Serializable;

/**
* 图灵API相关参数
* 图灵API相关参数
* @author chaoyalong
* @date 2018-5-20 1:39
*/
public class TulingEntity implements Serializable{

    private int reqType;                    //输入类型:0-文本(默认)、1-图片、2-音频
    private PerceptionEntity perception;    //输入信息
    private UserInfoEntity userInfo;        //用户参数

    public int getReqType() {
        return reqType;
    }

    public void setReqType(int reqType) {
        this.reqType = reqType;
    }

    public PerceptionEntity getPerception() {
        return perception;
    }

    public void setPerception(PerceptionEntity perception) {
        this.perception = perception;
    }

    public UserInfoEntity getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoEntity userInfo) {
        this.userInfo = userInfo;
    }
}
