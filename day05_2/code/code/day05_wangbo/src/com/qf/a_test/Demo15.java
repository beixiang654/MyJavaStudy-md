package com.qf.a_test;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��Ӣ����ĸ:");
		//abcdef
		//012345
		char ch1 = scanner.next().charAt(0);//�ӿ���̨��ȡ �������һ���ַ� ������ch1
		isUpper(ch1);//ch1ʵ��
		//��ʵ�θ�ֵ���βε�
	}
	//�в��޷���ֵ��
	public static void isUpper (char ch1) {//ch1�β�
		if (ch1 >= 'A' && ch1 <= 'Z') {
			System.out.println("�Ǵ�д����ĸ");
		} else {
			System.out.println("���Ǵ�д����ĸ");
		}
	} 
}
