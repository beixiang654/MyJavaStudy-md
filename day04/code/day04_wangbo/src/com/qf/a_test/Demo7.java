package com.qf.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//打印3遍的hello
		/**
		 * i=9 当代码执行到do以后直接sout("hello") i++ i=10 10 <12 true
		 * 回到do 执行do后面的代码sout("hello") i++ i=11 11<12 true
		 * 回到do  执行do后面的代码sout("hello") i++ i=12 12<12 false
		 * 不能再回到do了
		 * 不管你布尔表达式都要先执行do后面语句
		 */
		int i = 9;
		do {
			System.out.println("hello");
			i++;
		} while (i < 3);
	}
}
