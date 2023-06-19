package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
enum Sex {
    MALE(0, "未知"),FEMALE(1, "女");
    private Integer sexId;
    private String sexChar;
    Sex(Integer sexId, String sexChar) {
        this.sexId = sexId;
        this.sexChar = sexChar;
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public String getSexChar() {
        return sexChar;
    }

    public void setSexChar(String sexChar) {
        this.sexChar = sexChar;
    }
}
class Person {
    private String name;
    private int age;
    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setSex(Sex.MALE);
        System.out.println(person.getSex().getSexId());
        System.out.println(person.getSex().getSexChar());
    }
}
