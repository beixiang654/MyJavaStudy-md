package com.qf.a_homework;

public class Demo2 {
	public static void main(String[] args) {
		
		/**
		 * i=1  1<4  true 
		 * 			���뵽��һ���ڲ�forѭ��
		 * 			j=1 1<=3 true  ��ӡһ���ո� j++
		 * 			j=2 2<=3 true  ��ӡ�ڶ����ո� j++
		 * 			j=3  3<=3 true ��ӡ�������ո� j++
		 * 			j=4  4<=3false  ѭ������  
		 * 			���뵹�ڶ����ڲ��forѭ��
		 * 			j=1 1<=1 true  ��ӡ��һ��* j++
		 * 			j=2  2<=1 false ѭ������  ������  i++
		 * i=2  2<4  true 
		 * 			���뵽��һ���ڲ�forѭ��
		 * 			j=1 1<=2 true  ��ӡ��һ���ո� j++
		 * 			j=2 2<=2 true  ��ӡ�ڶ����ո� j++
		 * 			j=3 3<=2 false  ѭ������
		 * 			���뵹�ڶ����ڲ��forѭ��
		 * 			j=1 1<=2 true  ��ӡ��һ��* j++
		 * 			j=2 2<=2 true  ��ӡ�ڶ���* j++
		 * 			j=3  3<=2 false  ѭ������   ���� i++
		 * i=3  3<4 true 
		 * 		���뵽��һ���ڲ�forѭ��
		 * 		j=1 1<=1 true  ��ӡ��һ���ո� j++
		 * 		j=2 2<=1 false ѭ������
		 * 		���뵹�ڶ����ڲ��forѭ��
		 * 		j=1 1<=3 true ��ӡ��һ��* j++
		 * 		j=2 2<=3  true ��ӡ�ڶ���* j++
		 * 		j=3 3<=3 true ��ӡ������* j++
		 * 		j=4 4<=3false  ����  i++
		 * i= 4 4<4 false  �������
		 * 			
		 */
		for (int i = 1; i < 4; i++) {
			//��ӡ���ǿո�
			for (int j = 1; j <= (4 - i); j++) {
				System.out.print(" ");
			}
			//��ӡ*
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();//����
			
		}
	}
}
