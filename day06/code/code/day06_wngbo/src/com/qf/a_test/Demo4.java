package com.qf.a_test;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char ch1 = scanner.next().charAt(0);
		System.out.println(isNumberCharString(ch1));
	}
	//有参有返回值的方法
	public static String isNumberCharString (char ch1) {
		if (ch1 >= '0' && ch1 <= '9') {
			 return "是数字字符";
		} else {
			return "不是数字字符";
		}
	}
}
