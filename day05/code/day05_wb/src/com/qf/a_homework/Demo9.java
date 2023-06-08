package com.qf.a_homework;

public class Demo9 {
	public static void main(String[] args) {
		int a = giveNum();//  会返回一个值  5  将返回的数据 给变量 a
		System.out.println(a);
		
		
		System.out.println(giveString());//可以将返回的值  直接打印的
		//System.out.println(str);
		
	}
	//声明一个无参有返回值的方法
	public  static int giveNum () {
		
		return 5;//返回一个5 这个整型的数据
	}
	
	//声明一个返回值是字符串类型的数据的方法
	public static String giveString () {
		String str = "呵呵 爽啊 ";
		str += "xixi";
		return str;
	}
	
	
}
