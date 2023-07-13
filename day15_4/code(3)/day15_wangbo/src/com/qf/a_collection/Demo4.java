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
public class Demo4 {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("嘻嘻");
        collection1.add("呵呵");
        collection1.add("哈哈");
        //1.先将集合变成迭代器对象
        Iterator<String> iterator = collection1.iterator();
        //iterator 这个里面还是有数据的！！！
        //boolean	hasNext()
        //如果迭代具有更多元素，则返回 true 。
        //System.out.println(iterator.hasNext());//true
        //E next()
        //返回迭代中的下一个元素。并将光标挪到当前元素上面
        //   [嘻嘻， 呵呵， 哈哈]
        //                  |
//        System.out.println(iterator.next());//嘻嘻
//        System.out.println(iterator.hasNext());//true
//        System.out.println(iterator.next());//呵呵
//        System.out.println(iterator.hasNext());//true
//        System.out.println(iterator.next());//哈哈
//        System.out.println(iterator.hasNext());//false
       // System.out.println(iterator.next());
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

    }
}
