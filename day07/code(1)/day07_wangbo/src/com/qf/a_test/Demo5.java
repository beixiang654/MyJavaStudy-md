package com.qf.a_test;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		//4. ��һ�������У��ҳ�����ָ�����ݵ��±�λ�� ���ѡ�
		int[] arr = {1,2,3,2,4,2, 8, 2, 9,2};
		//��2�����е��±���������[1,3,5]
		//�½�һ�����飬�������ҵ����±�
		int[] indexes = new int[arr.length];//�յ�����[0,0,0,0,0,0]
		int count = 0;//������
		//��������
		/**
		 * i=0 0<6 true
		 * 		if (2==arr[0])
		 * 		if (2==1) false i++
		 * i=1 1<6 true
		 * 		if (2==arr[1])
		 * 		if (2==2) true
		 * 		indexes[count++] = 1
		 * 		indexes[0] = 1===> [1,0,0,0,0,0] i++ count = 1
		 * i=2 2<6 true
		 * 		if (2==arr[2]) 
		 * 		if (2==3) false i++
		 * i=3 3<6 true 
		 * 		if (2==arr[3])
		 * 		if (2==2) true
		 * 		indexes[count++] = 3;
		 * 		indexes[1] = 3===>[1,3,0,0,0,0] count = 2 i++
		 * i=4  4<6 true
		 * 		if (2 == arr[4])
		 * 		if (2 == 4) false i+=
		 * i=5 5<6 true
		 * 		if (2 == arr[5])
		 * 		if (2==2) true
		 * 		indexes[count++] = 5
		 * 		indexes[2] = 5;===>[1,3,5,0,0,0] count= 3 i++
		 * i=6 6<6false ѭ������
		 */
		for (int i = 0; i < arr.length; i++) {
			if (2 == arr[i]) {
				indexes[count++] = i;
			}
		}
//		System.out.println(count);//3
//		System.out.println(Arrays.toString(indexes));//[1, 3, 5, 0, 0, 0]
		
		//�����ٸ�һ���µ����� ������ֻҪ�ҵ����±��  ������count
		
		int[] newIndexes = new int[count];
		//���ϵ������е�indexes[1, 3, 5, 0, 0, 0]�������ֵ�ĸ�ֵ���µ�����[0,0,0]
		/**
		 * i=0 0<3 
		 * 	newIndexes[i] = indexes[i];
		 * 	newIndexes[0] = indexes[0];
		 * 	newIndexes[0] = 1;===>[1,0,0] i++
		 * i=1 1<3 
		 * 		newIndexes[1] = indexes[1];
		 * 		newIndexes[1] = 3;===>[1,3,0] i++
		 * i=2 2<3 
		 * 		newIndexes[2] = indexes[2];
		 * 		newIndexes[2] = 5;===>[1,3,5] i++
		 * i=3 3<3 false ѭ������
		 * 
		 * 
		 */
		for (int i = 0; i < newIndexes.length; i++) {
			newIndexes[i] = indexes[i];
		}
		System.out.println(Arrays.toString(newIndexes));
		
		
	}
}
