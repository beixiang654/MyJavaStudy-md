package com.qf.d_serliz;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Person implements Serializable{
    String name;
    int age;
    public void sleep() {
        System.out.println("嘻嘻 要睡觉喽");
    }
}
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.name = "狗蛋";
        person.age  = 22;

        //将person对象存到磁盘上面
        //内存--》  磁盘   输出！！！ ObjectOutputStream
        FileOutputStream fos = new FileOutputStream("c:/aaa/person.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.close();
        fos.close();
    }
}
