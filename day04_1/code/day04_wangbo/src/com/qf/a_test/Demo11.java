package com.qf.a_test;

public class Demo11 {
	public static void main(String[] args) {
		//������1~100�ĺ�   5050
		int sum = 0;//��ʼ����  ���� �͵�
		/**
		 * i=1 1<101 true sum = sum + i;  sum=0+1; i++
		 * i=2 2<101 true sum = sum + i;  sum=0+1+2; i++
		 * i=3 3<101 true sum =sum + i;   sum=0+1+2 + 3; i++
		 * 
		 */
		for (int i = 1; i < 101; i++) {
			//sum = sum + i;
			sum += i;

		}
		//����ѭ�������Ժ���ֻҪ����һ�����
		System.out.println(sum);
		
	}
}	
