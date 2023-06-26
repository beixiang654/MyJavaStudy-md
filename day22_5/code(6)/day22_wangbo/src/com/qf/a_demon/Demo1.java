package com.qf.a_demon;

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
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread1(), "狗蛋");
      //setDaemon(boolean on)
        //将此线程标记为daemon线程或用户线程。 当运行的唯一线程都是守护进程线程时，Java虚拟机将退出。
        //线程启动前必须调用此方法。
        thread.setDaemon(true);//设置为守护线程
        thread.start();
        System.out.println(Thread.currentThread().isDaemon());
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程:" + i);
        }

    }
}
