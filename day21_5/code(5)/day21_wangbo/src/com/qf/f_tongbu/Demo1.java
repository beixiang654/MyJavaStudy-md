package com.qf.f_tongbu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class SaleTicket implements Runnable {
   static int ticket = 200;//200张票
    //synchronized   锁的是整个方法 run
    //方法体中的所有的代码都被一个线程执行完
    Lock lock = new ReentrantLock();
    @Override
    public  void run() {

        while (true) {
            lock.lock();
            try{
                if (ticket > 0) {

                    //有可能  线程1 和线程2 都进入到while循环了

                    System.out.println(Thread.currentThread().getName() + "卖出了第" + ticket + "票");

                    ticket--;


                } else {
                    System.out.println(Thread.currentThread().getName() + ":票已经买完了");
                    break;
                }


            }catch (Exception e) {

            } finally {
                lock.unlock();
            }

        }
    }

}
public class Demo1 {
    public static void main(String[] args) {
        //保证共享的是同一个资源
        SaleTicket saleTicket = new SaleTicket();
        new Thread(saleTicket, "线程1").start();
        new Thread(saleTicket, "线程2").start();
    }
}
