package com.qf.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("老邢");
        strings.add("老邢xiao");
        strings.add("张三");
        strings.add("狗蛋");
        strings.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                boolean b = s.contains("邢");
                return b;
            }
        }).forEach(s-> System.out.println(s));
        strings.stream().filter(s->s.contains("邢")).forEach(s-> System.out.println(s));





    }
}
