```Java
package com.qf.a_test;

class Person {
	String name;//名字属性
	int age;//年龄 属性
	
	//无参构造方法
	public Person () {
		
	}
	//有参构造方法
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	//方法
	public void work () {
		System.out.println("人活着就要工作！！！");
	}
	
	
}
//主类
public class Demo1 {
	public static void main(String[] args) {
		//通过 类创建对象 吧官方术语 实例化对象
		Person person = new Person();//无参构造方法创建
		person.name = "狗蛋";
		person.age = 20;
		person.work();
		
		
		System.out.println(person.name +":" + person.age);
		Person person1 = new Person("张三", 78);//有参构造方法创建的对象
		System.out.println(person1.name +":" + person1.age);
		
		
		
	}
}

```

### 今天的内容

> 1.局部变量和成员变量
>
> 2.封装【重点】

### 1.局部变量和成员变量

#### 1.1局部变量

> 其实就是一个变量使用的范围

```Java
package com.qf.a_test;


public class Demo2 {
	
	public static void main(String[] args) {
		
		int num1 = 90;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			num1++;
			//出了这个大括号 （循环体）就无法使用变量 i
		}
		//System.out.println(i);
	}
	
	public  static void test () {
		
		//int num;
		int num = 90;//声明的时候可以暂时不用赋值，但是使用的使用必须赋值
		//The local variable num may not have been initialized
		System.out.println(num);
	}
	public static void test1 () {
		//System.out.println(num);
	}
	/**
	 * 总结： 
	 * 		诀窍.看局部变量作用域的时候，看的这个变量所属的大括号
	 * 		
	 */
}

```

#### 1.2成员变量

> 定以在实体类中的大括号后面 咱们的属性
>
> 属性又叫成员变量

```Java
package com.qf.a_test;

class Dog {
	String name;//成员变量
	int age;//成员变量
	//成员变量在整个类中都可以用
	
	public void test () {
		int num = 20;//局部变量
		System.out.println(name);
		System.out.println(age);
	}
	
}
public class Demo3 {
	public static void main(String[] args) {
		
	}
}

```

#### 1.3成员变量和局部变量

| 区别       | 成员变量                       | 局部变量                   |
| ---------- | ------------------------------ | -------------------------- |
| 定义的位置 | 紧跟着类的大括号的后面（属性） | 定义在方法中               |
| 作用       | 描述当前对象的特征（属性）     | 在方法中保存变量的值的     |
| 初始化的值 | 是默认值                       | 在使用的额时候一定要初始化 |
| 内存       | 堆内存                         | 栈内存                     |
| 作用域     | 作用整个类                     | 只能在当前方法中使用       |

### 2.封装【重点】

> Java有三大特性:   封装 继承    和多态
>
> 封装也是Java面向对象编程的思想。
>
> ​		对属性的封装    对方法的封装    对类的封装 等
>
> 今天主要讲对属性的封装。
>
> 之前写属性的时候
>
> ​	
>
> ```
> String  name;
> int age
> ```
>
> 现在要对属性进行封装
>
> 步骤
>
> 1.在属性的前面加上private 修饰符
>
> 2.在类中提供set 和get方法
>
> ​			set方法是对属性赋值的方法
>
> ​			get方法是对属性取值的方法

```Java
package com.qf.b_test;

class Person {
	//加private之后，就变成私有的只能在当前类中，外部的类 不能直接访问
	//1.加private 修饰
   private String name;
   private int age;
   
   //set方法  一般  set+属性  属性首字母要大写  告知别人  对哪个属性在赋值！！！
   public void setName (String name) {
	   this.name = name;
   }
   //get方法 取值
   public String getName () {
	   return name;
   }
   
   public void setAge (int age) {
	   this.age = age;
   }
   public int getAge () {
	   return age;
   }
}
public class Demo1 {
	public static void main(String[] args) {
		Person person = new Person();
		//field Person.name is not visible  不可视化
//		person.name = "狗蛋";
//		person.age = 23;
//		System.out.println(person.name + ":" + person.age);
		person.setName("狗蛋");//赋值
		System.out.println(person.getName());
		person.setAge(45);
		System.out.println(person.getAge());
		
		
	}
}

```

知道我在干嘛？ 对属性进行赋值，然后再取值

加上private之后，没有办法直接 对象.属性 赋值和取值了

只能通过 set方法进行赋值   然后通过get方法进行取值。

```Java
package com.qf.b_test;

class Dog {
	private String kind;//品种
	private int age;//年龄
	
	//赋值
	public void setKind (String kind) {
		this.kind = kind;
	}
	//get方法获取值
	public String getKind () {
		return kind;
	}
	public void setAge (int age) {
		//封装的内部的细节
		if (age > 12 || age < 0) {
			this.age = 0;
		} else {
			this.age = age;//实际传的值
		}
		
	}
	public int getAge () {
		return age;
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
//		dog.kind = "哈斯其";
//		dog.age = 2;
		dog.setKind("哈士奇");//赋值
		System.out.println(dog.getKind());
		dog.setAge(3);
		System.out.println(dog.getAge());
		
		
		
	}
}

```

> 案例:
>
> ​	声明一个Cat类，属性  name  age  sex  weight   属性是private修饰的   对属性进行赋值和取值

```java 
package com.qf.b_test;

class Cat {
	private String name;
	private int age;
	private char sex;
	private double weight;
	
	
	
	public Cat() {
		
	}
	public Cat(String name, int age, char sex, double weight) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
public class Demo3 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setSex('公');
		System.out.println(cat.getSex());
		
		System.out.println("============");
		//有参构造方法也是对属性赋值的
		//set方法也是赋值
		Cat cat1 = new Cat("大狗子", 3, '母', 45.6);
		cat1.setName("小小狗");
		cat1.setSex('公');
		System.out.println(cat1.getName() + ":" + cat1.getSex()+ ":" + cat1.getAge());
		//总结:  有参构造方法 和set方法都是可以对属性赋值的
	
	}
}

```

> 练习:
>
> ​	声明一个牛类 :
>
> ​		name  age  sex  weight color  
>
> ​		private 修饰
>
> ​		在整这个类中要书写有参构造，通过有参构造进行赋值		在main主函数中取值