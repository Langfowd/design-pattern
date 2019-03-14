package com.ltf.design.pattern.singleton;

import java.io.*;

/**
 * 序列化测试
 */
public class SearilizeTest {
    public static void main(String[] args) {
        LazySingle instance = LazySingle.getInstance();
        try {
            FileOutputStream fos = new FileOutputStream("LazySingle.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);

            FileInputStream fis = new FileInputStream("LazySingle.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            LazySingle o = (LazySingle) ois.readObject();
            System.out.println(o == instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
