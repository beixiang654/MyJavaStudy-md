package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Student {
    int id;//编号
    String name;
    int age;
    char sex;

    public Student(int id, String name, int age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    //student1.equals(student2)
    public boolean equals (Object obj) {
        //Object obj = student2;  向上转型
        //this===>student1
        //obj ====>student2
        if (this == obj) {//先比较的是内存地址
           return  true;
        }
        //接下来判断对象的内容
        //student2 instanceof Student
        if (obj instanceof Student) {
            Student stu = (Student) obj;//向下转型
            //stu  就是student2
            return stu.id == this.id && stu.name.equals(this.name) && this.age == stu.age && this.sex == stu.sex;
        }
        return false;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "狗蛋", 34, '男');
        Student student2 = new Student(1, "狗蛋", 34, '男');
        System.out.println(student1.equals(student2));//false
        //STudent此时继承Object  要使用父类下面equals方法
        //Obejct  下面的equals方法比较的是地址。所以false
        //但是真实的开始的时候，关注数据的内容，而不是内存地址
        //所以要求equals方法的结果是true。那咋办？
    }
}
