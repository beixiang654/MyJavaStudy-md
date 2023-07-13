package com.qf.test;

import java.util.Arrays;

public class Demo12 {
	public static void main(String[] args) {
		int[] arr1 =  test();//将 test方法返回的数据 赋值给arr1  
		System.out.println(Arrays.toString(arr1));
		
	}
	public  static  int[] test () {
		int[] arr = {1,2,3};
		return arr;
	}
}
