package com.qf.a_test;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		isEnglish();
	}

	// 无参无返回值的方法
	public static void isEnglish() {
		// 写一个方法，判断一个字符是否是数字字符
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char ch1 = scanner.next().charAt(0);
		if ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z')) {
			System.out.println("是一个英文字符");
		} else {
			System.out.println("不是一个英文字符");
		}
	}
}
