package com.qf.b_reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();//实例化对象
        System.out.println(person);
        //还有其他实例化对象的情况
        //.class文件中 无参的构造方法
        Class<Person> personClass = Person.class;
        Person person1 = personClass.getConstructor().newInstance();
        System.out.println(person1);


    }
}
