package com.qf.a_test;

import java.util.Arrays;

public class Demo9 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		remove(arr, 6);
	}
	public static void remove (int[] arr, int index) {
		
		if (index > arr.length) {
			System.out.println("��������±����������أ�����");
			System.exit(0);//�����˳�
		}
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		System.out.println(Arrays.toString(arr));
				
	}
}
