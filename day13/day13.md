### 今天的内容

> 1.多态
>
> 2.异常
>
> 3.String类

### 1.多态

> 多种形态。
>
> 同一个事件,在不同的对象操作事件的时候，会有不同的结果！！！
>
> 需要三个条件:
>
> ​	1.继承
>
> ​	2.重写
>
> ​	3.父类的引用指向子类的对象

#### 1.1向上转型

> 父类的引用指向子类的对象
>
> Person person = new Man();

向上转型案例

```Java
package com.qf.a_duotai;

abstract class Animal {
	public abstract void eat ();
}
class Dog extends Animal{
	public void eat () {
		System.out.println("狗吃大骨头");
	}
}
class Cat extends Animal{
	public void eat () {
		System.out.println("猫吃鱼");
	}
}
class Person {
	public void feed (Animal animal) {//向上转型
		animal.eat();
	}
	
}
public class Demo1 {
	public static void main(String[] args) {
		Person person = new Person();
		/**
		 * public void feed (Animal animal) {
				animal.eat();
			}
			形参是:  Animal animal
			实参是:  new Dog()
			实参赋值给形参
			Animal animal = new Dog();   父类的引用指向子类的对象
			Animal animal = new Cat();  父类的引用指向子类的对象
			向上转型
		 */
		person.feed(new Dog());
		person.feed(new Cat());
	}
}

```

#### 1.2向下转型

> 先向上再向下转型

```Java
package com.qf.a_duotai;

abstract class Animal {
	public abstract void eat ();
}
class Dog extends Animal{
	public void eat () {
		System.out.println("狗吃大骨头");
	}
}
class Cat extends Animal{
	public void eat () {
		System.out.println("猫吃鱼");
	}
	//独有的方法
	public void sleep () {
		System.out.println("睡觉");
	}
}
class Person {
	public void feed (Animal animal) {//向上转型
		animal.eat();
		//父类的引用无法调用子类的独有 方法
		//现在我就想让你调用子类独有的方法！！！
		//只能拿当前对象调用自己独有的方法
		//Cat对象，可以将animal转为cat对象
		//语法格式:   子类  子类对象 = (子类)父类的引用
		 Cat cat = (Cat)animal;//向下转型
		 cat.sleep();
	}
	
}
public class Demo1 {
	public static void main(String[] args) {
		Person person = new Person();
		/**
		 * public void feed (Animal animal) {
				animal.eat();
			}
			形参是:  Animal animal
			实参是:  new Dog()
			实参赋值给形参
			Animal animal = new Dog();   父类的引用指向子类的对象
			Animal animal = new Cat();  父类的引用指向子类的对象
			向上转型
		 */
		//person.feed(new Dog());
		person.feed(new Cat());
	}
}

```

#### 1.3instanceof关键字

> instanceof是Java关键字
>
> 语法格式:
>
> ```
> boolean ret = 对象的引用   instanceof  类的类型
> 
> ```
>
> 主要能干嘛? 判断 这个对象的引用是不是类的类型或者子类

```Java
package com.qf.a_duotai;

class Moneky {
	
}
class People extends Moneky{
	
}
public class Demo2 {
	public static void main(String[] args) {
		People people = new People();
		//boolean ret = 对象的引用   instanceof  类的类型
		//判断 这个对象的引用是不是类的类型或者子类
		System.out.println(people instanceof People);//true
		System.out.println(people instanceof Moneky);//true
		Moneky moneky = new Moneky();
		System.out.println(moneky instanceof People);//false
		
		Moneky moneky2 = new People();
		System.out.println(moneky2 instanceof People);//true
		System.out.println(moneky2 instanceof Moneky);//true
		//总结：
		//  instanceof 的左边  是对象   平辈或者晚辈
		//intanceof的右边 是类   是平辈或者长辈
		
		
		
	}
}

```

```Java
package com.qf.a_duotai;

abstract class Animal {
	public abstract void eat ();
}
class Dog extends Animal{
	public void eat () {
		System.out.println("狗吃大骨头");
	}
}
class Cat extends Animal{
	public void eat () {
		System.out.println("猫吃鱼");
	}
	//独有的方法
	public void sleep () {
		System.out.println("睡觉");
	}
}
class Person {
	public void feed (Animal animal) {//向上转型
		animal.eat();
		//父类的引用无法调用子类的独有 方法
		//现在我就想让你调用子类独有的方法！！！
		//只能拿当前对象调用自己独有的方法
		//Cat对象，可以将animal转为cat对象
		//语法格式:   子类  子类对象 = (子类)父类的引用
		//person.feed(new Dog());
		//person.feed(new Cat());
		//Animal animal = new Dog();
		// animal instanceof Cat  false
		//Animal animal = new Cat();
		//animal instanceof Cat true
		
		if (animal instanceof Cat) {
			 Cat cat = (Cat)animal;//向下转型
			 cat.sleep();
		}
		
	}
	
}
public class Demo1 {
	public static void main(String[] args) {
		Person person = new Person();
		/**
		 * public void feed (Animal animal) {
				animal.eat();
			}
			形参是:  Animal animal
			实参是:  new Dog()
			实参赋值给形参
			Animal animal = new Dog();   父类的引用指向子类的对象
			Animal animal = new Cat();  父类的引用指向子类的对象
			向上转型
		 */
		person.feed(new Dog());
		person.feed(new Cat());
		
		//思路:  将子类（Dog）给父类的引用  ，然后再讲父类的引用强转为子类（Cat）
	}
}

```

### 2.异常

#### 2.1Java中异常

> 程序允运行，发生冷不可预期的事件。它阻止了程序的正常的执行。这就是Java中异常。
>
> Java提供了非常优秀的异常处理机制。都是封装好的。

让大家看看什么是异常。

```Java
package com.qf.b_exception;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		int[] arr = new int[2];
		arr[0] = 89;
		arr[1] = 98;
		arr[2] = 76;
		/**
		 * ArrayIndexOutOfBoundsException: 2
	at com.qf.b_exception.Demo1.main(Demo1.java:10)
		 */
		System.out.println(Arrays.toString(arr));
		
	}
}

```

#### 2.2Throwable类

> Java封装好的类，咋学啊？
>
> JDK  官方的API文档  就相当于字典一样
>
> 搜Throwable
>
> [Java 8 中文版 - 在线API中文手册 - 码工具 (matools.com)](https://www.matools.com/api/java8)
>
> `Throwable`类是Java语言中所有错误（Error）和异常（Exception）的父类。
>
> 通常使用两个子类的实例[`Error`](https://www.matools.com/file/manual/jdk_api_1.8_google/java/lang/Error.html)和[Exception](https://www.matools.com/file/manual/jdk_api_1.8_google/java/lang/Exception.html)来表示出现异常情况。 通常，这些实例是在特殊情况的上下文中新创建的，以便包括相关信息（如堆栈跟踪数据）
>
> 1.**构造方法**
>
> `Throwable()`构造一个新的可抛出的 `null`作为其详细信息。
>
> `Throwable(String message)`构造一个具有指定的详细消息的新的throwable。
>
> 2.**方法**
>
> | `String` | `getMessage()`返回此throwable的详细消息字符串。            |
> | -------- | ---------------------------------------------------------- |
> | `void`   | `printStackTrace()`将此throwable和其追溯打印到标准错误流。 |
> | `String` | `toString()`返回此可抛出的简短描述。                       |

```Java
package com.qf.c_throwable;



public class Demo1 {
	public static void main(String[] args) {
		//	Throwable()
		//构造一个新的可抛出的 null作为其详细信息。
		Throwable throwable = new Throwable();
		System.out.println(throwable);
		//返回此throwable的详细消息字符串。
		System.out.println(throwable.getMessage());//null
//		System.err.println("嘻嘻");
		/**
		 * java.lang.Throwable
			at com.qf.c_throwable.Demo1.main(Demo1.java:9)
		将此throwable和其追溯打印到标准错误流。
		 */
		throwable.printStackTrace();
		
		System.out.println(throwable.toString());
		
		//构造一个具有指定的详细消息的新的throwable。
		Throwable throwable2 = new Throwable("单身！！！");
		System.out.println(throwable2.getMessage());//单身！！！
		throwable2.printStackTrace();
		System.out.println(throwable2.toString());
	
	}
}

```

以上的类是Java中专门处理Error和Exception的异常的类

开发不用，学习它的子类[Error](https://www.matools.com/file/manual/jdk_api_1.8_google/java/lang/Error.html) ， [Exception](https://www.matools.com/file/manual/jdk_api_1.8_google/java/lang/Exception.html)

#### 2.3错误和异常

> Error:  是代表JVM本身错误，程序员是无法通过代码进行调试的。
>
> Exception： 异常 ，写Java代码的时候发生不可预期的效果。没有达到咱们想要的结果。
>
> 可以借助于Java封装好的异常的处理机制来解决。
>
> ​	异常分为两大类：
>
> ​			运行时异常:    数组下标越界，  代码写上没报错，一点击运行按钮，有异常。
>
> ​			编译时异常:  代码写上了，直接报红了。

#### 2.4异常【重点】

> Java代码的时候发生不可预期的效果。没有达到咱们想要的结果
>
> 咋办？  
>
> 针对于异常有两种解决方案:
>
> ​	1.捕捉
>
> ​	2.抛出