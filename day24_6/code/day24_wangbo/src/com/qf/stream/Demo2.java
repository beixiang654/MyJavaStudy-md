package com.qf.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) {
        //将List集合转为流对象Stream
        List<String> list = new ArrayList<>();
        list.add("狗蛋");
        list.add("喜羊羊");
        list.add("美羊羊");
        list.add("懒羊羊");
        //将list集合转为stream流
        Stream<String> stream = list.stream();
        System.out.println(stream);

        Set<String> set = new HashSet<>();
        set.add("xixi");
        Stream<String> stream1 = set.stream();
        System.out.println(stream1);

        Map<String, String> map = new HashMap<>();
        map.put("001", "狗蛋");
        map.put("002", "张三");
        map.put("003", "李四");
        //map集合是没有stream方法的
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream2 = entries.stream();
        System.out.println(stream2);

    }
}
