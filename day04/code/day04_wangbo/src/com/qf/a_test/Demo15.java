package com.qf.a_test;

public class Demo15 {
	public static void main(String[] args) {
		
		/**
		 * i=1 1<5 true
		 * 		���뵽�ڲ��ĵ�һ��forѭ��
		 * 		j=1 1<=3 ��ӡ��һ���ո� j++
		 * 		j=2 2<=3 ��ӡ�ڶ����ո� j++
		 * 		j=3 3<=3 ��ӡ�������ո� j++
		 * 		j=4 4<=3 false
		 * 		���뵽�ڲ��ĵڶ���forѭ��
		 * 		j=1 1<=1 ��ӡһ��* j++		
		 * 		j=2 2 <=1 false ���� i++
		 * i=2 2<5true
		 * 
		 * 		
		 */
		//   *  
		//
		for (int i = 1; i < 5; i++) {//���Ƶ���
			for (int j = 1; j <= 4-i; j++) {//���ƿո�
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {//���Ƶ�*
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
