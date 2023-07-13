package com.qf.a_test;

public class Demo14 {
	public static void main(String[] args) {
		//byte b1 = 20;
		//short b1 = 30;
		//int b1 = 20;
		//long b1 = 27828L; 不行
		//String b1 = "20";
		//无法打开long类型的值。只允许使用可转换的int值、字符串或枚举变量
		//char b1 = 'a';
		//float b1 = 87.9f;//不行的！！！
		//'a'所对应的十进制的assci码值是97
		//'b'==>98  'c'===>99
		
		
		switch (87) {
		case 87:
			System.out.println("打印了");
			break;

		default:
			break;
		}
	}
}
