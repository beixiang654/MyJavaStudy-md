package com.qf.a_test;

public class Demo10 {
	public static void main(String[] args) {
		//案例2: 逢7过 1~100以内
		//1 2 3  4 5  6 过 8  9  10  11 12  13 过  15 16 过 18...
		//1.7的倍数？  i % 7 == 0   2.个位是7 ？  i % 10 == 7
		//3.十位是7?  i / 10 == 7;
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("过");
			} else {
				System.out.println(i);
			}
		}
		
	}
}
