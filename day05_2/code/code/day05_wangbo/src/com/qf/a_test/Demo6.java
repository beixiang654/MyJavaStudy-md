package com.qf.a_test;

public class Demo6 {
	public static void main(String[] args) {
		print99();
	}
	//��ӡ�žų˷���ķ���
	public static void print99 () {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
}
