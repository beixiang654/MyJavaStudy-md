package com.qf.a_test;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		char ch1 = scanner.next().charAt(0);
		isNumberChar(ch1);//ch1 ʵ��
	}
	//�в��޷���ֵ�ķ���
	public static void isNumberChar (char ch1) {//ch1 �β�
		if (ch1 >= '0' && ch1 <= '9') {
			System.out.println("�������ַ�");
		} else {
			System.out.println("���������ַ�");
		}
	}
}
