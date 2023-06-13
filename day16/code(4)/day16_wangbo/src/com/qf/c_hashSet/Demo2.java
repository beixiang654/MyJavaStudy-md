package com.qf.c_hashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Phone {
    String name;
    double price;//价格

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }



    @Override
    public int hashCode() {
        //将name 和 price 两个值 进行hash计算变成一个具体的int类型的hahs
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Set<Phone> set = new HashSet<>();
        Phone phone1 = new Phone("ab", 4567.2);
        System.out.println("phone1的hash值:" + phone1.hashCode());
        set.add(phone1);
        Phone phone2 = new Phone("ba", 4567.2);
        System.out.println("phone2的hash值:" + phone2.hashCode());
        set.add(phone2);
        Phone phone3 = new Phone("华为", 4567.2);
        System.out.println("phone3的hash值:" + phone3.hashCode());
        set.add(phone3);
        System.out.println(set);
        //为啥都能存进去？因为hashSet的底层是按照hash值进行存储的
        //如果hash值是一样的话，那么肯定存不进去。
        //Phone 继承Object   默认去调用Object的hashCode方法(十六进制转为十进制表示形式)
        //内存不一样 意味hash值不一样的

        //存进去是不合适的。因为关注的是内容。如果内容一样，不能存到Set集合中
        //那咋办？ 重写equals方法和hashCode




    }
}
