package com.qf.a_test;

import java.util.Arrays;

public class Demo13 {
	public static void main(String[] args) {
		// �ҳ���������С��Ԫ�أ��ŵ��±�Ϊ0��λ�� ����һ��
		int[] arr = { 7, 9, 3, 11 };
		// {3, 9, 7,11}
		int minIndex = 0;
		/**
		 * �Լ�дע��
		 */
		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		// ����ѭ��������Сֵ�������±꣡����
		//System.out.println(minIndex);
		// {3,9,3,11}
		// զ���� ���±�Ϊ2De���ݸ��±�Ϊ0 ��λ�ã� �±�Ϊ0��λ�õ����ݸ��±�Ϊ2λ��
		// �м����
		int temp = arr[minIndex];// ��3 ��ֵ��һ������ temp
		arr[minIndex] = arr[0];// {7, 9, 7, 11}
		arr[0] = temp;// {3, 9, 7, 11}
		System.out.println(Arrays.toString(arr));// [3, 9, 7, 11]
		// ����Сֵ���±ꡣȻ��ͨ���±���н���
		//Ȼ��������� [9, 7, 11]����Сֵ���±� Ȼ����±�Ϊ1De�ط����н���
		int minIndex1 = 1;//�±�Ϊ0De�Ѿ��������,���Դ�1��ʼ
		for (int i = 2; i < arr.length; i++) {
			if (arr[minIndex1] > arr[i]) {
				minIndex1 = i;
			}
		}
		System.out.println(minIndex1);
		//��ʼ����
		int temp1 = arr[minIndex1];//7��temp1
		arr[minIndex1] = arr[1];//{3,9,9,11}
		arr[1] = temp1;//{3, 7, 9, 11}
		
		
		
	}
}
