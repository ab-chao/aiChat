package com.aichat.saveMgs.entity;

/**
 * Created by cyl on 2018/5/28.
 */


import java.util.Date;

/**
* Table: ai_message_file
* Table: ai_message_file
* @author chaoyalong
* @date 2018-5-28 16:15
*/
public class SaveMgsEntity {
    private float id;
    private float fnd_id;
    private String uuid;
    private float user_id;
    private Date creation_date;
    private String file_location;

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getFnd_id() {
        return fnd_id;
    }

    public void setFnd_id(float fnd_id) {
        this.fnd_id = fnd_id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public float getUser_id() {
        return user_id;
    }

    public void setUser_id(float user_id) {
        this.user_id = user_id;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public String getFile_location() {
        return file_location;
    }

    public void setFile_location(String file_location) {
        this.file_location = file_location;
    }
}
