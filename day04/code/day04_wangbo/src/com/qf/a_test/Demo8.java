package com.qf.a_test;

public class Demo8 {
	public static void main(String[] args) {
		
		//打印三遍的狗蛋
		//表达式1 是初始化的值
		//表达式2 是终止条件
		//表达式3 循环条件
		/**
		 * i=0  0<3 true 执行后面的大括号中的代码  sout("狗蛋") i++
		 * i=1  1<3 true 执行后面的大括号中的代码  sout("狗蛋") i++
		 * i=2 2<3 true执行后面的大括号中的代码  sout("狗蛋") i++
		 * i=3 3<3 false 不执行大括号中的代码 循环结束
		 */
		for (int i = 0; i < 3; i++) {
			System.out.println("狗蛋");
		}
	}
}
