package com.qf.a_test;

import java.util.Arrays;

public class Demo10 {
	public static void main(String[] args) {
		
		//7���ָ��Ԫ�ص�ָ���±�λ�ã�Ҫ���ָ���±�λ��֮���Ԫ�أ���������ƶ������ѡ�
		int[] arr = {1, 2, 4, 6, 0};
		
		/**
		 * i=4  4>2 true
		 * 	arr[4] = arr[3]
		 * 	arr[4] = 6===>{1,2,4,6,6} i--
		 * i=3 3>2 true
		 * 	arr[3] = arr[2]====>{1,2,4,4,6} i--
		 * i=2 2>2 false
		 * arr[2]  = 250===>{1,2,250,4,6}
		 * 	
		 */
		for (int i = arr.length - 1; i > 2; i--) {
			arr[i] = arr[i - 1];
		}
		arr[2] = 250;
		System.out.println(Arrays.toString(arr));
	}
}
