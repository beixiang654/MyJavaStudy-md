package com.qf.b_singleinstance;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Dog {
    private static Dog dog;
    //目的就是不让在类的外部实例化对象
    private Dog () {

    }
    public static Dog getInstance() {
        if (dog == null) {
            dog = new Dog();
        }
        return dog;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Dog dog1 = Dog.getInstance();
        Dog dog2 = Dog.getInstance();
        System.out.println(dog1 == dog2);

    }
}
