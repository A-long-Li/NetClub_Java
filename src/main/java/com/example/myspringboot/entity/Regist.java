package com.example.myspringboot.entity;

import java.io.Serializable;

public class Regist implements Serializable {


    private Integer id;
    private String name;
    private String initials;
    private String top_domains;
    private String userNumber;
    private String QQ;
    private String purpose1;
    private String purpose2;

    public Regist(){

    }
    public Regist(Integer id, String name, String initials, String top_domains, String userNumber, String QQ, String purpose1, String purpose2) {
        this.id = id;
        this.name = name;
        this.initials = initials;
        this.top_domains = top_domains;
        this.userNumber = userNumber;
        this.QQ = QQ;
        this.purpose1 = purpose1;
        this.purpose2 = purpose2;
    }

    @Override
    public String toString() {
        return "regist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", initials='" + initials + '\'' +
                ", top_domains='" + top_domains + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", QQ='" + QQ + '\'' +
                ", purpose1='" + purpose1 + '\'' +
                ", purpose2=" + purpose2 +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getTop_domains() {
        return top_domains;
    }

    public void setTop_domains(String top_domains) {
        this.top_domains = top_domains;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getPurpose1() {
        return purpose1;
    }

    public void setPurpose1(String purpose1) {
        this.purpose1 = purpose1;
    }

    public String getPurpose2() {
        return purpose2;
    }

    public void setPurpose2(String purpose2) {
        this.purpose2 = purpose2;
    }
}