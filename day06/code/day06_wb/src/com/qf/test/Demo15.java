package com.qf.test;

public class Demo15 {
	
	public static void main(String[] args) {
		//找到数组中最大值的下标
		int[] arr = {1,2,3,1};
		int maxIndex = 0;//用来接收最大值的下标的
		/**
		 * i=1 1<4  if arr[0] < arr[1]  1<2 true  maxIndex = 1 i++
		 * i=2 2<4 if arr[1] < arr[2] 2<3 true maxIndex = 2 i++
		 * i=3 3<4 if arr[2] <arr[3] 3<1 false maxIndex = 2 i++
		 * i=4 4<4 false  循环结束
		 * 输出maxIndex   = 2 
		 */
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}
}
