package com.qf.b_singleinstance;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Person {
    private static Person person = null;
    private Person () {

    }
    public static  Person getInstance() {
        //判断person 对象是否为null

        if (person == null) {
             person = new Person();
        }


        return person;
    }


}
public class Demo1 {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        Person person2 = new Person();
//        System.out.println(person1 == person2);//false
        //一旦new了之后  肯定对象是不等，想要弄成一个单例的 单个实例的
        //只能new一次， 不能在类的外部new对象了
        //1.在实体类中 私有化构造方法.目的不让在类外部再new对象
        //想要对象在实体中new 一个
        //2.创建静态方法，判断对象是否为空，如果对象为空就实例化，如果对象不为空
        //就直接返回
        //
        Person person1 = Person.getInstance();
        Person person2 = Person.getInstance();
        Person person3 = Person.getInstance();
        Person person4 = Person.getInstance();
        Person person5 = Person.getInstance();
        System.out.println(person1 == person2);
    }
}
