package com.qf.a_test;

import java.util.Arrays;

public class Demo14 {
	public static void main(String[] args) {

		// ����һ������ Ŀ������
		int[] arr = {21, 829, 291};
		int[] arr1 = new int[arr.length];//������һ���յ����� �����������ĳ�����һ��de
		System.out.println(Arrays.toString(test(arr , arr1)));

	}
	// ����: ʹ�÷���������{1,2,3} תΪ����һ������ {3,2,1}
	public static int[] test ( int[] arr, int[] arr1) {
		//arr1 �Ǹ���ߵ�֮����µ�����
				/**
				 * i=0,j=2  0<3 true 
				 * 		{21, 829, 291};
				 * 		arr1[2] = arr[0];    ��21 ��ֵ���±�Ϊ  2��λ�õ�arr1����
				 *      arr1=>  [0,0,21]   i++ j--
				 * i=1 j=1 1<3 true
				 * 		arr1[j] = arr[i];
				 * 		arr1[1] = arr[1];
				 * 		arr1[1] = 829;
				 * 		[0,0,21]===>[0, 829, 21] i++ j--
				 * i=2 j=0  2<3 true
				 * 		arr1[j] = arr[i];
				 * 		arr1[j] = arr[2];
				 * 		arr1[j] = 291;
				 * 		arr1[0] = 291;
				 * 		[0, 829, 21]==>[291, 829, 21] i++ j--
				 * i=3 j=-1 3<3false
				 * 		�ϵ�����  �ӵ�һ���ó�������
				 * 		�����µ������� ���һ��������������
				 */
				for (int i = 0,  j = arr.length - 1; i < arr.length; i++, j--) {
					arr1[j] = arr[i];
				}
				return arr1;
				
	}
}
