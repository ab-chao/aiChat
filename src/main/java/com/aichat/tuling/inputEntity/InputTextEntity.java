package com.aichat.tuling.inputEntity;

import java.io.Serializable;

/**
* 文本信息
* 文本信息
* @author chaoyalong
* @date 2018-5-20 1:46
*/
public class InputTextEntity implements Serializable {

    private String text;    //直接输入文本

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
