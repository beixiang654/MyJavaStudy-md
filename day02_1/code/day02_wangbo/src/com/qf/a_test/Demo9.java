package com.qf.a_test;

public class Demo9 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		/**
		 * 1. num1 + num2 = 30
		 * 2.num1 = 30
		 */
		//num1 = num1 + num2;
		//�Ǽ�д��һ�����
		num1 += num2;//num1 + num2 Ȼ����  ��ֵ num1
		System.out.println(num1);//30
		
		int a = 3;
		a += 2;//
		/**
		 * 1. a+ 2 =5
		 * 2.��5��ֵ��a
		 */
		System.out.println(a);
		int b= 3;
		//4 += b;
		/**
		 *1.  4 + 3 = 7
		 *2. 4 = 7
		 */
		
	}
	
}
