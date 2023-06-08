package com.qf.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//需求: 打印10以后的偶数
		/**
		 * i=0 0<10 true 执行if语句 0 %2==0 true 执行if后面的大括号中的代码 sout(0) i++
		 * i=1 1<10 true 执行if语句 1 %2==0 false 不执行if后面的大括号中的代码 i++
		 * i=2 2<10 true 执行if语句 2 %2==0  true执行if后面的大括号中的代码 sout(2) i++
		 * i=3 3<10 true 执行if语句 3 %2==0 false不执行if后面的大括号中的代码 i++ 
		 * i=4 4<10 true执行if语句 4%2==0true执行if后面的大括号中的代码 sout(4) i++
		 * ...
		 */
		int i = 0;
		while (i < 10) {
			//if语句起到什么作用 判读过滤
			if (i % 2 == 0) {
				System.out.println(i);
				
			}
			i++;
			
		}
		//以上代码循环了10次
		
		//换一种写法
		/**
		 * a = 0 0<10 true sout(0) a = 0+2===>a=2
		 * a=2 2<10 true sout(2) a = a+2===>a = 4
		 * a=4 4<10 true sout(4) 
		 * ...
		 */
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			//a = a + 2;//循环条件
			a += 2;//步幅
		}
	}
}
