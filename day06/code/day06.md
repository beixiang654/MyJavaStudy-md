```
1.八大基本数据类型
byte  short  int  long   char  boolean float  double
2.声明变量的语法格式
数据类型  变量名字 = 值;
3.使用for循环打印等腰三角形
for (int i = 1; i <= 4; i++) {//行
	for(int j = 1; j <= 4-i; j++) {//打印的空格
		System.out.print(" ");
	}
	for (int j = 1; j <= 2*i-1; j++) {//打印*
		System.out.print("*");
	}
	System.out.println();
}
4.break和continue关键字的简单介绍 

break  在循环和switch中使用  终止 打断
continue  在循环中使用   终止本次的循环，然后进入到下一次的循环
4.四种方法的语法格式分别列出来
	无参无返回值的方法
	public static void  方法的名字() {}
	有参无返回值的方法
	public static void 方法的名字 (数据类型 变量1, 数据类型 变量2,...) {}
	无参有返回值的
	public  static 数据类型 方法的名字() {
		return  返回值;//返回值的数据类型和方法的声明处的数据类型保持一致的
	}
	有参有返回值的
	public  static 数据类型 方法的名字 (数据类I型  变量1, 数据类型 变量2,...) {
		return 返回值;
	}
```

回顾

```
1.方法的声明
2.break和continue
```

```
1.写一个方法，控制台输入一个字符，判断一个字符是否是英文字符（包含大写和小写）
2.写一个方法，控制台输入一个字符，判断一个字符是否是数字字符
3.写一个方法，控制台输入一个字符，将一个整数逆序打印【难】
	int a = 8796
结果	6
	 9
	 7
	 8
4.写一个方法，控制台输入一个年份  判断是否闰年
5.写一个方法 判断一个数是否是正数
```

写一个方法，控制台输入一个字符，判断一个字符是否是英文字符（包含大写和小写）

```Java
package com.qf.test;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		// 写一个方法，控制台输入一个字符，判断一个字符是否是英文字符（包含大写和小写）
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		
		char ch = scanner.next().charAt(0);
		isEnglish(ch);
	}

	// 写成有参？还是无参的？ 有参 参数数据类型是啥？
	public static void isEnglish(char ch1) {
		//从A-Z  或者  a-z  
		if ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z')) {
			System.out.println("是英文字符");
		} else {
			System.out.println("不是英文字符");
		}
	}
}

```

写一个方法，控制台输入一个字符，判断一个字符是否是数字字符

```Java
package com.qf.test;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		isNumber();
	}
	//写一个方法，控制台输入一个字符，判断一个字符是否是数字字符
	public static void isNumber () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char a = scanner.next().charAt(0);
		if (a >= '0' && a <= '9') {
			System.out.println("是数字字符");
		} else {
			System.out.println("不是数字字符");
		}
		
	}
}

```

写一个方法，控制台输入一个字符，将一个整数逆序打印【难】

```Java
package com.qf.test;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个整形的数:");
		int a = scanner.nextInt();
		test(a);
	}
	//写一个方法，控制台输入一个字符，将一个整数逆序打印
	//int a = 3456  打印  6       5       4     3 
	
	//3456 % 10 = 6    3456 /10 = 345
	//345 % 10 = 5     345 / 10 = 34
	//34 % 10 = 4     34 /10 = 3
	//3 % 10 = 3      3/10= 0
	
	
	public static void  test (int a) {
		//执行流程 自己写
		/**
		 * i=675  675!= 0 true  sout(5) i = i/10  
		 * i=67
		 */
		for (int i = a; i != 0; i/=10) {
			System.out.println(i % 10);
		}
	}
}

```

### 今天的内容

> 数组

### 1.数组【重点】

#### 1.1开发中为啥要使用数组

> 如果开发中出现了大量的同一个类型的数据，按照现在所学的知识点，声明变量的话。如果一个变量存一个数据的话，那么就会需要多个变量了，相当麻烦。
>
> 使用数组：  只需要一个变量，然后数组中存很多的数据
>
> 数组想成 一个容器。
>
> int[]  arr = {1,2,3,4,5,6};

#### 1.2数组在Java中如何定义的

> 变量定义:
>
> 数据类型  变量名字 = 值;
>
> 数组定义:
>
> 数据类型[]  数组名字 = 数组的值;
>
> 数组详细的语法格式:
>
> 第一种:
>
> ```
> 数据类型[]   数组的名字 = {值1, 值2, 值3,...};
> 或
> 数据类型   数组的名字 []= {值1, 值2, 值3,...};
> ```
>
> 第二种：
>
> ```
> 数据类型[]   数组的名字 = new  数据类型[容量];
> 或者
> 数据类型 数组的名字[] = new  数据类型[容量];
> ```
>
> 第一种和第二种区别：   第一种即声明了数组又对数组赋值了
>
> 第二种只是声明空的数组而已，暂时还没有赋值
>
> 第三种：【很少】
>
> 语法格式：
>
> ```
> 数据类型[] 数组的名字  = new 数据类型[]{值1, 值2, 值3,...};
> ```
>
> 其实是第一种的完全写法



```Java
package com.qf.test;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		//数组第一种声明方式 ：数据类型[]   数组的名字 = {值1, 值2, 值3,...};
		int[] arr = {23, 34, 12, 15};
		System.out.println(arr);//[I@15db9742  内存地址   但是数据看不到 那咋办？
		System.out.println(Arrays.toString(arr));//  将一个内存地址形式的数据变成 人类可以看懂的
		//[23, 34, 12, 15]
		
		String[] strs = {"狗蛋","文博", "广瑞"}; 
		System.out.println(strs);//@6d06d69c
		System.out.println(Arrays.toString(strs));//[狗蛋, 文博, 广瑞]
		
		boolean[] bools = {true, true, false, true};
		System.out.println(bools);//[Z@7852e922
		System.out.println(Arrays.toString(bools));//[true, true, false, true]
		
		float[] f2 = {12.3f, 45.6F};
		
		
		//声明一个char类型的数组
		char[]  chs = {'a', '中', '9'};
		System.out.println(chs);//a中9  这个比较特殊 打印不是地址  是数组中值组成的
		
	}
}

```

```Java
package com.qf.test;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		
		//第二种声明方式: 数据类型[]   数组的名字 = new  数据类型[容量];
		int[] arr = new int[3];//在声明一个数组 ，且容量为3  只能存放3个数据  空的数组
		//arr = {0,0,0};
		System.out.println(arr);//内存地址
		System.out.println(Arrays.toString(arr));//[0, 0, 0]
		//此时是空的数组  
		String[] strs = new String[4];
		System.out.println(strs);
		System.out.println(Arrays.toString(strs));//[null, null, null, null]
		//这种方式的声明 是好比弄好了桌子 空桌子  
		

		
		
		
	}
}

```

```Java
package com.qf.test;

public class Demo6 {
	public static void main(String[] args) {
		char[] chs = new char[] {'a', '啊', 'o'};
		System.out.println(chs);//a啊o
		
		
	}
}

```

#### 1.3第二种声明方式 是空的数组，如何赋值

```Java
package com.qf.test;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		//第二种数组的声明方式
		int[] arr = new int[3];//arr = {0,0,0};
		//对这个空的数组进行的的赋值
		arr[0] = 23;//将23d赋值给 下标为0 的arr这个数组  arr = [23, 0, 0]
		//System.out.println(Arrays.toString(arr));
		arr[1] = 45;
		//System.out.println(Arrays.toString(arr));//arr = [23, 45, 0]
		arr[2] = 678;
		System.out.println(Arrays.toString(arr));//arr = [23, 45, 678]
		//arr[3] = 250;  这个下标越界
		//ArrayIndexOutOfBoundsException   数组下标越界
		//System.out.println(Arrays.toString(arr));
		
		
		System.out.println("=========");//arr = [23, 45, 678]
		/**
		 * i=0  0<3  true   arr[0] = 89   arr = [89, 45, 678] i++
		 * i=1 1<3  true  arr[1] = 90 arr=[89, 90, 678] i++
		 * i=2 2<3  true  arr[2]= 91  arr =[89, 90, 91] i++
		 * i=3 3<3 false  循环结束以后  arr =[89, 90, 91]
		 */
		for (int i = 0; i < 3; i++) {
			arr[i] = 89 + i;
		}
		
		System.out.println(Arrays.toString(arr));//[89, 90, 91]
		
	}
}

```

回顾上午的内容

```
1.数组的声明
	1. 数据类型[]   数组的名字 = {值1, 值2,...};
		int[] arr = {1,2,3,4};
		sout(arr)  内存地址
		sout(Arrays.toString(arr))//可以看懂这个数据
	2.数据类型[]  数组的名字 = new 数据类型[容量];
		int[] arr = new int[5];  意味着空的数组只能放5个数据
	3.数据类型[]  数组的名字 = new 数据类型[]{值1, 值2, ...};
2.数组赋值
	通过数组的下标（索引）进行赋值
	int[] arr = new int[3];
	arr[0] = 90;
	arr[1] = 190;
	arr[2] = 89;
	arr[3] = 810;//这个地方会出问题的
	
	
```

#### 1.4对数组进行取值

> 通过下标来取值
>
> 

```Java
package com.qf.test;

public class Demo8 {
	public static void main(String[] args) {
		int[] arr = {32, 45, 89, 12, 999, 5667};
		//获取数组中的值
		System.out.println(arr[0]);//32
		System.out.println(arr[1]);//45
		System.out.println(arr[2]);//89
		System.out.println(arr[3]);//12
		System.out.println("==============");
		
		for (int i = 0; i < 4; i++) {
			//i的循环的值 刚好作为数组的下标
			System.out.println(arr[i]);
		}
		
		//数组.length    数组的长度
		System.out.println(arr.length);//  arr的长度    4
		
		System.out.println("---------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		String[] strs = {"张三", "狗蛋", "麻子", "嘻嘻"};
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
	}
}

```

#### 1.5二维数组【了解】

> [1,2,3,4]  一维数组  排成一条线
>
> 语法格式
>
> ```
> 数据类型[][]  数组名字 = new 数据类型[容量][荣量];
> ```
>
> [
>
> [1,2,3,4]
>
> [5,6,7,8]
>
> [8,9,1,2]
>
> ]

| 78   | 89   | 100  |
| ---- | ---- | ---- |
| 250  | 101  | 99   |

```
package com.qf.test;

import java.util.Arrays;

public class Demo9 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		arr[0][0] = 78;
		arr[0][1] = 89;
		arr[0][2] = 100;
		arr[1][0] = 250;
		arr[1][1] = 101;
		arr[1][2] = 99;
		
		//第一个[]  是行  第二个[] s是列
		//取数据  使用循环来取
		for (int i = 0; i < 2; i++) {//控制行
			for (int j = 0; j < 3; j++) {//控制列
				
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}
}

```

#### 1.6数组可以 作为方法的参数

> 方法的参数 可以是哪些数据类型？  八大基本数据类型 和String  
>
> 同理  数组也是可以作为方法的参数的

```Java
package com.qf.test;

public class Demo10 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		printArr(arr1);
	}
	//方法 的参数  int  a ,   String str   , int[] arr;
	public static void printArr (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//在main主函数中 声明一个数组变量  这个数组有值，  然后通过方法 printArr 将数组的值(arr1)传递
	//给形参(arr) ,然后在方法中 将arr通过for循环进行遍历
}

```

```Java
package com.qf.test;

import java.util.Arrays;

public class Demo11 {

	public static void main(String[] args) {
		int[] arr2 = new int[3];//arr2 = {0,0,0};
		setArr(arr2);//arr2 = {89, 90, 91}
		System.out.println(Arrays.toString(arr2));//{89, 90, 91}
	}
	//准备对数组进行赋值
	public static void setArr (int[] arr) {//arr必须是空的数组 {0,0,0}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 89 + i;
		}
		//arr = {89, 90, 91}
	}
}

```

```Java
package com.qf.test;

import java.util.Arrays;
import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		int[] arr2 = new int[3];//arr2 = {0,0,0};
		setArr(arr2);//arr2 = {89, 90, 91}
		System.out.println(Arrays.toString(arr2));//{89, 90, 91}
	}
	//准备对数组进行赋值
	public static void setArr (int[] arr) {//arr必须是空的数组 {0,0,0}
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * i=0  0< 3  打印 ：  请输入第1数   在控制台中输入了87   ===》  scanner.nextInt()=87  执行
		 * 				arr[0] = 87    arr = {87, 0,0}  i++
		 * i=1 1<3  打印:  请输入第2数   在控制台中输入 100  scanner.nextInt()=100
		 * 				arr[1] = 100  arr = {87,100, 0} i++
		 * i=2 2<3  打印:  请输入第3数  在控制台中输入  190  scanner.nextInt();=190
		 * 				arr[2] = 190 arr = {87, 100, 190}; i++
		 * i=3 3<3 false
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "数");
			arr[i] = scanner.nextInt();
			//arr[0] = 100   arr = {100,0,0}
			//arr[1] = 90    arr = {100, 90, 0}
			//arr[2] = 20    arr={100, 90, 20}
			
		}
		//arr = {89, 90, 91}
	}
}

```

#### 1.7数组可以作为方法的返回值

> 方法的返回值可以是八大基本数据类型 和String   ，数组也是作为返回值的

```Java
package com.qf.test;

import java.util.Arrays;

public class Demo14 {

	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6};
		int[] arr2 = reverse(arr);
		System.out.println(Arrays.toString(arr2));
	}
	////{1,2,3,4}  =>  {4,3,2,1}
	public static int[] reverse (int[] arr) {
		int[] arr1 = new int[arr.length];//创建了一个空的数组 长度 和 arr一样的
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			arr1[j] = arr[i];
		}
		return arr1;
	}
}

```

案例：需求： 定义一个方法，找出来一个int数组中最大的那个值的下标

｛1,2,3,1｝===》   2

```Java
package com.qf.test;

public class Demo16 {
	public static void main(String[] args) {
		
		/**
		 * 1.arr = {1,23,3,1}
		 * 2.执行getMaxIndexInArray 方法  去看下面的自己写的方法
		 * 3. maxIndex = 0 变量
		 * 4.碰到一个for循环
		 * 	分析for循环的执行的流程：
		 * 		i=1 1<4 true  if 语句 arr[0] < arr[1]  1<23 true  maxIndex = 1 i++
		 * 		i=2 2<4  true  if arr[1]<arr[2]  23 < 3 false maxIndex = 1 i++
		 * 		i=3 3<4 true  if arr[1] <arr[3] 23 <1 false  maxIndex = 1 i+=
		 * 		i=4 4<4 bfalse  
		 * 		return  maxIndex = 1; 
		 * 5.返回的是1    将1赋值给a了
		 * 6. 打印了a  得到结果是1
		 * 
		 */
		int[] arr = {1,23,3,1};
		int a = getMaxIndexInArray(arr);
		System.out.println(a);
	}
	//定义一个方法，找出来一个int数组中最大的那个值的下标  有参 有返回值
	public static int getMaxIndexInArray (int[] arr) {
		int maxIndex = 0;//接最大值的下标
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}

```

作业

```
1.需求：定义一个方法，找出int数组中，最大值的索引下标
[1,2,23,5,6,7,8]  打印出来2
2.需求：定义一个方法，找出int数组中，最小值的索引下标
3.需求：定义一个方法，在指定的int数组中找出指定的数据第一次出现的下标
		8这个数的下标
[1,2,8,4,5,78,7,8,9]

4. 在一个数组中，找出所有指定数据的下标位置 【难】
	找出所有的下标存倒数组中
5. 完成一个方法，替换掉数组中所有元素为0的元素，替换为指定元素  [1,2,3,0,0,0]
6. 完成一个方法，删除指定下标的元素，要求从删除位置开始，之后的元素整体前移。【难】
	[1,2,3,4,5]==>[1,3,4,5,0]
7. 完成一个方法，添加指定元素到指定下标位置，要求从指定下标位置之后的元素，整体向后移动。【难】
	[1,2,3,4,0]===>[1,250,2,3,4]
8. 找出数组中最大的元素，放到下标为0的位置
	
9. 在上一道题的基础上，不考虑下标为0的元素。
   找出数组中最大的元素，放到下标为1的位置
   
   
```

今天的内容

```
1.  把今天讲的数组消化掉  
2.  我会发一下的预习视频 咱们可以提前预习一下
3.  上面 9道题（选做）
```

