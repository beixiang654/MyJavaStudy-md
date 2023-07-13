### 今天的内容

> 1.重载【overload】
>
> 2.super关键字
>
> 3.static 关键字

### 1.重载【overload】

> 在Java中，同一个类中有很多方法，方法的名字是可以一样的，但是参数列表不一样。那么这些方法就是方法的重载

```Java
package com.qf.b_overload;

public class Person {
	public void test () {
		System.out.println("嘻嘻 test");
	}
	public void test (int a) {
		System.out.println(a);
	}
	//方法重载和修饰符无关
	void test (String name) {
		System.out.println(name);
	} 
	//方法的重载和返回值无关的
	public int test (int a, int b) {
		return a + b;
	}
}

```

```
总结:
1.方法的重载必须写在同一个类中
2.方法的名字一定是一样的
3.方法的参数一定不一样
4.方法的返回值和修饰符可以一样也可以不一样
5.无参构造和有参构造也是方法的重载
```

面试题:

```
方法的重写和重载的区别
```

### 2.super关键字【鸡肋】

> 食之无味弃之可惜
>
> this：
>
> ​		代表是当前对象
>
> ​		在当前类中书写 一个类
>
> ​		1.可以调用属性和方法
>
> ​		2.可以调用构造方法
>
> super:
>
> ​		代表父类的对象
>
> ​		必须在子类中写，代表父类的对象
>
> ​		1.可以调用父类的属性和方法（用）
>
> ​		2.可以调用父类的构造方法

```Java
package com.qf.c_super;

class Father {
	String name;
	int age;
	public Father () {
		System.out.println("嘻嘻父类的无参构造方案");
	}
	public Father (String name, int age) {
		System.out.println("嘻嘻父类的有参构造方案");
	}
	public void eat () {
		System.out.println("嘻嘻要吃窝窝头了啊");
	}
}
class Son extends Father {
	
	public Son () {
		//调用父类的有参的构造方法  默认就是   不写也会调用父类的无参的构造方法
		super("哈哈", 12);
	}
	public void test () {
		//super调用属性和方法
		super.name = "狗蛋";
		super.age = 12;
		super.eat();
	}
	@Override
	public void eat() {
		System.out.println("哈哈要吃山珍海味了啊");
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Son son = new Son();
		son.test();
		son.eat();
	}
}

```

### 3.static 关键字

> 静态的意思
>
> static 修饰的东西和对象无关的

#### 3.1生活中静态的东西

> 公共厕所
>
> 饮水机
>
> 不属于某一个对象，但是对象可以用的
>
> 即使你不实例化对象，也能用

#### 3.2Java中静态的

> 1.修饰变量     静态变量
>
> 2.修饰方法  静态方法
>
> 3.修饰代码块  静态代码块

##### 3.2.11.使用static修饰变量 叫 静态变量

> 语法格式:
>
> ```
> 权限修饰符 static 数据类型 变量名字;
> ```
>
> 在main主函数中调用静态变量的时候
>
> ```
> 类.静态属性
> ```
>
> 

```Java
package com.qf.d_static;

class Person{
	String name;
	int age;
	static String country;//国家变量
}
public class Demo1 {
	public static void main(String[] args) {
		Person.country  = "PRC";
		System.out.println(Person.country);
		Person person = new Person();
		//The static field Person.country should be accessed in a static way
		System.out.println(person.country);
		person.country = "中华人民共和国";
		System.out.println(person.country);//中华人民共和国
		System.out.println(Person.country);//中华人民共和国
		
		Person person2 = new Person();
		System.out.println(person2.country);
		//注意：以后碰到静态的变量的时候，一定要用类名.静态属性即可
	}
}

```

![static](static.png)

