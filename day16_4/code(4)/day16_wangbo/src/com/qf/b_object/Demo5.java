package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Teacher {
    int id;
    String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof  Teacher) {
            Teacher teacher = (Teacher) obj;
            return teacher.id == this.id && teacher.name.equals(this.name);
        }
        return false;
    }
    public int hashCode() {
        return id + name.hashCode();
    }
}
public class Demo5 {
    public static void main(String[] args) {
        Teacher tea1 = new Teacher(1, "老邢");
        Teacher tea2 = new Teacher(1, "骚磊");
        System.out.println(tea1.equals(tea2));
        //1.现在关注的是内容，只要内容一样，那么equals返回值就是true
        //咋办？ 重写equals方法  内容只要一样就是true。
        //规定: 如果根据equals(Object)方法两个对象相等，
        // 则在两个对象中的每个对象上调用hashCode方法必须产生相同的整数结果。
        System.out.println(tea1.hashCode());
        System.out.println(tea2.hashCode());
        //到这一步，发现它不符合 规定 咋办? 重写hashCode方法


    }
}
