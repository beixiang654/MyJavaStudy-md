package com.qf.a_homework;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		int a = max();
		System.out.println("���� ���ֵΪ:"+a);
	}
	//�޲� �з���ֵ��
	public static int max() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������:");
		int i1 = scanner.nextInt();
	
		System.out.println("������ڶ�������:");
		int i2 = scanner.nextInt();
		if (i1 >= i2) {
			return i1;
		} else {
			return i2;
		}
	}
}
