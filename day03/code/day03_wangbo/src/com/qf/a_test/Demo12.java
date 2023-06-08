package com.qf.a_test;

public class Demo12 {
	public static void main(String[] args) {
		/**
		 * 按1  给爸爸打电话
		 * 按2  给妈妈打电话
		 * 按3  给爷爷打电话
		 * 按4  给奶奶打电话
		 * 按其他键  给警察打电话
		 */
		int a = 3;
		switch (a) {
			case 1:
				System.out.println("给爸爸打电话");
				break;
			case 2:
				System.out.println("给妈妈打电话");
				break;
			case 3:
				System.out.println("给爷爷打电话");
				break;//终止 打断   
			case 4:
				System.out.println("给奶奶打电话");
				break;
			default:
				System.out.println("给警察打电话");
				break;
		}
	}
}
