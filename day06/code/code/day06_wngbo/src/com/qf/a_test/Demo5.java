package com.qf.a_test;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		isEnglish();
	}

	// �޲��޷���ֵ�ķ���
	public static void isEnglish() {
		// дһ���������ж�һ���ַ��Ƿ��������ַ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		char ch1 = scanner.next().charAt(0);
		if ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z')) {
			System.out.println("��һ��Ӣ���ַ�");
		} else {
			System.out.println("����һ��Ӣ���ַ�");
		}
	}
}
