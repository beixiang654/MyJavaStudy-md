package com.qf.a_test;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		//5. ���һ���������滻������������Ԫ��Ϊ0��Ԫ�أ��滻Ϊָ��Ԫ��  [1,2,3,0,0,0]
		int[] arr = {1,2,3,0,0,0,0};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 250;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
