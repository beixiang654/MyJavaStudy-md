package com.qf.a_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

public class Demo1 {
    public  static void main(String[] args) {
        //Java中封装的有实现类  ArrayList
        Collection<String> collection = new ArrayList<>();
        //但是 只能使子类重写父类的那个方法，子类独有的方法不能使用！！
        System.out.println(collection);//[]
        collection.add("狗蛋");
        collection.add("吴彦祖");
        collection.add("狗蛋");
        collection.add("闫世达");
        System.out.println(collection);//[狗蛋, 吴彦祖, 闫世达]
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("嘻嘻");
        collection1.add("哈哈");
        collection.addAll(collection1);//将collection1数据存到collection
        System.out.println(collection);//[狗蛋, 吴彦祖, 闫世达, 嘻嘻, 哈哈]
        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(21);
        collection2.add(22);
        collection2.add(23);
        //collection.addAll(collection2);
        System.out.println(collection.remove("闫世达"));
        System.out.println(collection);//被删除以后的集合的数据
        System.out.println(collection.remove("闫世达"));//如被删除的元素如果没有话的，就是false
        collection.remove("狗蛋");
        System.out.println(collection);//[吴彦祖, 狗蛋, 嘻嘻, 哈哈]
        Collection<String> collection3 = new ArrayList<>();
        collection3.add("嘻嘻");
        collection3.add("呵呵");
        collection3.add("哈哈");
        collection.removeAll(collection3);
        System.out.println(collection);//[吴彦祖, 狗蛋]
//        collection.clear();
//        System.out.println(collection);//[]
        System.out.println(collection.size());//2
        System.out.println(collection.contains("狗蛋"));//true
        System.out.println(collection.isEmpty());//false 因为不为空

        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }
}
