package com.travels.temple.bean;

import java.io.Serializable;

/**
 * Created by yangz on 2017/8/10.
 */
public class User implements Serializable {

    /**
     * User的唯一标识
     */
    private long uuid;

    /**
     * 身份证
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String alias;

    /**
     * 年龄
     */
    private int age;

    /**
     * 性别
     */
    private boolean gender;

    /**
     * 电话
     */
    private String phone;

    /**
     * 居住地
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    public long getUuid() {
        return uuid;
    }

    public void setUuid(long uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
