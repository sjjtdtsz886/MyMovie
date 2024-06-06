package com.bcu.yunduanmovies.domain;

public class User {


    private int userId;

    private String userName;


    private String userPassword;


    private int userMemberStatus;

    // Getters and Setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserMemberStatus() {
        return userMemberStatus;
    }

    public void setUserMemberStatus(int userMemberStatus) {
        this.userMemberStatus = userMemberStatus;
    }
}

