package com.qf.a_linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("狗蛋");
        list.addLast("李四");
        list.add("嘻嘻");
        list.addFirst("张三");
        System.out.println(list);
    }
}
