package com.aichat.saveMsg.dao;

/**
 * Created by cyl on 2018/5/28.
 */

import com.aichat.saveMsg.entity.SaveMsgEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* Mapper
* Mapper
* @author chaoyalong
* @date 2018-5-28 16:54
*/
@Mapper
public interface SaveMsgDao {

   /**
   * @desc 添加
   * 添加
   *
   * @param saveMsgEntity
   * @date 2018年5月29日 21:15
   * @return void
   * @exception
   */

   void insertSaveMsg(SaveMsgEntity saveMsgEntity);

   /**
   * @desc 删除
   * 删除
   *
   * @param id
   * @date 2018年5月29日 21:15
   * @return void
   * @exception
   */

   void deleteSaveMsg(float id);

   /**
   * @desc 更新
   * 更新
   *
   * @param saveMsgEntity
   * @date 2018年5月29日 21:15
   * @return void
   * @exception
   */

   void updateSaveMsg(SaveMsgEntity saveMsgEntity);

   /**
   * @desc 查找
   * 查找
   *
   * @param id
   * @date 2018年5月29日 21:16
   * @return com.aichat.saveMsg.entity.SaveMsgEntity
   * @exception
   */

   SaveMsgEntity getSaveMsg(float id);
}
