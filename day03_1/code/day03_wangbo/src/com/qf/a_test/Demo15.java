package com.qf.a_test;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		
		//sc是一个变量
		//Java面向对象 思想:专门的对象做专门的事
		//Scanner  sc = new Scanner(System.in)   创建了一个对象 叫sc
		//Scanner 专门  是一扫描器，扫描控制台你手动输入的数据
		Scanner  sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a = sc.nextInt();
		System.out.println(a);
	}
}
