package com.qf.a_test;

public class Demo9 {
	public static void main(String[] args) {
		// ��ӡ10���ڵ�����  ʹ��forѭ��
		//1   2   3  4   5  6    7  8   9   forѭ�� 
		//1   3    5  7 9    if ���
		/**
		 * i=1 1<10 true ִ�д������д���  if(1%2!=0) true  sout(1) i++
		 * i=2 2<10 true ִ�д������д���  if(2%2!=0) false  i++
		 * i=3 3<10 true ִ�д������д���  if(3%2!=0) true sout(3) i++
		 * ..
		 */
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("==========");
		/**
		 * i=1 1<10 sout(1) i+=2 i=i+2;
		 * i=3 3<10 sout(3)
		 */
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		
	}
}
