package com.qf.a_test;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ�����:");
		int year = scanner.nextInt();
		if  (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("������");
		} else {
			System.out.println("��ƽ��");
		}
	}
}
