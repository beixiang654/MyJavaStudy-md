package com.qf.c_baozhuang;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer i1 = new Integer(20);
        System.out.println(i1);//20
        int compare = Integer.compare(20, 30);
        System.out.println(compare);


        int i= 30;//基本数据类型
        Integer i2 = i;
        Integer i3 = 40;//自动装箱
        int i4 = i3;//自动拆箱
        int i5 = Integer.parseInt("12");//将字符转为int类型的数据
        System.out.println(i5);//12

        //面试题
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a == b);//true
        System.out.println(c == d);//false

    }
}
