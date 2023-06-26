package com.qf.e_fun;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread1 implements Runnable {
    @Override
    public void run() {
        //Thread.currentThread()  当前线程对象
        System.out.println("Line 12:" + Thread.currentThread());
        System.out.println("Line 13:" + Thread.currentThread().getName());//Thread-0
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run() {
        //Thread.currentThread()  当前线程对象
        System.out.println("Line 20:" + Thread.currentThread());
    }
}
public class Demo1 {
    public static void main(String[] args) {
        //通过构造方法对线程起名字
        Thread thread = new Thread(new MyThread1(), "狗蛋");
        thread.setName("嘻嘻");
        System.out.println("line19:" + thread);//
        System.out.println("line28:" + thread.getName());//
        thread.start();
        Thread thread1 = new Thread(new MyThread2());
        System.out.println("Line31:"+thread1.getName());
        thread1.start();//Thread-1
    }
}
