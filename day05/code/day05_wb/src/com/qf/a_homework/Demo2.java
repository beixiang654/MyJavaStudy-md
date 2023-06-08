package com.qf.a_homework;

public class Demo2 {
	public static void main(String[] args) {
		
		/**
		 * i=1  1<4  true 
		 * 			进入到第一个内层for循环
		 * 			j=1 1<=3 true  打印一个空格 j++
		 * 			j=2 2<=3 true  打印第二个空格 j++
		 * 			j=3  3<=3 true 打印第三个空格 j++
		 * 			j=4  4<=3false  循环结束  
		 * 			进入倒第二个内层的for循环
		 * 			j=1 1<=1 true  打印第一个* j++
		 * 			j=2  2<=1 false 循环结束  立马换行  i++
		 * i=2  2<4  true 
		 * 			进入到第一个内层for循环
		 * 			j=1 1<=2 true  打印第一个空格 j++
		 * 			j=2 2<=2 true  打印第二个空格 j++
		 * 			j=3 3<=2 false  循环结束
		 * 			进入倒第二个内层的for循环
		 * 			j=1 1<=2 true  打印第一个* j++
		 * 			j=2 2<=2 true  打印第二个* j++
		 * 			j=3  3<=2 false  循环结束   换行 i++
		 * i=3  3<4 true 
		 * 		进入到第一个内层for循环
		 * 		j=1 1<=1 true  打印第一个空格 j++
		 * 		j=2 2<=1 false 循环结束
		 * 		进入倒第二个内层的for循环
		 * 		j=1 1<=3 true 打印第一个* j++
		 * 		j=2 2<=3  true 打印第二个* j++
		 * 		j=3 3<=3 true 打印第三个* j++
		 * 		j=4 4<=3false  换行  i++
		 * i= 4 4<4 false  整体结束
		 * 			
		 */
		for (int i = 1; i < 4; i++) {
			//打印的是空格
			for (int j = 1; j <= (4 - i); j++) {
				System.out.print(" ");
			}
			//打印*
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();//换行
			
		}
	}
}
