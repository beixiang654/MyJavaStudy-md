package com.qf.a_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Student {
    private String name;
    private int age;

    //对属性进行赋值
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Collection<Student> stus = new ArrayList<>();
        stus.add(new Student("狗蛋", 21));
        stus.add(new Student("永杰", 25));
        stus.add(new Student("世奇", 83));
        System.out.println(stus);
        for (Student student : stus) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }
    }
}
