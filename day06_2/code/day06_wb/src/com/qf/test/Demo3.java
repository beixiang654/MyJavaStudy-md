package com.qf.test;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ�����ε���:");
		int a = scanner.nextInt();
		test(a);
	}
	//дһ������������̨����һ����������һ�����������ӡ
	//int a = 3456  ��ӡ  6       5       4     3 
	
	//3456 % 10 = 6    3456 /10 = 345
	//345 % 10 = 5     345 / 10 = 34
	//34 % 10 = 4     34 /10 = 3
	//3 % 10 = 3      3/10= 0
	
	
	public static void  test (int a) {
		//ִ������ �Լ�д
		/**
		 * i=675  675!= 0 true  sout(5) i = i/10  
		 * i=67
		 */
		for (int i = a; i != 0; i/=10) {
			System.out.println(i % 10);
		}
	}
}
