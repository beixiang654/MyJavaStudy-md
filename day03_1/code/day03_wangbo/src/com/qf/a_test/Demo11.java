package com.qf.a_test;

public class Demo11 {
	public static void main(String[] args) {
		int chineseScore = 89;//���ĳɼ�
		int mathScore = 29;//��ѧ�ɼ�
		/**chineseScore >= 80 && mathScore >= 80
		 * 89>=80 && 29>=80    true && false ����������false
		 * 
		 */
		if (chineseScore >= 80 && mathScore >= 80) {
			System.out.println("����ѧ��");
		} else  if ((chineseScore >= 60 && chineseScore < 80) && (mathScore >= 60 && mathScore < 80)) {
			System.out.println("����");
		} else if (chineseScore< 30 && mathScore < 30) {
			System.out.println("����");
		} else {
			System.out.println("����Ŭ����������һ����ҪŬ��");
		}
		
	}
}
