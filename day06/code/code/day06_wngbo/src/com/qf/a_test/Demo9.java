package com.qf.a_test;

import java.util.Arrays;

public class Demo9 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		//�������ڸ�ֵ
		arr[0] = 67;
		arr[1] = 78;
		arr[2] = 12;
		//arr[3] = 89;//ArrayIndexOutOfBoundsException
		System.out.println(arr);//�ڴ��ַ
		System.out.println(Arrays.toString(arr));//[67, 78, 12]
	}
}
