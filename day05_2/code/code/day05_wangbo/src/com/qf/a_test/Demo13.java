package com.qf.a_test;

public class Demo13 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				continue;
			}
			System.out.println(i);
		}
	}
}
