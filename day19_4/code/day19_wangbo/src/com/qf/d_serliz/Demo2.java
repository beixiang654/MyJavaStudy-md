package com.qf.d_serliz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //磁盘-》内存  输入流
        FileInputStream fis = new FileInputStream("c:/aaa/person.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person p = (Person)ois.readObject();
        System.out.println(p.name);
        System.out.println(p.age);
        p.sleep();

    }
}
