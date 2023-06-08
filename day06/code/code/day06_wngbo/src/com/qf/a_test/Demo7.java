package com.qf.a_test;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		//第一种声明方式
		//声明一个数组类型的数据
		String[] strs = {"狗蛋", "张三", "李四", "王五"};
		System.out.println(strs);//[Ljava.lang.String;@15db9742 
		//关于String数组打印的是内存地址 好不好？  不好 咋办？
		//toString 将内存地址（看不懂）转为字符串（能看懂 对程序有友好）
		System.out.println(Arrays.toString(strs));//[狗蛋, 张三, 李四, 王五]
	
		
		int[] arr= {1, 2,3 , 4, 5};
		System.out.println(arr);//[I@6d06d69c
		System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
		
		//除了char数组其他的都是需要toString 才能看到数据的
		
		char[] chs = {'a', 'b', 'c'};
		System.out.println(chs);//abc
		
	}
}
