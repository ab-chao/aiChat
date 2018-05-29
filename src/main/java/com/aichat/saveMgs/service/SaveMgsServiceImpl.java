package com.aichat.saveMgs.service;

/**
 * Created by cyl on 2018/5/28.
 */

import com.aichat.saveMgs.dao.SaveMgsDao;
import com.aichat.saveMgs.entity.SaveMgsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
* Service
* Service
* @author chaoyalong
* @date 2018-5-28 17:08
*/
@Service
public class SaveMgsServiceImpl {

    @Autowired
    private SaveMgsDao saveMgsDao;

    public void insertSaveMgs(SaveMgsEntity saveMgsEntity){
        saveMgsDao.insertSaveMgs(saveMgsEntity);
    }

    public void deleteSaveMgs(float id){
        saveMgsDao.deleteSaveMgs(id);
    }

    public void updateSaveMgs(SaveMgsEntity saveMgsEntity){
        saveMgsDao.updateSaveMgs(saveMgsEntity);
    }

    public SaveMgsEntity getSaveMgs(float id){
        return saveMgsDao.getSaveMgs(id);
    }

}
