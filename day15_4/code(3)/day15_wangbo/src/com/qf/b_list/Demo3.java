package com.qf.b_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("安徽板面加狮子头");
        list.add("北京烤手机");
        list.add("烧饼加馍馍");
        System.out.println(list);//[安徽板面加狮子头, 北京烤手机, 烧饼加馍馍]
        ListIterator<String> sli = list.listIterator();
        while (sli.hasNext()) {
            System.out.println(sli.next());
        }
        System.out.println("========");
        //到此位置 光标在最后
        while (sli.hasPrevious()) {
            System.out.println(sli.previousIndex());
            System.out.println(sli.previous());
        }


    }
}
