package com.qf.a_homework;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������:");
		int i1 = scanner.nextInt();
	
		System.out.println("������ڶ�������:");
		int i2 = scanner.nextInt();
		
		int i3 = max(i1, i2);
		System.out.println("���ֵΪ:" + i3);
	}
	//�в��з���ֵ�ķ���
	public static int max (int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
}
