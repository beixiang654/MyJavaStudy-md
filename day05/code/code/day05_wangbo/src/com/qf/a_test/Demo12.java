package com.qf.a_test;

public class Demo12 {
	public static void main(String[] args) {
		//continue : 终止当前循环，继续去执行下次循环   
		
		/**
		 * i=3 3<8  true 执行if语句 3%5==0  false sout(3) i++
		 * i=4 4<8 true 执行if语句 4%5==0 false sout(4) i++
		 * i=5 5<8 true 执行if语句 5%5==0 true continue   当前循环不再往下走了。但是继续下次循环 i++
		 * i=6 6<8  true 执行if语句 6%5==0 falsesout(6)
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
