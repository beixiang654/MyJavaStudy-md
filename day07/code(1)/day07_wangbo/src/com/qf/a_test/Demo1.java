package com.qf.a_test;

public class Demo1 {
	public static void main(String[] args) {
		//需求：找出int数组中，最大值的索引下标
		int[] arr = {2, 7, 34, 9, 12};
		int maxIndex = 0;//用来接收最大值的下标的变量
		/**
		 * i=1 1<5 true
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[0]< arr[1])
		 * 		if (2 < 7) true
		 * 		maxIndex = 1 i++
		 * i=2 2<5 true 
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[1]< arr[2])
		 * 		if (7 < 34) true
		 * 		maxIndex = 2 i++
		 * i=3 3<5true 
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[2]< arr[3])
		 * 		if (34 < 9) false
		 * 		maxIndex = 2 i++
		 * i=4 4<5 true
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[2]< arr[4])
		 * 		if (34 < 12) false
		 * 		maxIndex = 2 i++
		 * i=5 5<5 false
		 * 
		 * sout(maxIndex)  sout(2)
		 */
		for (int i = 0; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {//只要找到的maxIndex下标的最大值和后面的值进行比较
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}
}
