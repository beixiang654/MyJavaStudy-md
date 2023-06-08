```
1.switch后面的小括号里面的  数据类型是那种数据类型
2.if-else的语法格式
3.switch-case的语法格式
4.逻辑的短路原则
5.while循环的语法格式及执行流程
6.while和do-while的循环的区别
7.for循环的语法格式和执行流程
8.使用for循环打印99乘法表

for (int i = 1; i <= 9; i++) {//控制是行  9行
	for (int j = 1; j <= i; j++) {//控制的是列
		System.out.print(j + "*" + i + "=" + i * j + "\t");
	}
	System.out.println();
}



```

```
1.
 *******
 *****
 ***
 *
2.
    *          第一行 由3个空格  1个*
   **          第二行  由 2个空格 2个*
  ***           第三行  由 1个空格  3个*
 ****           第四行  由 0个空格   4个*
 for (int i = 0; i < 4; i++) {
			//控制是空格
			for (int j = 0; j < args.length; j++) {
				
			}
			//控制是*
			for (int j = 0; j < args.length; j++) {
				
			}
		}
3.
   *         第一行  3个空格 1个*
  ***        第二行  2个空格 3 个*
 *****       第三行  1个空格  5个*
*******      第四行  0个空格  7个*
```

```
1.
 *******       第一行 4   7个*  （2 * i） - 1
 *****         第二行 3   5个*
 ***           第三行 2   3个*
 *             第四行 1   1个*
```

```Java
package com.qf.a_homework;

public class Demo1 {
	public static void main(String[] args) {
		
		for (int i = 4; i > 0; i--) {//控制行
			//控制列
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}
}

```

```
2.
    *          第一行 由3个空格 (4 - i)     1个*    i 
   **          第二行  由 2个空格 2个*
  ***           第三行  由 1个空格  3个*
 ****           第四行  由 0个空格   4个*
```

```java 
package com.qf.a_homework;

public class Demo2 {
	public static void main(String[] args) {
		
		/**
		 * i=1  1<4  true 
		 * 			进入到第一个内层for循环
		 * 			j=1 1<=3 true  打印一个空格 j++
		 * 			j=2 2<=3 true  打印第二个空格 j++
		 * 			j=3  3<=3 true 打印第三个空格 j++
		 * 			j=4  4<=3false  循环结束  
		 * 			进入倒第二个内层的for循环
		 * 			j=1 1<=1 true  打印第一个* j++
		 * 			j=2  2<=1 false 循环结束  立马换行  i++
		 * i=2  2<4  true 
		 * 			进入到第一个内层for循环
		 * 			j=1 1<=2 true  打印第一个空格 j++
		 * 			j=2 2<=2 true  打印第二个空格 j++
		 * 			j=3 3<=2 false  循环结束
		 * 			进入倒第二个内层的for循环
		 * 			j=1 1<=2 true  打印第一个* j++
		 * 			j=2 2<=2 true  打印第二个* j++
		 * 			j=3  3<=2 false  循环结束   换行 i++
		 * i=3  3<4 true 
		 * 		进入到第一个内层for循环
		 * 		j=1 1<=1 true  打印第一个空格 j++
		 * 		j=2 2<=1 false 循环结束
		 * 		进入倒第二个内层的for循环
		 * 		j=1 1<=3 true 打印第一个* j++
		 * 		j=2 2<=3  true 打印第二个* j++
		 * 		j=3 3<=3 true 打印第三个* j++
		 * 		j=4 4<=3false  换行  i++
		 * i= 4 4<4 false  整体结束
		 * 			
		 */
		for (int i = 1; i < 4; i++) {
			//打印的是空格
			for (int j = 1; j <= (4 - i); j++) {
				System.out.print(" ");
			}
			//打印*
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();//换行
			
		}
	}
}

```

```
3.
   *         第一行  3个空格(4 - i) 1个*  (2 * i )- 1
  ***        第二行  2个空格 3 个*
 *****       第三行  1个空格  5个*
*******      第四行  0个空格  7个*
```

```java 
package com.qf.a_homework;

public class Demo3 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			//打印空格的
			for (int j = 1; j <= (4 - i); j++) {
				System.out.print(" ");
			}
			//打印*
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

```

### 今天的内容

> 1.方法
>
> 2.break和continue

### 1.方法【重点】

#### 1.1为什么要有方法

> 开发中如果出现了重复的代码或者重复的功能，可以使用循环。但是有的时候循环也满足不了咱们的
>
> 1.代码是臃肿的
>
> 2.代码的维护性极差的
>
> 3.可读性极差
>
> 所以借助于方法来写咱们的功能

#### 1.2其实已经见过方法了

```
public  static void main (String[] args) {

}
main方法  是Java自己内置的方法

public  static  不要问    修饰符
void    无返回值的意思  空的

main :  就是咱们的方法的名字   是Java已经内置的
方法的后面紧跟着小括号。  小括号中是参数
小括号的后面跟的是大括号
只要会抄上面的方法

```

#### 1.3定义方法的语法格式

> 无参 无返回值的方法
>
> 有参 无返回值的方法
>
> 无参有返回值的方法
>
> 有参有返回值的方法

##### 1.3.1无参无返回值的方法

> 语法格式：
>
> ```java 
> public static void 方法的名字 () {
>     语句体
> }
> ```
>
> 注意事项:
>
> ​		1.方法的声明必须放在类中，main方法的外面
>
> ​		2.方法声明完以后，一定要记得在main函数中调用

```Java
package com.qf.a_homework;

public class Demo6 {
	//main方法必须要有的
	public static void main(String[] args) {
		//必须在main主函数中调用 才会执行
		//方法的调用
		printEatSheep();
		
	}
	//打印5遍的中午吃烤喜羊羊
	//void 是无返回值的
	//printEatSheep  方法的名字 和变量的命名规则是一样的
	public static void printEatSheep ()  {
		//大括号中写语句体，就是咱们需求功能
		for (int i = 0; i < 5; i++) {
			System.out.println("中午吃烤喜羊羊");
		}
	}
	
	
}

```

> 练习： 写一个方法，要求 打印一下九九乘法表，使用 无参无返回值的方法

```Java
package com.qf.a_homework;

public class Demo7 {
	
	public static void main(String[] args) {
		print99();
	}
	public static void print99 () {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}
		
	}
	
	
}

```

##### 1.3.2有参无返回值的方法

> 语法格式：
>
> ```java 
> public static void 方法的名字 (数据类型 变量1, 数据类型 变量2,... ) {
>     语句体
> }
> ```

```java 
package com.qf.a_homework;

public class Demo8 {
	public static void main(String[] args) {
		//34是实参  实际参数
		printNum(34);
		printHello(8);
		//printHello("goudan");
		printStr("孤舟蓑笠翁，独钓寒江雪");
		
		printNStr(9, "已是黄昏独自愁");
	}
	public static void  printNum (int sb) {//int  num  是形参  形式参数
		System.out.println(sb);
	}
	
	//打印n遍的hello  world
	public static void printHello (int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("hello world");
		}
	}
	//打印随便字符串  打印8遍
	public  static void printStr(String str) {
		for (int i = 0; i < 8; i++) {
			System.out.println(str);
		}
	}
	//打印n遍的随便的字符串
	public static void printNStr (int a, String str) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}
	
}

```

> 练习：  打印66乘法表   有参无返回值的方法

```java
//打印66乘法表
	public  static void  print66(int num) {
		for (int i = 1; i < num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j +"*"+ i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
```

回顾上午的内容

```
1.for循环的嵌套  一定要知道流程
2.方法的语法格式
	2.1无参无返回值的方法
	public static void 方法的名字 () {
		
	}
	2.2有参无返回值的方法
	public static void 方法的名字(数据类型 变量, 数据类型 变量, ...) {
	
	} 
```

##### 1.3.3无参有返回值的方法

> 语法格式：
>
> ```java 
> public static  数据类型 方法的名字() {
>     
>     return 返回的数据;//返回的数据的数据类型一定是声明方法的时候  的数据类型是一致的
> }
> ```

```Java
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

```

##### 1.3.4有参有返回值的方法

> 语法格式：
>
> ```java 
> public  static 数据类型  方法的名字 (数据类型 变量1, 数据类型 变量2,...) {
>     	return  返回的数据;
> }
> ```

```JAVA 
package com.qf.a_homework;

public class Demo10 {
	public static void main(String[] args) {
		
		int sum = add(3, 4);
		System.out.println(sum);
	}
	//声明一个有参有返回值的方法
	//求两个整数的和
	public static int  add(int a , int b) {
		return a + b;
	}
}

```

案例：  控制台输入两个int类型的数据，然后将最大值输出

```Java
package com.qf.a_homework;

import java.util.Scanner;

public class Demo11 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int b = scanner.nextInt();
		if (a >= b) {
			System.out.println("两个数中最大的数为:"+a);
		} else {
			System.out.println("两个数中最大的数为:"+ b);
		}
		
	}
}

```

分别使用方法的四种形式来书写案例

使用无参无返回值的

```Java
package com.qf.a_homework;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		max();
	}
	//无参无返回值的方法   求两个数之间的最大的数
	public static void max () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int b = scanner.nextInt();
		if (a >= b) {
			System.out.println("两个数中最大的值为:" + a);
		} else {
			System.out.println("两个数中最大的值为:" + b);
		}
		
	}
	
}

```

有参无返回值的方法

```Java
package com.qf.a_homework;

import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = scanner.nextInt();
		System.out.println("请输入第二个整数:");
		int b = scanner.nextInt();
		max(a, b);//a  是  控制套输入的数据  是实参
		
	}
	//有参 无返回值的方法
	public static void max(int a, int b) {//a   是形式参数
		
		if (a >= b) {
			System.out.println("最大值为:" + a);
		} else {
			System.out.println("最大值为:" + b);
		}
	}

}

```

无参有返回值的

```Java
package com.qf.a_homework;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		int a = max();
		System.out.println("嘻嘻 最大值为:"+a);
	}
	//无参 有返回值的
	public static int max() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int i1 = scanner.nextInt();
	
		System.out.println("请输入第二个整数:");
		int i2 = scanner.nextInt();
		if (i1 >= i2) {
			return i1;
		} else {
			return i2;
		}
	}
}

```

有参有返回值的方法

```Java
package com.qf.a_homework;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int i1 = scanner.nextInt();
	
		System.out.println("请输入第二个整数:");
		int i2 = scanner.nextInt();
		
		int i3 = max(i1, i2);
		System.out.println("最大值为:" + i3);
	}
	//有参有返回值的方法
	public static int max (int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
}

```

关于方法

总结：  4个形式  把握四个形式的语法格式，方法以后继续练习 不用担心

### 2.break和continue

#### 2.1break

> 字面意思：  打断  终止
>
> 语法格式:
>
> ```
> break;
> ```
>
> 只能在swicth-case中或者  循环中 其他地方不能用！！！

```Java
package com.qf.a_homework;

public class Demo16 {
	public static void main(String[] args) {
		//break
		//break cannot be used outside of a loop or a switch
		
		for (int i = 0; i < 5; i++) {
			System.out.println("嘻嘻哒");
			break;//终止
		}
		
		for (int i = 0; i < 8; i++) {
			switch (7) {
			case 1:
				System.out.println("哈哈");
				break;//这个break打断的是switch -case
			case 7:
				System.out.println("呵呵");
				break ;
			default:
				System.out.println("jcdsjnjn");
				break;
			}
		}
		
	}
}

```

#### 2.2continue

> 字面意思： 继续
>
> 语法格式:
>
> ```java 
> continue;
> ```
>
> 循环中  结束本次循环，进入到下次循环

```Java
package com.qf.a_homework;

public class Demo17 {
	public static void main(String[] args) {
		/**
		 * i=4 4<=7? true  4==5 false  sout(4) i++
		 * i=5 5<=7 true  5==5 true continue  终止当前的循环，然后进入到下一次循环 i++
		 * i=6 6<=7  true 6==5 false sout(6)
		 */
		for (int i = 4; i <= 7; i++) {
			if (i== 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}

```

总结：

```
break;  用在switch 和循环中
continue; 用在循环中
```

### 3.案例

> 1.写一个方法，判断一个字符是否是英文小写字符
>
> ```Java
> package com.qf.a_homework;
> 
> import java.util.Scanner;
> 
> public class Demo18 {
> 	public static void main(String[] args) {
> 		Scanner scanner = new Scanner(System.in);
> 		System.out.println("请输入一个字符:");
> 		char x = scanner.next().charAt(0);
> 		test(x);
> 		
> 		
> 	}
> 	public static void test (char ch1) {
> 		//  char类型的数据 十进制的ASSIC码值的
> //		if (ch1 >= 'a' && ch1 <= 'z') {
> 		if (ch1 >= 97 && ch1 <= 122) {
> 			System.out.println("是英文的小写字符");
> 		} else {
> 			System.out.println("不是英文的小写字符");
> 		}
> 	}
> }
> 
> ```
>
> 

作业：

```
1.写一个方法，控制台输入一个字符，判断一个字符是否是英文字符（包含大写和小写）
2.写一个方法，控制台输入一个字符，判断一个字符是否是数字字符（包含大写和小写）
3.写一个方法，控制台输入一个字符，将一个整数逆序打印【难】
	int a = 8796
结果	6
	 9
	 7
	 8
4.写一个方法，控制台输入一个年份  判断是否闰年
5.写一个方法 判断一个数是否是正数
```

