package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		test();
		System.out.println("==================");
		test();
		System.out.println("--=----------------");
		test();
	}
	//把一个功能装到一个方法中，然后在main主函数中用到这个功能的时候
	//只需要调用一下这个方法即可
	public static void test () {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello world");
		}
	}
}
