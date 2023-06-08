package com.qf.test;

public class Demo16 {
	public static void main(String[] args) {
		
		/**
		 * 1.arr = {1,23,3,1}
		 * 2.执行getMaxIndexInArray 方法  去看下面的自己写的方法
		 * 3. maxIndex = 0 变量
		 * 4.碰到一个for循环
		 * 	分析for循环的执行的流程：
		 * 		i=1 1<4 true  if 语句 arr[0] < arr[1]  1<23 true  maxIndex = 1 i++
		 * 		i=2 2<4  true  if arr[1]<arr[2]  23 < 3 false maxIndex = 1 i++
		 * 		i=3 3<4 true  if arr[1] <arr[3] 23 <1 false  maxIndex = 1 i+=
		 * 		i=4 4<4 bfalse  
		 * 		return  maxIndex = 1; 
		 * 5.返回的是1    将1赋值给a了
		 * 6. 打印了a  得到结果是1
		 * 
		 */
		int[] arr = {1,23,3,1};
		int a = getMaxIndexInArray(arr);
		System.out.println(a);
	}
	//定义一个方法，找出来一个int数组中最大的那个值的下标  有参 有返回值
	public static int getMaxIndexInArray (int[] arr) {
		int maxIndex = 0;//接最大值的下标
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
