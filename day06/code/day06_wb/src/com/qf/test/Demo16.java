package com.qf.test;

public class Demo16 {
	public static void main(String[] args) {
		
		/**
		 * 1.arr = {1,23,3,1}
		 * 2.ִ��getMaxIndexInArray ����  ȥ��������Լ�д�ķ���
		 * 3. maxIndex = 0 ����
		 * 4.����һ��forѭ��
		 * 	����forѭ����ִ�е����̣�
		 * 		i=1 1<4 true  if ��� arr[0] < arr[1]  1<23 true  maxIndex = 1 i++
		 * 		i=2 2<4  true  if arr[1]<arr[2]  23 < 3 false maxIndex = 1 i++
		 * 		i=3 3<4 true  if arr[1] <arr[3] 23 <1 false  maxIndex = 1 i+=
		 * 		i=4 4<4 bfalse  
		 * 		return  maxIndex = 1; 
		 * 5.���ص���1    ��1��ֵ��a��
		 * 6. ��ӡ��a  �õ������1
		 * 
		 */
		int[] arr = {1,23,3,1};
		int a = getMaxIndexInArray(arr);
		System.out.println(a);
	}
	//����һ���������ҳ���һ��int�����������Ǹ�ֵ���±�  �в� �з���ֵ
	public static int getMaxIndexInArray (int[] arr) {
		int maxIndex = 0;//�����ֵ���±�
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
