package com.qf.f_system;

import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        PrintStream out = System.out;//打印流对象
        out.println("狗蛋");
        System.out.println("狗蛋");
        System.err.println("嘻嘻");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数:");
//        int i = scanner.nextInt();

        //static long	currentTimeMillis()
        //返回当前时间（以毫秒为单位）。
//        long start = System.currentTimeMillis();//1687162040724
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("xixi");
//        }
        long end = System.currentTimeMillis();
        //System.out.println(end - start);//36ms
        //获取电脑 安装的一下属性
        Properties properties = System.getProperties();
        System.out.println(properties.get("os.name"));//window10
        System.out.println(properties.get("user.home"));//C:\Users\bowang
        System.out.println(properties.get("java.version"));//1.8.0_241
    }
}
