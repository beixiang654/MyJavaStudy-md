```
1.File类
	会将此磁盘上面的文件或者文件夹抽象成为一个对象，可以拿对象调用方法来对咱们的文件或者文件夹操作(创建,删除，各种判断，查询)
	File类很多的方法
		createNewFile
		mkdir
		mkdirs
		delete
		isFile
		isDirectory
		getName
		getPath
		getParent
		
2.递归算法【了解】

3.IO流
	字节输入流:   FileInputStream    需求: 磁盘上面的文件 读取文件的内容到Java代码（缓冲）中
	main {
		File file = new File("c:/aaa/1.txt");//1.txt  存的有数据
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte  buf = new byte[3];//空的[0,0,0]
		int length;
		while ((length = bis.read(buf)) != -1) {
			sout(new String(buf, 0, length))
		}
		bis.close();
		fis.close();
		
		
	}

```

### 1.IO流

> 输入流:
>
> ​		磁盘-》内存
>
> ​	字节输入流: FileInputStream
>
> ​	字符输入流:  FileReader
>
> 输出流:
>
> ​		内存-》磁盘
>
> ​	字节输出流:  FileOutputStream
>
> ​	字符输出流: FileWriter

#### 1.1字节输出流

```Java
package com.qf.a_fileoutputstream;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //需求:   将Java中的一个字符串的数据  写入到c:/aaa/2.txt
        //1.指定写入的磁盘上面的文件
        File file = new File("c:/aaa/2.txt");
        //2.创建FileOutputstream   字节输出流
        FileOutputStream fos = new  FileOutputStream(file);
        //3.对字节输出流加一个缓冲效果
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //4.准备一个字符串

        String str = "中国";//将这个字符串写入到磁盘上的2.txt
        //void	write(byte[] b, int off, int len)
        //从指定的字节数组写入 len个字节，从偏移 off开始到缓冲的输出流。
        //将字符串转为字节数组
        byte[] buf = str.getBytes();

        //bos.write(buf, 0, 2);
        bos.write(buf);

        //写完的时候一定要关流
        bos.close();
        fos.close();


    }
}

```

> 案例:  将一个字符串 我欲乘风归去 写入到c:/aaa/3.txt
>
> 

```java 
package com.qf.a_fileoutputstream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/aaa/3.txt"));
        byte[] bytes = "我欲乘风归去".getBytes();
        bos.write(bytes);
        bos.close();

    }
}

```

#### 1.2综合案例

> 需求:  c:/aaa/1.mp4   复制到 c:/bbb/2.mp4
>
> 思路分心:   先读去1.mp4  然后读的同时写入 2.mp

```java 
package com.qf.a_fileoutputstream;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:/aaa/22.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/bbb/xixi.png"));
        byte[] buf = new byte[4 * 1024];
        int length;
        while ((length = bis.read(buf)) != -1) {
            bos.write(buf, 0, length);
        }
        bos.close();
        bis.close();
    }
}

```

```java 
package com.qf.a_fileoutputstream;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:/aaa/22.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/bbb/xixi.mp4"));
        byte[] buf = new byte[4 * 1024];
        int length;
        while ((length = bis.read(buf)) != -1) {
            bos.write(buf, 0, length);
        }
        bos.close();
        bis.close();
    }
}

```

回顾

```
1.输出流
	FileOutputStream    内存-》磁盘
2.复制一个图片到另外一个文件夹下面。  输入-》输出
```

#### 1.3字符输入流【不太重要】

> 阅读字符文件的便利类。`FileReader`是用于读取字符流。 要读取原始字节流，请考虑使用`FileInputStream` 。图片  音频 视频 等都必须使用原始的字节流，无法使用字符流
>
> 总结:   文本 图片   音频 视频   用FileInputStream流
>
> ​	文本 可以用FileReader
>
> 需求:  从磁盘上面某一个1.txt文件，读取数据到内存  (使用的字节输入流)
>
> 

```java 
package com.qf.b_filereader;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 从磁盘上面某一个1.txt文件，读取数据到内存  (使用的字符输入流)
        File file = new File("c:/aaa/1.txt");
        FileReader fr = new FileReader(file);
        //本身是不具备缓冲效果的。可以使用BufferedReader
        BufferedReader br = new BufferedReader(fr);
        //int i = br.read();//返回值是一个字符的ascii码的值
        //声明了一个字符的缓冲数组
       char[] cbuf = new char[3];//缓冲数组是空的
//        int read = br.read(cbuf);
//        System.out.println(read);//读到数组中的值
//        System.out.println(cbuf);
//        System.out.println("=======");
//        int read1 = br.read(cbuf);
//        System.out.println(read1);//读到数组中的值
//        System.out.println(cbuf);
//        System.out.println("=======");
//        int read2 = br.read(cbuf);
//        System.out.println(read2);//读到数组中的值
//        System.out.println(cbuf);
//        System.out.println("=======");
//        int read3 = br.read(cbuf);
//        System.out.println(read3);//读到数组中的值
//        System.out.println(cbuf);
//        System.out.println("=======");
//        int read4 = br.read(cbuf);
//        System.out.println(read4);//读到数组中的值
//        System.out.println(cbuf);
        //针对于想法循环
        int length;
        while ((length = br.read(cbuf)) != -1) {
            System.out.println(new String(cbuf, 0, length));
        }
        br.close();
        fr.close();
    }
}

```

#### 1.4字符输出流【不太重要】

> 需求:  将Java代码中某一个字符串数据写入到磁盘的4.txt

```Java
package com.qf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //将一个字符串古道西风瘦马 夕阳西下  写入到c:/aaa/4.txt
        File file = new File("c:/aaa/4.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        String str = "古道西风瘦马 夕阳西下";
        //void write(String str);
        //bw.write(str);
        //bw.write(97);这个方法是不用的额！！！！
        //void write(String str, int off, int len);
        //bw.write(str, 3, 2);
        //void write(char[] cbuf, int off, int len);
        //bw.write(str.toCharArray(), 0,  11);
        bw.write("狗蛋");
        bw.newLine();//换行的意思
        bw.write("嘻嘻");
        bw.newLine();
        bw.write("哈哈");
        bw.close();
        fw.close();



    }
}

```

验证图片是否能够复制，使用字符流

思路: 先读取原图片，然后再写入图片

```Java
package com.qf.c_filewriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) throws Exception{
        //先读取图片，然后写入到另外一个文件夹下面
        //发现字符流无法处理 图片 音频 视频 等 只能使用字节流
        //但是文本文档可以处理的！！！
        BufferedReader br = new BufferedReader(new FileReader("c:/aaa/《雪中悍刀行》.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("c:/bbb/1.txt"));
        char[] cbuf = new char[1024];
        int length;
        while ((length = br.read(cbuf)) != -1) {
            bw.write(cbuf, 0, length);
        }
        bw.close();
        br.close();
    }
}

```

```Java
package com.qf.c_filewriter;

import java.awt.image.BufferedImage;
import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo4 {
    public static void main(String[] args) throws Exception {
        //test1();
        test2();
    }
    public static  void test1 () throws Exception{//字符流
        long start = System.currentTimeMillis();//给当前时间  毫秒
        BufferedReader br = new BufferedReader(new FileReader("c:/aaa/《雪中悍刀行》.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("c:/bbb/1.txt"));
        char[] cbuf = new char[1024];
        int length;
        while ((length = br.read(cbuf)) != -1) {
            bw.write(cbuf, 0, length);
        }
        bw.close();
        br.close();
        long end = System.currentTimeMillis();//给当前时间  毫秒
        System.out.println(end - start);//819 ms
    }
    public static  void test2 () throws Exception{//字节流
        long start = System.currentTimeMillis();//给当前时间  毫秒
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:/aaa/10递归.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/bbb/8.mp4"));
        byte[] buf = new byte[4 * 1024];
        int length;
        while ((length = bis.read(buf)) != -1) {
            bos.write(buf, 0, length);
        }
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();//给当前时间  毫秒
        System.out.println(end - start);
    }
}

```

#### 1.5Java中序列化和反序列化

> Java 提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列
>
> 可以将一个对象以一个字节序列的形式存到本地磁盘上面做持久化的操作！！！
>
> 类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含反序列化和序列化对象的方法。

##### 1.5.1序列化

> 将java对象带着数据存到磁盘中的某一个文件中

```Java
package com.qf.d_serliz;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Person implements Serializable{
    String name;
    int age;
    public void sleep() {
        System.out.println("嘻嘻 要睡觉喽");
    }
}
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.name = "狗蛋";
        person.age  = 22;

        //将person对象存到磁盘上面
        //内存--》  磁盘   输出！！！ ObjectOutputStream
        FileOutputStream fos = new FileOutputStream("c:/aaa/person.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.close();
        fos.close();
    }
}

```

##### 1.5.2反序列化

> 将序列化过之后的一个文件。然后取出来对象数据