package com.qf.a_test;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		System.out.println(isUpper());
	}
	//�޲� �з���ֵ�ķ���
	public static String isUpper () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ���ַ�:");
		char c1 = scanner.next().charAt(0);
		if (c1 >= 'A' && c1 <= 'Z') {
			return "�Ǵ�д��Ӣ�ĵ��ַ�";
		} 
		return "���Ǵ�д��Ӣ�ĵ��ַ�";
		
	}
}
