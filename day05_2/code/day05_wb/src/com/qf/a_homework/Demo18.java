package com.qf.a_homework;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		char x = scanner.next().charAt(0);
		test(x);
		char xx = '0';
		
	}
	public static void test (char ch1) {
		//  char���͵����� ʮ���Ƶ�ASSIC��ֵ��
//		if (ch1 >= 'a' && ch1 <= 'z') {
		if (ch1 >= 97 && ch1 <= 122) {
			System.out.println("��Ӣ�ĵ�Сд�ַ�");
		} else {
			System.out.println("����Ӣ�ĵ�Сд�ַ�");
		}
	}
}
