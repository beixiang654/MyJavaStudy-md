package com.qf.test;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		// дһ������������̨����һ���ַ����ж�һ���ַ��Ƿ���Ӣ���ַ���������д��Сд��
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		
		char ch = scanner.next().charAt(0);
		isEnglish(ch);
	}

	// д���вΣ������޲εģ� �в� ��������������ɶ��
	public static void isEnglish(char ch1) {
		//��A-Z  ����  a-z  
		if ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z')) {
			System.out.println("��Ӣ���ַ�");
		} else {
			System.out.println("����Ӣ���ַ�");
		}
	}
}
