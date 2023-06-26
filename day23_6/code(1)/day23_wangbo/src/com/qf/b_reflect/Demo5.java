package com.qf.b_reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo5 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        //getMethods()  获取父类和当前类公开的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {

            System.out.println(method);
        }
        //想要获取私有的方法  加declared
        System.out.println("=======");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        //获取单个的方法对象
        //getMethod(String name, Class<?>... parameterTypes)
        //Params:
        //name – the name of the method  方法名字
        //parameterTypes – the list of parameters  方法 的参数 的Class类型
        Method eat = personClass.getMethod("eat", null);
        System.out.println(eat);//无参的eat方法
        //public void eat (String xixi) {
        //        System.out.println(xixi + "吃饭");
        //    }
        Method eat1 = personClass.getMethod("eat", String.class);
        System.out.println(eat1);
        //public void eat (int age, String goudan) {
        Method eat2 = personClass.getMethod("eat", int.class, String.class);
        System.out.println(eat1);

        System.out.println("----------");
        //方法对象有了,方法得调用  执行的
        //Object invoke(Object obj, Object... args)
        //第一个参数  Object   obj  是告诉我eat方法在哪个对象下面
        //第二个参数  方法的实参
        Person person = personClass.getConstructor().newInstance();
        eat.invoke(person, null);
        eat2.invoke(person, 76, "hehe");

        //现在我想获取sleep方法  私有的方法
        Method sleep = personClass.getDeclaredMethod("sleep", null);
        System.out.println(sleep);
        //暴力反射
        sleep.setAccessible(true);
        sleep.invoke(person, null);


    }
}
