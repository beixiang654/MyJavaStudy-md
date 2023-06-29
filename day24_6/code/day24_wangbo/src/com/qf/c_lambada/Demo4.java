package com.qf.c_lambada;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
interface C {
    int test();
}
public class Demo4 {
    public static void main(String[] args) {
        eat(new C() {
            @Override
            public int test() {
                return 250;
            }
        });
        System.out.println("=======");
        eat(()-> {return 250;});
        eat(()-> 250);//不写return的时候 干掉大括号即可
    }
    public static void eat (C c){
        int test = c.test();
        System.out.println(test);

    }
}
