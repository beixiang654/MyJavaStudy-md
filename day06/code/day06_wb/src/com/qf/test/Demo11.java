package com.qf.test;

import java.util.Arrays;
import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		int[] arr2 = new int[3];//arr2 = {0,0,0};
		setArr(arr2);//arr2 = {89, 90, 91}
		System.out.println(Arrays.toString(arr2));//{89, 90, 91}
	}
	//准备对数组进行赋值
	public static void setArr (int[] arr) {//arr必须是空的数组 {0,0,0}
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * i=0  0< 3  打印 ：  请输入第1数   在控制台中输入了87   ===》  scanner.nextInt()=87  执行
		 * 				arr[0] = 87    arr = {87, 0,0}  i++
		 * i=1 1<3  打印:  请输入第2数   在控制台中输入 100  scanner.nextInt()=100
		 * 				arr[1] = 100  arr = {87,100, 0} i++
		 * i=2 2<3  打印:  请输入第3数  在控制台中输入  190  scanner.nextInt();=190
		 * 				arr[2] = 190 arr = {87, 100, 190}; i++
		 * i=3 3<3 false
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "数");
			arr[i] = scanner.nextInt();
			//arr[0] = 100   arr = {100,0,0}
			//arr[1] = 90    arr = {100, 90, 0}
			//arr[2] = 20    arr={100, 90, 20}
			
		}
		//arr = {89, 90, 91}
	}
}
