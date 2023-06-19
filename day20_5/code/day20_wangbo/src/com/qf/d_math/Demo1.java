package com.qf.d_math;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);

        double pow = Math.pow(2, 3);
        System.out.println(pow);

        //绝对值
        System.out.println(Math.abs(-986));//986
        //求两个数的最大值
        System.out.println(Math.max(89, Math.max(67, Math.max(2, 8))));
        //求两个数的最小值
        System.out.println(Math.min(67, 23));
        //向上取整   ceil  天花板
        System.out.println(Math.ceil(81.1));
        //向下取整   floor  地板
        System.out.println(Math.floor(89.9));//89
        //四舍五入
        System.out.println(Math.round(84.3));//返回值的是int类型的数据
        System.out.println(Math.round(84.8));//返回值的是int类型的数据

        //随机数  返回一个double值为正号，大于等于0.0 ，小于1.0
        System.out.println(Math.random());
        //随机生成一个[0, 100)整数
        System.out.println((int)(Math.random()*100));
    }
}
