package com.qf.a_test;

public class Demo6 {
	public static void main(String[] args) {
		//打印10以内的额奇数
		int i = 1;
		while (i < 10) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
		
		int a = 1;
		while (a < 10) {
			System.out.println(a);
			a+=2;
		}
	}
}
