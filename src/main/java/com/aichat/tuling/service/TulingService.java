package com.aichat.tuling.service;

import com.aichat.tuling.inputEntity.TulingEntity;

/**
* 调用图灵机器人API服务
* 调用图灵机器人API服务
* @author chaoyalong
* @date 2018-5-28 14:42
*/
public interface TulingService {

    /**
    * @desc 调用图灵api
    * 调用图灵api
    *
    * @param tuling
    * @date 2018年5月28日 14:47
    * @return java.lang.Object
    * @exception
    */
    Object getResponse(TulingEntity tuling);

}
