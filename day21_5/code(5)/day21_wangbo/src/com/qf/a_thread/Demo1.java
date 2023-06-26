package com.qf.a_thread;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//1.将一个类声明为Thread的子类
class MyThread1 extends Thread {
    //2.这个子类应该重写run

    @Override
    public void run() {
        //这个run方法中是做的事情 也叫功能
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread1这个线程:" + i);
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        //这个run方法中是做的事情 也叫功能
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread2这个线程:" + i);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        //然后可以分配并启动子类的实例。
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();//开启线程start()
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

    }
}
