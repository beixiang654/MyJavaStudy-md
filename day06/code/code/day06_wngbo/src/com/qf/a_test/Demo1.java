package com.qf.a_test;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		isNumberChar();
	}

	// 无参无返回值的方法
	public static void isNumberChar() {
		// 写一个方法，判断一个字符是否是数字字符
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char ch1 = scanner.next().charAt(0);
		if (ch1 >= '0' && ch1 <= '9') {
			System.out.println("是一个数字字符");
		} else {
			System.out.println("不是一个数字字符");
		}
	}
}
