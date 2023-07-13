package com.qf.a_test;

public class Demo11 {
	public static void main(String[] args) {
		
		//break 关键字  打断终止
		for (int i = 0; i < 5; i++) {
			System.out.println("嘻嘻哒");
			break;//终止 打断
		}
		
		switch (2) {
		case 1:
			System.out.println("这个是1");
			//break;
		case 2:
			System.out.println("这个是2");
			//break;
		case 3:
			System.out.println("这个是3");
			break;
		default:
			break;
		}
		
		if (2 > 3) {
			//break;
			//break cannot be used outside of a loop or a switch
		}
		
	}
}
