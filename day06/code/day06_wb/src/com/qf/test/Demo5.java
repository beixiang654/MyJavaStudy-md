package com.qf.test;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		
		//第二种声明方式: 数据类型[]   数组的名字 = new  数据类型[容量];
		int[] arr = new int[3];//在声明一个数组 ，且容量为3  只能存放3个数据  空的数组
		//arr = {0,0,0};
		System.out.println(arr);//内存地址
		System.out.println(Arrays.toString(arr));//[0, 0, 0]
		//此时是空的数组  
		String[] strs = new String[4];
		System.out.println(strs);
		System.out.println(Arrays.toString(strs));//[null, null, null, null]
		//这种方式的声明 是好比弄好了桌子 空桌子  
		

		
		
		
	}
}
