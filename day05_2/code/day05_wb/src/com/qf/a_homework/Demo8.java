package com.qf.a_homework;

public class Demo8 {
	public static void main(String[] args) {
		//34��ʵ��  ʵ�ʲ���
		printNum(34);
		printHello(8);
		//printHello("goudan");
		printStr("���������̣���������ѩ");
		
		printNStr(9, "���ǻƻ���Գ�");
		
		print66(7);
	}
	public static void  printNum (int sb) {//int  num  ���β�  ��ʽ����
		System.out.println(sb);
	}
	
	//��ӡn���hello  world
	public static void printHello (int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("hello world");
		}
	}
	//��ӡ����ַ���  ��ӡ8��
	public  static void printStr(String str) {
		for (int i = 0; i < 8; i++) {
			System.out.println(str);
		}
	}
	//��ӡn��������ַ���
	public static void printNStr (int a, String str) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}
	
	//��ӡ66�˷���
	public  static void  print66(int num) {
		for (int i = 1; i < num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j +"*"+ i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	
}
