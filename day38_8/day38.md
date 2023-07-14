### 今天的内容

> 1.xml
>
> 2.安装Tomcat并讲解Tomcat

### 1.XML

> **XML 指可扩展标记语言**
>
> XML 被设计用来传输和存储数据
>
> xml主要是用来存储数据【重点】druid.properties
>
> html是w3c定义好的标签
>
> xml可以自己定义的
>
> xml是自定定义的变签

![ct_nodetree1](ct_nodetree1.gif)


> 分析：根元素 bookstore
>
> 1.声明一个头文件，告知编译器书写的是xml文件
>
> 2.书写根元素
>
> 3.在根元素中书写子元素
>
> 4.在子元素中嵌套另外一个子元素

```xml
<?xml version="1.0" encoding="utf-8"?>
<!-- 第一行是 XML 声明。它定义 XML 的版本 (1.0) 和所使用的编码 (utf-8万国码) -->
<!-- 下一行描述文档的根元元素：bookstore   【必须只有一个】-->

<bookstore>
<!--bookstore的子元素是book  -->
	<book>
		<!-- book标签下面又有四个子元素 -->
		<title>西游记</title>
		<author>吴承恩</author>
		<year>1550</year>
		<price>78.9</price>
	</book>
	<book>
		<!-- book标签下面又有四个子元素 -->
		<title>红楼梦</title>
		<author>曹雪芹</author>
		<year>1715</year>
		<price>88.9</price>
	</book>
</bookstore>

```

> 语法格式：
>
> 1.只能有一个根元素在xml文件中
>
> 2.标签大小写敏感
>
> 3.必须正确嵌套
>
> 4.属性必须加引号
>
> 5.xml关注的是标签的内容

练习：书写员工的xml文件，根元素自己起名字  下面有资源，要将员工的信息保存到xml文件中（name, age,salary,gender,info）



```xml
<?xml version="1.0" encoding="utf-8"?>
<students>
	<student>
		<name>李聪</name>
		<age>98</age>
		<salary>2789399</salary>
		<gender>男</gender>
		<info>喜欢打游戏</info>
	</student>
	<student>
		<name>李聪</name>
		<age>98</age>
		<salary>2789399</salary>
		<gender>男</gender>
		<info>喜欢打游戏</info>
	</student>
	<student>
		<name>李聪</name>
		<age>98</age>
		<salary>2789399</salary>
		<gender>男</gender>
		<info>喜欢打游戏</info>
	</student>
	<student>
		<name>李聪</name>
		<age>98</age>
		<salary>2789399</salary>
		<gender>男</gender>
		<info>喜欢打游戏</info>
	</student>
	
</students>
```

咱们发现一个问题，就是在书写xml标签的时候，标签是胡乱写的，这样好不好？

真实的开发，在SSM框架中会遇到很多的xml文件，但是这些xml文件的标签不是胡乱写的

是进行了一定的约束的

### 2.xml文件约束

开发中只用两个约束  DTD约束 还有一个叫Schema约束

SSM框架中会用这两个

以后开发中DTD，SChema约束不用自己写的

#### 2.1DTD约束

> 文档类型定义（DTD）可定义合法的XML文档构建模块。它使用一系列合法的元素来定义xml文档的结构。
>
> DTD 可被成行地声明于 XML 文档中，也可作为一个外部引用。开发中使用外部的引用！！！
>
> 1.外部专门写一个dtd文件，把它引入到当前xml文件中
>
> 2.当前的xml文件你就不能胡乱写标签了

```dtd

<!--students是跟标签，要求根标签下面的子标签必须是student-->

<!ELEMENT students (student*)>
<!--student 的元素必须是 name  age  sex  info-->
<!ELEMENT student (name, age, sex, info)>
<!--声明name  age  sex  info  这几个标签的额数据类型-->
<!--#PCDATA  是文本类型的数据-->
<!ELEMENT name (#PCDATA)>
<!ELEMENT age (#PCDATA)>
<!ELEMENT sex (#PCDATA)>
<!ELEMENT info (#PCDATA)>
<!--可以对标签加属性-->
<!ATTLIST student id ID #REQUIRED>
<!--这个dtd文件不需要写，因为咱们以后都用别人给咱们封装好的-->
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<!--引入外部的dtd文件
    <!DOCTYPE 根元素 SYSTEM "dtd绝对路径">
-->
<!DOCTYPE students SYSTEM "C:\Users\wangbo\IdeaProjects\day42_boge\src\com\qfedu\b_dtd\student.dtd">

<students>
    <student id="qwer">
        <name>haoran</name>
        <age>23</age>
        <sex>1</sex>
        <info>bhjcasm</info>
    </student>
    <student id="ergou">
        <name>maye</name>
        <age>88</age>
        <sex>0</sex>
        <info>kmxsaj</info>

    </student>
</students>

```

#### 2.2schema约束

> XML Schema 是基于 XML 的 DTD 替代者。
>
> 是DTD加强版本
>
> **XML Schema 描述 XML 文档的结构。**
>
> 1.创建一个.xsd文件（这个文件不用自己写，咱们以后开发别人封装好的）
>
> 2.创建一个xml文件外部进行引入一下即可

```xsd
<?xml version="1.0"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            targetNamespace="http://www.qfedu.com/xml"
            xmlns="http://www.qfedu.com/xml"
            elementFormDefault="qualified">
    <!-- xmlns:xs="http://www.w3.org/2001/XMLSchema"-->
    <!-- 显示 schema 中用到的元素和数据类型来自命名空间 "http://www.w3.org/2001/XMLSchema"。同时它还规定了来自命名空间 "http://www.w3.org/2001/XMLSchema" 的元素和数据类型应该使用前缀 xsd
    ：-->
    <!-- targetNamespace="http://www.qfedu.com/xml" -->
    <!-- 显示被此 schema 定义的元素 (note, to, from, heading, body) 来自命名空间： "http://www.w3school.com.cn"。-->
    <!-- xmlns="http://www.qfedu.com/xml" -->
    <!-- 指出默认的命名空间是 "http://www.qfedu.com/xml"。-->
    <!--     elementFormDefault="qualified">-->
    <!--    指出任何 XML 实例文档所使用的且在此 schema 中声明过的元素必须被命名空间限定。s-->
    <!-- 根节点名字和包含的内容，内容是自定义studentType -->
    <!--    根节点students-->
    <xsd:element name="students" type="studentsType"/>
    <!-- studentsType类型声明   -->
    <xsd:complexType name="studentsType">
        <xsd:sequence>
            <!-- students根节点中存放的是student类型  type="studentType" 要求student的个数从0开始 个数不限制 -->
            <xsd:element name="student" type="studentType" minOccurs="0" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>
    <!-- studentType声明 -->
    <xsd:complexType name="studentType">
        <xsd:sequence>
            <!-- 要求student标签内有name，age，sex子标签，并且要求对一个对应保存的数据类型是type指定 -->
            <xsd:element name="name" type="xsd:string"/>
            <!-- ageType 和 sexType 是自定义数据约束 -->
            <xsd:element name="age" type="ageType" />
            <xsd:element name="sex" type="sexType" />
        </xsd:sequence>
        <!-- 给予Student标签属性 属性为id，要声明idType， use="required"不可缺少的 -->
        <xsd:attribute name="id" type="idType" use="required"/>
    </xsd:complexType>
    <!-- sexType性别类型声明 -->
    <xsd:simpleType name="sexType">
        <xsd:restriction base="xsd:string">
            <!-- 有且只有两个数据 male female -->
            <xsd:enumeration value="male"/>
            <xsd:enumeration value="female"/>
        </xsd:restriction>
    </xsd:simpleType>
    <xsd:simpleType name="ageType">
        <xsd:restriction base="xsd:integer">
            <!-- 0 ~ 256 要求范围，是一个integer类型 -->
            <xsd:minInclusive value="0"/>
            <xsd:maxInclusive value="256"/>
        </xsd:restriction>
    </xsd:simpleType>
    <xsd:simpleType name="idType">
        <xsd:restriction base="xsd:string">
            <!-- ID类型，要求zz_xxxx(四位数字) -->
            <xsd:pattern value="zz_\d{4}"/>
        </xsd:restriction>
    </xsd:simpleType>
</xsd:schema>
        <!--麻烦，还好咱们以后开发不用写dtd  xsd文件，只需要使用被人封装好的即可-->
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<!--通过命名空间找到当前的约束-->
<students xmlns="http://www.qfedu.com/xml"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://www.qfedu.com/xml student.xsd">

<!--    除了标签进行约束了，连数据都进行约束了-->
    <student id="zz_1001">
        <name>goudan</name>
        <age>110</age>
        <sex>male</sex>
    </student>
</students>
```

总结：dtd和xsd文件以后开发中都是别人封装好的东西，咱们只要拿来用，按照规矩来写代码即可，不需要会自己敲，属性太多了

### 2.xml解析

> xml是保存的数据的，解析xml就是将数据取出来的
>
> java有四种解析方式，咱们只讲一种
>
> 1.DOM解析
>
> 2.SAX解析
>
> 3.JDom解析
>
> 4.dom4j解析
>
> 只学dom4j解析，以后会学习SSM框架，框架里面会书写xml文件，咱们的spring的框架的底层就是封装了dom4j讲这个不是为了开发，是为了以后能看懂源码。
>
> dom4j是将一个xml文件解析成为一个对象，然后从这个对象中把数据取出来

案例

> 1.新建一个book.xml文件
>
> 2.导包使用dom4j形式去读取xml文件里面的内容

```JAVA
package com.qfedu.d_parsexml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        //1.创建了一个对象，这个对象专门读取xml文件的对象
        SAXReader saxReader = new SAXReader();
        //2.开始读取XML文件 将xml文件变成了对象
        Document document = saxReader.read(new FileInputStream("C:\\Users\\wangbo\\IdeaProjects\\day42_boge\\src\\com\\qfedu\\d_parsexml\\book.xml"));
       //3.通过当前的对象根节点元素 bookstore
        Element bookstore = document.getRootElement();
        System.out.println(bookstore);
        //4.bookstore下面有很多个book标签
        //返回值是一个迭代器，可以把bookstore下面的book全部迭代出来
        Iterator iterator = bookstore.elementIterator();
        //5.使用while循环进行迭代
        while (iterator.hasNext()) {
            System.out.println("====开始迭代一本书=====");
            Element book = (Element)iterator.next();//处理的是book标签  对象
            //6.获取book对象的子标签
            Iterator iterator1 = book.elementIterator();
            while (iterator1.hasNext()) {
                Element bookChild = (Element)iterator1.next();
                System.out.println("book标签下面子标签的名字:" + bookChild.getName());
                System.out.println("子标签中的值:" + bookChild.getStringValue());
            }
            System.out.println("====结束迭代一本书=====");
        }
    }
}

```

这个代码不用练！！！

### 3.Tomcat

> 什么是web？
>
> ​	就是咱们的打开的淘宝京东等这些网页
>
> web服务器？
>
> ​		思考一下为什么要安装web服务器？
>
> ​		比如淘宝，京东这些网站，人家把web网页放到自己的服务器，通过url来访问这个网页
>
> ​		如果咱们的安装了Tomcat服务器以后，咱们写的代码扔到这个服务器下面通过这个服务器的url可以访问你写的代码了。
>
> java中有Tomcat,Resin,weblogic
>
> 其中Tomcat是免费的开源是apache这个组织和sun公司还有一些个人搞出来的
>
> 明天要学习web一块的东西了，学习要安装Tomcat服务器

#### 3.1安装Tomcat

> 1.去官方网站(http://tomcat.apache.org) 去下载解压缩版本Tomcat9.0版本
>
> 2.我给大家发的tomcat是一个压缩包，解压之后放到任意盘符下面即可
>
> 注意事项：
>
> ​		1.不建议服务器软件放的层级太深
>
> ​		2.不能有中文路径
>
> ​		3.Tomcat需要配置jdk环境变量有问题的 别是jre的环境变量
>
> ​		4.建议把你们的电脑的防火墙关闭

#### 3.2启动和关闭Tomcat服务器

> 启动：
>
> ​	1.进到tomcat文件夹里面，找到bin文件夹，然后找到startup.bat 文件，双击即可，不要点击小黑屏哪个x
>
> ​	2.打开浏览器在浏览器的地址框输入（http://localhost:8080）
>
> ​	闪退的情况：
>
> ​		1.防火墙没有关闭
>
> ​		2.jdk环境配置的有问题
>
> ​		3.即使现在打不开tomcat服务器，没有关系的，因为咱们要使用idea来打开服务器
>
> 关闭：
>
> ​	1.进到tomcat文件夹里面，找到bin文件夹，然后找到shutdown.bat 文件，双击即可,可以关闭了
>
> 

#### 3.3Tomcat下面文件夹简单介绍【非重点】

| 文件夹  | 说明                                                         | 备注                                                         |
| ------- | :----------------------------------------------------------- | ------------------------------------------------------------ |
| bin     | 该目录下存放的是二进制可执行文件                             | startup.bat启动Tomcat、shutdown.bat停止Tomcat                |
| conf    | 这是一个非常重要的目录，这个目录下有两个最为重要的文件server.xml和web.xml | server.xml：配置整个服务器信息。例如修改端口号，编码格式等。<br/>web.xml：项目部署描述符文件，这个文件中注册了很多MIME类型，即文档类型。 |
| lib     | Tomcat的类库，里面存放Tomcat运行所需要的jar文件。            |                                                              |
| logs    | 存放日志文件，记录了Tomcat启动和关闭的信息，如果启动Tomcat时有错误，异常也会记录在日志文件中。 |                                                              |
| temp    | Tomcat的临时文件，这个目录下的东西在停止Tomcat后删除。       |                                                              |
| webapps | 存放web项目的目录，其中每个文件夹都是一个项目；其中ROOT是一个特殊的项目，在地址栏中没有给出项目目录时，对应的就是ROOT项目。 |                                                              |
| work    | 运行时生成的文件，最终运行的文件都在这里。                   | 当客户端用户访问一个JSP文件时，Tomcat会通过JSP生成Java文件，然后再编译Java文件生成class文件，生成的java和class文件都会存放到这个目录下。 |

说明：Tomcat服务器就算安好了，们明天讲解WEB开发的时候要用的，使用idea来配置Tomcat服务器

明天咱们一步一步的走，我到哪一步你们走到哪一步，并且我会录屏，还会给大家截屏！！！

总结：

```
1.xml
	自己定义标签
2.DTD约束
	看一下即可不用记
3.schema约束
	看一下即可不用记
4.xml解析

	想敲一下也可以的
5.安装Tomcat服务器
	即使你tomcat服务器启动不了没有关系，咱们可以使用idea启动
	
```

