package com.qf.a_test;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		String string = isNumberChar();
		System.out.println(string);
		System.out.println(isNumberChar());
//		int a = 30;
//		System.out.println(a);
//		System.out.println(30);
	}
	//无参有返回值的方法
	public static  String isNumberChar () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char ch1 = scanner.next().charAt(0);
		if (ch1 >= '0' && ch1 <= '9') {
			return "是一个数字字符";
		} 
		return "不是数字字符";
		
		
	}
}
