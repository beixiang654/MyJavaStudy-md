package com.qf.a_test;

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * ��ӡѧ���ĳɼ�
		 * 	90~100:  ��ӡ����
		 * 	80~89: ��ӡ ����
		 * 	70~79: ��ӡ һ��
		 * 	60~69: ��ӡ����
		 * 	60����: ��ӡ������ҪŬ����  
		 */
		int score = 80;//����һ��������score �洢��ֵ��80
		//90<=score <= 100  ��������дû���������﷨��ʽ
		/**
		 * score = 80
		 * score >= 90 && score <= 100 
		 * 80>=90 && 80<=100====>false && true===>false
		 * if (false) {
		 * System.out.println("���㣡����");//�����ӡ����
		 * }
		 * �����ж� esle if (score>= 80 && score < 90)
		 * 80 >= 80 && 80 < 90====> true && true =====>true
		 * else if (true) {
			System.out.println("����");
		}
		����� if () ���ʽ������ִ���ж���
		ֻҪ����if (���ʽ) Ϊtrue ��ִ�ж�Ӧ�Ĵ������е������
		������жϲ���ִ����
		 * 
		 */
		if (score >= 90 && score <= 100 ) {
			System.out.println("���㣡����");
		} else if (score>= 80) {
			System.out.println("����");
		} else if (score >= 70) {
			System.out.println("һ��");
		} else if (score >= 60) {
			System.out.println("����");
		} else {
			System.out.println("������ҪŬ����  ");
		}
		
	}
}
