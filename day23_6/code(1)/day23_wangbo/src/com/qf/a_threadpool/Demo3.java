package com.qf.a_threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

public class Demo3 {
    public static void main(String[] args) {
        //参数
        //public ThreadPoolExecutor(int corePoolSize,
        //                              int maximumPoolSize,
        //                              long keepAliveTime,
        //                              TimeUnit unit,
        //                              BlockingQueue<Runnable> workQueue,
        //                              ThreadFactory threadFactory,
        //                              RejectedExecutionHandler handler)
        //第一个参数: corePoolSize, 核心线程数  5
       //第二个参数: int maximumPoolSize, 10
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 10, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        for (int i = 0; i < 21; i++) {
            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "执行了任务");
                }
            });

        }
    }
    //无界队列:LinkedBlockingQueue   比如 核心的线程5个   有17个任务
    //先5个线程先执行5个任务，12个任务会存到 无界队列中LinkedBlockingQueue  和 最大线程数无关
    //有界队列:
    //    3个任务  开3个线程
    //    5个任务  开5 个线程  队列中没有
    //   7 个任务  开5个 线程  队列中有两个
    //  10个任务   开5个 线程  队列中有5个任务
    //  13个任务   开5个线程  队列中有8个任务
    //   16个任务  开了5个线程  队列中11个  发现存不下了  只能存10个 还剩1个 临时加开线程1
    //  18个任务   开5个线程  队列中13个 发现存不下了  只能存10个 还剩3个临时加开3线程
    // 21个任务    开5个线程  队列中16个发现存不下了  只能存10个  还剩6个 临时加开6个线程
    //总结：
    // 如果任务没有超过核心线程，就新建线程
    //如果超过核心线程，但是没有超过有界队列的长度。依旧是核心线程和队列中的存的任务
    //如果超过核心线程，超过有界队列的长度。但是没有超过最大线程数，创建临时线程
    //如果超过核心线程，超过有界队列的长度。超过最大线程数，拒绝策略开始上
}
