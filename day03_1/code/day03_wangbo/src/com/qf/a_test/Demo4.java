package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		boolean ret1 = 3 > 4 || 5 >3;
		//||  ����ֻҪ��һ��Ϊtrue ������Ϊtrue�� ��������false��Ϊfalse
		System.out.println(ret1);//true
		
		boolean ret2 = 5 < 3 || 7 < 2 || 7 < 4;
		System.out.println(ret2);//false
		//false || false || false
		
		boolean ret3 = !(3 > 4);//ȡ��
		System.out.println(ret3);
	}
}
