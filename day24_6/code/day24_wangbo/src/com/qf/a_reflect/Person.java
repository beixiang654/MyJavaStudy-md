package com.qf.a_reflect;/**
 *description:
 *公司:千锋教育
 *author:博哥
 *公众号:Java架构栈
 */public class Person {
     public String name;
     int age;
     protected double weight;
     private char sex;

     @Override
     public String toString() {
          return "Person{" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                  ", weight=" + weight +
                  ", sex=" + sex +
                  '}';
     }
}
