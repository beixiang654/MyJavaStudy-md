package com.qf.a_test;

public class Demo8 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1  + num2);//30
		//=是赋值号，一定先看=右边的
		/*
		 *斜线**敲回车 是文档注释
		 *1.先算 num1 + num2 = 30
		 *2.将30赋值给 num1
		 */
		num1 = num1 + num2;
		System.out.println(num1);//30
		/**
		 * 1.num1(30) + num2(20)
		 * 2.num1 = 50
		 */
		num1 = num1 + num2;
		System.out.println(num1);//50
		//注意:一定要围绕着变量的概念 变化着的量
		
		num1 = num1 - num2;
		System.out.println(num1);//30
		
		int a = 20;
		int b = 3;
		System.out.println(a * b);
		//除法
		System.out.println(a / b);//取的商的 整数
		//取余
		System.out.println(a % b);//2
		System.out.println(15 / 2);
		//先乘除后加减  先算小括号里面的然后再算小括号外面的
		int c = 2;
		int i1 = a + b * c;
		System.out.println(i1);//26
		int i2 = (a + b) * c;
		System.out.println(i2);//46
		
		
		
	}
}
