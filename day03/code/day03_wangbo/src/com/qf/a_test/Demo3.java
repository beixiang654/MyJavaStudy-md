package com.qf.a_test;

public class Demo3 {
	public static void main(String[] args) {
		//语法格式:  关系运算符的表达式1 && 关系运算符的表达式2
		//如果表达式都为true的时候整体结果i就为true。如果有一个表达式为false，那么整体就为false
		boolean ret = (3 > 4) && (4 > 2);
		System.out.println(ret);//false
		
		boolean ret1 = (5 >1) && (3 >2) && (9 >= 7);
		System.out.println(ret1);//true
		
	}
}
