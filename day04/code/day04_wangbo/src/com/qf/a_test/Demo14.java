package com.qf.a_test;

public class Demo14 {
	public static void main(String[] args) {
		//�žų˷���
		/**
		 * i=1 1<10 true 
		 * 		�ڲ�forѭ��
		 * 		j=1 1<=1 sout(1*1=1) j++
		 * 		j=2 2<=1 false  ���� i++
		 *i=2 2<10 true
		 *		�ڲ�forѭ��
		 * 		j=1 1<=2 sout(1*2=2) �Ʊ�� j++
		 * 		j=2 2<=2 sout(2*2=4) j++
		 * 		j=3 3<=2 false  ���� i++
		 * i=3 3<10 true
		 * 		�ڲ�forѭ��
		 * 		j=1 1<=3 sout(1*3=3) �Ʊ�� j++
		 */
		//1*1=1
		//1*2=2  2*2=4
		//1*3=3 ...
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();//����
		}

		
	}
}
