package com.qf.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//printNum(12);//12 是实参  实际参数   实参 会赋值形参
		//在方法处调用 叫实参
		//方法的声明处叫形参   一定是 实参赋值给形参
		
		printHello(6);
		sum(289, 2);
		printStr("狗蛋很狗");
		concate("嘻嘻", "哈哈", "呵呵");
	}
	//
	public static void printNum (int a) {//a 叫形参  形式参数就是一个无值的变量而已
		System.out.println(a);
	}
	
	//声明一个方法打印4遍的hello
	public static void  printHello (int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("hello");
		}
	}
	//声明一个方法求两个int数的和
	public static void sum (int a, int b) {
		System.out.println(a + b);
	}
	//方法打印一个字符串
	public static void printStr (String str) {
		System.out.println(str);
	}
	//方法字符串拼接的方法
	public static void concate (String str, String str1, String str2) {
		System.out.println(str + str1 + str2);
	}
}
