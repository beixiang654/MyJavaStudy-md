package com.qf.test;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		//�����һ��������ʽ ����������[]   ��������� = {ֵ1, ֵ2, ֵ3,...};
		int[] arr = {23, 34, 12, 15};
		System.out.println(arr);//[I@15db9742  �ڴ��ַ   �������ݿ����� ��զ�죿
		System.out.println(Arrays.toString(arr));//  ��һ���ڴ��ַ��ʽ�����ݱ�� ������Կ�����
		//[23, 34, 12, 15]
		
		String[] strs = {"����","�Ĳ�", "����"}; 
		System.out.println(strs);//@6d06d69c
		System.out.println(Arrays.toString(strs));//[����, �Ĳ�, ����]
		
		boolean[] bools = {true, true, false, true};
		System.out.println(bools);//[Z@7852e922
		System.out.println(Arrays.toString(bools));//[true, true, false, true]
		
		float[] f2 = {12.3f, 45.6F};
		
		
		//����һ��char���͵�����
		char[]  chs = {'a', '��', '9'};
		System.out.println(chs);//a��9  ����Ƚ����� ��ӡ���ǵ�ַ  ��������ֵ��ɵ�
		
	}
}
