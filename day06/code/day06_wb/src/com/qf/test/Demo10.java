package com.qf.test;

public class Demo10 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		printArr(arr1);
	}
	//���� �Ĳ���  int  a ,   String str   , int[] arr;
	public static void printArr (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//��main�������� ����һ���������  ���������ֵ��  Ȼ��ͨ������ printArr �������ֵ(arr1)����
	//���β�(arr) ,Ȼ���ڷ����� ��arrͨ��forѭ�����б���
}
