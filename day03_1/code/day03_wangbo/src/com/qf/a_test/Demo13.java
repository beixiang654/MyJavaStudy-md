package com.qf.a_test;

public class Demo13 {
	public static void main(String[] args) {
		/**
		 * 打印学生的成绩
		 * 	90~100:  打印优秀
		 * 	80~89: 打印 良好
		 * 	70~79: 打印 一般
		 * 	60~69: 打印及格
		 * 	60以下: 打印不及格要努力。  
		 * 之前讲的用的是  if-else if
		 * 现在我要求 用swicth-case
		 */
		int score = 28;
		//找规律:  90~100    91/10=9   92/10 =9  99/10=9
		//87/10=8  81/10=8
		switch (score / 10) {
		case 10:
			System.out.println("优秀");
			break;
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("一般");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格，要努力");
			break;
		}
	}
}
