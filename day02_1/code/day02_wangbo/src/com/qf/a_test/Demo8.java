package com.qf.a_test;

public class Demo8 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1  + num2);//30
		//=�Ǹ�ֵ�ţ�һ���ȿ�=�ұߵ�
		/*
		 *б��**�ûس� ���ĵ�ע��
		 *1.���� num1 + num2 = 30
		 *2.��30��ֵ�� num1
		 */
		num1 = num1 + num2;
		System.out.println(num1);//30
		/**
		 * 1.num1(30) + num2(20)
		 * 2.num1 = 50
		 */
		num1 = num1 + num2;
		System.out.println(num1);//50
		//ע��:һ��ҪΧ���ű����ĸ��� �仯�ŵ���
		
		num1 = num1 - num2;
		System.out.println(num1);//30
		
		int a = 20;
		int b = 3;
		System.out.println(a * b);
		//����
		System.out.println(a / b);//ȡ���̵� ����
		//ȡ��
		System.out.println(a % b);//2
		System.out.println(15 / 2);
		//�ȳ˳���Ӽ�  ����С���������Ȼ������С���������
		int c = 2;
		int i1 = a + b * c;
		System.out.println(i1);//26
		int i2 = (a + b) * c;
		System.out.println(i2);//46
		
		
		
	}
}
