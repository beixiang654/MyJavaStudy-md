package com.qf.test;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		isNumber();
	}
	//дһ������������̨����һ���ַ����ж�һ���ַ��Ƿ��������ַ�
	public static void isNumber () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		char a = scanner.next().charAt(0);
		if (a >= '0' && a <= '9') {
			System.out.println("�������ַ�");
		} else {
			System.out.println("���������ַ�");
		}
		
	}
}
