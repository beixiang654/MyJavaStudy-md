package com.qf.a_test;

import java.util.Arrays;

public class Demo15 {
	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 3};
		/**
		 * i=0 0< 3 
		 * 		�����ڲ�forѭ��
		 * 		j=0 0<3 
		 * 			if(arr[0] > arr[1]) false  ������ j++
		 * 		j=1 1<3 
		 * 			if (arr[1] > arr[2]) true
		 * 				int temp = 5
		 * 				arr[1] = arr[2]====>{1,2,2,3}
		 * 				arr[2] = temp= 5===>{1,2,5,3} j++
		 * 		j=2 2<3 
		 * 			if (arr[2] > arr[3]) true
		 * 			int temp = arr[2]=5;
					arr[2] = arr[3];===>{1,2,3,3}
					arr[3] = temp=5;===>{1,2,3,5} j++
				j=3 3<3 false i++
			i=1 1<3
		 * 		
		 */
		for (int i = 0; i < arr.length - 1; i++) {//��������
			for (int j = 0; j < arr.length - 1 - i; j++) {//ÿ�����ݵ������Ƚ�
				//�����Ƚ�
				if (arr[j] > arr[j + 1]) {
					//����λ��
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
