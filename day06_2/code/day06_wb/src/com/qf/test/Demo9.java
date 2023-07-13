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
		
		//第一个[]  是行  第二个[] s是列
		//取数据  使用循环来取
		for (int i = 0; i < 2; i++) {//控制行
			for (int j = 0; j < 3; j++) {//控制列
				
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}
}
