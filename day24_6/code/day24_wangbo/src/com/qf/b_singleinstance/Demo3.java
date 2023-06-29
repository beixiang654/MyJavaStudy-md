package com.qf.b_singleinstance;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//懒汉式写法！！！
class Student {
    private static Student stu;
    private Student() {

    }
    public static  Student getInstance() {
        synchronized (Student.class) {
            if (stu == null) {
                stu = new Student();
            }
        }

        return stu;
    }
}
class MyThread1 implements Runnable {
    @Override
    public void run() {
        //创建Student对象
        Student student = Student.getInstance();
        System.out.println(student);//内存地址
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run() {
        //创建Student对象
        Student student = Student.getInstance();
        System.out.println(student);//内存地址
    }
}

public class Demo3 {
    public static void main(String[] args) {
        new Thread(new MyThread1()).start();
        new Thread(new MyThread2()).start();
    }
}
