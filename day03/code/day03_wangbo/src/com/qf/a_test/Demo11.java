package com.qf.a_test;

public class Demo11 {
	public static void main(String[] args) {
		int chineseScore = 89;//语文成绩
		int mathScore = 29;//数学成绩
		/**chineseScore >= 80 && mathScore >= 80
		 * 89>=80 && 29>=80    true && false 整体结果就是false
		 * 
		 */
		if (chineseScore >= 80 && mathScore >= 80) {
			System.out.println("给奖学金");
		} else  if ((chineseScore >= 60 && chineseScore < 80) && (mathScore >= 60 && mathScore < 80)) {
			System.out.println("及格");
		} else if (chineseScore< 30 && mathScore < 30) {
			System.out.println("重修");
		} else {
			System.out.println("继续努力！！！有一门需要努力");
		}
		
	}
}
