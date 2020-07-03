package com.pkisi.kucd;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UsersDTO {
    private Integer userId;
    private String userLogin;
    private String userPassword;
    private String userNickname;
    private List<UserPref> userPrefs;
    private List<Environment> userEnvironment;

    public UsersDTO(){}
    public UsersDTO(Integer userId, String userLogin, String userPassword, String userNickname, List<UserPref> userPrefs, List<Environment> userEnvironment) {
        this.userId = userId;
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userNickname = userNickname;
        this.userPrefs = userPrefs;
        this.userEnvironment = userEnvironment;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public List<UserPref> getUserPrefs() {
        return userPrefs;
    }

    public void setUserPrefs(List<UserPref> userPrefs) {
        this.userPrefs = userPrefs;
    }

    public List<Environment> getUserEnvironment() {
        return userEnvironment;
    }

    public void setUserEnvironment(List<Environment> userEnvironment) {
        this.userEnvironment = userEnvironment;
    }
}
