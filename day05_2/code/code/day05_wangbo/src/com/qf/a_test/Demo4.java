package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		test();
		System.out.println("==================");
		test();
		System.out.println("--=----------------");
		test();
	}
	//��һ������װ��һ�������У�Ȼ����main���������õ�������ܵ�ʱ��
	//ֻ��Ҫ����һ�������������
	public static void test () {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello world");
		}
	}
}
