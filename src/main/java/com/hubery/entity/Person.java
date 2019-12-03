package com.hubery.entity;

/**
 * Created with IntelliJ IDEA
 *
 * @author kgh
 * @description
 * @date 2019-05-21
 * @time 16:12
 */

public class Person {
    private int id;
    private String adminName;
    private String password;
    private int ustatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUstatus() {
        return ustatus;
    }

    public void setUstatus(int ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                ", ustatus=" + ustatus +
                '}';
    }
}
