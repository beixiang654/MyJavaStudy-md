package com.qf.c_runnable;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Mythread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Mythread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        new Thread(new Mythread3()).start();
        new Thread(new Mythread4()).start();
    }
}
