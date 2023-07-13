package com.qf.a_homework;

import java.util.Scanner;

public class Demo11 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int b = scanner.nextInt();
		if (a >= b) {
			System.out.println("两个数中最大的数为:"+a);
		} else {
			System.out.println("两个数中最大的数为:"+ b);
		}
		
	}
}
