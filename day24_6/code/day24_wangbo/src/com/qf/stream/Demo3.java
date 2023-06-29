package com.qf.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("李四");
        list.add("张山");
        list.add("张大山");
        list.add("张小山");
        list.add("狗蛋");
        list.add("卤蛋");
        //统计流中有几个元素
        long count = list.stream().count();
        System.out.println(count);//6

        //遍历数据
        list.stream().forEach((s)-> System.out.println(s));

    }
}
