package com.qf.d_javabean;

import org.apache.commons.beanutils.BeanUtils;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        Person person = Person.class.getConstructor().newInstance();
        BeanUtils.setProperty(person, "id", 78);
        BeanUtils.setProperty(person, "name", "狗蛋");
        System.out.println(BeanUtils.getProperty(person, "id"));
        System.out.println(person.getName());
    }
}
