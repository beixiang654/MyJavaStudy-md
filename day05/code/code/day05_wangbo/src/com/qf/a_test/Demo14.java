package com.qf.a_test;

public class Demo14 {
	public static void main(String[] args) {

		isUpper();
//		char ch2 = 97;
//		char ch3 = 'a';

	}

	// �Ƿ��Ǵ�д������
	//�޲��޷���ֵ�ķ���
	public static void isUpper() {
		// �ж��Ƿ��Ǵ�д��Ӣ���ַ�
		char ch1 = 'H';// ����һ��char���� �ַ�����
		// if (ch1 >= 'A' && ch1 <= 'Z') {
		// Java���������ַ�����Ĭ�ϵ�תΪʮ���Ƶ�int���� ��ascii��ֵ
		if (ch1 >= 65 && ch1 <= 90) {

			System.out.println("�Ǵ�д����ĸ");
		} else {
			System.out.println("���Ǵ�д����ĸ");
		}
	}
}
