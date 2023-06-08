package com.qf.a_test;

public class Demo11 {
	public static void main(String[] args) {
		//案例：1~100的和   5050
		int sum = 0;//初始变量  接收 和的
		/**
		 * i=1 1<101 true sum = sum + i;  sum=0+1; i++
		 * i=2 2<101 true sum = sum + i;  sum=0+1+2; i++
		 * i=3 3<101 true sum =sum + i;   sum=0+1+2 + 3; i++
		 * 
		 */
		for (int i = 1; i < 101; i++) {
			//sum = sum + i;
			sum += i;

		}
		//等你循环结束以后，我只要最后的一个结果
		System.out.println(sum);
		
	}
}	
