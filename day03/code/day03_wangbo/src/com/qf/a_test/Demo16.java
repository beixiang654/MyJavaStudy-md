package com.qf.a_test;

import java.util.Scanner;

public class Demo16 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//一般会写一个提示的语句
//		System.out.println("请输入一个整数:");
//		int a = scanner.nextInt();//获取的是整数的类型的
//		System.out.println(a);
		
//		System.out.println("请输入一个小数:");
//		double a = scanner.nextDouble();
//		System.out.println(a);
//		System.out.println("请输入一个布尔类型:");
//		boolean b1 = scanner.nextBoolean();
//		System.out.println(b1);
		//输入一个字符串类型的数据
//		System.out.println("请输入一个字符串:");
//		String str = scanner.next();
//		System.out.println(str);
		
		//获取字符，依靠 字符串来获取
		System.out.println("请输入一个字符串:");
		char ch1 = scanner.next().charAt(3);
		System.out.println(ch1);
		
	}
}
