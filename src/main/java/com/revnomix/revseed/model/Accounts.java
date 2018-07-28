package com.revnomix.revseed.model;

import javax.persistence.*;
import java.io.Serializable;

//@Entity
public class Accounts implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Column(name = "account_fname")
    private String accountFirstName;

    @Column(name = "account_lname")
    private String accountLastName;

    @Column(name = "account_address1")
    private String Address1;

    @Column(name = "account_address2")
    private String Address2;

    @Column(name = "account_mobile1")
    private String mobile1;

    @Column(name = "account_mobile2")
    private String mobile2;

    @Column(name = "account_city")
    private String city;

    @Column(name = "account_state")
    private String state;

    @Column(name = "account_email")
    private String email;

    @Column(name = "account_password")
    private String password;


    @Column(name = "account_status")
    private boolean status;


    @Column(name = "account_regdate")
    private String regdate;

    @Column(name = "account_author")
    private String author;

    @Column(name = "account_position")
    private String position;

    @Column(name = "client_id")
    private Integer clienId;

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountFirstName() {
        return accountFirstName;
    }

    public void setAccountFirstName(String accountFirstName) {
        this.accountFirstName = accountFirstName;
    }

    public String getAccountLastName() {
        return accountLastName;
    }

    public void setAccountLastName(String accountLastName) {
        this.accountLastName = accountLastName;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getClienId() {
        return clienId;
    }

    public void setClienId(Integer clienId) {
        this.clienId = clienId;
    }
}