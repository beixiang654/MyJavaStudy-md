package com.qf.test;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		//�ڶ��������������ʽ
		int[] arr = new int[3];//arr = {0,0,0};
		//������յ�������еĵĸ�ֵ
		arr[0] = 23;//��23d��ֵ�� �±�Ϊ0 ��arr�������  arr = [23, 0, 0]
		//System.out.println(Arrays.toString(arr));
		arr[1] = 45;
		//System.out.println(Arrays.toString(arr));//arr = [23, 45, 0]
		arr[2] = 678;
		System.out.println(Arrays.toString(arr));//arr = [23, 45, 678]
		//arr[3] = 250;  ����±�Խ��
		//ArrayIndexOutOfBoundsException   �����±�Խ��
		//System.out.println(Arrays.toString(arr));
		
		
		System.out.println("=========");//arr = [23, 45, 678]
		/**
		 * i=0  0<3  true   arr[0] = 89   arr = [89, 45, 678] i++
		 * i=1 1<3  true  arr[1] = 90 arr=[89, 90, 678] i++
		 * i=2 2<3  true  arr[2]= 91  arr =[89, 90, 91] i++
		 * i=3 3<3 false  ѭ�������Ժ�  arr =[89, 90, 91]
		 */
		for (int i = 0; i < 3; i++) {
			arr[i] = 89 + i;
		}
		
		System.out.println(Arrays.toString(arr));//[89, 90, 91]
		
	}
}
