package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
enum Color3 {
    RED, GREEN, YELLOW
}
public class Demo3 {
    public static void main(String[] args) {
        Color3[] values = Color3.values();
        for (Color3 value : values) {
            System.out.println(value + "所对应索引为:" + value.ordinal());
        }
        //valueOf();字符串对应的枚举常量
        Color3 red = Color3.valueOf("RED");
        System.out.println(red);
    }
}
