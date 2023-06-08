package com.qf.test;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		//数组第一种声明方式 ：数据类型[]   数组的名字 = {值1, 值2, 值3,...};
		int[] arr = {23, 34, 12, 15};
		System.out.println(arr);//[I@15db9742  内存地址   但是数据看不到 那咋办？
		System.out.println(Arrays.toString(arr));//  将一个内存地址形式的数据变成 人类可以看懂的
		//[23, 34, 12, 15]
		
		String[] strs = {"狗蛋","文博", "广瑞"}; 
		System.out.println(strs);//@6d06d69c
		System.out.println(Arrays.toString(strs));//[狗蛋, 文博, 广瑞]
		
		boolean[] bools = {true, true, false, true};
		System.out.println(bools);//[Z@7852e922
		System.out.println(Arrays.toString(bools));//[true, true, false, true]
		
		float[] f2 = {12.3f, 45.6F};
		
		
		//声明一个char类型的数组
		char[]  chs = {'a', '中', '9'};
		System.out.println(chs);//a中9  这个比较特殊 打印不是地址  是数组中值组成的
		
	}
}
