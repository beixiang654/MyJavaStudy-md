package com.qf.a_test;

public class Demo1 {
	public static void main(String[] args) {
		int num1 = 10;
		//++�ڱ����ĺ���:��ִ�е�ǰ�Ĳ�����Ȼ���������1
//		System.out.println(num1++);//10  ���˼�������:1.��ӡnum1������2.num1�������1
//		System.out.println(num1);//11
		//++�ڱ�����ǰ�� ��ʱ��:��ִ��������Ȼ����ִ�������Ĳ���
		System.out.println(++num1);//11   ������������: 1.������ 11 2num1��ʱΪ11
		System.out.println(num1);//11
		
		int num2 = 6;
		System.out.println(num2--);//6
		System.out.println(num2);//5
		
		int num3 = 3;
		int ret = num3++  * num3;
		System.out.println(ret);//12
		System.out.println(num3);//4
		
		int num4 = 2;
		int ret1 = num4 * ++num4;
		System.out.println(ret1);//6
		System.out.println(num4);//3
		
		int a = 5;
		int i = 5;
		// a = 5  + 6 + 8 + 9
	
		a = i++  + i++ + ++i + ++i;
		System.out.println(a);//28
		System.out.println(i);//9
		//a = 9 + 9 + 9
		a = i-- + ++i + i++;
		System.out.println(a);//27
		i++;
		
		
		
	}
}
