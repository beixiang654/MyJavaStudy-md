package com.qf.a_test;

public class Demo3 {
	public static void main(String[] args) {
		
		//����: ��ӡ��������Ա���
		/**
		 * i=0  0<3 true  ִ�д������еĴ��� sout��"����Ա���"�� i++ 
		 * i=1 1<3  true  ִ�д������еĴ��� sout��"����Ա���"�� i++
		 * i=2 2<3 true   ִ�д������еĴ��� sout��"����Ա���"��i++
		 * i=3 3<3 false ѭ������
		 */
		int i = 0;//1.��ʼ��������
		while (i < 3) {//i < 3  3.��ֹ����
			System.out.println("����Ա���");
			i++;//2.ѭ������
		}
		System.out.println("�����Ǻ���");
	}
}
