

### 今天的内容

> 1.html表单标签
>
> 2.html框架

```
Date   年 月  日
Time   时 分 秒
DateTime  年月日  时分秒
TimeStamp   年月日  时分秒
Java中  控制台输入  String
转时间类型  无外乎就一个方法
```



### 1、HTML表单标签

---

HTML表单用于收集不同类型的用户输入

例如咱们的登录页面注册页面等都是表单

#### 0.1URL

```
URL 也被称为网址。统一资源定位符

URL 可以由单词组成，比如 “baidu.com”，或者是因特网协议（IP）地址：192.168.1.253。大多数人在网上冲浪时，会输入网址的域名，因为名称比数字容易记忆。
URL组成部分：
	协议://域名(ip地址):端口号/资源文件?参数1&参数2
	https://www.baidu.com:43/index.html?name=goudan&pwd=1323456
	http://127.0.0.1:8848/demo/test.html?username=goudann&pwd=123
```



#### 1.1 form标签

定义html表单的

<form> 元素

HTML 表单用于收集用户输入。

<form> 元素定义 HTML 表单：

    常用属性：action：表示动作，值为服务器的地址，把表单的数据提交到该地址上处理
             method:请求方式：get 和post
             enctype:表示是表单提交的类型
    			    默认值：application/x-www-form-urlencoded  普通表单
    			           multipart/form-data  多部分表单(一般用于文件上传)
    			           text/plain 普通文本
    			           
    	 get:
    	   1.数据存在地址栏中,请求参数都在地址后拼接 path?name="张三"&password="123456"
    	   2.不安全
    	   3.效率高
    	   4.get请求大小有限制，不同浏览器有不同，但是大约是2KB
    使用情况：一般情况用于查询数据。
    	 post：
    	   1.地址栏没有数据：请求参数单独处理。
    	   2.安全可靠
    	   3.效率低
    	   4.post请求大小理论上无限。
    使用情况：一般用于插入修改等操作			           		           

入门级别得案例

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- <form> 元素定义 HTML 表单：  用来收集用户输入的数据的
			form表单里面必须有表单的元素
		 -->
		<!-- HTML 表单包含表单元素。
表单元素指的是不同类型的 input 元素、复选框、单选按钮、提交按钮等等。 -->

		<form>
			<!-- <input> 元素是最重要的表单元素。是单边的标签

·			<input> 元素有很多形态，根据不同的 type 属性。 
					type：属性  表单元素的形态
						属性值:
							text：  文本类型
							password: 密文类型
							submit： 提交按钮
					提交按钮的value属性:  给按钮设置文本内容的
			-->
			<input type="text"><br>
			<input type="password"><br>
			<input type="submit" value="登陆"/>
		</form>
	</body>
</html>
```

form收集数据并把数据带到另外资源中，案例入下

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- <form> 元素定义 HTML 表单：  用来收集用户输入的数据的
			form表单里面必须有表单的元素
		 -->
		<!-- HTML 表单包含表单元素。
表单元素指的是不同类型的 input 元素、复选框、单选按钮、提交按钮等等。 -->

		<form  action="test.html" method="post">
			<!-- form标签的属性:
				action： 是一个url 资源 将数据提交给一个资源
				method:  是提交方式
					get:
						是默认，
						1.带到另外一个资源的数据存在了url的地址中。人肉眼可以看到
						path？name=goudan&pwd=123123
						2.不安全
						3.效率高
						4. get 请求的大小是有限制的。大约是2KB
						以后开发中中:  查询数据
						
					
					 post：
						   1.地址栏没有数据：请求参数单独处理。
						   2.安全可靠
						   3.效率低
						   4.post请求大小理论上无限。
			 -->
			<!-- <input> 元素是最重要的表单元素。是单边的标签

·			<input> 元素有很多形态，根据不同的 type 属性。 
					type：属性  表单元素的形态
						属性值:
							text：  文本类型
							password: 密文类型
							submit： 提交按钮
					提交按钮的value属性:  给按钮设置文本内容的 
					
					name： 属性 当前表单元素的名字   只有写了之后 会作为一个键
					提交数据给另外一个资源   ！！！！！！相当重要！！！！！！
			-->
			<input type="text" name="user"><br>
			<input type="password" name="pwd"><br>
			<input type="submit" value="登陆"/>
		</form>
	</body>
</html>
```

1.1.1 input标签

*<input>* 元素是最重要的*表单元素*。就是他必须写在form标签的里面作为form标签的子标签

    type: 以下为type可能要取的值： 
          1.1   text 文本框  输入内容
          1.2   password  密码框   密文或者掩码
          1.3   radio 表示是单选，name必须一致；value：提交给服务器的数据
                      表示同一组中只能选中一个( checked ="checked" 表示选中)
          1.4  checkbox  表示多选 ，name必须一致，
                     表示同一组中可以选多个，返回值是个数组( checked ="checked" 表示选中)
          1.5   file ：表示上传控件			    
          以上具有输入性质的必须要有name属性,初始开始写value表示是默认值(以后获取输入框的内容要根据name来取)	 
    	 以下按钮不具有输入性质，不需要name属性，但是按钮上的文字提示使用value属性
          1.6 submit   提交
          1.7 reset   重置
          1.9 image   图片提交按钮
    	  1.10 button 普通按钮
    	  
          1.11 hidden  表示隐藏域，该框的内容服务器需要，但是不想让用户知道(不想清楚的显示在界面上)
          1.12 email  表示邮箱格式的数据
         
    name属性：表单元素名字，只有name属性才能提交给服务器。   
    value属性：提交给服务器的数据
    placeholder：提示信息

4.1.2 select元素

(下拉列表)

    <select name="city">   <!--select标签添加该属性multiple="multiple"表示多选 、size表示显示的个数-->  
         <!--option表示下拉列表项-->
    	<option value="北京">北京</option> 
         <!--selected="selected"表示选中该项-->
    	<option value="上海" selected="selected">上海</option>
    	<option value="广州">广州</option>
    	<option value="杭州">杭州</option>
    </select>

1.1.3 textarea元素

(文本域)

需要指定输入的区域位置大小

     <textarea cols="100" rows="5">  表示5行100列的区域可以输入内容，该元素没有value属性

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- 写一个单独的form标签是不显示任何效果的  input标签是form表单最重要的子元素 -->
		<!-- form标签面的属性
			action：动作，表单数据要提交的地址  url  就是另外一个页面
				地址：可以是本地地址，也可以是网络地址
			method：提交的方式
				1.get提交方式  默认的不写也是get  提交的数据会在url以参数的形式显示
					1.数据存在地址栏中,请求参数都在地址后拼接 path?name="张三"&password="123456"
				   2.不安全
				   3.效率高
				   4.get请求大小有限制，不同浏览器有不同，但是大约是2KB
					5.一般情况用于查询数据。
				2.post提交方式  不会在url中显示，但是程序员可以看到
					1.地址栏没有数据：请求参数单独处理。
				   2.安全可靠
				   3.效率低
				   4.post请求大小理论上无限。
				   5.一般用于插入修改等操作
				   总结:想要把输入框里面的数据提交给另外一个url
				   有两种提交方式：getz在url中显示  post在url里面不显示，右键检查
				-->
		<form action="test.html" method="get" enctype="multipart/form-data">
			<!-- input标签的属性
				type：设置文本框的类型的
					属性值：
						1.text  明文框
						2.password  密文框
						3.submit  提交按钮
				value:  设置按钮的文本内容
				name:【重要】 在提交的数据的时候，name的属性值有可能会当成url的参数
				在提交数据到另外一个页面的时候，name属性是必须要写的 可以把linput
				输入框中的数据带到另外一个页面 以url中参数的形式带到另外 一个页面
			 -->
			姓名:<input type="text" name="username" placeholder="请输入用户名..."/><br />
			密码:<input type="password" name="pwd" placeholder="请输入密码..."/><br />
			<!-- 单选框按钮 
			 type:radio
			 name:【重要】设置单选的状态的 值要保持一致 才能锁定单选状态的
			 value【重要】:传入的数据具体的值
			 checked：属性默认选中的
			-->
			<input type="radio"  name="sex" value="0" />男
			<input type="radio" name="sex" value="1" checked="checked"/>女<br />
			<!-- 多选框 or 复选框
			 type：checkbox
			 name:【重要】作为url参数的键
			 value:【重要】作为url参数的值
			 -->
			 <input type="checkbox" name="hobby" value="ball" checked/>打篮球
			 <input type="checkbox" name="hobby" value="sing"/>唱跳
			 <input type="checkbox" name="hobby" value="rap"/>rap<br />
			
			<!-- 日期文本框 
			 type：date
			-->
			<input type="date" name="birth" /><br />
			<!-- 上传文件文本框 
				type="file"
				注意事项 form表单必须书写一个属性
				enctype="multipart/form-data"  必须要写的，因为文件数据比较大
				
			-->
			<input type="file" name="file"/><br>
			
			<!-- 隐藏文本
			 表示隐藏域，该框的内容服务器需要，但是不想让用户知道(不想清楚的显示在界面上)
			 以后开发要用的
			 -->
			 <input type="hidden" name="hid" value="sb"/>
			 
			 <!-- 邮箱输入框，必须写对邮箱的格式  写不对的话不让提交数据 -->
			 <input type="email" name="email"/><br />
			 <!-- 下拉列表 
			 
			 selected  默认显示效果
			 multiple  可以加入多选效果
			 -->
			 <select name="city" multiple="multiple">
				 <option value="zz">郑州</option>
				 <option value="ny" selected="selected">南阳</option>
				 <option value="xy">信阳</option>
			 </select>
			 
			 <br />
			 <!-- 文本编辑器 
			 col设置列的
			 rows设置行的
			 -->
			 <textarea cols="100" rows="5" name="info"></textarea><br />
			<input type="submit"  value="登录"/>
			<!-- 重置按钮 -->
			<input type="reset"  value="重置"/>
			<input type="image"  value="图片"/>
			<!-- button  一般结合js使用的  没有js是没有效果的-->
			<input type="button"  value="注册"/>
			
		</form>
	</body>
</html>

```



### 2、HTML框架

通过使用框架，你可以在同一个浏览器窗口中显示不止一个页面。每份HTML文档称为一个框架，并且每个框架都独立于其他的框架。

使用框架的缺点：

    开发人员必须同时跟踪更多的HTML文档
    
    很难打印整张页面

2.1 frameset【这个不用了】

框架结构标签，把body删掉，使用framset代替body

框架结构标签（<frameset>）定义如何将窗口分割为框架

每个 frameset 定义了一系列行或列

rows/cols 的值规定了每行或每列占据屏幕的面积

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<!-- rows  上下分割  上面一个页面占 20%的屏幕  下面一个页面占 80% -->
	<frameset rows="20%, *">
		<frame  src="test.html"/>
		<frame  src="https://www.taobao.com"/>
	</frameset>
</html>

```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<!-- z左右分割的 -->
	<frameset cols="30%, *">
		<frame  src="test.html"/>
		<frame  src="https://www.taobao.com"/>
	</frameset>
</html>

```

2.2 frame【使用这个】

框架标签

frame 标签定义了放置在每个框架中的 HTML 文档。

2.3 基本的注意事项

    1. 不能将 <body></body> 标签与 <frameset></frameset> 标签同时使用
    2. 假如一个框架有可见边框，用户可以拖动边框来改变它的大小。为了避免这种情况发生，可以在   <frame> 标签中加入：noresize="noresize
    3 frameset的属性 frameborder="1|0|yes|no" 表示是否有边框  border="1" 表示边框的粗细   bordercolor表示边框颜色
```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<frameset cols="20% , *" frameborder="1" border="100" bordercolor="red">
		<frame src="left.html" noresize="noresize"/>
		<!-- 右边做了一个标记为  name="frameName"-->
		<frame src="right.html"  name="sb"/>
	</frameset>
</html>

```

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<a href="http://www.taobao.com" target="sb">淘宝</a><br />
		<a href="http://www.4399.com" target="sb">4399</a>
	</body>
</html>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		右边
	</body>
</html>

看官方手册，可以玩玩其他标签

开发中标签已经全部讲完了，你们可以自己翻看官方手册，自己玩玩其他标签

https://www.w3school.com.cn/

表单标签不用担心，以后在做开发的时候天天写！！