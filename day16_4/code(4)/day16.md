```
昨天的内容回顾
List接口下面的方法:
	add(Object o);  添加数据到集合容器中
	add(int index, Object o);在指定下标下面，添加数据到集合容器中
	addAll(Collection<? extends E> e);
	addAll(int index, Collection<? extends E> e);
	
	remove(Object o);
	remove(int index);
	clear();
	
	E set(int index, E e);
	
	size();
	isEmpty();
	contains();
	containsAll();
	toArray();
	get(int index);
	indexOf(Object o);
	lastIndexOf(Object o);
	subList(int fromIndex, int toIndex);
	startWith();
	endWith();
2.遍历集合中的数据
	1.for循环
	2.增强for循环
	3.迭代器
	
3.ArrayList底层
	面试角度:
		1.ArrayList  是集合容器，用来存数据的。是有序的集合并且他的数据可以重复的
		底层是数组Object[] elementData。一旦牵涉到数组，容量是固定的，但是ArrayList
		可以扩容的。默认容量是10.一旦操作10容量的话，每次扩容1.5倍。
		增删是比较效率比较低的o(n),因为增的时候有可能牵涉扩容。牵涉到数据整体前移和后移。
		查询 是比较快的 因为用索引下标 时间复杂度o(1)
		开发中用的最多！！！开发中查询的最多的！！！
```

### 今天的内容

> 1.LinkedList【开发不用】
>
> 2.Object类
>
> 3.Set集合

### 1.LinkedList

> LinkedList 是 List接口的实现类
>
> 只不过它有自己独有的方法
>
> 双链表实现了`List`和`Deque`接口。 实现所有可选列表操作，并允许所有元素（包括`null` ）。
>
> 所有的操作都能像双向列表一样预期。 索引到列表中的操作将从开始或结束遍历列表，以更接近指定的索引为准。

```java 
package com.qf.a_linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("狗蛋");
        list.addLast("李四");
        list.add("嘻嘻");
        list.addFirst("张三");
        System.out.println(list);
    }
}

```

面试题 :   ArrayList和LinkedList区别

### 2.Object类

>  `Object`是类结构的根。 每个class都有`Object`作为超类。 所有对象（包括数组）都实现了这个类的方法。

#### 2.1toString

> | `String` | `toString()`返回对象的字符串表示形式。 |
> | -------- | -------------------------------------- |
> |          |                                        |

> 返回对象的字符串表示形式。 一般来说， `toString`方法返回一个“textually代表”这个对象的字符串。 结果应该是一个简明扼要的表达，容易让人阅读。 建议所有子类覆盖此方法。
>
> 该`toString`类方法`Object`返回一个由其中的对象是一个实例，该符号字符`的类的名称的字符串`@` ”和对象的哈希码的无符号的十六进制表示。 换句话说，这个方法返回一个等于下列值的字符串：
>
> > ```
> >  getClass().getName() + '@' + Integer.toHexString(hashCode()) 
> > ```
>
> - **结果**
>
>   对象的字符串表示形式。

```java 
package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Object obj= new Object();
        System.out.println(obj);//java.lang.Object@1b6d3586
        //该符号字符`的类的名称的字符串@ ”和对象的哈希码的无符号的十六进制表示
        System.out.println(obj.toString());//java.lang.Object@1b6d3586


        Person person = new Person();
        //结果应该是一个简明扼要的表达，容易让人阅读。 建议所有子类覆盖(重写)此方法。
        person.name = "狗蛋";
        person.age = 12;
        //Person{name='null', age=0}
        //Person{name='狗蛋', age=12}
        System.out.println(person);//com.qf.b_object.Person@4554617c
       // System.out.println(person.toString());


        //总结：  如果在一个类不重写toString方法  打印是地址 看不懂
        //如果重写toString之后，打印重写的字符串 目的让人容易阅读
    }
}

```

#### 2.2equals方法

> ```Java
> public boolean equals(Object obj) {
>     return (this == obj);
> }
> ```
>
> Object类下面的equals方法是比较的内存地址，。使用的是==。
>
> 为啥String类中的equals比较内容的?  因为一句话重写！！！

```Java
package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));//false

        //String 继承了Object类啊
        //因为父类（Object）的需求满足不了子类（String）的所以子类重写euqals方法
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));//true
    }
}

```

案例：

```Java
package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Student {
    int id;//编号
    String name;
    int age;
    char sex;

    public Student(int id, String name, int age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    //student1.equals(student2)
    public boolean equals (Object obj) {
        //Object obj = student2;  向上转型
        //this===>student1
        //obj ====>student2
        if (this == obj) {//先比较的是内存地址
           return  true;
        }
        //接下来判断对象的内容
        //student2 instanceof Student
        if (obj instanceof Student) {
            Student stu = (Student) obj;//向下转型
            //stu  就是student2
            return stu.id == this.id && stu.name.equals(this.name) && this.age == stu.age && this.sex == stu.sex;
        }
        return false;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "狗蛋", 34, '男');
        Student student2 = new Student(1, "狗蛋", 34, '男');
        System.out.println(student1.equals(student2));//false
        //STudent此时继承Object  要使用父类下面equals方法
        //Obejct  下面的equals方法比较的是地址。所以false
        //但是真实的开始的时候，关注数据的内容，而不是内存地址
        //所以要求equals方法的结果是true。那咋办？
    }
}

```

总结:现在要关注的是对象的内容，而不是地址。

练习:

```
1.toString
	Person类
2.
声明一个Dog类
	name   age  kind
创建两个对象，要求调用equals方法，如果属性值一样，返回true
```

回顾上午的内容

```
1.linkeList
	从代码角度来说，开发不用！！！
	底层  是双向链表  数据结构
	val  0x123
	pre  0x124
	next  0x456
2.Object类
	一个方法就是一个功能
	toString();
	equals();
	
	
```

#### 2.3HashCode方法

> ```
> public int hashCode()
> ```
>
> 返回对象的哈希码值。  在Object类型中，hash值 是十六进制的内存地址转为十进制的值，就叫hash值
>
> 尽可能多的合理实用，由类`Object`定义的hashCode方法确实为不同对象返回不同的整数。 （这通常通过将对象的内部地址转换为整数来实现，但Java的编程语言不需要此实现技术。）

```Java
package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Man {

}
public class Demo4 {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.hashCode());//
        Object obj2 = new Object();
        System.out.println(obj2);
        System.out.println(obj2.hashCode());
        Man man = new Man();
        //十六进制的内存地址转为十进制的值
        System.out.println(man.hashCode());
        Man man1 = new Man();
        System.out.println(man1.hashCode());
    }
}

```

扩展： 字符串呢？

> 请注意，无论何时覆盖该方法（equals），通常需要覆盖`hashCode`方法，以便维护`hashCode`方法的通用合同，该方法规定相等的对象（equals）必须具有相等的哈希码。
>
> 通用合同:  (规定)
>
> - 如果根据`equals(Object)`方法两个对象相等，则在两个对象中的每个对象上调用`hashCode`方法必须产生相同的整数结果。

```Java
package com.qf.b_object;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Teacher {
    int id;
    String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof  Teacher) {
            Teacher teacher = (Teacher) obj;
            return teacher.id == this.id && teacher.name.equals(this.name);
        }
        return false;
    }
    public int hashCode() {
        return id + name.hashCode();
    }
}
public class Demo5 {
    public static void main(String[] args) {
        Teacher tea1 = new Teacher(1, "老邢");
        Teacher tea2 = new Teacher(1, "骚磊");
        System.out.println(tea1.equals(tea2));
        //1.现在关注的是内容，只要内容一样，那么equals返回值就是true
        //咋办？ 重写equals方法  内容只要一样就是true。
        //规定: 如果根据equals(Object)方法两个对象相等，
        // 则在两个对象中的每个对象上调用hashCode方法必须产生相同的整数结果。
        System.out.println(tea1.hashCode());
        System.out.println(tea2.hashCode());
        //到这一步，发现它不符合 规定 咋办? 重写hashCode方法


    }
}

```

总结:重写equals方法必须重写hashCode方法

### 3.Set集合

> Collection下面有两个子接口一个是List一个Set
>
> List:  有序的可以重复的
>
> Set:  无序的不可重复的
>
> ​		Set接口下面有两个实现类:
>
> ​				HashSet：  底层是依靠hash值进行存储的！！！如果hash值一样的就无法存到集合中
>
> ​				TreeSet:  底层是二叉树，存入数据是按照自然顺序来排 的

#### 3.1HashSet

> 看一下方法
>
> 

```Java
package com.qf.c_hashSet;

import java.util.HashSet;
import java.util.Set;
/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(34);
        set.add(28);
        set.add(18);
        set.add(88);
        set.add(34);
        System.out.println(set);//[34, 18, 88, 28]
        Set<String> set1 = new HashSet<>();
        set1.add("b");
        set1.add("d");
        set1.add("a");
        set1.add("c");
        set1.add("ab");
        System.out.println(set1);
        for (String s : set1) {
            System.out.println(s);
        }
    }
}

```

#### 3.2HashSet存数据的时候是一个自定义的类

```Java
package com.qf.c_hashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Phone {
    String name;
    double price;//价格

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }



    @Override
    public int hashCode() {
        //将name 和 price 两个值 进行hash计算变成一个具体的int类型的hahs
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Set<Phone> set = new HashSet<>();
        Phone phone1 = new Phone("ab", 4567.2);
        System.out.println("phone1的hash值:" + phone1.hashCode());
        set.add(phone1);
        Phone phone2 = new Phone("ba", 4567.2);
        System.out.println("phone2的hash值:" + phone2.hashCode());
        set.add(phone2);
        Phone phone3 = new Phone("华为", 4567.2);
        System.out.println("phone3的hash值:" + phone3.hashCode());
        set.add(phone3);
        System.out.println(set);
        //为啥都能存进去？因为hashSet的底层是按照hash值进行存储的
        //如果hash值是一样的话，那么肯定存不进去。
        //Phone 继承Object   默认去调用Object的hashCode方法(十六进制转为十进制表示形式)
        //内存不一样 意味hash值不一样的

        //存进去是不合适的。因为关注的是内容。如果内容一样，不能存到Set集合中
        //那咋办？ 重写equals方法和hashCode




    }
}

```

```Java
package com.qf.c_hashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("嘻嘻");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        System.out.println("哈哈");
        return name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Set<Student> set1 = new HashSet<>();
        set1.add(new Student("a", 2));
        set1.add(new Student("b", 1));

        //你的hash值都不一样的额话，就没有必要调用equals方法了
        System.out.println(set1);
    }
}

```

