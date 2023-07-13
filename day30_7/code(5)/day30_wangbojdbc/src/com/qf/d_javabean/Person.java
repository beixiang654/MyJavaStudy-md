package com.qf.d_javabean;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//4.单独成一个文件
public class Person {
    //1.私有化成员变量
    private Integer id;
    private String name;
    private Integer age;
    //2.提供一个无参构造方法
    public Person () {

    }
    //3.提供setter和getter方法


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
