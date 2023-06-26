package com.qf.b_thread;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//在MyThread1   干打印99乘法表
class MyThread1 extends Thread  {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();
    }
}
