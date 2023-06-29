package com.qf.a_reflect;

import java.lang.reflect.Field;

/**
 *description:
 *公司:千锋教育
 *author:博哥
 *公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        //获取公开的所有的属性
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=======");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("----------");
        //获取当个字段
        Field name = personClass.getField("name");
        System.out.println(name);
        Field sex = personClass.getDeclaredField("sex");
        System.out.println(sex);
        //属性对象获取出来，  可以借助于属性对象对属性进行赋值
        //void set(Object obj(告知那个对象下面的属性), Object value)
        Person person = personClass.getConstructor(null).newInstance(null);

        name.set(person, "狗蛋");
        sex.setAccessible(true);//暴力反射
        sex.set(person, '女');
        System.out.println(person);
    }
}
