package com.qf.b_lifecycle;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("嘻嘻" + i);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        new Thread(new MyThread1()).start();//开启线程
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程:" + i);
        }
    }
}
