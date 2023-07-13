作业：

```Java
package com.qf.a_test;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		//11、输入三个int型的数据，
		//放入到a,b,c三个变量中去，
		//使用条件结构和交换逻辑这三个变量中的值从小到大排列。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a  = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int b = scanner.nextInt();
		System.out.println("请输入第三个整数:");
		int c = scanner.nextInt();
		//System.out.println(a + ":" + b + ":" + c );
		
		//找最大值
		int max = a;//将a赋值给了 max变量
		if (b > a && b > c) {
			max = b;//将最大的b的情况 赋值给max变量
			
		}
		if (c > a && c > b) {
			max = c;//
		}
		//找最小值
		int min = a;
		if (b < a && b < c) {
			min = b;
		}
		if (c < a && c < b) {
			min = c;
		}
		int middle = (a + b + c) - (max + min);//中间值
		System.out.println(min + ":" + middle + ":" + max);
		
	}
}

```

### 今天的内容

> 方法

### 1.方法【重点】

#### 1.1为啥要有方法

> 如果开发中出现了大量的重复的代码或者重复的功能？循环满足不了。
>
> 1.代码是臃肿的
>
> 2.维护性极差
>
> 3.可读性比较差
>
> 咱们可以使用方法的方式进行解决以上的问题

#### 1.2其实已经见过方法了

> main方法
>
> ```Java
> public static void  main (String[] args) {
>     
> }
> 
> 这main方法是Java给提供的额！！！
>     
>  public static :   不要问！！！  修饰符
>  void: 空的  没有返回值的
>  main: 方法的名字
>  		方法的名字后面跟的是一个小括号，小括号里面可以有值 （有参数）也可以没有值（无参）
>      	小括号后面跟的是大括号！！！
>      	大括号中放的是一个方法体，就是功能代码！！！
> ```

#### 1.3几种方式形式

> 无参无返回值的方法
>
> 有参无返回值的方法
>
> 无参有返回值的方法
>
> 有参有返回值的方法

##### 1.3.1无参无返回值的方法

> 语法格式:	
>
> ```Java
> public static void 方法的名字 () {
>     
> } 
> ```
>
> 注意事项: 
>
> ​		1.方法的命名 和变量的命名一模一样
>
> ​		2.void  的意思是空的  无返回值的意思
>
> ​		3.() 中没有写任何的东西  叫无参的意思
>
> ​		4.方法的声明在类中，在main方法 的外边
>
> ​		5.方法的调用在main方法中调用

```Java
package com.qf.a_test;


public class Demo5 {
	
	
	public static void main(String[] args) {
		//方法的调用
		printTenFish();
	}
	//无参无返回值的方法
	//public static void 方法的名字 () {}
	//需求： 功能打印 10遍的酸菜鱼
	//方法的声明
	public static void printTenFish () {
		for (int i = 0; i < 10; i++) {
			System.out.println("中午吃酸菜鱼");
		}
	}
}


```

> 案例: 打印九九乘法表 使用方法的形式

```Java
package com.qf.a_test;

public class Demo6 {
	public static void main(String[] args) {
		print99();
	}
	//打印九九乘法表的方法
	public static void print99 () {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
}

```

##### 1.3.2有参无返回值的方法

> 语法格式:
>
> ```java 
> public static void 方法的名字 (数据类型 参数的名字, 数据类型 参数的名字, ...) {
>     
> }
> ```
>
> 注意事项:
>
> ​	

```java 
package com.qf.a_test;

public class Demo7 {
	public static void main(String[] args) {
		printNum(12);//12 是实参  实际参数   实参 会赋值形参
		//在方法处调用 叫实参
		//方法的声明处叫形参   一定是 实参赋值给形参
	}
	//
	public static void printNum (int a) {//a 叫形参  形式参数就是一个无值的变量而已
		System.out.println(a);
	}
}

```

```java 
package com.qf.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//printNum(12);//12 是实参  实际参数   实参 会赋值形参
		//在方法处调用 叫实参
		//方法的声明处叫形参   一定是 实参赋值给形参
		
		printHello(6);
		sum(289, 2);
		printStr("狗蛋很狗");
		concate("嘻嘻", "哈哈", "呵呵");
	}
	//
	public static void printNum (int a) {//a 叫形参  形式参数就是一个无值的变量而已
		System.out.println(a);
	}
	
	//声明一个方法打印4遍的hello
	public static void  printHello (int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("hello");
		}
	}
	//声明一个方法求两个int数的和
	public static void sum (int a, int b) {
		System.out.println(a + b);
	}
	//方法打印一个字符串
	public static void printStr (String str) {
		System.out.println(str);
	}
	//方法字符串拼接的方法
	public static void concate (String str, String str1, String str2) {
		System.out.println(str + str1 + str2);
	}
}

```

> 案例:
>
> ​	1.逢7过   有参无返回值的
>
> ​	2.找出两个数的最大值 有参无返回值的
>
> ​	3.打印等腰三角形    要求 有参的来写   要求行随时变化

```java 
package com.qf.a_test;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		sevenPass(20);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int sb = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int dasb = scanner.nextInt();
		
		max(sb, dasb);//sb  dasb  是实参
		printTriangle(100);
	}
	//找出两个数的最大值
		public  static void max (int a, int b) {//a  b 是形参
			if (a >= b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	//逢7过   有参无返回值的方法
	public static void sevenPass (int a) {
		for (int i = 1; i < a; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("过");
			} else {
				System.out.println(i);
			}
		}
	}
	//打印等腰三角形  方法
	public  static void  printTriangle (int num) {
		for (int i = 1; i < num; i++) {//控制行
			for (int j = 1; j <= num - i; j++) {//打印空格
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
}

```

上午的内容

```
1.无参无返回值的方法
	public static void 方法的名字 () {
	
	}
2.有参无返回值的方法
	public  static void 方法的名字 (数据类型 参数1, 数据类型 参数2,...) {
		
	}
```

##### 1.3.3无参有返回值的方法

> 语法格式:
>
> ```java 
> public static 数据类型  方法的名字 () {
>     
>     return  值;//值必须和方法的声明的数据类型保持一致
> }
> ```
>
> return :  返回的意思
>
> 注意:
>  		一般:  无返回值的方法 在声明方法的时候，就打印一下
>
> ​					有返回值的方法，一般在main方法中，通过方法的调用将数据取出来而已

```Java
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

```

##### 1.3.4有参有返回值的方法

> 语法格式:
>
> ```java 
> public static 数据类型 方法的名字 (数据类型 参数1, 数据类型 参数2,...) {
>     
>     return 返回值;
> }
> 
> ```
>
> 

```java 
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
	}
	
}

```

### 2.break和continue关键字

> 字面意思:
>
>   break：  终止  打断
>
> continue:   继续

#### 2.1break

> 语法格式:
>
> ```java 
> break;
> ```

```java 
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
		
		
	}
}

```

注意: break关键只使用循环或者swicth-case中 

#### 2.2continue

> 语法格式:
>
> ```java 
> continue;
> ```
>
> 继续

```Java
package com.qf.a_test;

public class Demo12 {
	public static void main(String[] args) {
		//continue : 终止当前循环，继续去执行下次循环   
		
		/**
		 * i=3 3<8  true 执行if语句 3%5==0  false sout(3) i++
		 * i=4 4<8 true 执行if语句 4%5==0 false sout(4) i++
		 * i=5 5<8 true 执行if语句 5%5==0 true continue   当前循环不再往下走了。但是继续下次循环 i++
		 * i=6 6<8  true 执行if语句 6%5==0 falsesout(6)
		 */
		for (int i = 3; i < 8; i++) {
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);
			//3 4 6 7
			

		}
	}
}

```

注意： continue用在循环中 不能用在其他地方

> 逢7不打印，跳过带7的和7的倍数的  1~100

```Java
package com.qf.a_test;

public class Demo13 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				continue;
			}
			System.out.println(i);
		}
	}
}

```

总结:

```
1.无参无返回值的方法
2.有参无返回值的方法
public static void 方法的名字 (数据类型 c参数1, 数据类型 参数2, ...) {

}
3.无参有返回值
public  static 数据类型 方法的名字() {

	return  值;
}
4.有参有返回值
public static 数据类型 方法的名字(数据类型 c参数1, 数据类型 参数2, ...) {
	return 值;
}
```

### 3.方法案例

> 1.写一个方法，判断一个字符是否是英文字符



```Java
package com.qf.a_test;

public class Demo14 {
	public static void main(String[] args) {

		isUpper();
//		char ch2 = 97;
//		char ch3 = 'a';

	}

	// 是否是大写！！！
	//无参无返回值的方法
	public static void isUpper() {
		// 判断是否是大写的英文字符
		char ch1 = 'H';// 声明一个char类型 字符类型
		// if (ch1 >= 'A' && ch1 <= 'Z') {
		// Java编译器会字符类型默认的转为十进制的int类型 叫ascii码值
		if (ch1 >= 65 && ch1 <= 90) {

			System.out.println("是大写的字母");
		} else {
			System.out.println("不是大写的字母");
		}
	}
}

```



```Java
package com.qf.a_test;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个英文字母:");
		//abcdef
		//012345
		char ch1 = scanner.next().charAt(0);//从控制台获取 你输入的一个字符 给变量ch1
		isUpper(ch1);//ch1实参
		//将实参赋值给形参的
	}
	//有参无返回值的
	public static void isUpper (char ch1) {//ch1形参
		if (ch1 >= 'A' && ch1 <= 'Z') {
			System.out.println("是大写的字母");
		} else {
			System.out.println("不是大写的字母");
		}
	} 
}

```

```Java
package com.qf.a_test;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		System.out.println(isUpper());
	}
	//无参 有返回值的方法
	public static String isUpper () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请书而入一个字符:");
		char c1 = scanner.next().charAt(0);
		if (c1 >= 'A' && c1 <= 'Z') {
			return "是大写的英文的字符";
		} 
		return "不是大写的英文的字符";
		
	}
}

```

```Java
package com.qf.a_test;

import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字母:");
		char cha = scanner.next().charAt(0);
		String string = isUpper(cha);
		System.out.println(string);
	}
	//有参有返回值的方法
	public static String isUpper (char c1) {
	
		if (c1 >= 'A' && c1 <= 'Z') {
			return "是大写的英文的字符";
		} 
		return "不是大写的英文的字符";
	}
}

```

基础作业：

```
1.写一个方法，判断一个字符是否是数字字符
2.写一个方法，判断一个字符是否是英文字符（包含大写和小写）
3.写一个方法， 将一个整数逆序打印
	int a = 1234;
	打印
	4
	3 
	2
	1
4.写一个方法判断一个数是否是正数
```

