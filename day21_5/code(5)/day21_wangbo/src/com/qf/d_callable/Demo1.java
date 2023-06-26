package com.qf.d_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//1.创建 Callable 接口的实现类，并实现 call() 方法，该 call() 方法将作为线程执行体，并且有返回值。
class CallableThreadTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 1000; i++) {
            System.out.println("当前线程:" + i);
        }
        return i;
    }
}
public class Demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //2.创建 Callable 实现类的实例，使用 FutureTask 类来包装 Callable 对象，
        // 该 FutureTask 对象封装了该 Callable 对象的 call() 方法的返回值。
        CallableThreadTest ctt = new CallableThreadTest();
        FutureTask<Integer> ift = new FutureTask<Integer>(ctt);
        //3.使用 FutureTask 对象作为 Thread 对象的 target 创建并启动新线程。
        new Thread(ift).start();
        //4.调用 FutureTask 对象的 get() 方法来获得子线程执行结束后的返回值。
        Integer integer = ift.get();
        System.out.println(integer);
    }
}
