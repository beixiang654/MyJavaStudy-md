package com.qf.e_fun;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread5 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class MyThread6 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
public class Demo3 {
    public static void main(String[] args) {
        int priority = Thread.currentThread().getPriority();
        System.out.println(priority);//main主线程的默认的优先级的值
        Thread thread = new Thread(new MyThread5(), "线程5");
        thread.setPriority(4);
        thread.start();
        Thread thread1 = new Thread(new MyThread6(), "线程6");
        thread1.setPriority(6);
        thread1.start();

    }
}
