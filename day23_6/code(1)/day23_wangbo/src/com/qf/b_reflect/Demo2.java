package com.qf.b_reflect;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Person类的对应的  Class对象
        //第一种方式：类.class;
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        //第二种方式:  获取com.qf.b_reflect.Person  的CLass对象
        //参数是包名+ 类名
        Class<?> aClass = Class.forName("com.qf.b_reflect.Person");
        System.out.println(aClass);
        //第三种的创建方式:
        Class<? extends Person> aClass1 = new Person().getClass();
        System.out.println(aClass1);


    }
}
