package com.qf.e_join;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class FatherThread implements Runnable {
    @Override
    public void run() {
        //
        Thread thread = new Thread(new SonThread());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("父线程:" + i);
        }
    }
}
class SonThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("子线程:" + i);
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        new Thread(new FatherThread()).start();
    }
}
