package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
enum Color1 {
    RED, GREEN, BLUE
}
public class Demo2 {
    public static void main(String[] args) {
        Color1 color1 = Color1.RED;
        switch (color1) {
            case RED:
                System.out.println("是红色");
                break;
            case GREEN:
                System.out.println("是绿色");
                break;
            case BLUE:
                System.out.println("是蓝色");
                break;
        }
    }
}
