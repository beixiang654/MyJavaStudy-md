package com.qf.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//��ӡ3���hello
		/**
		 * i=9 ������ִ�е�do�Ժ�ֱ��sout("hello") i++ i=10 10 <12 true
		 * �ص�do ִ��do����Ĵ���sout("hello") i++ i=11 11<12 true
		 * �ص�do  ִ��do����Ĵ���sout("hello") i++ i=12 12<12 false
		 * �����ٻص�do��
		 * �����㲼�����ʽ��Ҫ��ִ��do�������
		 */
		int i = 9;
		do {
			System.out.println("hello");
			i++;
		} while (i < 3);
	}
}
