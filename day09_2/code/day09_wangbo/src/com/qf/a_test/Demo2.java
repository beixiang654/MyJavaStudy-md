package com.qf.a_test;


public class Demo2 {
	
	public static void main(String[] args) {
		
		int num1 = 90;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			num1++;
			//������������� ��ѭ���壩���޷�ʹ�ñ��� i
		}
		//System.out.println(i);
	}
	
	public  static void test () {
		
		//int num;
		int num = 90;//������ʱ�������ʱ���ø�ֵ������ʹ�õ�ʹ�ñ��븳ֵ
		//The local variable num may not have been initialized
		System.out.println(num);
	}
	public static void test1 () {
		//System.out.println(num);
	}
	/**
	 * �ܽ᣺ 
	 * 		����.���ֲ������������ʱ�򣬿���������������Ĵ�����
	 * 		
	 */
}
