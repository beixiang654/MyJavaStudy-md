package com.qf.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//����: ��ӡ10�Ժ��ż��
		/**
		 * i=0 0<10 true ִ��if��� 0 %2==0 true ִ��if����Ĵ������еĴ��� sout(0) i++
		 * i=1 1<10 true ִ��if��� 1 %2==0 false ��ִ��if����Ĵ������еĴ��� i++
		 * i=2 2<10 true ִ��if��� 2 %2==0  trueִ��if����Ĵ������еĴ��� sout(2) i++
		 * i=3 3<10 true ִ��if��� 3 %2==0 false��ִ��if����Ĵ������еĴ��� i++ 
		 * i=4 4<10 trueִ��if��� 4%2==0trueִ��if����Ĵ������еĴ��� sout(4) i++
		 * ...
		 */
		int i = 0;
		while (i < 10) {
			//if�����ʲô���� �ж�����
			if (i % 2 == 0) {
				System.out.println(i);
				
			}
			i++;
			
		}
		//���ϴ���ѭ����10��
		
		//��һ��д��
		/**
		 * a = 0 0<10 true sout(0) a = 0+2===>a=2
		 * a=2 2<10 true sout(2) a = a+2===>a = 4
		 * a=4 4<10 true sout(4) 
		 * ...
		 */
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			//a = a + 2;//ѭ������
			a += 2;//����
		}
	}
}
