package com.model;

import java.io.Serializable;
//实体类一定要序列化
public class Sex implements Serializable {
    private  int id;
    private  String name;
    private  int code;

    //get/set方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
