package com.qf.a_test;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char ch1 = scanner.next().charAt(0);
		isNumberChar(ch1);//ch1 实参
	}
	//有参无返回值的方法
	public static void isNumberChar (char ch1) {//ch1 形参
		if (ch1 >= '0' && ch1 <= '9') {
			System.out.println("是数字字符");
		} else {
			System.out.println("不是数字字符");
		}
	}
}
