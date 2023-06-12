package com.qf.a_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Person {
    String name;
    int age;
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class Demo5 {
    public static void main(String[] args) {
        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("吕布", 21));
        collection.add(new Person("曹操", 28));
        collection.add(new Person("董卓", 58));
        System.out.println(collection);//可以存对象的

        //将数据遍历出来
        for (Person person : collection) {
            System.out.println(person.name + ":" + person.age);
            System.out.println("==========");
        }
    }
}
