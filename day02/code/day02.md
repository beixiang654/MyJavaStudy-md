### 今天的内容

> 1.安装eclipse  开发工具
>
> 2.数据的存储形式【了解】
>
> 3.变量
>
> 4.八大基本数据类型
>
> 5.运算符

### 1.安装eclipse

双击快捷方式：会出现如下的页面

![1](img\1.png)

File->new->project->java project

![3](img\3.png)

![4](img\4.png)



window->perspectiove->reset perspective    eclipse是项目的可视化的架子，右边是写代码的地方

找到项目中的src文件夹，点击上之后右键-》new ->packges

![5](img\5.png)

建好以后会有几个空的文件夹，选中空的文件夹，右键  -》new ->class

#### 1.1调一些eclipse的字体大写

windows->perferences->

![7](img\7.png)

![8](img\8.png)

![9](img\9.png)

### 2.数据存储的方式【了解】

#### 2.1数据存储的基本单位

> 计算机存储的最小的基本单位是 字节   byte
>
> 1024byte = 1KB
>
> 1024KB = 1MB
>
> 1024MB = 1GB
>
> 1024GB = 1TB
>
> 1024TB = 1PB
>
> 1024PB = 1EB

#### 2.2常见进制单位

| 进制单位 | 基数范围  | 规则    |
| -------- | --------- | ------- |
| 二进制   | 0~1       | 逢2 进1 |
| 八进制   | 0~7       | 逢8进1  |
| 十进制   | 0~9       | 逢10进1 |
| 十六进制 | 0~9   a-f | 逢16进1 |

```
二进制:  逢2进1  
	0  （0）  1（1） 2（10）   3（11） 4（100）
	整数十进制转二进制:   拿十进制的数除以2  看余数 直到数据变成0  将余数逆序排列
	4/2    余数0  商是2
	2/2    余数0   商是1
	1/2    余数1   商是0    100
八进制:   逢8进1
	1（1）....7(7) 8(10) 9(11) 10(12) 11(13)  12(14)...15(17) 16(20)

十六进制:
		10(a)  11(b) ... 15(f) 16(10)
	
关于进制的换算:
	十进制转二进制   二进制转八进制   十六进制转二进制  等
	1.使用计算器
	2.在线转换网站
	3.使用Java中 封装方法，可以通过一个方法将进制进行转化
	开发不用
```

### 3.变量【重要】

> 要求必须会书写变量    变化的量

#### 3.1生活中也是有变量的

> 工资
>
> 年龄
>
> 温度
>
> x + y = 10

#### 3.2java 中的变量

> 在程序运行过程中，用来保存数据的。可以改变的叫变量
>
> 声明变量的语法格式:
>
> ​		数据类型  变量名字 = 初始化的值;	
>
> ​		数据类型:  对变量进行约束的 告知此时这个变量的值 只能是某一个范围
>
> ​		变量名字 :  自己起的一个名字
>
> ​		=  :赋值号　　　　　将右边的数据赋值给了左边的变量
>
> ​		初始化的值;	：　　是一个值而已
>
> 开房
>
> 房间比作一个变量
>
> 房间的名字＝＝＝》　　变量的名字
>
> 房间的类型＝＝＝＝》数据类型
>
> 入住的客人====》初始化的值

```java 
package com.qf.a_test;

public class Demo2 {
	public static void main(String[] args) {
		//数据类型  变量名字 = 初始化的值;
		int a = 20;//将20赋值给了变量a  a就有了值是20
		//int   是数据类型 对数据进行约束的  整型
		System.out.println(a);//20
		a = 250;//再将250赋值给a  
		System.out.println(a);//250
		int age = 89;
		
		//int score  = 98;
		int score;//在用这个变量给变量赋值
		//System.out.println(score);
		int c, d;//同时声明了两个变量
		int r, t, u ;
		r = 89;
		t = 78;
		u = 23;
		System.out.println(r);
		//声明  +  赋值
		
	}
}

```

回顾

```
1.使用eclipse创建Java工程
2.声明并赋值一个变量
	数据类型 变量名字 = 值;
```

#### 3.3java中数据类型

Java有八大基本数据类型

> 整数（整型）: 4个     byte  short  int long
>
> 小数（浮点数）: 2  个  float  double
>
> 字符:  1个  char
>
> 布尔类型:   1个 boolean  真假关系

##### 3.3.1整数类型的数据

| 整型  | 数据范围        | 占用内存的字节 |
| ----- | --------------- | -------------- |
| byte  | -128~127        | 1字节          |
| short | -32768~32767    | 2字节          |
| int   | -2^31 ~  2^31-1 | 4字节          |
| long  | -2^63 ~ 2^63-1  | 8字节          |

注意: 

1.int是开发中最常用的，也是Java中默认的数据类型

2.声明long类型的额数据的时候，在值的上面加L或者l。

学到什么程度:  只需要会  int  a = 30;

```java 
package com.qf.a_test;

public class Demo3 {
	public static void main (String[] args) {
		//声明一个byte 类型的数据  整数
		byte b1 = 20;
		System.out.println(b1);
		//byte b2 = 128; 128赋值不了b2的因为  byte类型范围  -128~127
		
		short s1 = 128;//范围是-32768~32767
		System.out.println(s1);
		//short s2 = 32789;//cannot convert from int to short
		//Java中默认的数据是int类型  32789  是int
		//将int转为 short  大转小（大被子的水倒到小杯子中，需要强转的）
		
		int i1 = 20;
		System.out.println(i1);
		
		
		long l1 = 28299228;
		long l2 = 27828299292929L;
		//如果long类型的数据 没有超过int类型的范围的时候不用加L或者l
		//如果long类型的数据 超过int类型的范围的时候加L或者l 不然编译报错
		//个人:不管你数据范围都大，都加L
		
		
		int age = 32;
		
		
		
	}
}

```

##### 3.3.2浮点类型【小数】

| 浮点   | 数据范围                      | 占用字节数 |
| ------ | ----------------------------- | ---------- |
| double | -1.79* 10^308 ~   1.79*10^308 | 8字节      |
| float  | -3.4* 10 ^38 ~ 3.4*  * 10^38  | 4字节      |

注意事项:

​	1.声明float类型数据的时候，需要加f后者F

​	2.float的有效位数:  7位

​	3.double的有效位数: 16位

```Java
package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		//声明一个double类型的数据  小数
		double  d1 = 89.123;
		System.out.println(d1);
		
		//声明一个float类型的数据
		//声明float类型的数据的时候一定加F或者f  不然编译报错
		float f1 = 292.98f;
		System.out.println(f1);
		
		float f2 = 1.23456789123f;
		System.out.println(f2);//1.2345679
		float f3 = 2828.8989898989f;
		System.out.println(f3);//2828.899
		
		double d2 = 1.1212121212122111234;
		System.out.println(d2);
		
		
	}
}

```

##### 3.3.3字符类型

| 数据类I型 | 数据范围            | 占用字节 |
| --------- | ------------------- | -------- |
| char      | 除了\  其他都可以的 | 2字节    |

```Java
package com.qf.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//声明一个char类型的数据
		char ch1 = '上';
		char ch2 = 'k';
		char ch3 = '0';
		char ch4 = '&';
		char ch5 = '*';
		char ch6 = '^';
		//注意事项: 字符类型的数据使用单引号进行引起来。
		//而且单引号中只能有一个元素
		
	}
}

```

##### 3.3.4布尔类型

| 数据类型 | 数据范围       | 占用字节 |
| -------- | -------------- | -------- |
| boolean  | true 或者false | 1字节    |

```Java
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
```

总结:

```
int
double
char (有时用)
boolean 
```

数据类型 变量的名字 = 值;

#### 3.4类和变量命名

> 命名的规范:
>
> ​		在真实的开发中，无论是类的名字 还有变量的名字都有规范的
>
> 类的命名:
>
> ​		1.首字母大写
>
> ​		2.如果有多个单词组成的类名  采用大驼峰的命名规则   HelloWorld   SingleDog
>
> 变量的命名:
>
> ​		1.变量的命名可以使用 数字,字母,_，$等组成，但是不能以数字开头
>
> ​		2.首字母不能大写
>
> ​		3.采用的是小驼峰命名规则 或者采用下划线连接多个单词的写法
>
> ​		4.命名一定要见名知意  
>
> ​		5.已经被Java预留的关键不能再作为变量的名字了

```Java
package com.qf.a_test;

public class Demo6 {
	public static void main(String[] args) {
		int $a2_$ = 30;
		//int 2a = 89;//不能以数字开头
		int Ab =  45;//不合理，没有这样写 不规范的！！！
		System.out.println(Ab);
		
		int userAge = 23;
		int user_age = 12;
		
		//想声明一个身高的变量
		double height = 110;//规范
		double shenGao = 120;//稍微不规范
		double 身高 = 140;//不规范
		System.out.println(身高);
		//建议 翻译
//		int package = 34;
//		int class = 78;
		
	}
}

```

### 4.转义字符或者转义字符串

> 转义:  转换意思
>
> 目的: 将一个无意义的字符转为有意义的字符或者将一个有意义的字符转为无意义的字符
>
> 语法格式:
>
> ​		\字符(有特殊意义的字符或者无特殊意义的字符)
>
> 两个特殊的符号:
>
> ​		\t：  制表符  空格
>
> ​		\n:   换行

```Java
package com.qf.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//打印一个字符类型的'
		System.out.println('\t');
		//打印一个字符类型\
		System.out.println('\\');
		
		//字符串类型的数据
		System.out.println("hello world");
		//打印一个字符串类的 "
		System.out.println("\"");
		//打印一个字符串的""
		System.out.println("\"\"");
		//打印一个字符串  \\
		System.out.println("\\\\");
		//\t \n 只能在字符和字符串中体现效果~！！！
		System.out.println("说的那家吗\t南山");
		System.out.println("孤舟蓑笠翁\n独钓寒江雪");
		
	}
}

```

### 5.运算符【重点】

> 1.算术运算符
>
> 2.关系运算符
>
> 3.逻辑运算符

#### 5.1算术运算符

> 数学中的
>
> ```
> + (加)    -(减)   *(乘)  /(除)   %(取余)    
> ```
>
> 

```Java
package com.qf.a_test;

public class Demo8 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1  + num2);//30
		//=是赋值号，一定先看=右边的
		/*
		 *斜线**敲回车 是文档注释
		 *1.先算 num1 + num2 = 30
		 *2.将30赋值给 num1
		 */
		num1 = num1 + num2;
		System.out.println(num1);//30
		/**
		 * 1.num1(30) + num2(20)
		 * 2.num1 = 50
		 */
		num1 = num1 + num2;
		System.out.println(num1);//50
		//注意:一定要围绕着变量的概念 变化着的量
		
		num1 = num1 - num2;
		System.out.println(num1);//30
		
		int a = 20;
		int b = 3;
		System.out.println(a * b);
		//除法
		System.out.println(a / b);//取的商的 整数
		//取余
		System.out.println(a % b);//2
		System.out.println(15 / 2);
		//先乘除后加减  先算小括号里面的然后再算小括号外面的
		int c = 2;
		int i1 = a + b * c;
		System.out.println(i1);//26
		int i2 = (a + b) * c;
		System.out.println(i2);//46
		
		
		
	}
}

```

```
特殊的算术运算符:
	+=  -=    *=  /=   %=
```

```java 
package com.qf.a_test;

public class Demo9 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		/**
		 * 1. num1 + num2 = 30
		 * 2.num1 = 30
		 */
		//num1 = num1 + num2;
		//是简写的一种情况
		num1 += num2;//num1 + num2 然后结果  赋值 num1
		System.out.println(num1);//30
		
		int a = 3;
		a += 2;//
		/**
		 * 1. a+ 2 =5
		 * 2.将5赋值给a
		 */
		System.out.println(a);
		int b= 3;
		//4 += b;
		/**
		 *1.  4 + 3 = 7
		 *2. 4 = 7
		 */
		
	}
	
}

```

作业:

```
1.整理笔记
2.列一个纲要
	1.变量
	2.数据类型
	3.变量的命名规则
	4.转义字符
	5.运算符
3.自学算术运算符中 自增和自减  明天我讲
4.ppt要写ppt 啊
5.金山打字通
```

