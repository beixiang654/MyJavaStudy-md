package com.qf.a_test;

public class Demo13 {
	public static void main(String[] args) {
		/**
		 * i=1 1<5 true 
		 * 		进入到内层for循环
		 * 		j=1 1<=1 true sout(*) j++
		 * 		j=2 2<=1 false 换行 i++
		 * i=2 2<5 true
		 * 		进入到内层for循环
		 * 		j=1 1<=2 true sout(*) j++
		 * 		j=2 2<=2 true sout(*) j++
		 * 		j=3 3<=2 false 换行 i++
		 * i=3 3<5 true
		 * 		进入到内层for循环
		 * 		j=1 1<=3 true sout(*) j++
		 * 		j=2 2<=3 true sout(*) j++
		 * 		j=3 3<=3 true sout(*) j++
		 * 		j=4 4<=3false 换行 i++
		 * i=4 
		 */
		//*
		//**
		//***
		//****
		for (int i = 1; i < 5; i++) {//控制的行 4行
			for (int j = 1; j <= i; j++) {//控制的列   让你
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
