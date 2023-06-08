package com.qf.a_test;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		sevenPass(20);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int sb = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int dasb = scanner.nextInt();
		
		max(sb, dasb);//sb  dasb  是实参
		printTriangle(100);
	}
	//找出两个数的最大值
		public  static void max (int a, int b) {//a  b 是形参
			if (a >= b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	//逢7过   有参无返回值的方法
	public static void sevenPass (int a) {
		for (int i = 1; i < a; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("过");
			} else {
				System.out.println(i);
			}
		}
	}
	//打印等腰三角形  方法
	public  static void  printTriangle (int num) {
		for (int i = 1; i < num; i++) {//控制行
			for (int j = 1; j <= num - i; j++) {//打印空格
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
}
