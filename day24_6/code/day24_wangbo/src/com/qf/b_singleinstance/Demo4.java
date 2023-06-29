package com.qf.b_singleinstance;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//饿汉式写法
class SingleDog {
     static final SingleDog singleDog = new SingleDog();
    private SingleDog() {}
    public static SingleDog getInstance() {
        return singleDog;
    }
}
public class Demo4 {
    public static void main(String[] args) {
        SingleDog dog1 = SingleDog.getInstance();
        SingleDog dog2 = SingleDog.getInstance();
        System.out.println(dog1 == dog2);
    }
}
