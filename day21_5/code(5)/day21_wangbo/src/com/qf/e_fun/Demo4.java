package com.qf.e_fun;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread8 implements Runnable {
    @Override
    public void run() {
        //这个地方不能throws  只能try-catch 因为方法是重写的。父类没有抛出。所以子类绝对不能抛
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class MyThread9 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread8(), "线程8");
        thread.start();
        Thread thread1 = new Thread(new MyThread9(), "线程9");
        thread1.start();

    }
}
