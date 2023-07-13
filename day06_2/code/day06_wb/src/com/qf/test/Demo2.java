package com.qf.test;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		isNumber();
	}
	//写一个方法，控制台输入一个字符，判断一个字符是否是数字字符
	public static void isNumber () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char a = scanner.next().charAt(0);
		if (a >= '0' && a <= '9') {
			System.out.println("是数字字符");
		} else {
			System.out.println("不是数字字符");
		}
		
	}
}
