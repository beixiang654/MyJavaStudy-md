package com.qf.d_waitnotify;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Message {
    private String message;

    public Message(String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
class WaitThread implements Runnable{
    private Message message;

    public WaitThread(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ ":" + i);
        }

        //0x998.wait()
        synchronized (message) {
            try {
                message.wait();//线程等待
                //为啥要用！！！当调用wait方法的时候，会自动的释放这个锁
                //把资源 message 放到对象的等待池中。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ i);
        }
    }
}
class NotifyThread implements Runnable{
    private Message message;

    public NotifyThread(Message message) {
        this.message = message;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ ":" + i);
        }
       //0x998.notify();
        synchronized (message) {
            message.setMessage("已经出餐");
            //message.notify();
            message.notifyAll();
        }
        System.out.println("唤醒线程已经将等待线程唤醒");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Message message = new Message("还未出餐");//0x998
        WaitThread waitThread = new WaitThread(message);
        NotifyThread notifyThread = new NotifyThread(message);
        new Thread(waitThread, "等待线程1").start();
        new Thread(waitThread, "等待线程2").start();
        new Thread(notifyThread, "唤醒线程").start();
    }
}
