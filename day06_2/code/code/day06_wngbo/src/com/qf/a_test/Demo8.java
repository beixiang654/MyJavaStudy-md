package com.qf.a_test;

import java.util.Arrays;

public class Demo8 {
	public static void main(String[] args) {
		//�ڶ���������ʽ   �������յ�����Ȼ���ٸ�ֵ
		int[] arr = new int[3];//������һ���յ�����[0,0,0]
		System.out.println(Arrays.toString(arr));//[0, 0, 0]
		//������ݣ�զ��ӣ� ͨ���±�������
		//[0, 0, 0]
		// 0  1  2  �±�һ������˳��
		arr[0] = 89;//��89��ֵ���±�Ϊ 0λ�õ����� [89, 0,0]
		System.out.println(Arrays.toString(arr));
		arr[1] = 76;
		System.out.println(Arrays.toString(arr));
		arr[2] = 26;
		System.out.println(Arrays.toString(arr));//[89, 76, 26]
		//arr[3] = 89;//ava.lang.ArrayIndexOutOfBoundsException: 3
		
		//�����ַ�ʽ
		int[] arr1 = new int[] {8, 7, 6, 5};
		System.out.println(Arrays.toString(arr1));
		
	}
}
