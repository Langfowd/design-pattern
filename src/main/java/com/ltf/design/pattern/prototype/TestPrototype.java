package com.ltf.design.pattern.prototype;

public class TestPrototype {
    public static void main(String[] args) {
        User user = new User();
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(20);
        userInfo.setUsername("xiaoming");
        user.setUserInfo(userInfo);
        user.setId(1);

        System.out.println(user);
        System.out.println(userInfo);

        try {
            User clone = user.clone();
            System.out.println(clone);
            System.out.println(clone.getUserInfo());

            System.out.println("user:"+user.getUserInfo().getUsername()+":"+user.getUserInfo().getAge());
            System.out.println("clone:"+clone.getUserInfo().getUsername()+":"+clone.getUserInfo().getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
