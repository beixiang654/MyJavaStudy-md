package com.qf.a_homework;

public class Demo8 {
	public static void main(String[] args) {
		//34是实参  实际参数
		printNum(34);
		printHello(8);
		//printHello("goudan");
		printStr("孤舟蓑笠翁，独钓寒江雪");
		
		printNStr(9, "已是黄昏独自愁");
		
		print66(7);
	}
	public static void  printNum (int sb) {//int  num  是形参  形式参数
		System.out.println(sb);
	}
	
	//打印n遍的hello  world
	public static void printHello (int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("hello world");
		}
	}
	//打印随便字符串  打印8遍
	public  static void printStr(String str) {
		for (int i = 0; i < 8; i++) {
			System.out.println(str);
		}
	}
	//打印n遍的随便的字符串
	public static void printNStr (int a, String str) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}
	
	//打印66乘法表
	public  static void  print66(int num) {
		for (int i = 1; i < num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j +"*"+ i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	
}
