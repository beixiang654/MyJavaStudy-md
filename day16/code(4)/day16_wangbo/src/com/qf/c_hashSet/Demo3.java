package com.qf.c_hashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("嘻嘻");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        System.out.println("哈哈");
        return name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Set<Student> set1 = new HashSet<>();
        set1.add(new Student("a", 2));
        set1.add(new Student("b", 1));

        //你的hash值都不一样的额话，就没有必要调用equals方法了
        System.out.println(set1);
    }
}
