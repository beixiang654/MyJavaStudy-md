package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo6 {
    public static void main(String[] args) {
        Integer i1 = new Integer(23);
        Integer i2 = new Integer(23);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1 == i2);//false
        //发现Integer重写Object类的下面equals方法
        System.out.println(i1.equals(i2));//true
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println("=======");
        String str1 = new String("ab");
        String str2 = new String("b");
        System.out.println(str1.equals(str2));//true
        // h = 31 * h + val[i];
        System.out.println(str1.hashCode());//3105    ab
        System.out.println(str2.hashCode());

    }
}
