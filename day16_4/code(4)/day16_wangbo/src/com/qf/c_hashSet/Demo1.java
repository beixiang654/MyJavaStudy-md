package com.qf.c_hashSet;

import java.util.HashSet;
import java.util.Set;
/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(34);
        set.add(28);
        set.add(18);
        set.add(88);
        set.add(34);
        System.out.println(set);//[34, 18, 88, 28]
        Set<String> set1 = new HashSet<>();
        set1.add("b");
        set1.add("d");
        set1.add("a");
        set1.add("c");
        set1.add("ab");
        System.out.println(set1);
        for (String s : set1) {
            System.out.println(s);
        }
    }
}
