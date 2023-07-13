package com.qf.b_list;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("安徽板面加狮子头");
        list.add("北京烤手机");
        list.add("烧饼加馍馍");
        System.out.println(list);
        list.add(1, "胡辣汤");
        list.add("北京烤手机");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("烤肠");
        list1.add("大肠赤身");
        list1.add("蜂蜜灌大肠");
        list.addAll(2, list1);
        System.out.println(list);//[安徽板面加狮子头, 胡辣汤, 烤肠, 大肠赤身, 蜂蜜灌大肠, 北京烤手机, 烧饼加馍馍]
        System.out.println(list.remove(1));//删除的数据  胡辣汤
        System.out.println(list);//被删除之后的数据  [安徽板面加狮子头, 烤肠, 大肠赤身, 蜂蜜灌大肠, 北京烤手机, 烧饼加馍馍]
        System.out.println(list.set(0, "兰州拉面"));
        System.out.println(list);//[兰州拉面, 烤肠, 大肠赤身, 蜂蜜灌大肠, 北京烤手机, 烧饼加馍馍]
        System.out.println(list.get(3));

        System.out.println(list.indexOf("烤肠"));//1
        System.out.println(list.lastIndexOf("北京烤手机"));//6

        List<String> strings = list.subList(2, 4);//要头不要尾
        System.out.println(strings);

    }
}
