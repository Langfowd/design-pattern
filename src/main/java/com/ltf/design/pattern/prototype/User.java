package com.ltf.design.pattern.prototype;

import java.io.*;

public class User implements Cloneable,Serializable{
    private int id;
    private UserInfo userInfo;

  /*  @Override
    protected User clone() throws CloneNotSupportedException {
        // 浅克隆，字段如果是引用对象那地址将会是一样的，没有达到克隆效果
        return (User) super.clone();
    }*/

    /**
     * 通过序列号和反序列化实现深克隆
     */
    @Override
    protected User clone() throws CloneNotSupportedException {
        // 深克隆，引用对象字段地址值也会变动
        ByteArrayOutputStream byteArray = null;
        ObjectOutputStream outputStream = null;
        ObjectInputStream inputStream = null;
        try {
            byteArray = new ByteArrayOutputStream();
            outputStream = new ObjectOutputStream(byteArray);
            outputStream.writeObject(this);
            inputStream = new ObjectInputStream(new ByteArrayInputStream(byteArray.toByteArray()));
            return (User) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
                byteArray.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Gets the value of id.
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the value of userInfo.
     *
     * @return the value of userInfo
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the userInfo.
     *
     * @param userInfo userInfo
     */
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
