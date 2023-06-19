package com.qf.e_randon;

import java.util.Random;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());//-2^31 ~  2^31-1
        System.out.println(random.nextDouble());//0.4644986990282639
        System.out.println(random.nextGaussian());//2.4073605658546566
    }
}
