package com.qf.a_homework;

public class Demo7 {
	
	public static void main(String[] args) {
		print99();
	}
	public static void print99 () {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}
		
	}
	
	
}
