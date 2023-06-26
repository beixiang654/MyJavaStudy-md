package com.qf.c_runnable;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread1  implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread1:：中午吃大盘鸡炒饼:" + i);
        }
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread2:下午吃麻辣小龙鸭:" + i);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        //然后可以分配类的实例
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        //在创建Thread时作为参数传递，并启动
        Thread thread = new Thread(myThread1);
        thread.start();//导致此线程开始执行; Java虚拟机调用此线程的run方法
        Thread thread1 = new Thread(myThread2);
        thread1.start();

    }
}
