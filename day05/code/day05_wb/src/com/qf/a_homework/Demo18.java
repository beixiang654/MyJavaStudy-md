package com.qf.a_homework;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char x = scanner.next().charAt(0);
		test(x);
		char xx = '0';
		
	}
	public static void test (char ch1) {
		//  char类型的数据 十进制的ASSIC码值的
//		if (ch1 >= 'a' && ch1 <= 'z') {
		if (ch1 >= 97 && ch1 <= 122) {
			System.out.println("是英文的小写字符");
		} else {
			System.out.println("不是英文的小写字符");
		}
	}
}
