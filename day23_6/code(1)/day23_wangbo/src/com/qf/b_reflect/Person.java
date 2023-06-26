package com.qf.b_reflect;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private Person(int age) {
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat () {
        System.out.println("吃饭");
    }
    public void eat (String xixi) {
        System.out.println(xixi + "吃饭");
    }
    public void eat (int age, String goudan) {
        System.out.println( goudan + age + "吃饭");
    }
    private void sleep () {
        System.out.println("睡觉");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
