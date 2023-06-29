package com.qf.c_lambada;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
interface D {
    int add(int a, int b);
}
public class Demo5 {
    public static void main(String[] args) {
        test(new D() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        }, 7, 8);
        System.out.println("=========");
        //lambda表达式
        test((a, b)->a+b, 8, 6);
        test((a, b)->{return a+b;}, 8, 6);
    }
    public static void test (D d, int a, int b) {
        System.out.println(d.add(a, b));

    }
}
