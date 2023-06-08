package com.qf.a_test;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个英文字母:");
		//abcdef
		//012345
		char ch1 = scanner.next().charAt(0);//从控制台获取 你输入的一个字符 给变量ch1
		isUpper(ch1);//ch1实参
		//将实参赋值给形参的
	}
	//有参无返回值的
	public static void isUpper (char ch1) {//ch1形参
		if (ch1 >= 'A' && ch1 <= 'Z') {
			System.out.println("是大写的字母");
		} else {
			System.out.println("不是大写的字母");
		}
	} 
}
