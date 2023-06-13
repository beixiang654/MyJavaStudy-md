package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));//false

        //String 继承了Object类啊
        //因为父类（Object）的需求满足不了子类（String）的所以子类重写euqals方法
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));//true
    }
}
