package com.qf.a_homework;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		max();
	}
	//无参无返回值的方法   求两个数之间的最大的数
	public static void max () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int b = scanner.nextInt();
		if (a >= b) {
			System.out.println("两个数中最大的值为:" + a);
		} else {
			System.out.println("两个数中最大的值为:" + b);
		}
		
	}
	
}
