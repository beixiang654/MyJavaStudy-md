package com.qf.a_test;

import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����ĸ:");
		char cha = scanner.next().charAt(0);
		String string = isUpper(cha);
		System.out.println(string);
	}
	//�в��з���ֵ�ķ���
	public static String isUpper (char c1) {
	
		if (c1 >= 'A' && c1 <= 'Z') {
			return "�Ǵ�д��Ӣ�ĵ��ַ�";
		} 
		return "���Ǵ�д��Ӣ�ĵ��ַ�";
	}
}
