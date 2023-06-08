package com.qf.a_homework;

public class Demo17 {
	public static void main(String[] args) {
		/**
		 * i=4 4<=7? true  4==5 false  sout(4) i++
		 * i=5 5<=7 true  5==5 true continue  终止当前的循环，然后进入到下一次循环 i++
		 * i=6 6<=7  true 6==5 false sout(6)
		 */
		for (int i = 4; i <= 7; i++) {
			if (i== 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
