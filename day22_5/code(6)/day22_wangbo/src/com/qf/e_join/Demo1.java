package com.qf.e_join;

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
            System.out.println(Thread.currentThread().getName() + ":"+ i);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        //main 就是一个主线程
        Thread thread = new Thread(new MyThread1(), "子线程");
        thread.start();
        thread.join();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":"+ i);
        }

    }
}
