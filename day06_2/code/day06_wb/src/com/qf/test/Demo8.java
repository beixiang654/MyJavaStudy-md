package com.qf.test;

public class Demo8 {
	public static void main(String[] args) {
		int[] arr = {32, 45, 89, 12, 999, 5667};
		//获取数组中的值
		System.out.println(arr[0]);//32
		System.out.println(arr[1]);//45
		System.out.println(arr[2]);//89
		System.out.println(arr[3]);//12
		System.out.println("==============");
		
		for (int i = 0; i < 4; i++) {
			//i的循环的值 刚好作为数组的下标
			System.out.println(arr[i]);
		}
		
		//数组.length    数组的长度
		System.out.println(arr.length);//  arr的长度    4
		
		System.out.println("---------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		String[] strs = {"张三", "狗蛋", "麻子", "嘻嘻"};
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
	}
}
