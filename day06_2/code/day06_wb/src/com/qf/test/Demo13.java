package com.qf.test;

import java.util.Arrays;

public class Demo13 {
	public static void main(String[] args) {
		
		//{1,2,3,4}  =>  {4,3,2,1}
		int[] arr = {1, 2, 3, 4};
		int[] arr1 = new int[arr.length];//arr1 = {0, 0, 0, 0}
		/**
		 * i=0,j=3   0<4 true  arr1[3] = arr[0]==>arr1[3] = 1=>arr1={0,0,0,1} i++, j--
		 * i=1,j=2  1<4 true  arr1[2] =arr[1]==> arr1[2] = 2=>arr1={0,0,2,1} i++, j--
		 * i=2 , j=1 2<4 true arr1[1]=arr[2]===>arr1[1]=3 ===>arr1={0,3,2,1} i++, j--
		 * i=3, j=0  3<4 true  arr1[0]=arr[3]====>arr1[0]=4 ====>arr1={4,3,2,1} i++,j--
		 * i=4 ,j=-1 4<4  false
		 * 
		 * Ñ­»·ÄØ½áÊø
		 * 
		 */
		for (int i = 0,  j = arr.length - 1; i < arr1.length; i++, j--) {
			arr1[j] = arr[i];
		}
		System.out.println(Arrays.toString(arr1));
	}
	
	
}
