package com.qf.a_test;

public class Demo1 {
	public static void main(String[] args) {
		
		int a1 = 20;
		//��������  x = ���ʽ ? ֵ1 : ֵ2;
		//���ж� a1 > 50  ��ֵ�����true ��30 f��ֵc1  ���Ϊfalse ��0 ��ֵ��c1
		int c1 = a1 > 50 ? 30 : 0;
		System.out.println(c1);
		int c2;
		if ( a1 > 50) {
			c2 = 30;
		} else {
			c2 = 0;
			
		}
		System.out.println(c2);
		
		String str = a1 > 20 ? a1 + "����20" : a1 + "С�ڵ���20";
		System.out.println(str);
		
		//��չ֪ʶ�� �����ַ�����֪ʶ��
		//�������һ���ַ�������
		String str1 = "���ܳԵĲ���";
		System.out.println(str1);
		//�ַ���ƴ��  ����ʹ�� +
		str1 = str1 + "����";//���+ ��������е�+ ��һ��
		System.out.println(str1);//���ܳԵĲ��ܹ���
		
		str1 = str1 + 89;//�ַ��� + int����  ���ַ���ƴ��
		System.out.println(str1);
		str1 = str1 + true;
		System.out.println(str1);
		//�ܽ᣺ �ַ�������������������Ͷ����ַ�����ƴ��
		
	}
}
