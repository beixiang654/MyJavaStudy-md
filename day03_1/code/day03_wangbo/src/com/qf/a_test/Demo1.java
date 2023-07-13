package com.qf.a_test;

public class Demo1 {
	public static void main(String[] args) {
		int num1 = 10;
		//++在变量的后面:先执行当前的操作，然后再自身加1
//		System.out.println(num1++);//10  做了几件事情:1.打印num1变量。2.num1自身加了1
//		System.out.println(num1);//11
		//++在变量的前面 的时候:先执行自增，然后再执行其他的操作
		System.out.println(++num1);//11   做了两个事情: 1.先自增 11 2num1此时为11
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
