package com.model;

import java.io.Serializable;
//实体类一定要序列化
public class Users implements Serializable {
    private int id;
    private String name;
    private String password;
    private int age;
    //关联(相当于外键)
    private Sex sexCode;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sexCode=" + sexCode +
                '}';
    }

    public Users() {
    }

    public Users(int id, String name, String password, int age, Sex sexCode) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.sexCode = sexCode;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSexCode() {
        return sexCode;
    }

    public void setSexCode(Sex sexCode) {
        this.sexCode = sexCode;
    }
}
