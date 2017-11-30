package com.farshmaker.blog.domain;

import java.io.Serializable;

/**
 * @author e.karachun
 * @version 27.11.2017
 */
public class User implements Serializable {

    private String email;

    private String nickName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
