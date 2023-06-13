package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Man {

}
public class Demo4 {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.hashCode());//
        Object obj2 = new Object();
        System.out.println(obj2);
        System.out.println(obj2.hashCode());
        Man man = new Man();
        //十六进制的内存地址转为十进制的值
        System.out.println(man.hashCode());
        Man man1 = new Man();
        System.out.println(man1.hashCode());
        //字符串呢?
        String str1 = new String("a");
        String str2 = new String("a");
        //String中的内存地址不一样，但是hahs值是一样的
        //肯定重写了Object的hashCode方法
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}
