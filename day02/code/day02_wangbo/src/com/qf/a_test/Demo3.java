package com.qf.a_test;

public class Demo3 {
	public static void main (String[] args) {
		//����һ��byte ���͵�����  ����
		byte b1 = 20;
		System.out.println(b1);
		//byte b2 = 128; 128��ֵ����b2����Ϊ  byte���ͷ�Χ  -128~127
		
		short s1 = 128;//��Χ��-32768~32767
		System.out.println(s1);
		//short s2 = 32789;//cannot convert from int to short
		//Java��Ĭ�ϵ�������int����  32789  ��int
		//��intתΪ short  ��תС�����ӵ�ˮ����С�����У���Ҫǿת�ģ�
		
		int i1 = 20;
		System.out.println(i1);
		
		
		long l1 = 28299228;
		long l2 = 27828299292929L;
		//���long���͵����� û�г���int���͵ķ�Χ��ʱ���ü�L����l
		//���long���͵����� ����int���͵ķ�Χ��ʱ���L����l ��Ȼ���뱨��
		//����:���������ݷ�Χ���󣬶���L
		
		
		int age = 32;
		
		
		
	}
}
