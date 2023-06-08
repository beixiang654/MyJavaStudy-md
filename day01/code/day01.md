```
王博
	博哥  微信群里  请假 问问题 可以找我
	
	
	上课时间：
		上午: 
			8:50之前到    会有晨考  内容 是昨天的讲的重点知识
			9:00~10:20   第一节课  中间休息20分钟
			10:25~11:50   第二节课 建议大家走楼梯
		下午:
        	13:50之前进班  会有课前分享 ppt  第一轮不限内容  第二轮 抽面试的技术  第三轮 模拟面试
        	14:00~15:10  第三节课
        	15:30~17:00  第四节课
        	17:00~18:00  精练时间
        	19:00~21:00  自习时间
        	
    纪律:
    	整个楼层不能玩游戏，刷抖音，看小说。只要和学习无关
    	1.上课保证课堂效率
    	2.不能睡觉
    	3.旷课是绝对不允许的！！！
    	4.手机上缴，听课证
    	
    上课的物料:
    	笔记
    	代码
    	视频
    	
    阶段考试：
    
    坚持很重要！！！
```

### 今天的内容

> 1.了解Java这个门课程
>
> 2.掌握JDK的安装和配置
>
> 3.理解Java代码的执行原理
>
> 4.使用notpad++编写咱们第一个Java代码
>
> 5.学会在Java代码中写注释
>
> 6.windows的DOS命令

### 1.什么是Java

> Java是一门编程语言。
>
> ​		思考一个问题:
>
> ​					人和人沟通?
>
> ​							靠人类语言沟通
>
> ​					人和计算机沟通?
>
> ​							靠的是计算机的语言:  C  C++  C#   python  go  php  Java 

### 2.Java的诞生

> 在1991年时候，James Gosling在Sun公司的工程师小组想要设计这样一种主要用于像电视盒这样的消费类电子产品的小型计算机语言。这些电子产品有一个共同的特点：计算处理能力和内存都非常有限。所以要求：语言必须非常小且能够生成非常紧凑的代码，这样才能在这样的环境中执行。另外，由于不同的厂商选择不同的CPU，因此，要求该语言不能和特定的体系结构绑在一起，要求语言本身是中立的，也就是跨平台的。于是James Gosling等人开始开发名称为 Oak （橡树）的语言，希望用于控制嵌入在有线电视交换盒、PDA等的微处理器。但是在投标一个交互电视项目时，失败了。
>
> 受Mosaic和Netscape启发，他们用一种全新的语言编写了一款浏览器，在一次几位该成员组的会员在一家名为“爪蛙”咖啡的店里正在讨论给这个新的语言取什么名字时，有一个人灵机一动说：“就叫Java怎样”, 得到了其他人的赞赏。于是，小爪（Java）就此诞生了。
>
> 1996年，Java的JDK1.0诞生
>
> 现在Java的最新版本是JDK19，比较常用的版本还是JDK8

### 3.Java三大平台体系

> Java分为三个体系：
>
> - JavaSE（J2SE）（Java2 Platform Standard Edition，java平台标准版）
> - JavaEE(J2EE)(Java 2 Platform,Enterprise Edition，java平台企业版)
> - JavaME(J2ME)(Java 2 Platform Micro Edition，java平台微型版)。
>
> 2005 年 6 月，JavaOne 大会召开，SUN 公司公开 Java SE 6。此时，Java 的各种版本已经更名，以取消其中的数字 "2"：J2EE 更名为 Java EE，J2SE 更名为Java SE，J2ME 更名为 Java ME。

### 4.跨平台的

> 可以在不同的操作系统上面来运行Java代码。
>
> Java源代码 （就是你写的代码） -》编译-》字节码文件-》运行-》JVM（Java虚拟机）可以安装在不同的操作系统

### 5.Java需要开发环境

#### 5.1几个概念

> JVM : Java virtual machine   Java虚拟机
>
> jre  :  java  runtime envirement Java运行环境
>
> jdk ：  Java  development  kit    Java的开发工具
>
> jdk中包含了jvm和jre
>
> 所以只需要安装JDK即可

#### 5.2jdk的安装【重点】

![1](img\1.png)

![2](img\2.png)

![4](img\4.png)

软件安装好以后，就可以用了。写Java代码通过这个软件来运行咱们的额Java代码

#### 5.3jdk环境变量的配置【重点】

![5](img\5.png)

![6](img\6.png)

![7](img\7.png)

![8](img\8.png)

![9](img\9.png)

![10](img\10.png)

![11](11.png)

回顾上午的内容

```
1.jdk安装和环境变量配置
```

#### 5.4jre环境变量的配置【重点】

![12](img\12.png)

![13](img\13.png)

![14](img\14.png)

一定要记住点击确定

```
配置以后，验证一下配置是否成功:
	打开黑屏终端:  wind + r  输入cmd
	输入: java -version    java版本
	输入: java
	输入: javac
```

### 6.DOS命令

> 打开cmd   wind+ r 输入cmd
>
> 命令行工具

#### 6.1dir

展示当前文件夹下面的所有的文件和文件夹

![15](img\15.png)

#### 6.2cd  路径

目录的切换

cd  文件夹的路径   就会进入到文件夹中

cd ../   返回上一级目录

cd ../../

![16](img\16.png)

#### 6.3mkdir             make   directory

在指定的路径(code)下面 创建文件夹 kwy

![17](img\17.png)

#### 6.4切换盘符

从c盘到d盘 效果叫切换盘符，直接在命令行中直接写盘符即可

![18](img\18.png)

#### 6.5rd  

删除指定的目录  remove  directory   回收站没有

![19](img\19.png)

#### 6.6del  文件的名字

delete  删除指定文件

![20](img\20.png)

### 7.使用notepad++写第一个Java代码

#### 7.1打开文件的后缀

> wind11:  先打开一个文件夹      查看-》显示-》文件扩展名 一定要勾选
>
> wind10: 先打开一个文件夹     查看-》文件扩展名  一定要勾选
>
> wind7:  先打开一个文件夹   组织-》文件夹及搜索选项-》查看-》隐藏已知的扩展  不勾选

#### 7.2编写第一个Java代码

> 1.新建一个空的文件夹  code
>
> 2.在code文件夹中新建一个Hello.txt文件
>
> 3.重命名 Hello.txt 为 Hello.java  在改后缀  因为学的是Java 所以后缀是.java 
>
> 4.用开发工具 notepad++打开Hello.java文件
>
> 5.写class 关键字   后面跟一个类名（一定是文件的名字），开发时候，类名都是首字母大写的。所以文件的名字首字母也要大写。
>
> 6.在类名的后面加 一对大括号，把光标放在大括号中间，敲回车
>
> 7.在大括号中写  main主函数 （死记硬背的） 的大括号中输出的内容
>
> 8.记得一定保存！！！  运行即可
>
> ```
> 开始运行：
> 	java代码的运行，一定是先编译（将.java文件编译成.class文件（字节码文件））后运行字节文件中的类
> 	打开黑屏终端: wind + r  然后cmd
> 		找到Hello.java文件编译成Hello.class文件
> 		javac Hello.java  在编译咱们的Java文件
> 		java Hello    在运行Hello这个类  出来结果
> 		
> ```
>
> ```Java
> class Hello {
> 	public static void main (String[] args) {
> 		System.out.println("hello world");
> 	}
> }
> ```

#### 7.3对咱们Java代码进行解释

```Java
class First {
	public static void main (String[] args) {
		System.out.println("ni hao");
	} 
}
```

> class :  类
>
> First： 类名 也是 文件名字
>
> public: 公开的
>
> static :  静态的
>
> void ：  无返回值的
>
> main ：  是一个主函数   是程序的入口
>
> String：字符串  
>
> []：  数组
>
> args:  参数
>
> System： 系统的
>
> out：输出的意思
>
> 以下两个是重点：
>
> println：  换行打印
>
> print： 不换行打印
>
> 不需要做过多的理解，先背下来，然后敲，练习不报错即可

#### 7.4解决中文乱码的问题

打开notepad++， 最上面的导航栏已找到编码点击=》转为ANSI编码格式

### 8.java中的注释

> 注释的目的:   注释的目的是解释代码的，不运行。单纯的解释代码是啥意思
>
> 一个成熟的程序员是必须要写注释的！！！
>
> 1.单行注释
>
> ​		//内容
>
> 2.多行注释
>
> ​		/* 注释的内容 */
>
> 3.文档注释 一般用在接口和类的上面
>
> ```
> /**
>   *内容
>   *
>   */
> ```
>
> 

```Java

/**
  *这个是一个类 是打印你好狗蛋的一个类
  *文档注释
  */
class Third {
	//main是程序的入口，少了它不行  单行注释

	public static void main (String[] args) {
		/*
		dxsnmmns
		cbdsndsn
		上学呢你们
		多行注释
		
		*/
		System.out.println("你好,狗蛋");
	}
}
```

总结：

```
1.jdk的安装和环境变量的配置一定要掌握的
2.dos命令一定要掌握
3.使用notepad++写一个Java程序，一定不能出错
4.注释

```

作业：

```
1.第一个Java代码敲到不出错为止
2.金山打字通   1分钟  180apm
3.ppt 课前分享
4.笔记整理一下

```

