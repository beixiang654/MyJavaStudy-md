package com.qf.a_homework;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		max();
	}
	//�޲��޷���ֵ�ķ���   ��������֮���������
	public static void max () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = scanner.nextInt();
		System.out.println("������ڶ�������:");
		int b = scanner.nextInt();
		if (a >= b) {
			System.out.println("������������ֵΪ:" + a);
		} else {
			System.out.println("������������ֵΪ:" + b);
		}
		
	}
	
}
