package com.qf.a_test;

public class Demo3 {
	public static void main (String[] args) {
		//声明一个byte 类型的数据  整数
		byte b1 = 20;
		System.out.println(b1);
		//byte b2 = 128; 128赋值不了b2的因为  byte类型范围  -128~127
		
		short s1 = 128;//范围是-32768~32767
		System.out.println(s1);
		//short s2 = 32789;//cannot convert from int to short
		//Java中默认的数据是int类型  32789  是int
		//将int转为 short  大转小（大被子的水倒到小杯子中，需要强转的）
		
		int i1 = 20;
		System.out.println(i1);
		
		
		long l1 = 28299228;
		long l2 = 27828299292929L;
		//如果long类型的数据 没有超过int类型的范围的时候不用加L或者l
		//如果long类型的数据 超过int类型的范围的时候加L或者l 不然编译报错
		//个人:不管你数据范围都大，都加L
		
		
		int age = 32;
		
		
		
	}
}
