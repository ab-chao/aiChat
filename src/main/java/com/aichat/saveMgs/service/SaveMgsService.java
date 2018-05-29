package com.aichat.saveMgs.service;

/**
 * Created by cyl on 2018/5/28.
 */

import com.aichat.saveMgs.entity.SaveMgsEntity;

/**
* Service
* Service
* @author chaoyalong
* @date 2018-5-28 17:05
*/
public interface SaveMgsService {

    void insertSaveMgs(SaveMgsEntity saveMgsEntity);
    void deleteSaveMgs(float id);
    void updateSavdMge(SaveMgsEntity saveMgsEntity);
    SaveMgsEntity getSaveMgs(float id);
}
