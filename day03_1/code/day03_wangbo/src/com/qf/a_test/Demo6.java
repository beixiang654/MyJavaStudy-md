package com.qf.a_test;

public class Demo6 {
	public static void main(String[] args) {
		//�߼���Ķ�·ԭ��
		int num = 10;
		boolean ret1 = (3 < 2) && (++num > 12);
		System.out.println(ret1);//false
		System.out.println(num);//10
		
		
		//�߼���Ķ�·ԭ��
		int num1 = 10;
		boolean ret2 = (3 > 2) || (++num1 > 90);
		System.out.println(ret2);//true
		System.out.println(num1);//10
		
	}
}
