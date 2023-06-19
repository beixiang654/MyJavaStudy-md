回顾

```
1.
	字节输入流:    FileInputStream
	字节输出流:    FileOutputStream
	字节缓冲输入流:   BufferedInputStream
	字节缓冲输出流:   BufferedOutputStream
	字符输入流:  FileReader
	字符输出流: FileWriter
	字符缓冲输入流:   BufferedReader
	字 符缓冲输出流:  BufferedWriter
	
2.写入一个字符串的数据到磁盘的c:/aaa/1.txt
BufferedOutputStream bos =  new BufferedOutputStream (newFileOutputStream("c:/aaa/1.txt"));
String str = "狗蛋很性;
byte[] buf = str.getBytes();
bos.write(buf);
bos.close();

3.序列化和反序列化
	ObjectInputStream
	ObjectOutputStream
```

### 今天的内容

> 1.常用类相关的东西

### 1.StringBuffer

> 也是和字符串相关的类
>
> 可变的字符序列。 字符串缓冲区就像一个[`String`](https://www.matools.com/file/manual/jdk_api_1.8_google/java/lang/String.html) ，但可以修改。 在任何时间点，它包含一些特定的字符序列，但可以通过某些方法调用来更改序列的长度和内容
>
> 如，如果`z`是指当前内容为`"start"`的字符串缓冲区对象，那么方法调用`z.append("le")`将使字符串缓冲区包含`"startle"` ，而`z.insert(4, "le")`会将字符串缓冲区更改为包含`"starlet"` 。

```Java
package com.qf.a_stringbuffer;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("a");
        System.out.println(sb);//start
        sb.append("le");
        System.out.println(sb);//startle
        sb.append("startlestartiuytreew");
        System.out.println(sb);


        sb.insert(1, "9");
        System.out.println(sb);//a9lestartlestartiuytreew
        //字符串反转
        System.out.println(sb.reverse());//weertyuitratseltratsel9a
        System.out.println(sb.delete(1, 3));
    }
}

```

String 和String Buffer和StringBuider区别

| String                                                       | StringBuffer                 | StringBuilder               |
| ------------------------------------------------------------ | ---------------------------- | --------------------------- |
| String 值不可变的，导致每次操作String都会有新的对象。不仅效率低而且 占内存。字符串在处理少量的字符串的时候用String | 可变的，线程安全的。         | 可变的，线程不安全的。      |
|                                                              | 如果是多线程的用StringBuffer | 如果是单线程用StringBuilder |

### 2.枚举类

```
Java中枚举类是一个特殊的类，代表是一组常量
在Java中常量:   public static final String WEEK = "星期一";
自从 JDK1.5之后枚举类开始出来
不可改变的量
```

> 定义枚举类的语法格式；
>
> ```
> public  enum  枚举类 {
> 	常量1, 常量2,...
> }
> ```
>
> 

```java 
package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
enum Color {
    //常量
    RED, GREEN, BLUE
}
public class Demo1 {
    public static void main(String[] args) {
       Color red =  Color.RED;
        System.out.println(red);
    }
}

```

枚举一般用在switch-case中

```Java
package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
enum Color1 {
    RED, GREEN, BLUE
}
public class Demo2 {
    public static void main(String[] args) {
        Color1 color1 = Color1.RED;
        switch (color1) {
            case RED:
                System.out.println("是红色");
                break;
            case GREEN:
                System.out.println("是绿色");
                break;
            case BLUE:
                System.out.println("是蓝色");
                break;
        }
    }
}

```

枚举类的三个方法

```
values();  获取的枚举类中所有的值
oridinal();常量的索引的值
valueOf();是字符串常量
```

```Java
package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
enum Color3 {
    RED, GREEN, YELLOW
}
public class Demo3 {
    public static void main(String[] args) {
        Color3[] values = Color3.values();
        for (Color3 value : values) {
            System.out.println(value + "所对应索引为:" + value.ordinal());
        }
        //valueOf();字符串对应的枚举常量
        Color3 red = Color3.valueOf("RED");
        System.out.println(red);
    }
}

```

> 比如以后会定义很多状态量，比如:订餐支付，未支付,订单完结，派送中。
>
> 

```Java
package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
enum ProductEnum {
    //利用有参构造方法对枚举属性进行赋值
    UP(0, "在架"), DOWN(1, "下架");

    private Integer code;
    private String message;
    //可以提供一个有参构造方法
    ProductEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
public class Demo5 {
    public static void main(String[] args) {
        System.out.println(ProductEnum.UP.getCode());
        System.out.println(ProductEnum.UP.getMessage());
        System.out.println(ProductEnum.DOWN.getCode());
        System.out.println(ProductEnum.DOWN.getMessage());
    }
}

```

```Java
package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
enum Sex {
    MALE(0, "未知"),FEMALE(1, "女");
    private Integer sexId;
    private String sexChar;
    Sex(Integer sexId, String sexChar) {
        this.sexId = sexId;
        this.sexChar = sexChar;
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public String getSexChar() {
        return sexChar;
    }

    public void setSexChar(String sexChar) {
        this.sexChar = sexChar;
    }
}
class Person {
    private String name;
    private int age;
    private Sex sex;

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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setSex(Sex.MALE);
        System.out.println(person.getSex().getSexId());
        System.out.println(person.getSex().getSexChar());
    }
}

```

### 3.包装类

> Java八大基本类型: java 提供了与之对应的包装类。
>
> 为啥?
>
> int a = 20;  基本数据类型是没有提供方法。int包装类是Integer  很多方法操作  int类型的数据
>
> int===>Integer
>
> byte===>Byte
>
> short===>Short
>
> long===>Long
>
> char===>Character
>
> float===>Float
>
> double=-==>Double
>
> boolean ===>Boolean
>
> 【重点】:
>
> ​		Java 中自动拆箱和自动装箱
>
> ​			自动装箱:   将基本数据类型转为包装类
>
> ​			自动拆箱:  将包装类转为基本数据类型
>
> 将字符串转为基本数据类型:
>
> ​		parse***();

```java 
package com.qf.c_baozhuang;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer i1 = new Integer(20);
        System.out.println(i1);//20
        int compare = Integer.compare(20, 30);
        System.out.println(compare);


        int i= 30;//基本数据类型
        Integer i2 = i;
        Integer i3 = 40;//自动装箱
        int i4 = i3;//自动拆箱
        int i5 = Integer.parseInt("12");//将字符转为int类型的数据
        System.out.println(i5);//12

        //面试题
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a == b);//true
        System.out.println(c == d);//false

    }
}

```

### 4.Math类

> `Math`类包含执行基本数字运算的方法，如基本指数，对数，平方根和三角函数。
>
> 绝对值:
>
> 最大值
>
> 最小值
>
> 向上取整
>
> 向下取整
>
> 四舍五入
>
> 随机数

```Java
package com.qf.d_math;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);

        double pow = Math.pow(2, 3);
        System.out.println(pow);

        //绝对值
        System.out.println(Math.abs(-986));//986
        //求两个数的最大值
        System.out.println(Math.max(89, Math.max(67, Math.max(2, 8))));
        //求两个数的最小值
        System.out.println(Math.min(67, 23));
        //向上取整   ceil  天花板
        System.out.println(Math.ceil(81.1));
        //向下取整   floor  地板
        System.out.println(Math.floor(89.9));//89
        //四舍五入
        System.out.println(Math.round(84.3));//返回值的是int类型的数据
        System.out.println(Math.round(84.8));//返回值的是int类型的数据

        //随机数  返回一个double值为正号，大于等于0.0 ，小于1.0
        System.out.println(Math.random());
        //随机生成一个[0, 100)整数
        System.out.println((int)(Math.random()*100));
    }
}

```

### 5.Random类

> 该类的实例用于生成伪随机数的流
>
> 

```Java
package com.qf.e_randon;

import java.util.Random;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());//-2^31 ~  2^31-1
        System.out.println(random.nextDouble());//0.4644986990282639
        System.out.println(random.nextGaussian());//2.4073605658546566
    }
}

```

### 6.System类

> `System`类包含几个有用的类字段和方法。 它不能被实例化。
>
> `System`类提供的`System`包括标准输入，标准输出和错误输出流; 

```Java
package com.qf.f_system;

import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        PrintStream out = System.out;//打印流对象
        out.println("狗蛋");
        System.out.println("狗蛋");
        System.err.println("嘻嘻");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数:");
//        int i = scanner.nextInt();

        //static long	currentTimeMillis()
        //返回当前时间（以毫秒为单位）。
//        long start = System.currentTimeMillis();//1687162040724
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("xixi");
//        }
        long end = System.currentTimeMillis();
        //System.out.println(end - start);//36ms
        //获取电脑 安装的一下属性
        Properties properties = System.getProperties();
        System.out.println(properties.get("os.name"));//window10
        System.out.println(properties.get("user.home"));//C:\Users\bowang
        System.out.println(properties.get("java.version"));//1.8.0_241
    }
}

```

### 7.Date

```Java
Date date = new Date();
        System.out.println(date);
        //Mon Jun 19 16:31:07 IRKT 2023
		//伊尔库茨克时间
        //以上的时间进行格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
    }
```



```
作业:
1.八大基本数据类型的包装类（自己百度）
2.Calendar
3.BigDecimal
4.LocalDate
```

