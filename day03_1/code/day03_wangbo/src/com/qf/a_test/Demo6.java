package com.qf.a_test;

public class Demo6 {
	public static void main(String[] args) {
		//逻辑与的短路原则
		int num = 10;
		boolean ret1 = (3 < 2) && (++num > 12);
		System.out.println(ret1);//false
		System.out.println(num);//10
		
		
		//逻辑或的短路原则
		int num1 = 10;
		boolean ret2 = (3 > 2) || (++num1 > 90);
		System.out.println(ret2);//true
		System.out.println(num1);//10
		
	}
}
