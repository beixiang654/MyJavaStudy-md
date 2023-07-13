package com.qf.a_test;

public class Demo12 {
	public static void main(String[] args) {
//		System.out.println("****");
//		System.out.println("****");
//		System.out.println("****");
//		重复代码用for循环改进一下
//		for (int i = 0; i < 3; i++) {
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.println();
//		}
		//以上再改进
		/**
		 * i=0  0<3 true 执行大括号中的代码 
		 * 		进入内层的for循环
		 * 		j=0 0<4 true sout(*) j++
		 * 		j=1 1<4 true sout(*) j++
		 * 		j=2 2<4 true sout(*) j++
		 * \	j=3 3<4 true sout(*) j++
		 * 		j=4 4<4 false 执行换行   i++
		 * i=1 1<3 true 执行大括号中的代码 
		 * 		第二次进入内层的for循环
		 * 		j=0 0<4 true sout(*) j++
		 * 		j=1 1<4 true sout(*) j++
		 * 		j=2 2<4 true sout(*) j++
		 * 		j=3 3<4 true sout(*) j++
		 * 		j=4 4<4 false 换行   i++
		 * i=2  2<3  true 执行大括号中的代码 
		 * 		第三次进入倒了内层for循环
				j=0 0<4 true sout(*) j++
		 * 		j=1 1<4 true sout(*) j++
		 * 		j=2 2<4 true sout(*) j++
		 * 		j=3 3<4 true sout(*) j++
		 * 		j=4 4<4 false 换行   i++
		 * 	i=3 3<3 false
		 * 	
		 */
		//****
		//****
		//****
		
		for (int i = 0; i < 3; i++) {//最外层循环控制行
			for(int j = 0; j < 4; j++) {//最内层循环控制列
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}
}
