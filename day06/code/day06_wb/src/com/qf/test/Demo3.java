package com.qf.test;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个整形的数:");
		int a = scanner.nextInt();
		test(a);
	}
	//写一个方法，控制台输入一个整数，将一个整数逆序打印
	//int a = 3456  打印  6       5       4     3 
	
	//3456 % 10 = 6    3456 /10 = 345
	//345 % 10 = 5     345 / 10 = 34
	//34 % 10 = 4     34 /10 = 3
	//3 % 10 = 3      3/10= 0
	
	
	public static void  test (int a) {
		//执行流程 自己写
		/**
		 * i=675  675!= 0 true  sout(5) i = i/10  
		 * i=67
		 */
		for (int i = a; i != 0; i/=10) {
			System.out.println(i % 10);
		}
	}
}
