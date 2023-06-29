package com.qf.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        //将集合中 字符串 转为int类型
        list.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {

                return Integer.valueOf(s);
            }
        }).forEach((Integer s)-> System.out.println(s));

        list.stream().map(s->Integer.valueOf(s)).forEach(s-> System.out.println(s));
    }
}
