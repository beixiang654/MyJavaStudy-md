package com.qf.a_test;

public class Demo12 {
	public static void main(String[] args) {
		//continue : ��ֹ��ǰѭ��������ȥִ���´�ѭ��   
		
		/**
		 * i=3 3<8  true ִ��if��� 3%5==0  false sout(3) i++
		 * i=4 4<8 true ִ��if��� 4%5==0 false sout(4) i++
		 * i=5 5<8 true ִ��if��� 5%5==0 true continue   ��ǰѭ�������������ˡ����Ǽ����´�ѭ�� i++
		 * i=6 6<8  true ִ��if��� 6%5==0 falsesout(6)
		 */
		for (int i = 3; i < 8; i++) {
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);
			//3 4 6 7
			

		}
		if (3 > 2) {
			//continue cannot be used outside of a loop
			//continue;
		}
	}
}
