package com.qf.a_test;

public class Demo1 {
	public static void main(String[] args) {
		//�����ҳ�int�����У����ֵ�������±�
		int[] arr = {2, 7, 34, 9, 12};
		int maxIndex = 0;//�����������ֵ���±�ı���
		/**
		 * i=1 1<5 true
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[0]< arr[1])
		 * 		if (2 < 7) true
		 * 		maxIndex = 1 i++
		 * i=2 2<5 true 
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[1]< arr[2])
		 * 		if (7 < 34) true
		 * 		maxIndex = 2 i++
		 * i=3 3<5true 
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[2]< arr[3])
		 * 		if (34 < 9) false
		 * 		maxIndex = 2 i++
		 * i=4 4<5 true
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[2]< arr[4])
		 * 		if (34 < 12) false
		 * 		maxIndex = 2 i++
		 * i=5 5<5 false
		 * 
		 * sout(maxIndex)  sout(2)
		 */
		for (int i = 0; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {//ֻҪ�ҵ���maxIndex�±�����ֵ�ͺ����ֵ���бȽ�
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}
}
