> ```
> 昨天的内容：
> 	1.线程池
> 	2.反射
> 		1.获取字节码文件所对应的Class对象   三种
> 			Class.forName("包名+ 类名");
> 			Person.class
> 			对象.getClass();
> 			Class对象包含类中的所有信息
> 		2.借助于CLass对象获取构造方法对象  Constructor
> 			personClass.getConstructor(null)
> 			personClass.getConstructor(String.class)
> 			借助于构造方法创建对象
> 			constructor.newInstance();
> 		3.借助于Class对象获取方法对象 Method
> 			personClass.getMethod("eat");
> 			personClass.getMethod("eat", String.class);
> 			Method eat = personClass.getMethod("eat", int.class);
> 			//方法被调用
> 			eat.invoke(person, 78);
> 			
> 			
> ```
>
> 今天的内容
>
> 1.反射
>
> 2.单例模式
>
> 3.lambada表达式

### 1.反射

#### 1.1获取Field对象【属性对象】

```Java
package com.qfedu.a_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo4 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //第一步获取Class对象为啥？因为属性在字节码文件中，字节码文件变成字节码文件对象即Class对象
        Class<Person> personClass = Person.class;
        //获取所有属性,公开的属性
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //
        System.out.println("========");
        //获取所有的属性对象
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("======");
        //获取某一个具体的属性对象
        //获取公开的属性的
        //getField(String name)  参数  是属性的名字
        Field sex = personClass.getField("sex");
        System.out.println(sex);
        //因为getFiled获取的是公开的属性
//        Field name = personClass.getField("name");
//        System.out.println(name);
        Field name = personClass.getDeclaredField("name");
        System.out.println(name);

        //属性对象获取出来以后，对属性进行赋值！！！
        //public void set(Object obj, Object value)
        //第一个参数：类对象，你得告诉我这个属性是谁下面的
        //第二个参数：  对属性赋的值
        Person person = personClass.getConstructor(null).newInstance();
        sex.set(person, '女');
        System.out.println(person);

        //
        name.set(person, "狗蛋");
        System.out.println(person);
        Field age = personClass.getDeclaredField("age");
        //private不能使用set进行赋值吗？并不是这样的？
        age.setAccessible(true);
        age.set(person, 23);
        System.out.println(person);
    }
}

```

### 2.单例模式

> Java提供了二十多种设计模式，全球通用的。为了更加规范化，重用化，等提供了便捷的方式
>
> 才有设计模式
>
> ​	Java开发中常用设计模式:单例模式  工厂模式  代理模式   策略模式 享元模式  适配器模式 等
>
> 单例模式：
>
> ​		要求在程序运行过程中，只出现以一个实例对象。目的减少内存的开销。
>
> 如果判断是否是同一个对象？看内存地址。如果内存地址一样，那绝对是同一个对象。
>
> 想一些问题:
>
> ​			创建对象  通过new关键字来创建。但是new一次  创建一个新的对象。再new  内存地址肯定不一样

```Java
package com.qf.b_singleinstance;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Person {
    private static Person person = null;
    private Person () {

    }
    public static  Person getInstance() {
        //判断person 对象是否为null

        if (person == null) {
             person = new Person();
        }


        return person;
    }


}
public class Demo1 {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        Person person2 = new Person();
//        System.out.println(person1 == person2);//false
        //一旦new了之后  肯定对象是不等，想要弄成一个单例的 单个实例的
        //只能new一次， 不能在类的外部new对象了
        //1.在实体类中 私有化构造方法.目的不让在类外部再new对象
        //想要对象在实体中new 一个
        //2.创建静态方法，判断对象是否为空，如果对象为空就实例化，如果对象不为空
        //就直接返回
        //
        Person person1 = Person.getInstance();
        Person person2 = Person.getInstance();
        Person person3 = Person.getInstance();
        Person person4 = Person.getInstance();
        Person person5 = Person.getInstance();
        System.out.println(person1 == person2);
    }
}

```

以上的单例的模式在多线程的时候会有问题

```Java
package com.qf.b_singleinstance;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Student {
    private static Student stu;
    private Student() {

    }
    public static  Student getInstance() {
        synchronized (Student.class) {
            if (stu == null) {
                stu = new Student();
            }
        }

        return stu;
    }
}
class MyThread1 implements Runnable {
    @Override
    public void run() {
        //创建Student对象
        Student student = Student.getInstance();
        System.out.println(student);//内存地址
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run() {
        //创建Student对象
        Student student = Student.getInstance();
        System.out.println(student);//内存地址
    }
}

public class Demo3 {
    public static void main(String[] args) {
        new Thread(new MyThread1()).start();
        new Thread(new MyThread2()).start();
    }
}

```

单例模式分为懒汉式单例模式，饿汉式单例模式

懒汉式写法：

```Java
package com.qfedu.b_single;

import jdk.internal.org.objectweb.asm.commons.JSRInlinerAdapter;

//懒汉式写法
public class SinglePerson {
    //1.成员变量
    private static SinglePerson singlePerson;
    private SinglePerson () {

    }
    public static synchronized SinglePerson getInstance() {
        if (singlePerson == null) {
            singlePerson = new SinglePerson();
        }
        return singlePerson;
    }
}

```

饿汉式写法

```Java
package com.qfedu.b_single;

//饿汉式的写法
public class SingleDog {
    //final修饰的不能再赋值
    private static final SingleDog singleDog = new SingleDog();
    private SingleDog() {
        
    }
    public static SingleDog getInstance() {
        return singleDog;
    }
}

```

区别:

懒汉式：  线程不安全的，但是咱们加了锁，也可以保证线程安全

饿汉式：  线程安全的

效率来讲：  饿汉的效率高    因为没有锁

内存消耗:   饿汉比较消耗内存。

从综合考虑开发使用懒汉式写法！！！

练习：  懒汉式和饿汉式  实例化多个对象看看是否对象是相同的 Cat





```
工厂模式
代理模式
	
```

```
回顾上午的内容
1.反射
	Field对象 和类中的属性有关   属性对象
	Field name = class.getField("属性的名字");
	name.set(Object obj, Object value);
2.单例模式
	只需要记住懒汉式的写法
	
```



### 3.Lambda表达式

> JDK1.8新特性
>
> Lambda表达式被成为闭包。又被称为函数式接口的编程。目的 就是为了简化咱们书写的代码。但是可读性特别差。

#### 3.1入门案例

```Java
package com.qfedu.c_lambda;

public class Demo3 {
    public static void main(String[] args) {
        //Thread构造方法中Runnable这个接口对象
        //当咱们遇到接口对象的时候可以将接口对象的匿名内类转为 lambda表达式
        //注意事项:要求这个接口只能有一个抽象方法
        new Thread(() -> System.out.println("嘻嘻")).start();
        new Thread(() -> System.out.println("哈哈")).start();
    }
}

```

和接口有关。把接口的实例化变得更得简单化。

#### 3.2lambda表达式的语法格式

> 接口式的函数编程，只和接口有关
>
> ```
> 接口 接口对象名字 = ()->表达式    这个接口下面的抽象方法是无参无返回值的方法
> 接口 接口对象名字 = (parameter)->表达式    这个接口下面的抽象方法是有参无返回值的方法
> 接口 接口对象名字 = ()->{表达式;}这个接口下面的抽象方法是无参有返回值的方法
> 接口 接口对象名字 = (parameter)->{表达式;}这个接口下面的抽象方法是有参有返回值的方法
> ```

##### 3.2.1接口下面的抽象方法是无参无返回值的方法

```Java
package com.qf.c_lambada;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
@FunctionalInterface//告知编译器 接口是功能性的接口！！！里面只能有一个抽象方法
interface A {
    //无参无返回值的抽象方法
    void test();

}
public class Demo2 {
    public static void main(String[] args) {
        //方法的参数是一个接口对象。咱们现在所学的知识点  匿名内部类
        A a = new A() {
            @Override
            public void test() {
                System.out.println("测试1");
            }
        };
        eat(a);
        System.out.println("=====");
        //再次改进
        eat(new A() {
            @Override
            public void test() {
                System.out.println("测试2");
            }
        });
        System.out.println("---------");
        //无参无返回值
        eat(()-> System.out.println("测试3"));
    }
    //总结: 真实的开发
    //方法的参数是一个功能性的接口，咱们在调用这个方法的时候，可以传入实参
    //实参就是一个lambda表达式而已
    public static void eat (A sb) {
        sb.test();
    }
}

```

##### 3.2.2接口下面的抽象方法是有参无返回值的方法

```java 
package com.qf.c_lambada;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
interface B {
    void test(int a, String b);
}
public class Demo3 {
    public static void main(String[] args) {
        eat(new B() {
            @Override
            public void test(int a, String b) {
                System.out.println(a + b);
            }
        }, 2, "goudan");

        System.out.println("----------");
        //lambda表达式
        //
        eat((a, b) -> System.out.println(a + b), 2, "goudan");
        eat((a, b)-> System.out.println(a+b), 89, "xixi");
    }
    public static void eat (B b, int a, String c) {
        b.test(a, c);
    }
}

```

##### 3.2.3接口下面的抽象方法是无参有返回值的方法

```java 
package com.qfedu.c_lambda;

interface B {
    int num();
}
public class Demo6 {
    public static void main(String[] args) {
        test(new B() {
            @Override
            public int num() {
                return 250;
            }
        });
        test(() ->250);//lambada表达式快捷结果
        test(() -> {return 250;});//王氏缩减法的结果
    }
    public static void test (B b) {
        int a = b.num();
        System.out.println(a);
    }
}

```

##### 3.2.4接口下面的抽象方法是有参有返回值的方法

```java 
package com.qfedu.c_lambda;

interface C {
    int sum (int a, int b);
}
public class Demo7 {
    public static void main(String[] args) {
        //匿名内部类的写法
        test(new C() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        }, 34, 2);
        //将后面
        test((a, b) -> a + b, 34, 2);
    }
    public static void test (C c, int a, int b) {
        int sum = c.sum(a, b);
        System.out.println(sum);
    }
}

```

### 3.Stream流

> 流: 是从支持数据操作的源生成元素序列。源可以是数组  集合  文件  函数。
>
> 流不是集合元素。不是数据结构并不是用来保存数据。主要是操作计算数据的
>
> 源数据-》Stream流来操作咱们数据
>
> 将集合变成一个流，通过流下面方法操作咱们的数据了
>
> Stream解决集合类库现有的弊端
>
> 现在有一个需求：
>
> ​	将list集合中姓张的名字元素过滤以后打印一下
>
> 

```Java
package com.qf.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("李四");
        list.add("张山");
        list.add("张大山");
        list.add("张小山");
        list.add("狗蛋");
        list.add("卤蛋");
        //List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                System.out.println(s);
            }
        }
       // System.out.println(list1);
        //其实还可以使用流（Stream）的操作
        list.stream().filter((s)->s.startsWith("张")).forEach(s-> System.out.println(s));


        System.out.println("====");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("张");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}

```

#### 3.1获取流的对象

> 为啥先讲获取流对象
>
> 根据集合获取流，将集合中的数据变成流的形式
>
> Collection接口下面的方法 stream();
>
> 1.根据List获取流对象
>
> ```Java
> package com.qfedu.a_stream;
> 
> import java.util.ArrayList;
> import java.util.List;
> import java.util.stream.Stream;
> 
> public class Demo2 {
> public static void main(String[] args) {
>  List<String> strings = new ArrayList<>();
>  strings.add("老邢");
>  strings.add("老邢xiao");
>  strings.add("xiao邢");
>  strings.add("xiao老邢");
>  //获取流对象
>   Stream<String> stream = strings.stream();
>   System.out.println(stream);
> }
> }
> 
> ```
>
> 2.set也可以获取stream对象
>
> ```Java
> package com.qfedu.a_stream;
> 
> import java.util.HashSet;
> import java.util.Set;
> import java.util.stream.Stream;
> 
> public class Demo3 {
> public static void main(String[] args) {
>   Set<String> set = new HashSet<>();
>   set.add("嘻嘻");
>   set.add("哈哈");
>   Stream<String> stream = set.stream();
>   System.out.println(stream);
> }
> }
> 
> ```
>
> 3.根据map集合获取流对象
>
> ```Java
> package com.qfedu.a_stream;
> 
> import java.util.Collection;
> import java.util.HashMap;
> import java.util.Map;
> import java.util.Set;
> import java.util.stream.Stream;
> 
> public class Demo4 {
> public static void main(String[] args) {
>   Map<String, String> map = new HashMap<>();
>   map.put("1", "狗蛋");
>   map.put("2", "腾飞");
>   //先获取键
>   Set<String> strings = map.keySet();
>   Stream<String> stream = strings.stream();
>   //获取值
>   Collection<String> values = map.values();
>   Stream<String> stream1 = values.stream();
>   //
>   Set<Map.Entry<String, String>> entries = map.entrySet();
> 
>   Stream<Map.Entry<String, String>> stream2 = entries.stream();
>   
> }
> }
> 
> ```

#### 3.2Stream流对象下面

> 流就是集合中的数据，方法对集合中进行操作的

| 方法的名称 | 方法的作用   | 方法种类   | 是否支持链式操作 |
| ---------- | ------------ | ---------- | ---------------- |
| count      | 统计个数     | 终结方法   | 否               |
| forEach    | 逐个处理数据 | 终结方法   | 否               |
| filter     | 过滤数据     | 函数的拼接 | 是               |
| limit      | 取前几个     | 函数的拼接 | 是               |
| skip       | 跳过前几个   | 函数的拼接 | 是               |
| map        | 映射         | 函数的拼接 | 是               |
| concat     | 拼接         | 函数的拼接 | 是               |

方法种类：

​		终结方法:对流操作的时候，链式操作的时候一定是写在最后的

​		函数拼接:方法还可以接着写方法

工厂的流水线:先造手机电池-》再造手机的主板-》造手机端额外壳-》一个成品

##### 3.2.1count和forEach

> count：统计流中的元素的个数
>
> forEach:遍历数据的

```Java
package com.qfedu.a_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("老邢");
        strings.add("老邢xiao");
        strings.add("xiao邢");
        strings.add("xiao老邢");
        //获取流中元素的个数的
        long count = strings.stream().count();
        System.out.println(count);//4
        ////用来接收流中8元素的  赋值s
        strings.stream().forEach(s -> System.out.println(s));

    }
}

```

##### 3.2.2filter方法

> | `Stream<T>` | `filter(Predicate<? super T> predicate)`返回由与此给定谓词匹配的此流的元素组成的流。  过滤 |
> | ----------- | ------------------------------------------------------------ |
> | Predicate   | 是一个判断接口，咱们可以写一写返回值是boolean类型            |

```Java
package com.qfedu.a_stream;

import java.util.ArrayList;
import java.util.List;

public class Demo6 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("老邢");
        strings.add("老邢xiao");
        strings.add("xiao邢");
        strings.add("xiao老邢");
        //filter 看数据流，如果返回的是一个true 就把它留到流中。如果是一个false就把从流中踢出去
        strings.stream().filter(s->s.endsWith("邢")).forEach(s-> System.out.println(s));

    }
}

```

##### 3.2.3limit

> 限制，取集合中前几个值

```Java
package com.qfedu.a_stream;

import java.util.ArrayList;
import java.util.List;

public class Demo7 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("老邢");
        strings.add("老邢xiao");
        strings.add("骚磊");
        strings.add("大骚磊");
        strings.add("xiao邢");
        strings.add("xiao老邢");
        strings.add("小骚磊");
        //找出前4个元素带有老的元素
        //strings.stream().limit(4).forEach(s-> System.out.println(s));
        strings.stream().limit(4).filter(s->s.contains("老")).forEach(s-> System.out.println(s));

    }
}

```

```
package com.qfedu.a_stream;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("老邢");
        strings.add("老邢xiao");
        strings.add("骚磊");
        strings.add("大骚磊");
        strings.add("xiao邢");
        strings.add("xiao老邢");
        strings.add("小骚磊");
        strings.stream().limit(5).filter(s->s.endsWith("磊")).forEach(s-> System.out.println(s));
    }
}

```



##### 3.2.4map方法

> 用来映射关系

```Java
package com.qfedu.a_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        //将集合中集合中字符串转为int类型的数据打印
//        for (String s : list) {
//            System.out.println(Integer.parseInt(s));
//        }
        list.stream().map(s -> Integer.parseInt(s)).forEach(s-> System.out.println(s));
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer s) {
                System.out.println(s);
            }
        });
    }
}

```

##### 3.2.5skip

> 跳过前几个，取m面的数据

```Java
package com.qfedu.a_stream;

import java.util.ArrayList;
import java.util.List;

public class Demo9 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("老邢");
        strings.add("老邢xiao");
        strings.add("骚磊");
        strings.add("大骚磊");
        strings.add("xiao邢");
        strings.add("xiao老邢");
        strings.add("小骚磊");
        strings.stream().skip(3).forEach(s-> System.out.println(s));
    }
}

```

##### 3.2.6concat

> 合并两个流

```Java
package com.qfedu.a_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo10 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("老邢");
        strings.add("老邢xiao");
        strings.add("骚磊");
        List<String> strings1 = new ArrayList<>();
        strings1.add("大骚磊");
        strings1.add("xiao邢");
        strings1.add("xiao老邢");
        strings1.add("小骚磊");
        //先变成流，然后再合并
        Stream<String> stream = strings.stream();
        Stream<String> stream1 = strings1.stream();
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(s-> System.out.println(s));
    }
}

```

#### 3.3收集流

> 将流转为集合
>
> toList();将流转为list集合
>
> toSet();将流转为set集合

```Java
package com.qfedu.a_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo11 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("老邢");
        strings.add("老邢xiao");
        strings.add("骚磊");
        strings.add("骚磊");
        Stream<String> stream = strings.stream();
       List<String> collect = stream.collect(Collectors.toList());
        //Set<String> collect1 = stream.collect(Collectors.toSet());
        System.out.println(collect);
    }
}

```

https://blog.csdn.net/QiuHaoqian/article/details/120942134

