package com.qf.a_test;

public class Demo15 {
	public static void main(String[] args) {
		
		/**
		 * i=1 1<5 true
		 * 		进入到内部的第一个for循环
		 * 		j=1 1<=3 打印第一个空格 j++
		 * 		j=2 2<=3 大印第二个空格 j++
		 * 		j=3 3<=3 打印第三个空格 j++
		 * 		j=4 4<=3 false
		 * 		进入到内部的第二个for循环
		 * 		j=1 1<=1 打印一个* j++		
		 * 		j=2 2 <=1 false 换行 i++
		 * i=2 2<5true
		 * 
		 * 		
		 */
		//   *  
		//
		for (int i = 1; i < 5; i++) {//控制的行
			for (int j = 1; j <= 4-i; j++) {//控制空格
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {//控制的*
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
