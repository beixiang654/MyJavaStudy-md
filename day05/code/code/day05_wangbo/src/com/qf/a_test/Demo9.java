package com.qf.a_test;

public class Demo9 {
	public static void main(String[] args) {
		//System.out.println(giveNum());
		int a = giveNum();
		int b = a + 10;
		System.out.println(a);
		
		
		System.out.println("======");
		String string = giveStr();
		System.out.println(string);
	}
	//无参有返回值的方法
	public static int giveNum () {
		
		return 5;
	}
	
	public static String giveStr() {
		//This method must return a result of type String
		String str = "一行白鹭上青天" + "。二个狗蛋嘻嘻哒";
		return str;
	}
}
