### 今天的内容

> 1.运算符
>
> 2.分支结构  if-else

### 1.运算符

> 1.算术运算符
>
> 2.关系运算符
>
> 3.逻辑运算符

#### 1.1算术运算符

> 自增和自减
>
> ​	目的: 让变量自身加一或者减一
>
> 语法格式:
>
> ```
> 变量++; 先执行当前的操作，然后自身再加1
> ++变量;
> 变量--;
> --变量;
> ```
>
> 

```Java
package com.qf.a_test;

public class Demo1 {
	public static void main(String[] args) {
		int num1 = 10;
		//++在变量的后面:先执行当前的操作，然后再自身加1
//		System.out.println(num1++);//10  做了几件事情:1.打印num1变量。2.num1自身加了1
//		System.out.println(num1);//11
		//++在变量的前面 的时候:先执行自增，然后再执行其他的操作
		System.out.println(++num1);//11   做了两个事情: 1.先自增 11 2num1此时为11
		System.out.println(num1);//11
		
		int num2 = 6;
		System.out.println(num2--);//6
		System.out.println(num2);//5
		
		int num3 = 3;
		int ret = num3++  * num3;
		System.out.println(ret);//12
		System.out.println(num3);//4
		
		int num4 = 2;
		int ret1 = num4 * ++num4;
		System.out.println(ret1);//6
		System.out.println(num4);//3
		
		int a = 5;
		int i = 5;
		// a = 5  + 6 + 8 + 9
	
		a = i++  + i++ + ++i + ++i;
		System.out.println(a);//28
		System.out.println(i);//9
		//a = 9 + 9 + 9
		a = i-- + ++i + i++;
		System.out.println(a);//27
		i++;
	}
}

```

#### 1.2关系运算符

```
>       <     >= (是否大于等于)    <=(是否小于等于)   !=(是否不等于)  ==(是否等于)

语法格式:
	boolean 变量名字 = 值1 关系运算符 值2;
```

```Java
package com.qf.a_test;

public class Demo2 {
	public static void main(String[] args) {
		boolean ret1 = 3 > 4;
		System.out.println(ret1);//false
		boolean ret2 = (5 > 1);
		System.out.println(ret2);//true
		boolean ret3 = 4 >= 3;
		System.out.println(ret3);//true
		boolean ret4 = 5 == 5;
		System.out.println(ret4);
		boolean ret5 = 6!=6;
		System.out.println(ret5);//false
		
		
	}
}

```

关系运算符会结合分支结构使用

#### 1.3逻辑运算符

返回值也是一个布尔类型的数据

> 与:   &&
>
> ​	语法格式:
>
> ```
> 关系运算符表达式1 &&  关系运算符表达式2 && 关系运算符表达式3 &&...
> ```
>
> 表达式就是咱们刚才讲的关系表达式。
>
> 如果所有的表达式 为true，那么总体的结果就为true。
>
> 只要有一个表达式为false，那么整体就为false了。
>
> 逻辑与:
>
> ​		并且
>
> ​		取款机中取钱！！！
>
> ​		得有卡还得有密码

```Java
package com.qf.a_test;

public class Demo3 {
	public static void main(String[] args) {
		//语法格式:  关系运算符的表达式1 && 关系运算符的表达式2
		//如果表达式都为true的时候整体结果i就为true。如果有一个表达式为false，那么整体就为false
		boolean ret = (3 > 4) && (4 > 2);
		System.out.println(ret);//false
		
		boolean ret1 = (5 >1) && (3 >2) && (9 >= 7);
		System.out.println(ret1);//true
		
	}
}

```

> 或:   ||
>
> ​		语法格式:
>
> ​		
>
> ```
> 条件1 || 条件2  ||条件3 || ...
> ```
>
> 所有条件都为false的时候，整体才为false。
>
> 只要有一个条件为true，则整体为true。
>
> 生活中的案例:家里的钥匙，你一把,你媳妇一把。  
>
> ​		都没有丢 true || true   =====》true
>
> ​		你的一把丢了，你媳妇能开。  false || true===>true
>
> ​		你媳妇钥匙丢了，你能开。   true  || false====> true
>
> ​		两个都丢了 false  || false   ====》false

```Java
package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		boolean ret1 = 3 > 4 || 5 >3;
		//||  或是只要有一个为true 则整体为true。 两个都是false才为false
		System.out.println(ret1);//true
		
		boolean ret2 = 5 < 3 || 7 < 2 || 7 < 4;
		System.out.println(ret2);//false
		//false || false || false
		
	}
}

```

> 非: !
>
> ​	语法格式:
>
> ```
> !条件
> ```
>
> 犟   让你往西，偏不往西

```Java
		boolean ret3 = !(3 > 4);//取反
		System.out.println(ret3);
```

```Java
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

```

#### 1.4逻辑运算符的短路原则

> 逻辑与的短路原则：
>
> ​		条件1 && 条件2 && 条件3&&...    只要有一个为false整体就为false
>
> ​		注意:  条件1为false的话，已经确定整体为false，后面的条件就不再运行了。
>
> 逻辑或的短路原则
>
> ​		条件1 || 条件2 ||...
>
> ​		只要一个为true，整体就为true了。
>
> ​		注意:  如果条件1 为true的话，后面的条件就不再执行了，为啥？因为条件1为true的话
>
> 已经确定整体的结果了，后面的条件结果不会影响整体的结果了。所以直接短路了

```Java
package com.qf.a_test;

public class Demo6 {
	public static void main(String[] args) {
		//逻辑与的短路原则
		int num = 10;
		boolean ret1 = (3 < 2) && (++num > 12);
		System.out.println(ret1);//false
		System.out.println(num);//10
		
		
		//逻辑或的短路原则
		int num1 = 10;
		boolean ret2 = (3 > 2) || (++num1 > 90);
		System.out.println(ret2);//true
		System.out.println(num1);//10
		
	}
}

```

总结：

```
运算符:
	1.算术运算符
	2.关系运算符
	3.逻辑运算符
	
```

### 2.分支结构

先学习语法格式，然后再记执行流程

> 生活中也有分支：通过条件来进行一种选择
>
> 程序中也有分支: 通过条件来进行一种选择

#### 2.1if分支

> 语法格式:
>
> ```
> if (表达式) {
> 	语句体
> }
> ```
>
> 表达式:   一定返回值是布尔类型数据的表达式。（关系运算符表达式和逻辑运算符表达式）
>
> 执行流程:首先进入if 判断if后面小括号中的表达式的值 如果为true 则执行后面大括号中的语句体。
>
> 如果为false，就不执行大括号中的二语句体，代码要继续往下执行

```Java
package com.qf.a_test;

public class Demo7 {
	public static void main(String[] args) {
		
		int a = 3;
		if (a < 1) {//小括号中的表达式的结果决定这大括号里面是否执行
			System.out.println("嘻嘻,3 大于1");
		}
		System.out.println("代码执行结束");
	}
}

```

#### 2.2if-else分支

两种选择

> 语法格式:
>
> ```java 
> if (表达式) {
> 	语句体1
> } else {
> 	语句体2
> }
> ```
>
> 执行流程:判断表达式，如果表达式为true，执行语句体1。如果表达式为false 执行语句体2
>
> 两者只能选其一

```Java
package com.qf.a_test;

public class Demo8 {
	public static void main(String[] args) {
		int money = 30;//口袋里面有30块钱
		//如果口袋里面的钱超过了20，打印我就吃顿好的。鲍鱼
		//如果口袋里面的钱没有超过了20，打印就凑合一下。泡面
		if (money > 20) {
			System.out.println("我就吃顿好的。鲍鱼");
		} else {
			System.out.println("就凑合一下。泡面+加肠");
		}
		System.out.println("嘻嘻 。。。");
		
	}
}

```

案例： 判断一个年份是否是闰年。

​	年数能够被4整除并且不能被100整除。或者能被400整除的是闰年。

​		

```Java
package com.qf.a_test;

public class Demo9 {
	public static void main(String[] args) {
		int year = 2008;
		boolean ret1  = year % 4 == 0;
		boolean ret2 = year % 100 != 0;
		boolean ret3 = year % 400 == 0;
		System.out.println(ret1);//true
		System.out.println(ret2);//true
		System.out.println(ret3);//false
		//true && true || false====>true
		//年数能够被4整除并且不能被100整除。或者能被400整除的是闰年。
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
	}
}

```



```
早上 8：40 之前
中午 13:50 之前
晚自习19：00 之前
```

回顾上午的内容

```
1.自增  自减
 	变量++:先执行当前的操作（保持原来的状态），然后再自身加1
 	++变量: 先自身加1，之后再执行其他的操作（在执行这个操作的时候，值已经是加过1De状态了）
2.关系运算符
	>   <   >=  <=  != ==
	4 > 3; 属于关系表达式
	关运算符的结果是布尔类型的数据  只有两个值 一个是true 一个false！！！
3.逻辑运算符
	&&:  当条件都为true的时候结果整体为true，只要有一个条件为false，整体就为false。
	||:  当条件都为false的时候，整体的结果才为false，只要有一个为true的话，整体就为true。 
	!:  取反   当条件为true的话，结果就为false。
	基础是 关系运算符的表达式
	4 >3 && 5 > 7    逻辑运算符的表达式
4.if分支
看语法格式和执行的流程
 if (4 > 3) {//4 > 3  是关系表达式
 
 }
 
 if (4 > 3|| 7 < 9 || 9 <6) {//4 > 3|| 7 < 9 || 9 <6 
 
 }
 5.if-esle 
 if：如果
 else:  其他的
 if (3 > 4) {
 	语句体1
 } else {
 	语句体2
 }
```

#### 2.3if-else if分支

多种选择

> 语法格式:
>
> ```java 
> if (表达式1) {
> 	语句体1
> } else if (表达式2) {
>     语句体2
> } else if (表达式3) {
>     语句体3
> }else if (表达式4) {
>     语句体4
> }else {
>     语句体n
> }
> ```
>
> 执行流程: 如果碰到if后面的小括号中的表达式的值为true的时候，就执行对应大括号中的语句体。其他语句体一概不执行
>
> 多种条件只能选择其一

```java 
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

```



> 案例：
>
> ​		如果语文成绩大于80分且数学成绩大于80分，打印给奖学金
>
> ​		如果语文成绩小于80分大于60且数学成绩大于60分小于80，打印及格
>
> ​		如果语文成绩小于30分且数学成绩小于30分，打印重修

```Java
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

```

#### 2.4switch-case分支

> 也是一种选择，只有当满足当前的条件的时候才会执行前的语句体
>
> 语法格式:
>
> ```java 
> switch  (表达式) {//表达式  结果是一个具体的值  不是布尔类型的值
>     case 常量1:
>         语句体1;
>         break;
>     case 常量2:
>         语句体2;
>         break; 
>     case 常量3:
>         语句体3;
>         break;
>       ...
>     default://其他的情况
>         语句体n;
>         break;
> }
> ```
>
> 执行流程:
>
> 首先计算表达式的值，拿到这个值以后去和case后面的常量去匹配。如果发现一致。就执行当前语句体

```Java
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

```

练习swicth-case

```java 
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

```

面试题：

```
swicth(表达式) {

}
表达式的值可以什么是数据类型?
 byte  short  int 
 char
 String  jdk1.8新特性
 枚举
```

```Java
package com.qf.a_test;

public class Demo14 {
	public static void main(String[] args) {
		//byte b1 = 20;
		//short b1 = 30;
		//int b1 = 20;
		//long b1 = 27828L; 不行
		//String b1 = "20";
		//无法打开long类型的值。只允许使用可转换的int值、字符串或枚举变量
		//char b1 = 'a';
		//float b1 = 87.9f;//不行的！！！
		//'a'所对应的十进制的assci码值是97
		//'b'==>98  'c'===>99
		
		
		switch (87) {
		case 87:
			System.out.println("打印了");
			break;

		default:
			break;
		}
	}
}

```

### 3.扩展知识

> 这个知识点咱们用两周以后不再用了。
>
> 咱们现在对变量进行赋值的时候咋赋值。
>
> int a = 34;  
>
> 还可以有其他的方式对咱们的变量的进行赋值
>
> 可以通过控制台输入一个数，然后通过Java代码将控制台输入的数给赋值到变量上面。

入门案例：

```Java
package com.qf.a_test;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		
		//sc是一个变量
		//Java面向对象 思想:专门的对象做专门的事
		//Scanner  sc = new Scanner(System.in)   创建了一个对象 叫sc
		//Scanner 专门  是一扫描器，扫描控制台你手动输入的数据
		Scanner  sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a = sc.nextInt();
		System.out.println(a);
	}
}

```

> 按照步骤来写:
>
> 1.导包
>
> ​	可以不用写，自己出来
>
> ```
> import java.util.Scanner;
> ```
>
> 2.创建一个对象  Scanner 对象
>
> ```
> Scanner  sc = new Scanner(System.in)；
> ```
>
> 3.拿对象sc调用方法获取控制台的各种类型的数据
>
> 获取一个int类型
>
> ```
> int a = sc.nextInt();
> ```
>
> 目的：  接收控制台的数据给 Java中某一个变量

```Java
package com.qf.a_test;

import java.util.Scanner;

public class Demo16 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//一般会写一个提示的语句
//		System.out.println("请输入一个整数:");
//		int a = scanner.nextInt();//获取的是整数的类型的
//		System.out.println(a);
		
//		System.out.println("请输入一个小数:");
//		double a = scanner.nextDouble();
//		System.out.println(a);
//		System.out.println("请输入一个布尔类型:");
//		boolean b1 = scanner.nextBoolean();
//		System.out.println(b1);
		//输入一个字符串类型的数据
//		System.out.println("请输入一个字符串:");
//		String str = scanner.next();
//		System.out.println(str);
		
		//获取字符，依靠 字符串来获取
		System.out.println("请输入一个字符串:");
		char ch1 = scanner.next().charAt(3);
		System.out.println(ch1);
		
	}
}

```

作业:

```
1.语法格式和执行流程！！！

```

