package com.qf.a_test;

public class Demo3 {
	public static void main(String[] args) {
		//3.������ָ����int�������ҳ�ָ�������ݵ�һ�����±�
		int[] arr = { 1, 2, 3, 2, 4 };
		int index = -1;//����ָ��ֵ��¼�±��  ��ӡ-1Deʱ��֤����������û�д�����
		/**
		 * ִ�������Լ�д������
		 */
		for (int i = 0; i < arr.length; i++) {
			if (89 == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
