package com.qf.a_test;

public class Demo10 {
	public static void main(String[] args) {
		int[] arr = {32, 45, 58};
		//ȡֵ��ͨ���±����ȡֵ��
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);
		System.out.println("=====");
		//����   
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		//arr.length  ����ĳ���
		System.out.println(arr.length);//5
		System.out.println("----------");
		//�ٴα���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("****************");
		String[] strs = {"����", "����", "����", "����"};
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
