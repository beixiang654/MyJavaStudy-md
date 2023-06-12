package com.qf.b_list;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("安徽板面加狮子头");
        list.add("北京烤手机");
        list.add("烧饼加馍馍");
        System.out.println(list);//[安徽板面加狮子头, 北京烤手机, 烧饼加馍馍]
        for (int i = 0; i < list.size(); i++) {
            //刚好通过get方法的遍历的
            System.out.println(list.get(i));
        }
        System.out.println("===========");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------");

    }
}
