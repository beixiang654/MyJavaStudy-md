```
回顾
1.LinkedList
	双向链表
2.Object类
	1.toString方法
	2.equals方法
	3.hashCode方法
2.Set集合
	HashSet
		
	TreeSet
	
```

### 今天的内容

> 1.TreeSet
>
> 2.内部类
>
> 3.Map集合





### 1.TreeSet

> Set 接口下面的一个实现类
>
> 底层是二叉树
>
> 存储的数据的时候不可重复的。可以进行自然排序的！！！

```Java
package com.qf.a_treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(12);
        set.add(17);
        set.add(78);
        set.add(2);
        set.add(23);
        System.out.println(set);


        Set<String> set1 = new TreeSet<>();
        set1.add("d");
        set1.add("c");
        set1.add("a");
        set1.add("b");
        set1.add("d");
        //[a, b, c, d]
        System.out.println(set1);

    }
}

```

#### 1.1TreeSet 存 自定义的类对象

> 刚才讲的是Integer和String类型存到TreeSet 没有报错，但是进行排序。在比较。
>
> 这两个实现了一个接口叫Comparable接口，给类强加了整体的排序功能
>
> 所以想要将Person类对象存到TreeSet要进行排序，在比较。实现Comparable接口
>
> ```
> int	compareTo(T o)
> 将此对象与指定的对象进行比较以进行排序。
> ```
>
> 返回一个负整数，零或正整数，因为该对象小于，等于或大于指定对象。
>
> person1.compareTo(person2);  有返回值的
>
> 返回值是负数:  person1小于person2       person1排在person2的前面
>
> 返回值是0:  person1等于person2       person1，person2只保留一个
>
> 返回值是正数: person1大于person2    person2 在person1前面

```Java
package com.qf.a_treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //按照Person对象的属性 age 进行排序
        int num = this.age - o.age;
        return num;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        //java.lang.ClassCastException:
        // com.qf.a_treeset.Person cannot be cast to java.lang.Comparable
        //	at java.util.TreeMap.compare(TreeMap.java:1294)
        //Person类无法转换成Comparable
        //Person类不具备排序的功能！！！
        //该接口对实现它的每个类的对象强加一个整体排序。
        // 这个排序被称为类的自然排序
        //让Person类实现Comparable接口，强加一个整体排序

        set.add(new Person("骚磊", 34));
        set.add(new Person("老邢", 23));
        set.add(new Person("老万", 23));
        set.add(new Person("瑞哥", 32));
        System.out.println(set);

    }
}

```



```
执行流程:
	第一次:进入到了CompraTo方法
		this：  骚磊 34
		o: 骚磊 34
	第二次:进入到了CompraTo方法
		this：  老邢 23
		o: 骚磊 34
		
		num= -11  [老邢  骚磊]
	第三次:进入到了CompraTo方法
		this：  老万 23
		o: 骚磊 34
		
		num= -11  [ 老万 骚磊]
		
	第四次:进入到了CompraTo方法
		this：  老万 23
		o: 老邢 23
		
		num= 0  [ 老邢 骚磊]
	第五次:进入到了CompraTo方法
		this：  瑞哥 32
		o: 骚磊 34
		num=-2  [瑞哥  骚磊]
	第六次进入到了CompraTo方法
		this：  瑞哥 32
		o: 老邢 23
		num=9  [老邢 瑞哥  骚磊]
```

扩展

```
二叉树
1、TeeSet/TreeMap是自平衡二叉树（AVL），遵循左小右大原则存放

      存放是要依靠左小右大原则，存放时，要进行比较

2、遍历二叉树三种方式

（1）前序遍历:根左右

（2）中序遍历:左根右

（3）后序遍历:左右根

注：

前中后说的是“根” 的位置

根在前面是前序；根在中间是中序；根在后面是后序

3、 TreeSet集合/TreeMap集合采用的是：中序遍历方式（左根右）

Iterator迭代器采用的是中序遍历方式

存放的过程就是排序的过程，取出来就是自动按照大小顺序排列的

如下数据：

5        2        8        1        4        7        9        3

在二叉树中表示如下：



进行中序遍历方式（左跟右） 遍历取出，会得到

1        2        3        4        5（根）        7        8        9

如果想深入的研究二叉树数据结构可查阅数据结构相关书籍
```

> 案例：
>
> 使用TreeSet存Employee，两个属性。String name  int age
>
> 要求先按照年龄进行排序升序。如果年龄一样，则按照字符串的字典的自然顺序排。

```Java
package com.qf.a_treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        //先按照年龄排，年龄一样再按照名字字典顺序排
        int num = this.age - o.age;
        if (num == 0) {//年龄相等的
            //比较字符串
            //ublic int compareTo(String anotherString)
            //按字典顺序比较两个字符串。 比较是基于字符串中每个字符的Unicode值。
            int num1 = this.name.compareTo(o.name);
            return num1;
        }


        return num;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Demo3 {
    public static void main(String[] args) {
//        String str1 = "中";
//        String str2 = "国";
//        System.out.println(str1.compareTo(str2));//0
        Set<Employee> set = new TreeSet<>();
        set.add(new Employee("b", 23));
        set.add(new Employee("a", 13));
        set.add(new Employee("d", 23));
        set.add(new Employee("a", 23));
        set.add(new Employee("e", 12));
        System.out.println(set);
        //e   c   a  b  d
    }
}

```

总结:

```
Collection 集合
	ArrayList:    开发用的最多 底层是数组
		不用管那么多，直接对象调用方法即可
	LinkedList：   底层是链表
		不用管那么多，直接对象调用方法即可
	HashSet：   底层是依靠hash值进行存储
		重写equals和hahsCode方法
	TreeSet：    底层是二叉树
		实现Comparable这个接口，重写抽象方法 compareTo方法
```

发现咱们通过Comparable这个接口实现排序

还有一种排序接口Comparator叫比较器

> ```
> TreeSet(Comparator<? super E> comparator)
> ```
>
> 构造一个新的，空的树集，根据指定的比较器进行排序。

```Java
package com.qf.a_treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class MyComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        int num1 = o1.age - o2.age;
        return num1;
    }
}
public class Demo4 {
    public static void main(String[] args) {

        Set<People> set1 = new TreeSet<>(new MyComparator());
        set1.add(new People("狗蛋", 12));
        set1.add(new People("狗蛋1", 1));
        set1.add(new People("狗蛋2", 2));
        set1.add(new People("狗蛋3", 22));
        System.out.println(set1);
    }
}

```

回顾

```
1.TreeSet 存数据  不可重复的  进行自然排序的
	Integer
	String
2.TreeSet 存自定义的对象
	1.实现一个接口  Comparable这个接口
	2.重写int  compareTo（T o1）方法
	根据某一个属性排序进行存储
	
3.一个接口Comparetor  比较器
	1.用一个类去实现Comparetor 接口
	2.重写一个方法 int compare(T o1, T o2);

```

### 2.内部类

> 1.成员内部类【了解】
>
> 2.静态内部类【了解】
>
> 3.匿名内部类【要用】

#### 2.1成员内部类

```Java
package com.qf.b_inner;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Outer {
    //成员变量
     int age = 18;
     String name = "张三";
    //成员方法
    public  void test () {
        //在外部类中取访问内部类的属性
        Inner inner = new Inner();
        System.out.println("======"+inner.age);
        System.out.println("outer的方法test" );
    }
    //成员内部类
    class Inner {
        int age = 19;
         String name = "李四";
        public void test () {
            //在内部类中去调用外部类中的属性
            System.out.println("----------"+Outer.this.name);
            System.out.println("inner的方法test" );
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.name);
        System.out.println(outer.age);
        outer.test();
        //使用内部类
        //外部类.内部类   内部类的对象 = new 外部类().new 内部类();
        Outer.Inner inner = new Outer().new Inner();
        System.out.println(inner.name);
        System.out.println(inner.age);
        inner.test();

    }
}

```

#### 2.2静态内部类

> ```Java
> package com.qf.b_inner;
> 
> /**
>  * description:
>  * 公司:千锋教育
>  * author:博哥
>  * 公众号:Java架构栈
>  */
> class Outer1 {
>     static int age = 12;
>     String name = "狗蛋";
> 
>     //静态内部类
>     static class Inner1 {
>         //int age = 89;
>         public void test () {
>             //静态类对象不需要外部类的对象
>             System.out.println(age);
>         }
>     }
> }
> public class Demo2 {
>     public static void main(String[] args) {
>         Outer1.Inner1 inner1 = new Outer1.Inner1();
>         inner1.test();
>     }
> }
> ```

#### 2.3匿名内部类

> 现在用接口的话咋办？   用一个类去实现这个接口重写方法。实例化这个类即可
>
> 现在呢？ 咱们使用匿名内部类。

```Java
package com.qf.b_inner;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
interface A {
    void fun();
}
public class Demo3 {
    public static void main(String[] args) {
        A a = new A(){
            @Override
            public void fun() {
                System.out.println("嘻嘻 玩吧");
            }
        };
        a.fun();
        System.out.println("=========");
        //不用在用一个类去实现接口了，直接new接口，但是实现接口的抽象的方法
        new A() {
            @Override
            public void fun() {
                System.out.println("哈哈看鬼片吧");
            }
        }.fun();

    }
}

```

开发中的用法

当一个方法的参数（形参）是一个接口的时候，直接在这个方法中 new 接口即可

```Java
package com.qf.b_inner;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
interface B {
    void test();
}

public class Demo4 {
    public static void main(String[] args) {
        xixi(new B() {
            @Override
            public void test() {
                System.out.println("你是测试的");
            }
        });
    }
    public static void xixi(B b) {
        b.test();
    }
}

```

```Java
package com.qf.b_inner;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Demo5 {
    public static void main(String[] args) {

        Set<People> set1 = new TreeSet<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                int num1 = o1.age - o2.age;
                return num1;
            }
        });
        set1.add(new People("狗蛋", 12));
        set1.add(new People("狗蛋1", 1));
        set1.add(new People("狗蛋2", 2));
        set1.add(new People("狗蛋3", 22));
        System.out.println(set1);
    }
}

```

真实开发的时候，方法的参数是一个接口。平常写法是用一个类去实现它，但是现在直接在

调用方法的时候，直接new  接口。new的同时要重写抽象方法。再调用重写的方法即可

### 3.Map集合

> 开发经常用！！！
>
> Map也是用来存储数据。存储数据的形式和List Set是不同的！！！
>
> 双边队列
>
> **Interface Map<K,V>**
>
> K：  key  键
>
> V: value  值
>
> 意味着咱们map集合存数据的时候，是以键值对的形式存储的！！！
>
> 0001====张三
>
> 0002====狗蛋
>
> 0003====李四
>
> 将键映射到值的对象。 地图不能包含重复的键; 每个键可以映射到最多一个值
>
> HashMap 是Map接口实现类

```
增:
	V put(K k, V v); 添加一个键值对的数据到集合中
	void putAll(Map<? extends K,? extends V> m);  添加一个map集合到另外一个map集合中
	
删:
	V remove(Object key);  通过键删除值，返回值是被删除的值
	void clear(); 清空
	
改:
	V put(K k, V v);和添加类似，只有当键存在的时候，将v覆盖
		当键存在的时候，会修改，当键不存在的时候，直接添加了。
	V replace(K k, V v);当键存在的时候可以修改。当键不存在的时候，返回的null
查:【重点】
	int size(); 查看map集合中的元素的个数
	boolean isEmpty(); 判断集合是否为空  如果为空就是true  如果不为空就是false
	boolean containsKey();  集合中是否包含键
	boolean containsValue(); 集合中是否包含值
	
	以下几个方法比较重要!!!
	V get(K key);  通过键获取值
	Set keySet();  获取map集合中的键，将键存到set集合中。因为键不能重复，set集合刚好不能存重复的值的
	Collection<V>  values(); 获取集合中的值的！！！！存到Collection集合中
	Set<Map.Entry<K,V>>	entrySet();将键值对封装给Map.entry  存到了Set集合中了
		

```

```Java
package com.qf.c_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "狗蛋");
        map.put("02", "张三");
        map.put("03", "狗磊");
        System.out.println(map);
        //{01=狗蛋, 02=张三, 03=狗磊}
        //01=狗蛋  键值对
        Map<String, String> map1 = new HashMap<>();
        map1.put("04", "狗蛋");
        map1.put("05", "张三");
        map1.put("06", "狗磊");
        map1.put("09", "狗磊");
        map.putAll(map1);
        System.out.println(map);
        //{01=狗蛋, 02=张三, 03=狗磊, 04=狗蛋, 05=张三, 06=狗磊}
        System.out.println(map.remove("03"));//狗磊
        System.out.println(map);//{01=狗蛋, 02=张三, 04=狗蛋, 05=张三, 06=狗磊}


        System.out.println(map.replace("08", "张三"));
        System.out.println(map);
        System.out.println(map.size());//6
        System.out.println(map.isEmpty());//false

        System.out.println(map.containsKey("09"));//true
        System.out.println(map.containsKey("19"));//false
        System.out.println(map.containsValue("狗蛋"));//true


        System.out.println(map.get("01"));//狗蛋
        Set<String> strings = map.keySet();
        System.out.println(strings);
        for (String string : strings) {
            System.out.println(string);
        }
        Collection<String> values = map.values();
        System.out.println(values);//获取的是值

        //拿一个键值对出来，不要单独的键
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // Map.Entry<K,V> 就是Java封装好的键值对的对象
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("=====");
        }

    }
}

```

今天的作业:

```
1.hashMap分析    word
2.编程题
```

