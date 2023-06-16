package com.qf.a_test;


public class Demo2 {
	
	public static void main(String[] args) {
		
		int num1 = 90;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			num1++;
			//出了这个大括号 （循环体）就无法使用变量 i
		}
		//System.out.println(i);
	}
	
	public  static void test () {
		
		//int num;
		int num = 90;//声明的时候可以暂时不用赋值，但是使用的使用必须赋值
		//The local variable num may not have been initialized
		System.out.println(num);
	}
	public static void test1 () {
		//System.out.println(num);
	}
	/**
	 * 总结： 
	 * 		诀窍.看局部变量作用域的时候，看的这个变量所属的大括号
	 * 		
	 */
}
