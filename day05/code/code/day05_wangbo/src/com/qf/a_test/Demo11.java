package com.qf.a_test;

public class Demo11 {
	public static void main(String[] args) {
		
		//break �ؼ���  �����ֹ
		for (int i = 0; i < 5; i++) {
			System.out.println("������");
			break;//��ֹ ���
		}
		
		switch (2) {
		case 1:
			System.out.println("�����1");
			//break;
		case 2:
			System.out.println("�����2");
			//break;
		case 3:
			System.out.println("�����3");
			break;
		default:
			break;
		}
		
		if (2 > 3) {
			//break;
			//break cannot be used outside of a loop or a switch
		}
		
	}
}
