package com.qf.a_homework;

public class Demo16 {
	public static void main(String[] args) {
		//break
		//break cannot be used outside of a loop or a switch
		
		for (int i = 0; i < 5; i++) {
			System.out.println("������");
			break;//��ֹ
		}
		
		for (int i = 0; i < 8; i++) {
			switch (7) {
			case 1:
				System.out.println("����");
				break;//���break��ϵ���switch -case
			case 7:
				System.out.println("�Ǻ�");
				break ;
			default:
				System.out.println("jcdsjnjn");
				break;
			}
		}
		
	}
}
