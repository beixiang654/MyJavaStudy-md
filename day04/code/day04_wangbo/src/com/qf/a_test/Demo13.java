package com.qf.a_test;

public class Demo13 {
	public static void main(String[] args) {
		/**
		 * i=1 1<5 true 
		 * 		���뵽�ڲ�forѭ��
		 * 		j=1 1<=1 true sout(*) j++
		 * 		j=2 2<=1 false ���� i++
		 * i=2 2<5 true
		 * 		���뵽�ڲ�forѭ��
		 * 		j=1 1<=2 true sout(*) j++
		 * 		j=2 2<=2 true sout(*) j++
		 * 		j=3 3<=2 false ���� i++
		 * i=3 3<5 true
		 * 		���뵽�ڲ�forѭ��
		 * 		j=1 1<=3 true sout(*) j++
		 * 		j=2 2<=3 true sout(*) j++
		 * 		j=3 3<=3 true sout(*) j++
		 * 		j=4 4<=3false ���� i++
		 * i=4 
		 */
		//*
		//**
		//***
		//****
		for (int i = 1; i < 5; i++) {//���Ƶ��� 4��
			for (int j = 1; j <= i; j++) {//���Ƶ���   ����
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
