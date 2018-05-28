package com.aichat.tuling.inputEntity;

import java.io.Serializable;

/**
* 输入信息
* 输入信息
* @author chaoyalong
* @date 2018-5-20 1:40
*/
public class PerceptionEntity implements Serializable {

    private InputTextEntity inputText;      //文本信息
    private InputImageEntity inputImage;    //图片信息
    private InputMediaEntity inputMedia;    //音频信息
    private SelfInfoEntity selfInfo;        //客户端属性

    public InputTextEntity getInputText() {
        return inputText;
    }

    public void setInputText(InputTextEntity inputText) {
        this.inputText = inputText;
    }

    public InputImageEntity getInputImage() {
        return inputImage;
    }

    public void setInputImage(InputImageEntity inputImage) {
        this.inputImage = inputImage;
    }

    public InputMediaEntity getInputMedia() {
        return inputMedia;
    }

    public void setInputMedia(InputMediaEntity inputMedia) {
        this.inputMedia = inputMedia;
    }

    public SelfInfoEntity getSelfInfo() {
        return selfInfo;
    }

    public void setSelfInfo(SelfInfoEntity selfInfo) {
        this.selfInfo = selfInfo;
    }
}
