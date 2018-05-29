package com.aichat.saveMsg.service;

/**
 * Created by cyl on 2018/5/28.
 */

import com.aichat.saveMsg.dao.SaveMsgDao;
import com.aichat.saveMsg.entity.SaveMsgEntity;
import com.aichat.saveMsg.entity.SaveMsgEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
* Service
* Service
* @author chaoyalong
* @date 2018-5-28 17:08
*/
@Service
public class SaveMsgServiceImpl {

    @Autowired
    private SaveMsgDao saveMsgDao;
    /**
    * @desc 添加
    * 添加saveMsg
    *
    * @param saveMsgEntity
    * @date 2018年5月29日 21:08
    * @return void
    * @exception
    */

    public void insertSaveMsg(SaveMsgEntity saveMsgEntity){
        saveMsgDao.insertSaveMsg(saveMsgEntity);
    }

    /**
    * @desc 删除
    * 删除saveMsg
    *
    * @param id
    * @date 2018年5月29日 21:11
    * @return void
    * @exception
    */

    public void deleteSaveMsg(float id){
        saveMsgDao.deleteSaveMsg(id);
    }

    /**
    * @desc 更新
    * 更新saveMsg
    *
    * @param saveMsgEntity
    * @date 2018年5月29日 21:12
    * @return void
    * @exception
    */

    public void updateSaveMsg(SaveMsgEntity saveMsgEntity){
        saveMsgDao.updateSaveMsg(saveMsgEntity);
    }

    /**
    * @desc 查找
    * 查找saveMsg
    *
    * @param id
    * @date 2018年5月29日 21:13
    * @return com.aichat.saveMsg.entity.SaveMsgEntity
    * @exception
    */

    public SaveMsgEntity getSaveMsg(float id){
        return saveMsgDao.getSaveMsg(id);
    }

}
