```
回顾
1.多态向上转型和向下转型
2.instanceof
3.异常
	捕捉
	抛出 throws
	
4.throw  抛的动作  造错

5.字符串
JDK1.8      栈区   堆区   堆区中字符串常量池
	1.String对象一旦被创建就固定不变了。对原来的字符串对象操作的时候，都不会影响到原来的对象。
	String str = "abc";  一定存在字符串常量池中
	String str2 = "abc";
	String str1 = new String("abd"); 先去常量池中找abc  有木有啊？ 有，就指向堆中的abc
					如果没有话，就在堆区中创建。
	
```

### 今天的内容

> 1.字符串的方法
>
> 2.权限修饰符
>
> 3.泛型【重点】

### 1.字符串的方法

> equals方法
>
> boolean equals （Object anObject）;

```java 
package com.qf.a_string;

public class Demo1 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abd");
		int a = 20;
		System.out.println(str1.equals(str2));//true
		/**
		 * str1.equals(str2)
		 *   public boolean equals(Object anObject) {
		 *   //this == anObject===>str1 ==   str2 false
        if (this == anObject) {
            return true;
        }
        // str2 instanceof String
        if (anObject instanceof String) {
        //向下转型
            String anotherString = (String)anObject;
            //str2="abc"==>{'a', 'b', 'c'}
            int n = value.length;//str1 字符串 数组 长度 3
            if (n == anotherString.value.length) {//两个字符串相对应的二数组的长度不一样，内容肯定不一样的
                //
                char v1[] = value;// str1  对应的 {'a', 'b', 'c'}
                char v2[] = anotherString.value;//str2 对应的 {'c', 'b', 'd'}
                int i = 0;
                n=3 3 ！=0 true
                		if (v1[0] != v2[0]) i++  i=1
                	2!=0 true
                		if v1[1] != v2[1] i++ i=2
                	1!=0 true
                		if (v1[2] != v2[2])
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }

		 */
	}
}

```

> int length();  获取字符串的长度
>
> char  charAt(int index);通过索引获取当前字符串中的一个字符
>
> int indexOf(char ch); 获取指定字符第一次在字符串中出现的下标（索引）
>
> int  lastIndexOf(char ch); 获取最后一次出现的下表呢

```Java
package com.qf.a_string;

public class Demo2 {
	public static void main(String[] args) {
		String str1 = "abcdef";
		System.out.println(str1.length());//6个字符
		int[] arr = {1,2,3};
		System.out.println(arr.length);
		
		
		System.out.println(str1.charAt(1));//a
		
		
		String str2 = "ababab";
		System.out.println(str2.indexOf('a'));//0
		System.out.println(str2.indexOf("b"));//1
		/**
		 *  final char[] value = this.value;//ababab
            for (int i = fromIndex; i < max; i++) {
            //   value[0] == 'b'
             * value[1] == 'b'
                if (value[i] == ch) {
                    return i;
                }
            }
            return -1;
		 */
		System.out.println(str2.lastIndexOf("a"));
		
	}
}

```

> 返回值是布尔类型的数据的方法
>
> boolean  endWith(String str);   是否以指定的字符或者字符互结尾
>
> boolean  startWith(String str);   是否以指定的字符或者字符互开头
>
> boolean isEmpty();判断是否为空
>
> boolean  contains(String str); 判断是否包含
>
> boolean  equals(Object anObject);
>
> boolean equalsIgnoreCase();忽略大小写判断两个字符串相等

```Java
package com.qf.a_string;

public class Demo3 {
	public static void main(String[] args) {
		String str1 = "abcdef";
		System.out.println(str1.endsWith("ef"));//true
		System.out.println(str1.endsWith("df"));//false
		System.out.println(str1.startsWith("bc"));//false
		System.out.println(str1.startsWith("abcdef"));//true
		String str2 = "";
		System.out.println(str2.isEmpty());//true
		String str3 = " ";
		System.out.println(str3.isEmpty());//false
		String str4 = null;
		//以后记住   凡是 null  调用任何方法 的时候 都是空指针异常
		//System.out.println(str4.isEmpty());
		System.out.println(str1.contains("cf"));//false
		System.out.println(str1.contains("bcd"));//true
		
		System.out.println("abc".equalsIgnoreCase("aBC"));//true
		
		
	}
}

```

> 将字符串转为字符数组
>
> char[]    toCharArray();
>
> 将一个数组转为字符串
>
> 借助于构造方法
>
> ```
> String(byte[] bytes)
> ```
>
> 通过使用平台的默认字符集解码指定的字节数组来构造新的 `String` 。
>
> ```
> String(byte[] bytes, int offset, int length)
> ```
>
> 通过使用平台的默认字符集解码指定的字节子阵列来构造新的 `String` 。
>
> | `String(char[] value)`分配一个新的 `String` ，以便它表示当前包含在字符数组参数中的字符序列。 |
> | ------------------------------------------------------------ |
> | `String(char[] value, int offset, int count)`分配一个新的 `String` ，其中包含字符数组参数的子阵列中的字符。 |

> static   String  valueOf(Char[] ch);

```java 
package com.qf.a_string;

import java.io.UnsupportedEncodingException;

public class Demo4 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "abcd";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("======");
		String str1 = "abcdef";
		byte[] b2 = str1.getBytes("utf-8");//先将"1234"字符串转为 字节数组  编码 以utf-8 进行编码
		
		String string = new String(b2, "utf-8");//再讲b2字节数组变成字符串  对b2进行解码  以utf-8
		System.out.println(string);
		//String(byte[] bytes, int offset, int length)
		//int offset  偏移量   
		//int lengt  要几个数据
		String str2 = new String(b2, 0, 2);
		System.out.println(str2);
		
		
		char[] chs = {'a', 'c', 'k'};
		String str3 = new String(chs);
		System.out.println(str3);
		String str5 = new String(chs, 1, 2);
		System.out.println(str5);//ck
		
		String str4 = String.valueOf(chs);
		String str6 = String.valueOf(chs, 1, 2);
		System.out.println(str4);//ack
		System.out.println(str6);
		
	}
}

```

> 以下的几个方法
>
> String  replace(char oldChar, char newChar);  字符替换
>
> String  replaceAll(String regex, String original);  字符串替换
>
> String[] split();  以指定的字符切割 之后变成了字符串数组。
>
> String  subString(int  beginIndex); 截取一段字符串
>
> String  subString(int  beginIndex， int  endIndex); 截取一段字符串  要头不要尾
>
> String toUpperCase();  将小写转为大写
>
> String toLowerCase(); 将大写转小写
>
> ```Java
> package com.qf.a_string;
> 
> import java.util.Arrays;
> 
> public class Demo5 {
> 	public static void main(String[] args) {
> 		System.out.println("abcdefbbrb".replace('b', '狗'));
> 		System.out.println("abcdefg".replaceAll("abcde", "狗子"));
> 		
> 		String str1 = "嘻嘻,呵呵,哈哈么么";
> 		String[] strs = str1.split(",");
> 		System.out.println(Arrays.toString(strs));//[嘻嘻, 呵呵, 哈哈么么]
> 		for (int i = 0; i < strs.length; i++) {
> 			System.out.println(strs[i]);
> 		}
> 		
> 		
> 		System.out.println("=========");
> 		System.out.println("abcdef".substring(3));//def  包含3
> 		System.out.println("abcdefghik".substring(3, 5));//de  包含3  但不包含5
> 		//要头不要尾
> 		
> 		System.out.println("abCSD".toUpperCase());//ABCSD
> 		System.out.println("DHJdj".toLowerCase());//dhjdj
> 	}
> }
> 
> ```

### 2.权限修饰符

> 其实咱们已经用过权限修饰符。
>
> public  private   不写(默认)    protected
>
> 权限修饰符:  
>
> ​		权限  ，使用权限修饰符去修饰，类，方法，属性 等  赋予不同访问权限。

#### 2.1private 

> private  私有的
>
> 可以修饰成员变量   ，成员方法， 构造方法
>
> 1.使用private修饰的东西，只能在本来中使用，出了这个类就无法使用了
>
> 2.在同一个包下面的其他类不能使用
>
> 3.其他包下面子孙类也不能使用
>
> 4.在不同包其他类不能用
>
> 总结:  private修饰的东西，只能在当前类中使用。

#### 2.2默认的

> 修饰类，  属性，方法  等
>
> 啥也不写就可以了
>
> 1.啥也不修饰的时候，就是默认，在同一个类中可以使用
>
> 2.在同一个包下面的其他类其他可以使用
>
> 3.在其他包下面的子孙类是不可以使用的
>
> 4.在其他包下面的其他累是不可以使用的

#### 2.3protected

> 受保护的，修饰 属性，方法 等
>
> 1.在同一个类中可以使用
>
> 2.在同一个包下面的其他类其他可以使用
>
> 3.在其他包下面的子孙类是可以使用的
>
> 4.在其他包下面的其他类是不可以使用的

#### 2.4public

> 公开的
>
> 哪个地方都可以的
>
> | 权限修饰符 | 当期类 | 同一个包下面其他类 | 其他包下面子孙类 | 其他包其他类 |
> | ---------- | ------ | ------------------ | ---------------- | ------------ |
> | public     | 可以   | 可以               | 可以             | 可以         |
> | protected  | 可以   | 可以               | 可以             | 不可以       |
> | 默认的     | 可以   | 可以               | 不可以           | 不可以       |
> | private    | 可以   | 不可以             | 不可以           | 不可以       |

### 3.泛型【重点】

#### 3.1为啥要使用泛型

> 泛型: 广泛的类型
>
> 开发中对数据类型一致性要求比较高
>
> 例如数组中存的数据 ，都是一个类型的
>
> ​		int[] arr = {1,2,3,4}
>
> ​		String[] strs = {"j", "函数"};
>
> ​		但是有一定缺陷，存数据的时候容量是固定
>
> ​		int[] arr = new int[4];

```java 
package com.qf.d_fanxing;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[1] = 12;
		//数组中的确保证了数据的一致。但是容量是固定的，不太好
		//Java 用集合来存数据
		//声明一个集合
		ArrayList list = new ArrayList();//是一个容器，可以存数据的
		list.add("狗蛋");//参数是Obejct 
		
		list.add(12);
		list.add(true);
		list.add('男');
		System.out.println(list);//[狗蛋, 12, true, 男]
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		//好不好？不好 因为没有
		String str = (String)list.get(0);
		System.out.println(str);
		//发现咱们在取数据的数据的时候还需要强转。麻烦
		//ArrayList加了泛型的操作
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("狗蛋");
		list1.add("嘻嘻");
		list1.add("tuy");
		String str1 = list1.get(0);
		System.out.println(str1);
		/**
		 * <E>  E 只能包装类
		 * int --->  Integer
		 * byte--->Byte
		 * short=>Short
		 * long=>Long
		 * char=>Character
		 * boolean=>Boolean
		 * float=>Float
		 * double =>Double
		 */
		ArrayList<Boolean> list2 = new ArrayList<Boolean>();
		list2.add(false);
		list2.add(true);
		
	}
}

```

#### 3.2自定义泛型在方法中的使用

> 成员方法语法格式:
>
> ```
> public 返回值类型 方法名字 (参数) {
> 
> }
> ```
>
> 带有泛型的方案的语法格式
>
> ```
> public <无意义的占位符>  返回值的类型 方法名字 (参数) {}
> ```
>
> 无意义的占位符：可以是26个英文单词大写， 还可以是?
>
> 开始中经常使用   T（Type）  E（Element）   K （key）  V（value）  ？
>
> 无参无返回值
>
> 有参无返回值
>
> 无参有返回值
>
> 有参有返回值

入门案例：

```Java
package com.qf.d_fanxing;

import com.qf.b_access.Person;

public class Demo2 {
	public static void main(String[] args) {
		test(23);//T  Intger
		test("狗蛋");//T  String
		test(false);//T  Boolean
		test('嘻');//T==>Character
		//泛型  代表各种类型的 广泛的类型
		test(new Person());//T Person
		String string = "saj";
	}
	
//	public static void test (int a) {
//		System.out.println(a);
//	}
//	public static void test (String a) {
//		System.out.println(a);
//	}
//	public static void test (boolean a) {
//		System.out.println(a);
//	}
	
	//以上方法的重载太多了
	//下面T是一个占位  随着传入的实参的类型改变而改变
	public static <T> void test (T t) {
		System.out.println(t);
	}
}

```

并不是所有的方法都适合使用泛型的

```Java
package com.qf.d_fanxing;

public class Demo3 {
	public static void main(String[] args) {
		
	}
	//无参方法是无法使用泛型！！！
	//无参无返回值和无参有返回方法都pass掉了
	public static <T> void  test () {
		//System.out.println();
		System.out.println(13);
	}
	
	//讲有参无返回值的和有参有返回值的方法
	public  static <T> void test (T t, String t1) {
		System.out.println(t + t1);
		System.out.println(t1);
	}
	public static <T> T test1(T t) {
		return t;
	}
	//总结:  有参才有必要使用泛型！！！！
}

```

#### 3.3自定义泛型类

> 语法格式:
>
> ```java 
> class 类名<无意义的占位符> {
>     属性
>     方法
> }
> ```

```Java
package com.qf.d_fanxing;

//类上面的泛型<T> 约束下面方法的参数的
class People<T> {
	public void eat () {
		System.out.println("吃饭");
	}
	//在类中如果类声明了泛型，方法中无需再使用<T> 再次声明
	public  void add (T t) {//这个方法的T 是受类后面T约束的
		System.out.println(t);
	}
	//静态方法受不受约束  不受类泛型的约束的！！
	//因为 咱们创建对象的时候才确定 T 类型，所以静态方法早于对象创建
	public static <T> void delete (T t) {
		System.out.println(t);
	}
}
public class Demo4 {
	public static void main(String[] args) {
		People<String> people = new People<String>();
		people.eat();
		people.add("狗蛋");
		People<Integer> people1 = new People<Integer>();
		people1.add(89);
		people1.add(78);
		
		
	}
}

```

#### 3.4自定义泛型抽象类

> 语法格式:
>
> ```
> abstract class 类<T> {
> 
> }
> ```
>
> 

```java 
package com.qf.d_fanxing;

abstract class B<T> {
	public abstract void test(T t);
}
//普通类继承抽象泛型类。那么普通类也得带泛型
class TestB<T> extends B<T> {

	@Override
	public void test(T t) {
		
	}


	
}
public class Demo5 {
	public static void main(String[] args) {
		
	}
}

```

#### 3.5自定义泛型的接口

```Java
package com.qf.d_fanxing;

interface A<T> {
	void test(T t);
}
class TestA<T> implements A<T> {

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
	}
}
public class Demo6 {
	public static void main(String[] args) {
		
	}
}

```

作业:

```
1.总结
2.编程题   
```

