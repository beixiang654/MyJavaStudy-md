package com.qf.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//printNum(12);//12 ��ʵ��  ʵ�ʲ���   ʵ�� �ḳֵ�β�
		//�ڷ��������� ��ʵ��
		//���������������β�   һ���� ʵ�θ�ֵ���β�
		
		printHello(6);
		sum(289, 2);
		printStr("�����ܹ�");
		concate("����", "����", "�Ǻ�");
	}
	//
	public static void printNum (int a) {//a ���β�  ��ʽ��������һ����ֵ�ı�������
		System.out.println(a);
	}
	
	//����һ��������ӡ4���hello
	public static void  printHello (int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("hello");
		}
	}
	//����һ������������int���ĺ�
	public static void sum (int a, int b) {
		System.out.println(a + b);
	}
	//������ӡһ���ַ���
	public static void printStr (String str) {
		System.out.println(str);
	}
	//�����ַ���ƴ�ӵķ���
	public static void concate (String str, String str1, String str2) {
		System.out.println(str + str1 + str2);
	}
}
