package com.qf.a_homework;

public class Demo9 {
	public static void main(String[] args) {
		int a = giveNum();//  �᷵��һ��ֵ  5  �����ص����� ������ a
		System.out.println(a);
		
		
		System.out.println(giveString());//���Խ����ص�ֵ  ֱ�Ӵ�ӡ��
		//System.out.println(str);
		
	}
	//����һ���޲��з���ֵ�ķ���
	public  static int giveNum () {
		
		return 5;//����һ��5 ������͵�����
	}
	
	//����һ������ֵ���ַ������͵����ݵķ���
	public static String giveString () {
		String str = "�Ǻ� ˬ�� ";
		str += "xixi";
		return str;
	}
	
	
}
