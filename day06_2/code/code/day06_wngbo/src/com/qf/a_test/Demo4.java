package com.qf.a_test;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		char ch1 = scanner.next().charAt(0);
		System.out.println(isNumberCharString(ch1));
	}
	//�в��з���ֵ�ķ���
	public static String isNumberCharString (char ch1) {
		if (ch1 >= '0' && ch1 <= '9') {
			 return "�������ַ�";
		} else {
			return "���������ַ�";
		}
	}
}
