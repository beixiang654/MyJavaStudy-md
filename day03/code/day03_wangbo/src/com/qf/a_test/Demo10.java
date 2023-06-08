package com.qf.a_test;

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * 打印学生的成绩
		 * 	90~100:  打印优秀
		 * 	80~89: 打印 良好
		 * 	70~79: 打印 一般
		 * 	60~69: 打印及格
		 * 	60以下: 打印不及格要努力。  
		 */
		int score = 80;//声明一个变量叫score 存储的值是80
		//90<=score <= 100  不能这样写没有这样的语法格式
		/**
		 * score = 80
		 * score >= 90 && score <= 100 
		 * 80>=90 && 80<=100====>false && true===>false
		 * if (false) {
		 * System.out.println("优秀！！！");//不会打印优秀
		 * }
		 * 继续判断 esle if (score>= 80 && score < 90)
		 * 80 >= 80 && 80 < 90====> true && true =====>true
		 * else if (true) {
			System.out.println("良好");
		}
		下面的 if () 表达式都不在执行判断了
		只要碰到if (表达式) 为true 就执行对应的大括号中的语句体
		下面的判断不再执行了
		 * 
		 */
		if (score >= 90 && score <= 100 ) {
			System.out.println("优秀！！！");
		} else if (score>= 80) {
			System.out.println("良好");
		} else if (score >= 70) {
			System.out.println("一般");
		} else if (score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格要努力。  ");
		}
		
	}
}
