package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		
		//��ӡ1 ~ 9
		/**
		 * ִ������:
		 * i=1 1<10 true  sout(1) i++
		 * i=2 2<10 true sout(2) i++
		 * i=3 3<10 true sout(3) i++
		 * i=4 4<10  true sout(4) i++
		 * ....
		 * i=9 9<10 true sout(9) i++
		 * i=10 10<10 false
		 */
		int i = 1;
		while (i < 10) {
			System.out.println(i);//�պý���i��ֵ ��������
			i++;
		}
	}
}
