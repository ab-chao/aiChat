package com.aichat.saveMsg.service;

/**
 * Created by cyl on 2018/5/28.
 */

import com.aichat.saveMsg.entity.SaveMsgEntity;

/**
* Service
* Service
* @author chaoyalong
* @date 2018-5-28 17:05
*/
public interface SaveMsgService {

    /**
    * @desc 添加
    * 添加
    *
    * @param saveMsgEntity
    * @date 2018年5月29日 21:13
    * @return void
    * @exception
    */

    void insertSaveMsg(SaveMsgEntity saveMsgEntity);

    /**
    * @desc 删除
    * 删除
    *
    * @param id
    * @date 2018年5月29日 21:14
    * @return void
    * @exception
    */

    void deleteSaveMsg(float id);

    /**
    * @desc 更新
    * 更新
    *
    * @param saveMsgEntity
    * @date 2018年5月29日 21:14
    * @return void
    * @exception
    */

    void updateSavdMsg(SaveMsgEntity saveMsgEntity);

    /**
    * @desc 查找
    * 查找
    *
    * @param id
    * @date 2018年5月29日 21:14
    * @return com.aichat.saveMsg.entity.SaveMsgEntity
    * @exception
    */

    SaveMsgEntity getSaveMsg(float id);
}
