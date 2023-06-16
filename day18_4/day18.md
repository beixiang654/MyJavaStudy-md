```
回顾昨天内容
1.TreeSet
	底层是二叉树
	会对咱们的存储的数据进行排序   从小到大排列
	
	存Integer，  String   
	存Perosn对象
	会报错的。Person类不具备排序的功能
	实现Comparable接口，重写comparaTo
2.匿名内部类
	interface A {
		void test();
	}
	main {
		new A () {
			public void test () {
				sout("嘻嘻");
			}
		}.test();
	}
4.HashMap
	方法
	
```

### 今天的内容

> 1.File类【重点】
>
> 2.递归
>
> 3.IO流【重点】

### 1.File类

> File类sun公司封装好的一个类，专门处理磁盘的文件和文件夹的类
>
> 咱们在windows系统上面。可以通过右键新建一个文件或者文件夹。还可以删除文件或者文件夹
>
> 也可以通过Java代码删除文件和文件夹。依靠File类。
>
> 路径问题:
>
> ​		1.相对路径
>
> ​				得有参照物
>
> ​					我坐在张三的前面
>
> ​					./当前的工作目录    ./是可以省略
>
> ​					../上一级目录
>
> ​					../../上两级目录
>
> ​		2.绝对路径
>
> ​			从磁盘的根目录 直到找到咱们资源
>
> ​			C:\aaa\1.txt

想学一个类File类

```
1.打开官方的API
2.搜File
3.看这个类是干嘛的
4.看构造方法
5.看方法
```

> ```
> File(String pathname)
> ```
>
> 通过将给定的路径名字符串转换为抽象路径名来创建新的 `File`实例。

```Java
package com.qf.a_file;

import java.io.File;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        File file = new File("c:/aaa/1.txt");//分隔符  /
        File file1 = new File("c:\\aaa\\1.txt");//分割符\\
        System.out.println(file);
        System.out.println(file1);
        //在windows系统中 使用的是  \  和/都是可以的
        //在Linux系统 必须是/
        //static String	separator
        //与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
        System.out.println(File.separator);
        //如果是windows系统就是\    如果是linux 系统 变成/
        File file2 = new File("c:" + File.separator + "aaa" + File.separator + "1.txt");
        System.out.println(file2);
        //将/换成了File.separator
    }
}

```

#### 1.1File类的方法

> boolean createNewFile();创建一个新的文件
>
> ​		1.文件存在的时候，创建的时候返回值是false
>
> ​		2.当路径不存在呢？会有异常系统找不到指定的路径。
>
> ​		3.磁盘坏了不能进行读写的操作，也是不行！！！
>
> boolean mkdir();创建单级目录
>
> boolean mkdirs();创建多级目录

```Java
package com.qf.a_file;

import java.io.File;
import java.io.IOException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:/aaa/xixi.txt");
        System.out.println(file.createNewFile());
        File file1 = new File("c:/aaa/bbb");
        System.out.println(file1.mkdir());
        File file2 = new File("c:/aaa/fff/ddd/uuu");
        System.out.println(file2.mkdir());
        System.out.println(file2.mkdirs());

    }
}

```

> 删除文件和文件夹
>
> boolean delete();  删除文件夹或者文件

```Java
package com.qf.a_file;

import java.io.File;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) {
        File file = new File("c:/aaa/xixi.txt");
        //当删除一个不存在的文件的时候返回值是false
        System.out.println(file.delete());
        //删除文件夹的
        File file1 = new File("c:/aaa/bbb");
        File file2 = new File("c:/aaa/fff");
        System.out.println(file1.delete());//true
        //只能删除空的文件夹
        System.out.println(file2.delete());//false


    }
}

```

> File对象的判断方法【开发中经常用的】
>
> boolean isFile();判断是否是文件
>
> boolean isDireactory(); 是否是文件夹
>
> boolean isHidden（）；是否是隐藏文件【开发中不常用】
>
> boolean isAbsolute(); 是否是绝对路径
>
> boolean  exists(); 判断文件或者文件夹是否存在

```Java
package com.qf.a_file;

import java.io.File;
import java.io.IOException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:/aaa/1.txt");
        //当文件存在的时候，才能判断是否是文件
        System.out.println(file.isFile());
        File file1 = new File("c:/aaa");
        System.out.println(file1.isFile());//false  不是文件

        System.out.println(file1.isDirectory());//true
        System.out.println(file.isHidden());//false
        System.out.println(file.isAbsolute());
        System.out.println(file.exists());//true
        
        if (!file.exists()) {//不存在才创建
            file.createNewFile();
        }
    }
}

```

> 返回值是String类型的File类的方法
>
> String  getName(); 获取文件夹或者文件的名字
>
> String getPath();获取路径
>
> String getParent();获取当前对象的父级目录

```Java
package com.qf.a_file;

import java.io.File;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo5 {
    public static void main(String[] args) {
        File file = new File("c:/aaa/1.txt");
        System.out.println(file.getName());//1.txt

        File file2 = new File("c:/aaa");
        System.out.println(file2.getPath());//c:\aaa
        System.out.println(file2.getParent());//c:\
        

    }
}

```

> 返回值是long类型的数据
>
> long  length();获取文件占用的额字节数
>
> long  lastModified();  获取最后一次修改的时间

```Java
package com.qf.a_file;

import java.io.File;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo6 {
    public static void main(String[] args) {
        File file = new File("c:/aaa/1.txt");
        System.out.println(file.length());

        System.out.println(file.lastModified());//1686800418402
    }
}

```

> File[]   listFiles(); 获取当前文件夹下面所有的文件和文件夹的对象，返回值是File数组
>
> String[]  list();获取当前文件夹下面所有的文件和文件夹的字符串

```Java
package com.qf.a_file;

import java.io.File;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo6 {
    public static void main(String[] args) {
        File file = new File("c:/aaa/1.txt");
        System.out.println(file.length());

        System.out.println(file.lastModified());//1686800418402

        File file1 = new File("c:/");
        System.out.println(file1.listFiles());
        File[] files = file1.listFiles();
        for (File file2 : files) {
            System.out.println(file2);//是file对象
        }
        System.out.println("=====");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}

```

上午回顾

```
1.创建File对象
2.File类下面方法
```

### 2.递归

见递归文档

> 案例:
>
> ```
> //遍历磁盘中的所有目录及子目录中的所有文件
> ```

```
1.
	file = "c:/ccc"
	遍历:
		file1 = 2.gif   是文件
		打印了2.gif
		file1 = 2.txt 是文件
		打印2.txt
		file1 = c:/ccc/ddd  是文件夹
		
	findFile(File file) file = "c:/ccc/ddd"
	遍历:
			file1 = 1.png
			file1 = eee  文件夹
			
	findFile(File file) file = "c:/ccc/ddd/eee"

		file1 = sb.txt
```

```java 
package com.qf.b_digui;

import java.io.File;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) {
        //遍历磁盘中的所有目录及子目录中的所有文件
        findFile(new File("c:/ccc"));
    }
    public static void findFile (File file) {
        //当前目录下面所有的文件及文件夹
        File[] files = file.listFiles();
        for (File file1 : files) {
           if (file1.isFile()) {//是文件的话打印文件的名字
               System.out.println(file1.getName());
           } else {//如果是文件夹呢？
               //使用递归
               findFile(file1);
           }
        }
    }
}

```

> 案例:
>
> 删除一个目录下面的所有的文件及其子目录下面的文件
>
> 注意事项:  不要乱删！！！

```Java
package com.qf.b_digui;

import java.io.File;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo4 {
    public static void main(String[] args) {
        delFile(new File("c:/ccc"));
    }
    //删除一个目录下面的所有的文件及其子目录下面的文件
    public static void delFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                delFile(file1);
            } else {
                file1.delete();
            }
        }
    }
}

```

### 3.IO流【重点】

> 现在学会创建文件  删除文件。但是文件中内容能读取出来？只能借助于IO流操作，读取文件，图片，音频，视频等文件。
>
> 咱们电脑上面所有的文件（文本，图片,音频,视频）等都是可以进行读和写的！！！
>
> 以流的形式来读写的！！！

#### 3.1缓冲的概念

> Io流在进行文件读和写的时候，其实是一字节一字节进行读和写的。但是可以加
>
> 一个缓冲流，每次读取4KB 。

#### 3.2IO流

> I:   
>
> ​		input：   输入流  从磁盘的某一个文件中读取数据到内存（Java代码）
>
> O:  
>
> ​		output：  输出流   从内存（String str = "狗蛋"） 写入咱们磁盘中 某一个文档文本中
>
> 参照物:
>
> ​		是内存
>
> ​		磁盘->内存       输入
>
> ​		内存->磁盘      输出

##### 3.2.1输入流

> 1.字节输入流
>
> 2.字符输入流

**1.字节输入流**

> Java中给咱们封装好的一个, FileInputStream
>
> 案例:    从磁盘的C：/aaa/1.txt文件  将数据读取到Java代码中赋值给一个变量。
>
> ```
> FileInputStream(File file)
> ```
>
> 通过打开与实际文件的连接创建一个 `FileInputStream` ，该文件由文件系统中的 `File`对象 `file`命名。

入门案例

```Java
package com.qf.c_input;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //场景:  从磁盘的C：/aaa/1.txt文件  将数据读取到Java代码中赋值给一个变量。
        //1.创建File对象， 就是数据源
        File file = new File("c:/aaa/1.txt");
        //2.创建字节输入流对象，操作数据源对象
        FileInputStream fis = new FileInputStream(file);
        //3.FileInputStream  流对象本身不具备缓冲功能！！！
        //A BufferedInputStream为另一个输入流添加了功能，即缓冲输入
        BufferedInputStream bis = new BufferedInputStream(fis);
        //4.走到这一步，字节输入流就具备缓冲功能了
        //当创建BufferedInputStream时，将创建一个内部缓冲区数组。
        byte[] buf = new byte[3];//缓冲数组。现在是空的数组
        System.out.println("Line24:"+new String(buf));
        //每次需要从1.txt文件中读取3个字节 到 空的数组中
        //为啥是字节数组，因为字节流
        //5.开始从1.txt文件中 去读取数据放到数组中
        //从输入流读取一些字节数，并将它们存储到缓冲区b
        int read = bis.read(buf);
        //读取到缓冲区的总字节数，或者如果没有更多的数据，因为已经到达流的末尾，则是 -1 。
        System.out.println(read);//3
        //缓冲数组中数据 咋看？
        System.out.println("Line33："+new String(buf, 0, read));//abc
        int read1 = bis.read(buf);
        System.out.println(read1);//1
        System.out.println("Line35："+new String(buf, 0, read1));//dbc
        //第一次的时候:  [a, b, c]
        //第二次的时候: [d, b, c]

        //6.关闭流
        bis.close();
        fis.close();

    }
}

```

```Java
package com.qf.c_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        //你得告诉我你要读取的是磁盘上面那个文件   数据源
        File file = new File("c:/aaa/1.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] buf = new byte[3];//一次可以存3字节[0,0,0]
//        int read = bis.read(buf);
        //返回值读取到缓冲区的总字节数，或者如果没有更多的数据，因为已经到达流的末尾，则是 -1
        int length;
        while ((length = bis.read(buf)) != -1) {
            System.out.println(length);
            System.out.println("xixi");
            System.out.println(new String(buf,0 , length));
        }
        //关闭流
        bis.close();
        fis.close();


    }
}

```

作业:

```
作业一.一定将字节输入流每行代码理解吃透！！！拿着官方手册还有笔记注释一点一点的理解
如果今天能弄懂这个，那么明天讲课就要起飞


作业二:
练习一:相对路径和绝对路径的使用

描述:创建两个文件对象，分别使用相对路径和绝对路径创建。
答案
操作步骤:
绝对路径创建文件对象：使用File类一个参数的构造方法。
相对路径创建文件对象：使用File类两个参数的构造方法。

练习二:检查文件是否存在,文件的创建

描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
答案
操作步骤:
1.使用绝对路径创建对象关联到D盘的a.txt。
2.通过文件对象方法判断文件是否存在。
3.不存在则调用创建文件的方法创建文件。

练习三:文件夹的获取方法

描述:
获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
注意：不包含子文件夹下的文件
答案
操作步骤:
1.创建文件对象关联到指定文件夹，比如：c:/aaa
2.调用文件对象的listFiles方法获得文件数组
3.遍历文件数组将每一个文件的名字输出到控制台


练习四:   
	一个文件夹下（文件夹地址：C:\Users\bowang\eclipse-workspace）有多个java文件
练习五: 
	编写一个程序，在命令行中以树状结构展现特定的文件夹及其子文件（夹）
	例如:   C:/aaa/bbb/1.txt    C:/aaa/ccc/2.txt   C:/aaa/3.txt
	C:/
		aaa
			bbb
				1.txt
			ccc  
				2.txt
			3.txt


```

