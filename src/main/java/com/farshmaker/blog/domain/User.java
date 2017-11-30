package com.farshmaker.blog.domain;

/**
 * @author e.karachun
 * @version 27.11.2017
 */
public class User extends DomainObject {

    private String nickName;

    private String email;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
