package com.aichat.tuling.inputEntity;

import java.io.Serializable;

/**
* 地理位置信息
* 地理位置信息
* @author chaoyalong
* @date 2018-5-20 1:55
*/
public class LocationEntity implements Serializable {

    private String city;        //所在城市
    private String province;    //省份
    private String street;      //街道

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
