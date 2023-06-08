package com.qf.a_test;

public class Demo14 {
	public static void main(String[] args) {
		//九九乘法表
		/**
		 * i=1 1<10 true 
		 * 		内层for循环
		 * 		j=1 1<=1 sout(1*1=1) j++
		 * 		j=2 2<=1 false  换行 i++
		 *i=2 2<10 true
		 *		内层for循环
		 * 		j=1 1<=2 sout(1*2=2) 制表符 j++
		 * 		j=2 2<=2 sout(2*2=4) j++
		 * 		j=3 3<=2 false  换行 i++
		 * i=3 3<10 true
		 * 		内层for循环
		 * 		j=1 1<=3 sout(1*3=3) 制表符 j++
		 */
		//1*1=1
		//1*2=2  2*2=4
		//1*3=3 ...
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();//换行
		}

		
	}
}
