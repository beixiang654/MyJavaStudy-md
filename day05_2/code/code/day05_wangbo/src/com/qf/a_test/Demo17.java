package com.qf.a_test;

import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字母:");
		char cha = scanner.next().charAt(0);
		String string = isUpper(cha);
		System.out.println(string);
	}
	//有参有返回值的方法
	public static String isUpper (char c1) {
	
		if (c1 >= 'A' && c1 <= 'Z') {
			return "是大写的英文的字符";
		} 
		return "不是大写的英文的字符";
	}
}
