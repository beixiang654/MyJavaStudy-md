package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo4 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setSex(Sex.MALE);
        System.out.println(person.getSex().getSexId());
        System.out.println(person.getSex().getSexChar());
    }
}
