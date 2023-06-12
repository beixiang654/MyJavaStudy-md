package com.qf.a_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) {
        Collection<Boolean> col = new ArrayList<>();
        col.add(true);
        col.add(false);
        col.add(true);
        col.add(true);
        System.out.println(col);
        Object[] objects = col.toArray();

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
