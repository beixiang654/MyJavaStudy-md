package com.qf.a_test;

public class Demo13 {
	public static void main(String[] args) {
		/**
		 * ��ӡѧ���ĳɼ�
		 * 	90~100:  ��ӡ����
		 * 	80~89: ��ӡ ����
		 * 	70~79: ��ӡ һ��
		 * 	60~69: ��ӡ����
		 * 	60����: ��ӡ������ҪŬ����  
		 * ֮ǰ�����õ���  if-else if
		 * ������Ҫ�� ��swicth-case
		 */
		int score = 28;
		//�ҹ���:  90~100    91/10=9   92/10 =9  99/10=9
		//87/10=8  81/10=8
		switch (score / 10) {
		case 10:
			System.out.println("����");
			break;
		case 9:
			System.out.println("����");
			break;
		case 8:
			System.out.println("����");
			break;
		case 7:
			System.out.println("һ��");
			break;
		case 6:
			System.out.println("����");
			break;
		default:
			System.out.println("������ҪŬ��");
			break;
		}
	}
}
