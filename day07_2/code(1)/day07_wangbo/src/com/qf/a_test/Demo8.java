package com.qf.a_test;

import java.util.Arrays;

public class Demo8 {
	public static void main(String[] args) {
		//���һ��������ɾ��ָ���±��Ԫ�أ�Ҫ���ɾ��λ�ÿ�ʼ��֮���Ԫ������ǰ�ơ����ѡ�
		
		
		//ɾ���±�Ϊ2��
		//ѭ����һ��  {1,2,4,4,5}   
		//ѭ���ڶ���  {1,2,4,5,5}
		//{1,2,4,5,0}
		
		//ɾ���±�Ϊ1De
		//ѭ����һ�� {1,3,3,4,5}
		//ѭ���ڶ��� {1,3,4,4,5}
		//ѭ��������{1,3,4,5,5}
		//��ֵ  {1,3,4,5,0}
		int[] arr = {1,2,3,4,5};
		/**
		 * i=2 2< 4 true
		 * 		arr[2] = arr[3]
		 * 		arr[2] = 4==>{1,2,4,4,5} i++
		 * i=3 3<4 true
		 * 		arr[3] = arr[4]==>{1,2,4,5,5} i++
		 * i=4 4<4 false
		 * 
		 * arr[arr.length - 1] = 0;
		 * arr[4] = 0===>{1,2,4,5,0}
		 */
		for (int i = 2; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		System.out.println(Arrays.toString(arr));
 		
	}
}
