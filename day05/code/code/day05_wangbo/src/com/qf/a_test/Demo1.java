package com.qf.a_test;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		//11����������int�͵����ݣ�
		//���뵽a,b,c����������ȥ��
		//ʹ�������ṹ�ͽ����߼������������е�ֵ��С�������С�
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a  = scanner.nextInt();
		System.out.println("������ڶ�������:");
		int b = scanner.nextInt();
		System.out.println("���������������:");
		int c = scanner.nextInt();
		//System.out.println(a + ":" + b + ":" + c );
		
		//�����ֵ
		int max = a;//��a��ֵ���� max����
		if (b > a && b > c) {
			max = b;//������b����� ��ֵ��max����
			
		}
		if (c > a && c > b) {
			max = c;//
		}
		//����Сֵ
		int min = a;
		if (b < a && b < c) {
			min = b;
		}
		if (c < a && c < b) {
			min = c;
		}
		int middle = (a + b + c) - (max + min);//�м�ֵ
		System.out.println(min + ":" + middle + ":" + max);
		
		
		  
		
	}
}
