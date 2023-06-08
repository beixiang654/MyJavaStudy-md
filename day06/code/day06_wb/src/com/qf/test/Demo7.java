package com.qf.test;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		//第二种数组的声明方式
		int[] arr = new int[3];//arr = {0,0,0};
		//对这个空的数组进行的的赋值
		arr[0] = 23;//将23d赋值给 下标为0 的arr这个数组  arr = [23, 0, 0]
		//System.out.println(Arrays.toString(arr));
		arr[1] = 45;
		//System.out.println(Arrays.toString(arr));//arr = [23, 45, 0]
		arr[2] = 678;
		System.out.println(Arrays.toString(arr));//arr = [23, 45, 678]
		//arr[3] = 250;  这个下标越界
		//ArrayIndexOutOfBoundsException   数组下标越界
		//System.out.println(Arrays.toString(arr));
		
		
		System.out.println("=========");//arr = [23, 45, 678]
		/**
		 * i=0  0<3  true   arr[0] = 89   arr = [89, 45, 678] i++
		 * i=1 1<3  true  arr[1] = 90 arr=[89, 90, 678] i++
		 * i=2 2<3  true  arr[2]= 91  arr =[89, 90, 91] i++
		 * i=3 3<3 false  循环结束以后  arr =[89, 90, 91]
		 */
		for (int i = 0; i < 3; i++) {
			arr[i] = 89 + i;
		}
		
		System.out.println(Arrays.toString(arr));//[89, 90, 91]
		
	}
}
