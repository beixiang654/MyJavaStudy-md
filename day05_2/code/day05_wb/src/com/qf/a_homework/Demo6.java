package com.qf.a_homework;

public class Demo6 {
	//main方法必须要有的
	public static void main(String[] args) {
		//必须在main主函数中调用 才会执行
		//方法的调用
		printEatSheep();
		
	}
	//打印5遍的中午吃烤喜羊羊
	//void 是无返回值的
	//printEatSheep  方法的名字 和变量的命名规则是一样的
	public static void printEatSheep ()  {
		//大括号中写语句体，就是咱们需求功能
		for (int i = 0; i < 5; i++) {
			System.out.println("中午吃烤喜羊羊");
		}
	}
	
	
}
