package com.qf.a_homework;

public class Demo1 {
	public static void main(String[] args) {
		
		for (int i = 4; i > 0; i--) {//控制行
			//控制列
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}
}
