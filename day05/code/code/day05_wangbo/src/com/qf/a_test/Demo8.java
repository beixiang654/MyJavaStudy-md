package com.qf.a_test;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		sevenPass(20);
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������:");
		int sb = scanner.nextInt();
		System.out.println("������ڶ�������:");
		int dasb = scanner.nextInt();
		
		max(sb, dasb);//sb  dasb  ��ʵ��
		printTriangle(100);
	}
	//�ҳ������������ֵ
		public  static void max (int a, int b) {//a  b ���β�
			if (a >= b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	//��7��   �в��޷���ֵ�ķ���
	public static void sevenPass (int a) {
		for (int i = 1; i < a; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("��");
			} else {
				System.out.println(i);
			}
		}
	}
	//��ӡ����������  ����
	public  static void  printTriangle (int num) {
		for (int i = 1; i < num; i++) {//������
			for (int j = 1; j <= num - i; j++) {//��ӡ�ո�
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
}
