package com.qf.a_test;

public class Demo5 {
	public static void main(String[] args) {
		boolean ret = (3 > 2) && (4 > 5) || (5 > 2);
		//true && false || true
		//false || true
		//true
		System.out.println(ret);//true
		boolean ret1 = !((8 > 9) || (7 > 2) && (8 < 4) || (6 > 7));
		//false || true && false || false
	
		System.out.println(ret1);//true
		//大家想一个问题:
		/**
		 * 用户名
		 * 密码
		 * 验证码
		 * 登陆成功  用或 还是与？   三个都得为true才让登陆
		 */
	}
}
