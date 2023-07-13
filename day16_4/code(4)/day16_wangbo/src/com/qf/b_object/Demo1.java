package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Object obj= new Object();
        System.out.println(obj);//java.lang.Object@1b6d3586
        //该符号字符`的类的名称的字符串@ ”和对象的哈希码的无符号的十六进制表示
        System.out.println(obj.toString());//java.lang.Object@1b6d3586


        Person person = new Person();
        //结果应该是一个简明扼要的表达，容易让人阅读。 建议所有子类覆盖(重写)此方法。
        person.name = "狗蛋";
        person.age = 12;
        //Person{name='null', age=0}
        //Person{name='狗蛋', age=12}
        System.out.println(person);//com.qf.b_object.Person@4554617c
       // System.out.println(person.toString());


        //总结：  如果在一个类不重写toString方法  打印是地址 看不懂
        //如果重写toString之后，打印重写的字符串 目的让人容易阅读
    }
}
