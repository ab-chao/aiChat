package com.aichat.tuling.inputEntity;

import java.io.Serializable;

/**
* 音频信息
* 音频信息
* @author chaoyalong
* @date 2018-5-20 1:46
*/
public class InputMediaEntity implements Serializable {

    private String url;     //音频地址

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
