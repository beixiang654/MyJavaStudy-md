package com.qf.a_test;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		System.out.println(isUpper());
	}
	//无参 有返回值的方法
	public static String isUpper () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请书而入一个字符:");
		char c1 = scanner.next().charAt(0);
		if (c1 >= 'A' && c1 <= 'Z') {
			return "是大写的英文的字符";
		} 
		return "不是大写的英文的字符";
		
	}
}
