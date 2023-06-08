```
1.需求：定义一个方法，找出int数组中，最大值的索引下标
[1,2,23,5,6,7,8]  打印出来2
2.需求：定义一个方法，找出int数组中，最小值的索引下标
3.需求：定义一个方法，在指定的int数组中找出指定的数据第一个的下标
		8这个数的下标
[1,2,8,4,5,78,7,8,9]

4. 在一个数组中，找出所有指定数据的下标位置 【难】
[1,2,8,4,5,78,7,8,9， 8] 找8的下标
[2, 7, 9]
	找出所有的下标存倒数组中
5. 完成一个方法，替换掉数组中所有元素为0的元素，替换为指定元素  [1,2,3,0,0,0]
6. 完成一个方法，删除指定下标的元素，要求从删除位置开始，之后的元素整体前移。【难】
[1,2,3,4,5,6]
[1,3,4,5,6,0]
[1,3,4,5,6]
7. 完成一个方法，添加指定元素到指定下标位置，要求从指定下标位置之后的元素，整体向后移动。【难】
[1,2,3,4,5,0]
[1,2,9,3,4,5]
8. 找出数组中最大的元素，放到下标为0的位置交换一下
	[1,2,3,4,5]==》[5,2,3,4,1]
9. 在上一道题的基础上，不考虑下标为0的元素。
   找出数组中最大的元素，放到下标为1的位置交换
   [1,2,3,4,5]==》[5,2,3,4,1]==>[5,4,3,2,1]
```

### 1.需求：定义一个方法，找出int数组中，最大值的索引下标

```Java
package com.qf.a_test;

public class Demo1 {
	public static void main(String[] args) {
		//需求：找出int数组中，最大值的索引下标
		int[] arr = {2, 7, 34, 9, 12};
		int maxIndex = 0;//用来接收最大值的下标的变量
		/**
		 * i=1 1<5 true
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[0]< arr[1])
		 * 		if (2 < 7) true
		 * 		maxIndex = 1 i++
		 * i=2 2<5 true 
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[1]< arr[2])
		 * 		if (7 < 34) true
		 * 		maxIndex = 2 i++
		 * i=3 3<5true 
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[2]< arr[3])
		 * 		if (34 < 9) false
		 * 		maxIndex = 2 i++
		 * i=4 4<5 true
		 * 		if (arr[maxIndex] < arr[i])
		 * 		if (arr[2]< arr[4])
		 * 		if (34 < 12) false
		 * 		maxIndex = 2 i++
		 * i=5 5<5 false
		 * 
		 * sout(maxIndex)  sout(2)
		 */
		for (int i = 0; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {//只要找到的maxIndex下标的最大值和后面的值进行比较
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}
}

```

```Java
package com.qf.a_test;

public class Demo2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,67, 12,45};
		findMaxIndexInArray(arr);
	}
	public static void findMaxIndexInArray (int[] arr) {
		
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}
}

```

### 3.需求：定义一个方法，在指定的int数组中找出指定的数据第一个的下标

> [1,2,3,4,5,2]         找2的第一次出现的下标

```Java
package com.qf.a_test;

public class Demo3 {
	public static void main(String[] args) {
		//3.需求：在指定的int数组中找出指定的数据第一个的下标
		int[] arr = { 1, 2, 3, 2, 4 };
		int index = -1;//用来指定值记录下标的  打印-1De时候证明在数组中没有此数字
		/**
		 * 执行流程自己写！！！
		 */
		for (int i = 0; i < arr.length; i++) {
			if (89 == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}

```

```Java
package com.qf.a_test;

public class Demo4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4 };
		findFirst(arr, 2);
	}

	/**
	 * 
	 * @param arr   目标数组 要从这个数组中找指定的数据
	 * @param find  指定的数据
	 */
	public static void findFirst(int[] arr, int find) {
		// 3.需求：在指定的int数组中找出指定的数据第一个的下标
		
		int index = -1;// 用来指定值记录下标的 打印-1De时候证明在数组中没有此数字
		/**
		 * 执行流程自己写！！！
		 * i=0 0<5
		 * 		2== 1 false i++
		 * i=1 1<5 true 
		 * 		2==2true
		 * 		index = 2
		 * 		break;终止打断  循环结束
		 * sout（2）
		 * 		
		 */
		for (int i = 0; i < arr.length; i++) {
			if (find == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}

```

### 4.在一个数组中，找出所有指定数据的下标位置 【难】

[1,2,8,4,5,78,7,8,9 8] 找8的下标
[2, 7, 9]
找出所有的下标存到新的数组中

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		//4. 在一个数组中，找出所有指定数据的下标位置 【难】
		int[] arr = {1,2,3,2,4,2, 8, 2, 9,2};
		//找2的所有的下标在数组中[1,3,5]
		//新建一个数组，用来存找到的下标
		int[] indexes = new int[arr.length];//空的数组[0,0,0,0,0,0]
		int count = 0;//计数器
		//遍历来找
		/**
		 * i=0 0<6 true
		 * 		if (2==arr[0])
		 * 		if (2==1) false i++
		 * i=1 1<6 true
		 * 		if (2==arr[1])
		 * 		if (2==2) true
		 * 		indexes[count++] = 1
		 * 		indexes[0] = 1===> [1,0,0,0,0,0] i++ count = 1
		 * i=2 2<6 true
		 * 		if (2==arr[2]) 
		 * 		if (2==3) false i++
		 * i=3 3<6 true 
		 * 		if (2==arr[3])
		 * 		if (2==2) true
		 * 		indexes[count++] = 3;
		 * 		indexes[1] = 3===>[1,3,0,0,0,0] count = 2 i++
		 * i=4  4<6 true
		 * 		if (2 == arr[4])
		 * 		if (2 == 4) false i+=
		 * i=5 5<6 true
		 * 		if (2 == arr[5])
		 * 		if (2==2) true
		 * 		indexes[count++] = 5
		 * 		indexes[2] = 5;===>[1,3,5,0,0,0] count= 3 i++
		 * i=6 6<6false 循环结束
		 */
		for (int i = 0; i < arr.length; i++) {
			if (2 == arr[i]) {
				indexes[count++] = i;
			}
		}
//		System.out.println(count);//3
//		System.out.println(Arrays.toString(indexes));//[1, 3, 5, 0, 0, 0]
		
		//现在再搞一个新的数组 用来接只要找到的下标的  借助于count
		
		int[] newIndexes = new int[count];
		//将老的数组中的indexes[1, 3, 5, 0, 0, 0]这个数组值的赋值给新的数组[0,0,0]
		/**
		 * i=0 0<3 
		 * 	newIndexes[i] = indexes[i];
		 * 	newIndexes[0] = indexes[0];
		 * 	newIndexes[0] = 1;===>[1,0,0] i++
		 * i=1 1<3 
		 * 		newIndexes[1] = indexes[1];
		 * 		newIndexes[1] = 3;===>[1,3,0] i++
		 * i=2 2<3 
		 * 		newIndexes[2] = indexes[2];
		 * 		newIndexes[2] = 5;===>[1,3,5] i++
		 * i=3 3<3 false 循环结束
		 * 
		 * 
		 */
		for (int i = 0; i < newIndexes.length; i++) {
			newIndexes[i] = indexes[i];
		}
		System.out.println(Arrays.toString(newIndexes));
		
		
	}
}

```

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo6 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,4,2,5};
		findAll(arr, 3);
	}
	public static void findAll(int[] arr, int find) {
		
		int count = 0;//统计次数
		int[] indexes = new int[arr.length];//接收下标的数组
		
		for (int i = 0; i < arr.length; i++) {
			if(find == arr[i]) {
				indexes[count++] = i;
			}
		}
		int[] newIndexes = new int[count];
		for (int i = 0; i < newIndexes.length; i++) {
			newIndexes[i] = indexes[i];
		}
		System.out.println(Arrays.toString(newIndexes));
		
	}
}

```

### 5. 完成一个方法，替换掉数组中所有元素为0的元素，替换为指定元素  [1,2,3,0,0,0]

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		//5. 完成一个方法，替换掉数组中所有元素为0的元素，替换为指定元素  [1,2,3,0,0,0]
		int[] arr = {1,2,3,0,0,0,0};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 250;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

```

### 6.完成一个方法，删除指定下标的元素，要求从删除位置开始，之后的元素整体前移。【难】

[1,2,3,4,5,6]
[1,3,4,5,6,0]

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo8 {
	public static void main(String[] args) {
		//完成一个方法，删除指定下标的元素，要求从删除位置开始，之后的元素整体前移。【难】
		
		
		//删除下标为2的
		//循环第一次  {1,2,4,4,5}   
		//循环第二次  {1,2,4,5,5}
		//{1,2,4,5,0}
		
		//删除下标为1De
		//循环第一次 {1,3,3,4,5}
		//循环第二次 {1,3,4,4,5}
		//循环第三次{1,3,4,5,5}
		//赋值  {1,3,4,5,0}
		int[] arr = {1,2,3,4,5};
		/**
		 * i=2 2< 4 true
		 * 		arr[2] = arr[3]
		 * 		arr[2] = 4==>{1,2,4,4,5} i++
		 * i=3 3<4 true
		 * 		arr[3] = arr[4]==>{1,2,4,5,5} i++
		 * i=4 4<4 false
		 * 
		 * arr[arr.length - 1] = 0;
		 * arr[4] = 0===>{1,2,4,5,0}
		 */
		for (int i = 2; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		System.out.println(Arrays.toString(arr));
 		
	}
}

```

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo9 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		remove(arr, 6);
	}
	public static void remove (int[] arr, int index) {
		
		if (index > arr.length) {
			System.out.println("您输入的下标有误，请慎重！！！");
			System.exit(0);//代码退出
		}
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		System.out.println(Arrays.toString(arr));
				
	}
}

```

### 7. 完成一个方法，添加指定元素到指定下标位置，要求从指定下标位置之后的元素，整体向后移动。【难】

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo10 {
	public static void main(String[] args) {
		
		//7添加指定元素到指定下标位置，要求从指定下标位置之后的元素，整体向后移动。【难】
		int[] arr = {1, 2, 4, 6, 0};
		
		/**
		 * i=4  4>2 true
		 * 	arr[4] = arr[3]
		 * 	arr[4] = 6===>{1,2,4,6,6} i--
		 * i=3 3>2 true
		 * 	arr[3] = arr[2]====>{1,2,4,4,6} i--
		 * i=2 2>2 false
		 * arr[2]  = 250===>{1,2,250,4,6}
		 * 	
		 */
		for (int i = arr.length - 1; i > 2; i--) {
			arr[i] = arr[i - 1];
		}
		arr[2] = 250;
		System.out.println(Arrays.toString(arr));
	}
}

```

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo11 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 8,10, 0 };
		add(arr, 3, 500);
	}

	public static void add(int[] arr, int index, int number) {
		

		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = number;
		System.out.println(Arrays.toString(arr));
	}
}

```

### 8.找出数组中最小的元素，放到下标为0的位置    交换一下

[1,2,3,4,5]==》[5,2,3,4,1]

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo12 {
	public static void main(String[] args) {
		//找出数组中最小的元素，放到下标为0的位置    交换一下
		int[] arr = { 7, 9, 3, 11 };
		//{3, 9, 7,11}
		int minIndex = 0;
		/**
		 * 自己写注释
		 */
		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		//以上循环在求最小值的索引下标！！！
		System.out.println(minIndex);
		//{3,9,3,11}
		//咋交换  将下标为2De数据给下标为0 的位置，  下标为0的位置的数据给下标为2位置
		//中间变量
		int temp  = arr[minIndex];//将3 赋值给一个变量 temp
		arr[minIndex] = arr[0];//{7, 9, 7, 11}
		arr[0] = temp;//{3, 9, 7, 11}
		System.out.println(Arrays.toString(arr));//[3, 9, 7, 11]
		//找最小值的下标。然后通过下标进行交换
		
		
	}
}

```

### 9.在上一道题的基础上，不考虑下标为0的元素。找出数组中最小的元素，放到下标为1的位置交换


```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo13 {
	public static void main(String[] args) {
		// 找出数组中最小的元素，放到下标为0的位置 交换一下
		int[] arr = { 7, 9, 3, 11 };
		// {3, 9, 7,11}
		int minIndex = 0;
		/**
		 * 自己写注释
		 */
		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		// 以上循环在求最小值的索引下标！！！
		//System.out.println(minIndex);
		// {3,9,3,11}
		// 咋交换 将下标为2De数据给下标为0 的位置， 下标为0的位置的数据给下标为2位置
		// 中间变量
		int temp = arr[minIndex];// 将3 赋值给一个变量 temp
		arr[minIndex] = arr[0];// {7, 9, 7, 11}
		arr[0] = temp;// {3, 9, 7, 11}
		System.out.println(Arrays.toString(arr));// [3, 9, 7, 11]
		// 找最小值的下标。然后通过下标进行交换
		//然后接下来找 [9, 7, 11]的最小值的下标 然后和下标为1De地方进行交换
		int minIndex1 = 1;//下标为0De已经处理过了,所以从1开始
		for (int i = 2; i < arr.length; i++) {
			if (arr[minIndex1] > arr[i]) {
				minIndex1 = i;
			}
		}
		System.out.println(minIndex1);
		//开始交换
		int temp1 = arr[minIndex1];//7给temp1
		arr[minIndex1] = arr[1];//{3,9,9,11}
		arr[1] = temp1;//{3, 7, 9, 11}
		
		
		
	}
}

```

### 10.排序

> [3,5,1,4,2]====>[1,2,3,4,5]

#### 10.1选择排序

> 原理: 在数组中找到最小值的索引。然后和第一个交换。再找除了第一个数据的剩余数据里面的最小值
>
> 然后再和第二个进行交换。直到最后一个

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo14 {

	public static void main(String[] args) {
		//选择排序
		int[] arr = {3, 4, 2, 1};
		/**
		 * i=0 0< 3 
		 * 		进入到了内层for循环
		 * 		minIndex=0   j=1 1<4 true
		 * 		if (3 >4) false  minIndex=0 j++
		 * 			j=2 2<4 true 
		 * 		if (3> 2) true  minIndex=2 j++
		 * 			j=3 3<4 true
		 * 		if (2 >1) true minIndex=3 j++
		 * 		j=4  4<4 false
		 * 		//交换位置
		 * 		int temp = 3;
		 * 		arr[0] = arr[minIndex]=1==>[1,4,2,1]
		 * 		arr[3] = 3===>[1, 4, 2, 3]
		 * 		第一个数交换完成 i++
		 * i=1 1<3
		 * 		进入到内层for循环
		 * 		minIndex=1
		 * 		j=2 2<4 
		 * 		if(arr[1] > arr[2])  4>2 true
		 * 		minIndex=2 j++
		 * 		j=3 3<4 true
		 * 		if (arr[2] > arr[3]) 2>3false
		 * 		minIndex=2 j++
		 * 		j=4 4<4 false
		 * 		交换位置
		 * 		int temp=arr[1] = 4
		 * 		arr[1] = arr[2]===>{1, 2,2,3}
		 * 		arr[2] = 4;===>{1,2,4,3}
		 * 		第二次交换结束 i++
		 * i=2 2<3 true
		 * 		进入到内层的for循环
		 * 		minIndex=2
		 * 		j=3 3<4 
		 * 		if (arr[2] > arr[3]) true
		 * 		minIndex = 3
		 * 		j++
		 * 		j=4 4<4false
		 * 		//交换位置
			int temp = arr[2]=4
			arr[2] = arr[3];===>{1,2,3,3}
			arr[3] = temp = 4;===>{1,2,3,4}
			i++
			i=3 3<3 false 循环结束
		 * 
		 * 
		 */
		for (int i = 0; i < arr.length - 1; i++) {//交换的次数
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
				
			}
			//交换位置
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

```



#### 10.2冒泡排序

> 原理:  从小到大， 比较两个相邻的元素，如果第一个元素比第二个大，就交换位置。
>
> 每一对都要比较 。和下标没有关系。

```Java
package com.qf.a_test;

import java.util.Arrays;

public class Demo15 {
	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 3};
		/**
		 * i=0 0< 3 
		 * 		进入内层for循环
		 * 		j=0 0<3 
		 * 			if(arr[0] > arr[1]) false  不交换 j++
		 * 		j=1 1<3 
		 * 			if (arr[1] > arr[2]) true
		 * 				int temp = 5
		 * 				arr[1] = arr[2]====>{1,2,2,3}
		 * 				arr[2] = temp= 5===>{1,2,5,3} j++
		 * 		j=2 2<3 
		 * 			if (arr[2] > arr[3]) true
		 * 			int temp = arr[2]=5;
					arr[2] = arr[3];===>{1,2,3,3}
					arr[3] = temp=5;===>{1,2,3,5} j++
				j=3 3<3 false i++
			i=1 1<3
		 * 		
		 */
		for (int i = 0; i < arr.length - 1; i++) {//控制轮数
			for (int j = 0; j < arr.length - 1 - i; j++) {//每个数据的两两比较
				//两两比较
				if (arr[j] > arr[j + 1]) {
					//交换位置
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

```

