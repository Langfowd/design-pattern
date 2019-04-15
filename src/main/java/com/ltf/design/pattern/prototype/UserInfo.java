package com.ltf.design.pattern.prototype;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String username;
    private int age;

    /**
     * Gets the value of username.
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     *
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the value of age.
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age.
     *
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
