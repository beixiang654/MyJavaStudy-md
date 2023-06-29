package com.qf.c_lambada;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("嘻嘻哈哈");
            }
        }).start();
        new Thread(()-> System.out.println("狗蛋")).start();

    }
}
