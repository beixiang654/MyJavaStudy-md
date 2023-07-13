### 今天的内容

> 1.三目运算符
>
> 2.循环结构

### 1.三目运算符

> 开发用的很多
>
> 语法格式:
>
> ```
> 数据类型  x = 表达式 ? 值1 : 值2;
> ```
>
> 执行流程:   先判断表达式  的真假，如果表达式为true的话，将值1赋值给变量x。如果表达式为false的话
>
> 就会将值2赋值给变量x。

```Java
package com.qf.a_test;

public class Demo1 {
	public static void main(String[] args) {
		
		int a1 = 20;
		//数据类型  x = 表达式 ? 值1 : 值2;
		//先判断 a1 > 50  的值，如果true 将30 f赋值c1  如果为false 将0 赋值给c1
		int c1 = a1 > 50 ? 30 : 0;
		System.out.println(c1);
		int c2;
		if ( a1 > 50) {
			c2 = 30;
		} else {
			c2 = 0;
			
		}
		System.out.println(c2);
		
		String str = a1 > 20 ? a1 + "大于20" : a1 + "小于等于20";
		System.out.println(str);
		
		//扩展知识点 关于字符串的知识点
		//如何声明一个字符串变量
		String str1 = "不能吃的不能";
		System.out.println(str1);
		//字符串拼接  可以使用 +
		str1 = str1 + "狗蛋";//这个+ 和运算符中的+ 不一样
		System.out.println(str1);//不能吃的不能狗蛋
		
		str1 = str1 + 89;//字符串 + int数据  还字符串拼接
		System.out.println(str1);
		str1 = str1 + true;
		System.out.println(str1);
		//总结： 字符串加上任意的数据类型都是字符串的拼接
		
	}
}

```

### 2.循环结构【重点】

#### 2.1为啥会有循环结构

> 代码中如果出现了大量的重复或者有规律的代码，咱们可以CV大法
>
> 1.代码是比较臃肿的
>
> 2.阅读性差
>
> 3.可维护性差
>
> 循环可以解决以上的问题:
>
> ​		循环至少三个条件:  1.初始化条件   2.循环条件  3.终止条件

#### 2.2while循环

> 语法格式:
>
> ```java 
> while (布尔表达式) {
> 	循环体;
> }
> ```
>
> 执行流程:
>
> ​		如果代码执行到while以后，首先判读小括号中的布尔的表达式，如果布尔表达式为true
>
> 执行大括号中的循环体。然后再次到while 再次判断布尔表达式，直到布尔表达式为false的时候
>
> 终止循环了。

```java
package com.qf.a_test;

public class Demo3 {
	public static void main(String[] args) {
		
		//需求: 打印三遍中午吃鲍鱼
		/**
		 * i=0  0<3 true  执行大括号中的代码 sout（"中午吃鲍鱼"） i++ 
		 * i=1 1<3  true  执行大括号中的代码 sout（"中午吃鲍鱼"） i++
		 * i=2 2<3 true   执行大括号中的代码 sout（"中午吃鲍鱼"）i++
		 * i=3 3<3 false 循环结束
		 */
		int i = 0;//1.初始化的条件
		while (i < 3) {//i < 3  3.终止条件
			System.out.println("中午吃鲍鱼");
			i++;//2.循环条件
		}
		System.out.println("嘻嘻呵呵哒");
	}
}

```

> 案例 :  打印1 ~9这些数字

```Java
package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		
		//打印1 ~ 9
		/**
		 * 执行流程:
		 * i=1 1<10 true  sout(1) i++
		 * i=2 2<10 true sout(2) i++
		 * i=3 3<10 true sout(3) i++
		 * i=4 4<10  true sout(4) i++
		 * ....
		 * i=9 9<10 true sout(9) i++
		 * i=10 10<10 false
		 */
		int i = 1;
		while (i < 10) {
			System.out.println(i);//刚好借助i的值 来完成输出
			i++;
		}
	}
}

```

> 案例:  打印10以内的偶数
>
> 用while循环

```Java
package com.qf.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//需求: 打印10以后的偶数
		/**
		 * i=0 0<10 true 执行if语句 0 %2==0 true 执行if后面的大括号中的代码 sout(0) i++
		 * i=1 1<10 true 执行if语句 1 %2==0 false 不执行if后面的大括号中的代码 i++
		 * i=2 2<10 true 执行if语句 2 %2==0  true执行if后面的大括号中的代码 sout(2) i++
		 * i=3 3<10 true 执行if语句 3 %2==0 false不执行if后面的大括号中的代码 i++ 
		 * i=4 4<10 true执行if语句 4%2==0true执行if后面的大括号中的代码 sout(4) i++
		 * ...
		 */
		int i = 0;
		while (i < 10) {
			//if语句起到什么作用 判读过滤
			if (i % 2 == 0) {
				System.out.println(i);
				
			}
			i++;
			
		}
		//以上代码循环了10次
		
		//换一种写法
		/**
		 * a = 0 0<10 true sout(0) a = 0+2===>a=2
		 * a=2 2<10 true sout(2) a = a+2===>a = 4
		 * a=4 4<10 true sout(4) 
		 * ...
		 */
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			//a = a + 2;//循环条件
			a += 2;//步幅
		}
	}
}

```

```Java
package com.qf.a_test;

public class Demo6 {
	public static void main(String[] args) {
		//打印10以内的额奇数
		int i = 1;
		while (i < 10) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
		
		int a = 1;
		while (a < 10) {
			System.out.println(a);
			a+=2;
		}
	}
}

```

#### 2.3do-while 【开发几乎不用】

> 语法格式:
>
> ```java 
> do {
>    循环体 
> } while (布尔表达式);
> ```
>
> 执行流程:
>
> ​	首先代码走到 do 执行do后面大括号中的 代码（循环体），然后执行while后面的布尔表达式，
>
> 判断布尔表达式，如果表达式为true 的话，再次回到do 执行循环体，然后执行while后面的布尔表达式
>
> 判断布尔表达式，直到布尔表达式为false的话，循环结束（不再回到do了）

```Java
package com.qf.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//打印3遍的hello
		/**
		 * i=9 当代码执行到do以后直接sout("hello") i++ i=10 10 <12 true
		 * 回到do 执行do后面的代码sout("hello") i++ i=11 11<12 true
		 * 回到do  执行do后面的代码sout("hello") i++ i=12 12<12 false
		 * 不能再回到do了
		 * 不管你布尔表达式都要先执行do后面语句
		 */
		int i = 9;
		do {
			System.out.println("hello");
			i++;
		} while (i < 3);
	}
}

```

注意 while 循环和do-while的区别==》while先判断根据判断的结果后执行 do-while 先执行后判断

#### 2.4for循环

> 语法格式：
>
> ```Java
> for (表达式1; 表达式2; 表达式3) {
>     循环体;
> }
> ```
>
> //表达式1 是初始化的值
> //表达式2 是终止条件
> //表达式3 循环条件
>
> 执行流程:   先执行表达式1，然后执行表达式2  进行判断 如果表达式2位true 执行 后面大括号中的代码
>
> 然后再执行表达式3,。 回去执行表达式2 进行判断 如果为true 继续执行后面大括号中的代码。执行表达式3。再次判断表达式2，直到表达式2位false  大括号中的代码不再执行了
>
> 

```java 
package com.qf.a_test;

public class Demo8 {
	public static void main(String[] args) {
		
		//打印三遍的狗蛋
		//表达式1 是初始化的值
		//表达式2 是终止条件
		//表达式3 循环条件
		/**
		 * i=0  0<3 true 执行后面的大括号中的代码  sout("狗蛋") i++
		 * i=1  1<3 true 执行后面的大括号中的代码  sout("狗蛋") i++
		 * i=2 2<3 true执行后面的大括号中的代码  sout("狗蛋") i++
		 * i=3 3<3 false 不执行大括号中的代码 循环结束
		 */
		for (int i = 0; i < 3; i++) {
			System.out.println("狗蛋");
		}
	}
}

```

回顾上午的内容

```
1.三目运算符
数据类型 变量名字 = 表达式 ? 值1: 值2;
执行流程: 如果表达式为true， 将值1赋值给变量。为false 将值2赋值给变量
2.while循环
	while (布尔表达式) {
		循环体
	}
	
3.do-while 循环
do {
	循环体
} while (布尔表达式);

4.for循环

for (表达式1; 表达式2; 表达式3) {
	循环体
}
```

案例1： 打印10以内的奇数

```Java
package com.qf.a_test;

public class Demo9 {
	public static void main(String[] args) {
		// 打印10以内的奇数  使用for循环
		//1   2   3  4   5  6    7  8   9   for循环 
		//1   3    5  7 9    if 语句
		/**
		 * i=1 1<10 true 执行大括号中代码  if(1%2!=0) true  sout(1) i++
		 * i=2 2<10 true 执行大括号中代码  if(2%2!=0) false  i++
		 * i=3 3<10 true 执行大括号中代码  if(3%2!=0) true sout(3) i++
		 * ..
		 */
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("==========");
		/**
		 * i=1 1<10 sout(1) i+=2 i=i+2;
		 * i=3 3<10 sout(3)
		 */
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		
	}
}

```

案例2: 逢7过 1~100以内

带7的 和7的倍数的都要打印一个过，其他正常打印

```Java
package com.qf.a_test;

public class Demo10 {
	public static void main(String[] args) {
		//案例2: 逢7过 1~100以内
		//1 2 3  4 5  6 过 8  9  10  11 12  13 过  15 16 过 18...
		//1.7的倍数？  i % 7 == 0   2.个位是7 ？  i % 10 == 7
		//3.十位是7?  i / 10 == 7;
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("过");
			} else {
				System.out.println(i);
			}
		}
		
	}
}

```

案例3: 1~100的和

```java 
package com.qf.a_test;

public class Demo11 {
	public static void main(String[] args) {
		//案例：1~100的和   5050
		int sum = 0;//初始变量  接收 和的
		/**
		 * i=1 1<101 true sum = sum + i;  sum=0+1; i++
		 * i=2 2<101 true sum = sum + i;  sum=0+1+2; i++
		 * i=3 3<101 true sum =sum + i;   sum=0+1+2 + 3; i++
		 * 
		 */
		for (int i = 1; i < 101; i++) {
			//sum = sum + i;
			sum += i;

		}
		//等你循环结束以后，我只要最后的一个结果
		System.out.println(sum);
		
	}
}	

```

#### 2.5嵌套循环【重点难点】

> 一个循环中嵌套一个if 或者if-esle 或者swicth-case  属于嵌套
>
> 一个循环中嵌套另外一个循环【重点】

案例1:

```
****
****
****
```

三行四列的*

```Java
package com.qf.a_test;

public class Demo12 {
	public static void main(String[] args) {
//		System.out.println("****");
//		System.out.println("****");
//		System.out.println("****");
//		重复代码用for循环改进一下
//		for (int i = 0; i < 3; i++) {
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.println();
//		}
		//以上再改进
		/**
		 * i=0  0<3 true 执行大括号中的代码 
		 * 		进入内层的for循环
		 * 		j=0 0<4 true sout(*) j++
		 * 		j=1 1<4 true sout(*) j++
		 * 		j=2 2<4 true sout(*) j++
		 * \	j=3 3<4 true sout(*) j++
		 * 		j=4 4<4 false 执行换行   i++
		 * i=1 1<3 true 执行大括号中的代码 
		 * 		第二次进入内层的for循环
		 * 		j=0 0<4 true sout(*) j++
		 * 		j=1 1<4 true sout(*) j++
		 * 		j=2 2<4 true sout(*) j++
		 * 		j=3 3<4 true sout(*) j++
		 * 		j=4 4<4 false 换行   i++
		 * i=2  2<3  true 执行大括号中的代码 
		 * 		第三次进入倒了内层for循环
				j=0 0<4 true sout(*) j++
		 * 		j=1 1<4 true sout(*) j++
		 * 		j=2 2<4 true sout(*) j++
		 * 		j=3 3<4 true sout(*) j++
		 * 		j=4 4<4 false 换行   i++
		 * 	i=3 3<3 false
		 * 	
		 */
		//****
		//****
		//*
		
		for (int i = 0; i < 3; i++) {//最外层循环控制行
			for(int j = 0; j < 4; j++) {//最内层循环控制列
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}
}

```

案例打印直角三角形

```
*
**
***
****
列和行有关系 有规律的
第一行  1列
第二行  2列
...
```

```java 
package com.qf.a_test;

public class Demo13 {
	public static void main(String[] args) {
		/**
		 * i=1 1<5 true 
		 * 		进入到内层for循环
		 * 		j=1 1<=1 true sout(*) j++
		 * 		j=2 2<=1 false 换行 i++
		 * i=2 2<5 true
		 * 		进入到内层for循环
		 * 		j=1 1<=2 true sout(*) j++
		 * 		j=2 2<=2 true sout(*) j++
		 * 		j=3 3<=2 false 换行 i++
		 * i=3 3<5 true
		 * 		进入到内层for循环
		 * 		j=1 1<=3 true sout(*) j++
		 * 		j=2 2<=3 true sout(*) j++
		 * 		j=3 3<=3 true sout(*) j++
		 * 		j=4 4<=3false 换行 i++
		 * i=4 
		 */
		//*
		//**
		//***
		//****
		for (int i = 1; i < 5; i++) {//控制的行 4行
			for (int j = 1; j <= i; j++) {//控制的列   让你
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

```



案例:九九乘法表

```
1*1=1
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
1*4=4 2*4=8 3*4=12 4*4=16
...
```

```java 
package com.qf.a_test;

public class Demo14 {
	public static void main(String[] args) {
		//九九乘法表
		/**
		 * i=1 1<10 true 
		 * 		内层for循环
		 * 		j=1 1<=1 sout(1*1=1) j++
		 * 		j=2 2<=1 false  换行 i++
		 *i=2 2<10 true
		 *		内层for循环
		 * 		j=1 1<=2 sout(1*2=2) 制表符 j++
		 * 		j=2 2<=2 sout(2*2=4) j++
		 * 		j=3 3<=2 false  换行 i++
		 * i=3 3<10 true
		 * 		内层for循环
		 * 		j=1 1<=3 sout(1*3=3) 制表符 j++
		 */
		//1*1=1
		//1*2=2  2*2=4
		//1*3=3 ...
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();//换行
		}

		
	}
}

```

案例:

打印等腰三角形

```
   *          第一行  3个空格 1个*      
  ***		  第二行  2个空格 3个*
 *****        第三行  1个空格 5个*   
*******       第四行  0个空格  7个*
```




作业:

```
1.每个人总结一个word文档   从周二讲的到今天的 不能复制黏贴【重点】
2.发一些 关于 分支和循环的作业  txt文档

2.打印直角三角形
*       1   1            2*i-1
***     2    3
*****   3    5
*******  4   7

3.圣诞树
    *
   ***
  *****
 *******
    *
   ***
  *****
 ********
   ***
   ***
   ***
   ***
```

