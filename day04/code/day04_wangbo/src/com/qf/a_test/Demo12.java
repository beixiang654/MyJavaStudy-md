package com.qf.a_test;

public class Demo12 {
	public static void main(String[] args) {
//		System.out.println("****");
//		System.out.println("****");
//		System.out.println("****");
//		�ظ�������forѭ���Ľ�һ��
//		for (int i = 0; i < 3; i++) {
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.println();
//		}
		//�����ٸĽ�
		/**
		 * i=0  0<3 true ִ�д������еĴ��� 
		 * 		�����ڲ��forѭ��
		 * 		j=0 0<4 true sout(*) j++
		 * 		j=1 1<4 true sout(*) j++
		 * 		j=2 2<4 true sout(*) j++
		 * \	j=3 3<4 true sout(*) j++
		 * 		j=4 4<4 false ִ�л���   i++
		 * i=1 1<3 true ִ�д������еĴ��� 
		 * 		�ڶ��ν����ڲ��forѭ��
		 * 		j=0 0<4 true sout(*) j++
		 * 		j=1 1<4 true sout(*) j++
		 * 		j=2 2<4 true sout(*) j++
		 * 		j=3 3<4 true sout(*) j++
		 * 		j=4 4<4 false ����   i++
		 * i=2  2<3  true ִ�д������еĴ��� 
		 * 		�����ν��뵹���ڲ�forѭ��
				j=0 0<4 true sout(*) j++
		 * 		j=1 1<4 true sout(*) j++
		 * 		j=2 2<4 true sout(*) j++
		 * 		j=3 3<4 true sout(*) j++
		 * 		j=4 4<4 false ����   i++
		 * 	i=3 3<3 false
		 * 	
		 */
		//****
		//****
		//****
		
		for (int i = 0; i < 3; i++) {//�����ѭ��������
			for(int j = 0; j < 4; j++) {//���ڲ�ѭ��������
				System.out.print("*");
			}
			System.out.println();//����
		}
	}
}
