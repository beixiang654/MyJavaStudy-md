package com.qf.c_lambada;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
@FunctionalInterface//告知编译器 接口是功能性的接口！！！里面只能有一个抽象方法
interface A {
    //无参无返回值的抽象方法
    void test();

}
public class Demo2 {
    public static void main(String[] args) {
        //方法的参数是一个接口对象。咱们现在所学的知识点  匿名内部类
        A a = new A() {
            @Override
            public void test() {
                System.out.println("测试1");
            }
        };
        eat(a);
        System.out.println("=====");
        //再次改进
        eat(new A() {
            @Override
            public void test() {
                System.out.println("测试2");
            }
        });
        System.out.println("---------");
        //无参无返回值
        eat(()-> System.out.println("测试3"));
    }
    //总结: 真实的开发
    //方法的参数是一个功能性的接口，咱们在调用这个方法的时候，可以传入实参
    //实参就是一个lambda表达式而已
    public static void eat (A sb) {
        sb.test();
    }
}
