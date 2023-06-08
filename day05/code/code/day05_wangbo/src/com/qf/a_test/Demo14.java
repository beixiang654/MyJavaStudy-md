package com.qf.a_test;

public class Demo14 {
	public static void main(String[] args) {

		isUpper();
//		char ch2 = 97;
//		char ch3 = 'a';

	}

	// 是否是大写！！！
	//无参无返回值的方法
	public static void isUpper() {
		// 判断是否是大写的英文字符
		char ch1 = 'H';// 声明一个char类型 字符类型
		// if (ch1 >= 'A' && ch1 <= 'Z') {
		// Java编译器会字符类型默认的转为十进制的int类型 叫ascii码值
		if (ch1 >= 65 && ch1 <= 90) {

			System.out.println("是大写的字母");
		} else {
			System.out.println("不是大写的字母");
		}
	}
}
