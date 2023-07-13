package com.qf.a_homework;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		int a = max();
		System.out.println("嘻嘻 最大值为:"+a);
	}
	//无参 有返回值的
	public static int max() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int i1 = scanner.nextInt();
	
		System.out.println("请输入第二个整数:");
		int i2 = scanner.nextInt();
		if (i1 >= i2) {
			return i1;
		} else {
			return i2;
		}
	}
}
