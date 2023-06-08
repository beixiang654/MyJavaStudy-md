package com.qf.a_homework;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int i1 = scanner.nextInt();
	
		System.out.println("请输入第二个整数:");
		int i2 = scanner.nextInt();
		
		int i3 = max(i1, i2);
		System.out.println("最大值为:" + i3);
	}
	//有参有返回值的方法
	public static int max (int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
}
