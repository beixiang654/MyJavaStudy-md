package com.qf.a_test;

import java.util.Arrays;

public class Demo14 {

	public static void main(String[] args) {
		//ѡ������
		int[] arr = {3, 4, 2, 1};
		/**
		 * i=0 0< 3 
		 * 		���뵽���ڲ�forѭ��
		 * 		minIndex=0   j=1 1<4 true
		 * 		if (3 >4) false  minIndex=0 j++
		 * 			j=2 2<4 true 
		 * 		if (3> 2) true  minIndex=2 j++
		 * 			j=3 3<4 true
		 * 		if (2 >1) true minIndex=3 j++
		 * 		j=4  4<4 false
		 * 		//����λ��
		 * 		int temp = 3;
		 * 		arr[0] = arr[minIndex]=1==>[1,4,2,1]
		 * 		arr[3] = 3===>[1, 4, 2, 3]
		 * 		��һ����������� i++
		 * i=1 1<3
		 * 		���뵽�ڲ�forѭ��
		 * 		minIndex=1
		 * 		j=2 2<4 
		 * 		if(arr[1] > arr[2])  4>2 true
		 * 		minIndex=2 j++
		 * 		j=3 3<4 true
		 * 		if (arr[2] > arr[3]) 2>3false
		 * 		minIndex=2 j++
		 * 		j=4 4<4 false
		 * 		����λ��
		 * 		int temp=arr[1] = 4
		 * 		arr[1] = arr[2]===>{1, 2,2,3}
		 * 		arr[2] = 4;===>{1,2,4,3}
		 * 		�ڶ��ν������� i++
		 * i=2 2<3 true
		 * 		���뵽�ڲ��forѭ��
		 * 		minIndex=2
		 * 		j=3 3<4 
		 * 		if (arr[2] > arr[3]) true
		 * 		minIndex = 3
		 * 		j++
		 * 		j=4 4<4false
		 * 		//����λ��
			int temp = arr[2]=4
			arr[2] = arr[3];===>{1,2,3,3}
			arr[3] = temp = 4;===>{1,2,3,4}
			i++
			i=3 3<3 false ѭ������
		 * 
		 * 
		 */
		for (int i = 0; i < arr.length - 1; i++) {//�����Ĵ���
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
				
			}
			//����λ��
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
