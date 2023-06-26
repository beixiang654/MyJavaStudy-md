package com.qf.b_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Class对象有 属性  构造方法  方法等
        Class<Person> personClass = Person.class;
        //只能拿class对象来获取
        Constructor<?>[] constructors = personClass.getConstructors();
        //System.out.println(constructors);
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("==========");
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("------------------");

        //获取无参的构造方法对象
        //public Person() {
        //    }
        Constructor<Person> constructor = personClass.getConstructor(null);
        System.out.println(constructor);

        //获取有参的构造方法
        // public Person(String name) {
        //        this.name = name;
        //    }
        Constructor<Person> constructor1 = personClass.getConstructor(String.class);
        System.out.println(constructor1);

        //private Person(int age) {
        //        this.age = age;
        //
        //   }
        Constructor<Person> constructor2 = personClass.getDeclaredConstructor(int.class);
        System.out.println(constructor2);

        //实例化出来 Person对象
        //借助于无参构造方法进行实例化
        Person person = constructor.newInstance(null);
        System.out.println(person);
        //有参构造方法对象
        Person person1 = constructor1.newInstance("狗蛋");
        System.out.println(person1);

        //public Person(String name, int age) {
        //        this.name = name;
        //        this.age = age;
        //    }
        Constructor<Person> constructor3 = personClass.getConstructor(String.class, int.class);
        Person person3 = constructor3.newInstance("嘻嘻", 23);
        System.out.println(person3);
    }
}
