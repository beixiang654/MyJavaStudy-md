package com.qf.a_test;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ�����:");
		int year = scanner.nextInt();//���տ���̨���������
		//int year = 2008;
		boolean ret1  = year % 4 == 0;
		boolean ret2 = year % 100 != 0;
		boolean ret3 = year % 400 == 0;
		System.out.println(ret1);//true
		System.out.println(ret2);//true
		System.out.println(ret3);//false
		//true && true || false====>true
		//�����ܹ���4�������Ҳ��ܱ�100�����������ܱ�400�����������ꡣ
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}
	}
}
