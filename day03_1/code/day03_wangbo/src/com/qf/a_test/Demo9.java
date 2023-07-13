package com.qf.a_test;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个年份:");
		int year = scanner.nextInt();//接收控制台输入的数据
		//int year = 2008;
		boolean ret1  = year % 4 == 0;
		boolean ret2 = year % 100 != 0;
		boolean ret3 = year % 400 == 0;
		System.out.println(ret1);//true
		System.out.println(ret2);//true
		System.out.println(ret3);//false
		//true && true || false====>true
		//年数能够被4整除并且不能被100整除。或者能被400整除的是闰年。
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
	}
}
