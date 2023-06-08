package com.qf.a_test;

import java.util.Arrays;

public class Demo14 {

	public static void main(String[] args) {
		//选择排序
		int[] arr = {3, 4, 2, 1};
		/**
		 * i=0 0< 3 
		 * 		进入到了内层for循环
		 * 		minIndex=0   j=1 1<4 true
		 * 		if (3 >4) false  minIndex=0 j++
		 * 			j=2 2<4 true 
		 * 		if (3> 2) true  minIndex=2 j++
		 * 			j=3 3<4 true
		 * 		if (2 >1) true minIndex=3 j++
		 * 		j=4  4<4 false
		 * 		//交换位置
		 * 		int temp = 3;
		 * 		arr[0] = arr[minIndex]=1==>[1,4,2,1]
		 * 		arr[3] = 3===>[1, 4, 2, 3]
		 * 		第一个数交换完成 i++
		 * i=1 1<3
		 * 		进入到内层for循环
		 * 		minIndex=1
		 * 		j=2 2<4 
		 * 		if(arr[1] > arr[2])  4>2 true
		 * 		minIndex=2 j++
		 * 		j=3 3<4 true
		 * 		if (arr[2] > arr[3]) 2>3false
		 * 		minIndex=2 j++
		 * 		j=4 4<4 false
		 * 		交换位置
		 * 		int temp=arr[1] = 4
		 * 		arr[1] = arr[2]===>{1, 2,2,3}
		 * 		arr[2] = 4;===>{1,2,4,3}
		 * 		第二次交换结束 i++
		 * i=2 2<3 true
		 * 		进入到内层的for循环
		 * 		minIndex=2
		 * 		j=3 3<4 
		 * 		if (arr[2] > arr[3]) true
		 * 		minIndex = 3
		 * 		j++
		 * 		j=4 4<4false
		 * 		//交换位置
			int temp = arr[2]=4
			arr[2] = arr[3];===>{1,2,3,3}
			arr[3] = temp = 4;===>{1,2,3,4}
			i++
			i=3 3<3 false 循环结束
		 * 
		 * 
		 */
		for (int i = 0; i < arr.length - 1; i++) {//交换的次数
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
				
			}
			//交换位置
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
