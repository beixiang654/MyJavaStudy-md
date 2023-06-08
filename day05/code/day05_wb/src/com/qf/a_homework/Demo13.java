package com.qf.a_homework;

import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int b = scanner.nextInt();
		max(a, b);//a  是  控制套输入的数据  是实参
		
	}
	//有参 无返回值的方法
	public static void max(int a, int b) {//a   是形式参数
		
		if (a >= b) {
			System.out.println("最大值为:" + a);
		} else {
			System.out.println("最大值为:" + b);
		}
	}

}
