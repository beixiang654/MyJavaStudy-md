package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4 };
		findFirst(arr, 2);
	}

	/**
	 * 
	 * @param arr   Ŀ������ Ҫ�������������ָ��������
	 * @param find  ָ��������
	 */
	public static void findFirst(int[] arr, int find) {
		// 3.������ָ����int�������ҳ�ָ�������ݵ�һ�����±�
		
		int index = -1;// ����ָ��ֵ��¼�±�� ��ӡ-1Deʱ��֤����������û�д�����
		/**
		 * ִ�������Լ�д������
		 * i=0 0<5
		 * 		2== 1 false i++
		 * i=1 1<5 true 
		 * 		2==2true
		 * 		index = 2
		 * 		break;��ֹ���  ѭ������
		 * sout��2��
		 * 		
		 */
		for (int i = 0; i < arr.length; i++) {
			if (find == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
