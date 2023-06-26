package com.qf.a_threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        fixedThreadPoolTest();
    }
    public static void fixedThreadPoolTest() {
        //1.借助于执行器 Executors  创建3个线程的线程池对象
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        //2.创建任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行的任务");
            }
        };
        //3.线程池执行任务
        //执行任务的方法有两个:  submit()  和 execute()
        //Future<?>	submit(Runnable task)
        //提交一个可运行的任务执行，并返回一个表示该任务的未来。
        //void execute(Runnable command)
        //在将来的某个时间执行给定的命令。 该命令可以在一个新线程，一个合并的线程中或在调用线程中执行，由Executor实现。
        threadPool.execute(runnable);
        threadPool.execute(runnable);
        threadPool.execute(runnable);
        threadPool.execute(runnable);
        threadPool.execute(runnable);
    }
}
