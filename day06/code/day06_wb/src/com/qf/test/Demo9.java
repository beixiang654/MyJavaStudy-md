package com.qf.test;

import java.util.Arrays;

public class Demo9 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		arr[0][0] = 78;
		arr[0][1] = 89;
		arr[0][2] = 100;
		arr[1][0] = 250;
		arr[1][1] = 101;
		arr[1][2] = 99;
		
		//��һ��[]  ����  �ڶ���[] s����
		//ȡ����  ʹ��ѭ����ȡ
		for (int i = 0; i < 2; i++) {//������
			for (int j = 0; j < 3; j++) {//������
				
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}
}
