package com.qf.a_test;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个年份:");
		int year = scanner.nextInt();
		if  (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("是闰年");
		} else {
			System.out.println("是平年");
		}
	}
}
