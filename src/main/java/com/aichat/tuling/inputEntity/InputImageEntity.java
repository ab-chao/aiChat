package com.aichat.tuling.inputEntity;

import java.io.Serializable;

/**
* 图片信息
* 图片信息
* @author chaoyalong
* @date 2018-5-20 1:46
*/
public class InputImageEntity implements Serializable {

    private String url;     //图片地址

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
