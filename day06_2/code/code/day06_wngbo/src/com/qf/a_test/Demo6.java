package com.qf.a_test;

public class Demo6 {
	public static void main(String[] args) {
		printReverse();
	}
	public  static void printReverse () {
		int a = 1235892;
		/**
		 * 12345 % 10 = 5     12345 / 10 = 1234
		 * 1234 % 10 = 4      1234 /10 = 123
		 * 123 % 10 = 3       123 / 10 = 12
		 * 12 % 10 = 2        12 /10 =1
		 * 1 %10 = 1          1/10 = 0  
		 * ѭ����������:
		 * 	1.��ʼ������   int  a = 12345;
		 * 	2.ѭ������   a = a/ 10     
		 * 	3.��ֹ����  a != 0
		 */
		while (a != 0) {
			System.out.println(a % 10);
			//a = a / 10;
			a /= 10;
		}
	}
}
