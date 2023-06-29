package com.qf.c_lambada;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
interface B {
    void test(int a, String b);
}
public class Demo3 {
    public static void main(String[] args) {
        eat(new B() {
            @Override
            public void test(int a, String b) {
                System.out.println(a + b);
            }
        }, 2, "goudan");

        System.out.println("----------");
        //lambda表达式
        //
        eat((a, b) -> System.out.println(a + b), 2, "goudan");
        eat((a, b)-> System.out.println(a+b), 89, "xixi");
    }
    public static void eat (B b, int a, String c) {
        b.test(a, c);
    }
}
