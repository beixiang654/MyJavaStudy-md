package com.qf.a_test;

public class Demo10 {
	public static void main(String[] args) {
		int s = sum(1, 2, 3);
		System.out.println(s);
	}
	//求三个的int类型数的和
	public  static int sum (int a, int b, int c) {
		
		int d = a + b + c;
		return d;
		//System.out.println(1);  咱们这个输出语句写在return的后面  代码执行不到了
		//因为到 return之后代码不再执行了
	}
	
}
