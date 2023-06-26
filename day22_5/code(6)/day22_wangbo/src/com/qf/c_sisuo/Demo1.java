package com.qf.c_sisuo;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class DeadLock implements Runnable {
    private boolean flag;//标记属性
    private Object obj1;//资源1
    private Object obj2;//资源2
    //有参构造方法


    public DeadLock(boolean flag, Object obj1, Object obj2) {
        this.flag = flag;
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        if (flag) {//flag为true的时候  让线程1进来执行if语句中代码
            synchronized (obj1) {//锁obj 1资源
                System.out.println(Thread.currentThread().getName() + "拿到了obj1对象");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //线程1走到这个方法不走了，休眠了
                System.out.println("我的线程1想拿obj2这个资源");
                synchronized (obj2) {//如果obj2一直没有释放，是锁不住这个资源的！！！
                    System.out.println(Thread.currentThread().getName() + "拿到了obj2对象");

                }

            }
        }
        //线程1拿到了obj1对象
        //线程2拿到了obj2对象
        //我的线程1想拿obj2这个资源
        //线程1拿到了obj2对象
        //
        //Process finished with exit code 0
        if (!flag) {//flag为false的时候  让线程2进来执行if语句中代码
            synchronized (obj2) {//锁obj 1资源
                System.out.println(Thread.currentThread().getName() + "拿到了obj2对象");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我的线程2想拿obj1这个资源");
                synchronized (obj1) {//如果obj2一直没有释放，是锁不住这个资源的！！！
                    System.out.println(Thread.currentThread().getName() + "拿到了obj1对象");

                }
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        //第一个线程
        DeadLock deadLock1 = new DeadLock(true, obj1, obj2);
        new Thread(deadLock1, "线程1").start();
        //第二个线程
        DeadLock deadLock2 = new DeadLock(false, obj1, obj2);
        new Thread(deadLock2, "线程2").start();
    }
}
