package com.qf.a_test;

public class Demo3 {
	public static void main(String[] args) {
		
		//需求: 打印三遍中午吃鲍鱼
		/**
		 * i=0  0<3 true  执行大括号中的代码 sout（"中午吃鲍鱼"） i++ 
		 * i=1 1<3  true  执行大括号中的代码 sout（"中午吃鲍鱼"） i++
		 * i=2 2<3 true   执行大括号中的代码 sout（"中午吃鲍鱼"）i++
		 * i=3 3<3 false 循环结束
		 */
		int i = 0;//1.初始化的条件
		while (i < 3) {//i < 3  3.终止条件
			System.out.println("中午吃鲍鱼");
			i++;//2.循环条件
		}
		System.out.println("嘻嘻呵呵哒");
	}
}
