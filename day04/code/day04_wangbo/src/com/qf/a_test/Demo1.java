package com.qf.a_test;

public class Demo1 {
	public static void main(String[] args) {
		
		int a1 = 20;
		//数据类型  x = 表达式 ? 值1 : 值2;
		//先判断 a1 > 50  的值，如果true 将30 f赋值c1  如果为false 将0 赋值给c1
		int c1 = a1 > 50 ? 30 : 0;
		System.out.println(c1);
		int c2;
		if ( a1 > 50) {
			c2 = 30;
		} else {
			c2 = 0;
			
		}
		System.out.println(c2);
		
		String str = a1 > 20 ? a1 + "大于20" : a1 + "小于等于20";
		System.out.println(str);
		
		//扩展知识点 关于字符串的知识点
		//如何声明一个字符串变量
		String str1 = "不能吃的不能";
		System.out.println(str1);
		//字符串拼接  可以使用 +
		str1 = str1 + "狗蛋";//这个+ 和运算符中的+ 不一样
		System.out.println(str1);//不能吃的不能狗蛋
		
		str1 = str1 + 89;//字符串 + int数据  还字符串拼接
		System.out.println(str1);
		str1 = str1 + true;
		System.out.println(str1);
		//总结： 字符串加上任意的数据类型都是字符串的拼接
		
	}
}
