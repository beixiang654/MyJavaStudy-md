package com.qf.a_test;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		//��һ��������ʽ
		//����һ���������͵�����
		String[] strs = {"����", "����", "����", "����"};
		System.out.println(strs);//[Ljava.lang.String;@15db9742 
		//����String�����ӡ�����ڴ��ַ �ò��ã�  ���� զ�죿
		//toString ���ڴ��ַ����������תΪ�ַ������ܿ��� �Գ������Ѻã�
		System.out.println(Arrays.toString(strs));//[����, ����, ����, ����]
	
		
		int[] arr= {1, 2,3 , 4, 5};
		System.out.println(arr);//[I@6d06d69c
		System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
		
		//����char���������Ķ�����ҪtoString ���ܿ������ݵ�
		
		char[] chs = {'a', 'b', 'c'};
		System.out.println(chs);//abc
		
	}
}
