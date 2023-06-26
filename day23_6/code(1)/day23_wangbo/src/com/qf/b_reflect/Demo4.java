package com.qf.b_reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 *
 * 公众号:Java架构栈
 */
public class Demo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person person = Person.class.getConstructor(null).newInstance(null);

    }
}
