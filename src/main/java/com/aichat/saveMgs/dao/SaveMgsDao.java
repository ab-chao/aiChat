package com.aichat.saveMgs.dao;

/**
 * Created by cyl on 2018/5/28.
 */

import com.aichat.saveMgs.entity.SaveMgsEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* Mapper
* Mapper
* @author chaoyalong
* @date 2018-5-28 16:54
*/
@Mapper
public interface SaveMgsDao {
   void insertSaveMgs(SaveMgsEntity saveMgsEntity);
   void deleteSaveMgs(float id);
   void updateSaveMgs(SaveMgsEntity saveMgsEntity);
   SaveMgsEntity getSaveMgs(float id);
}
