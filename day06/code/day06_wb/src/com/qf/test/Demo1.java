package com.qf.test;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		// 写一个方法，控制台输入一个字符，判断一个字符是否是英文字符（包含大写和小写）
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		
		char ch = scanner.next().charAt(0);
		isEnglish(ch);
	}

	// 写成有参？还是无参的？ 有参 参数数据类型是啥？
	public static void isEnglish(char ch1) {
		//从A-Z  或者  a-z  
		if ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z')) {
			System.out.println("是英文字符");
		} else {
			System.out.println("不是英文字符");
		}
	}
}
