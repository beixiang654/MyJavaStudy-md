package com.qf.test;

public class Demo8 {
	public static void main(String[] args) {
		int[] arr = {32, 45, 89, 12, 999, 5667};
		//��ȡ�����е�ֵ
		System.out.println(arr[0]);//32
		System.out.println(arr[1]);//45
		System.out.println(arr[2]);//89
		System.out.println(arr[3]);//12
		System.out.println("==============");
		
		for (int i = 0; i < 4; i++) {
			//i��ѭ����ֵ �պ���Ϊ������±�
			System.out.println(arr[i]);
		}
		
		//����.length    ����ĳ���
		System.out.println(arr.length);//  arr�ĳ���    4
		
		System.out.println("---------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		String[] strs = {"����", "����", "����", "����"};
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
	}
}
