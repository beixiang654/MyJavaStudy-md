package com.qf.a_test;


public class Demo5 {
	
	
	public static void main(String[] args) {
		//方法的调用
		printTenFish();
	}
	//无参无返回值的方法
	//public static void 方法的名字 () {}
	//需求： 功能打印 10遍的酸菜鱼
	//方法的声明
	public static void printTenFish () {
		for (int i = 0; i < 10; i++) {
			System.out.println("中午吃酸菜鱼");
		}
	}
}

