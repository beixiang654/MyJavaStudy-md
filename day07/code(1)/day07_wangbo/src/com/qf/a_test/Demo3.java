package com.qf.a_test;

public class Demo3 {
	public static void main(String[] args) {
		//3.需求：在指定的int数组中找出指定的数据第一个的下标
		int[] arr = { 1, 2, 3, 2, 4 };
		int index = -1;//用来指定值记录下标的  打印-1De时候证明在数组中没有此数字
		/**
		 * 执行流程自己写！！！
		 */
		for (int i = 0; i < arr.length; i++) {
			if (89 == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
