package com.qf.a_test;

public class Demo10 {
	public static void main(String[] args) {
		int[] arr = {32, 45, 58};
		//取值，通过下标进行取值的
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);
		System.out.println("=====");
		//遍历   
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		//arr.length  数组的长度
		System.out.println(arr.length);//5
		System.out.println("----------");
		//再次遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("****************");
		String[] strs = {"张三", "李四", "王五", "老六"};
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
