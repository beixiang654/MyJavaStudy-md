package com.qf.a_test;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		//11、输入三个int型的数据，
		//放入到a,b,c三个变量中去，
		//使用条件结构和交换逻辑这三个变量中的值从小到大排列。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a  = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int b = scanner.nextInt();
		System.out.println("请输入第三个整数:");
		int c = scanner.nextInt();
		//System.out.println(a + ":" + b + ":" + c );
		
		//找最大值
		int max = a;//将a赋值给了 max变量
		if (b > a && b > c) {
			max = b;//将最大的b的情况 赋值给max变量
			
		}
		if (c > a && c > b) {
			max = c;//
		}
		//找最小值
		int min = a;
		if (b < a && b < c) {
			min = b;
		}
		if (c < a && c < b) {
			min = c;
		}
		int middle = (a + b + c) - (max + min);//中间值
		System.out.println(min + ":" + middle + ":" + max);
		
		
		  
		
	}
}
