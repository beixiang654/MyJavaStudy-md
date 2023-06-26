package com.qf.e_fun;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread3 implements Runnable {
    @Override
    public void run() {

    }
}
public class Demo2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread3(), "呵呵");
        System.out.println(thread.getName());//获取当前线程的名字
        thread.start();
        //想看一下main主函数中的线程的名字叫啥? main
         Thread.currentThread().setName("哈哈");
        String name = Thread.currentThread().getName();
        System.out.println(name);//main
    }
}
