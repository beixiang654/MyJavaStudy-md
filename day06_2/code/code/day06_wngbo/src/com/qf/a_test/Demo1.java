package com.qf.a_test;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		isNumberChar();
	}

	// �޲��޷���ֵ�ķ���
	public static void isNumberChar() {
		// дһ���������ж�һ���ַ��Ƿ��������ַ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		char ch1 = scanner.next().charAt(0);
		if (ch1 >= '0' && ch1 <= '9') {
			System.out.println("��һ�������ַ�");
		} else {
			System.out.println("����һ�������ַ�");
		}
	}
}
