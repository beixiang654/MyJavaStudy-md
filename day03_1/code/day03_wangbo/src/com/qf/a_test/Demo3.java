package com.qf.a_test;

public class Demo3 {
	public static void main(String[] args) {
		//�﷨��ʽ:  ��ϵ������ı��ʽ1 && ��ϵ������ı��ʽ2
		//������ʽ��Ϊtrue��ʱ��������i��Ϊtrue�������һ�����ʽΪfalse����ô�����Ϊfalse
		boolean ret = (3 > 4) && (4 > 2);
		System.out.println(ret);//false
		
		boolean ret1 = (5 >1) && (3 >2) && (9 >= 7);
		System.out.println(ret1);//true
		
	}
}
