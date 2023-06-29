package com.qf.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("李四");
        list.add("张山");
        list.add("张大山");
        list.add("张小山");
        list.add("狗蛋");
        list.add("卤蛋");
        //List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                System.out.println(s);
            }
        }
       // System.out.println(list1);
        //其实还可以使用流（Stream）的操作
        list.stream().filter((s)->s.startsWith("张")).forEach(s-> System.out.println(s));


        System.out.println("====");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("张");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
