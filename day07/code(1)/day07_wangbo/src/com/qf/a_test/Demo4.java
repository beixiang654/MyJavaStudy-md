package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4 };
		findFirst(arr, 2);
	}

	/**
	 * 
	 * @param arr   目标数组 要从这个数组中找指定的数据
	 * @param find  指定的数据
	 */
	public static void findFirst(int[] arr, int find) {
		// 3.需求：在指定的int数组中找出指定的数据第一个的下标
		
		int index = -1;// 用来指定值记录下标的 打印-1De时候证明在数组中没有此数字
		/**
		 * 执行流程自己写！！！
		 * i=0 0<5
		 * 		2== 1 false i++
		 * i=1 1<5 true 
		 * 		2==2true
		 * 		index = 2
		 * 		break;终止打断  循环结束
		 * sout（2）
		 * 		
		 */
		for (int i = 0; i < arr.length; i++) {
			if (find == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
