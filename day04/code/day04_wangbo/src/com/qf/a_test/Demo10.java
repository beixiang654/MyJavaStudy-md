package com.qf.a_test;

public class Demo10 {
	public static void main(String[] args) {
		//����2: ��7�� 1~100����
		//1 2 3  4 5  6 �� 8  9  10  11 12  13 ��  15 16 �� 18...
		//1.7�ı�����  i % 7 == 0   2.��λ��7 ��  i % 10 == 7
		//3.ʮλ��7?  i / 10 == 7;
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("��");
			} else {
				System.out.println(i);
			}
		}
		
	}
}
