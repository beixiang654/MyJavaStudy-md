package com.qf.a_homework;

import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = scanner.nextInt();
		System.out.println("������ڶ�������:");
		int b = scanner.nextInt();
		max(a, b);//a  ��  ���������������  ��ʵ��
		
	}
	//�в� �޷���ֵ�ķ���
	public static void max(int a, int b) {//a   ����ʽ����
		
		if (a >= b) {
			System.out.println("���ֵΪ:" + a);
		} else {
			System.out.println("���ֵΪ:" + b);
		}
	}

}
