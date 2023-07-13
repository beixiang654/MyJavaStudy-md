### C回顾

```
1.html
	表单 form  
		表单元素
			input
				属性 type
					属性值
						text
						password
						submit
						radio
						checkbox
						email
						hidden
						date
						reset
						button
						
					select
						optional
					textarea
2.html框架
	frameset
	
3.css
	1.css三种引入方式
		1.行内
		2.内联
		3.外联
	2.css选择器
		id
		class
		组合
		层级
		标签
	3.css各种属性
		1.背景
		2.边框 border: solid 12px red;
		3.文本和字体
		4.盒子模型
		5.浮动和清除浮动
		6.定位 
```

### 今天的内容

> 1.JavaScript
>
> 作为后端的先入门  js
>
> 以后会学封装的js框架
>
> ​	jQuery js一个的框架
>
> ​	layui也是是封装了js
>
> ​	vue 也是封装了js
>
> js是一门开发语言，重量级别的语言

### 1.JavaScript

#### 1.1JS的简介

> ## 为何学习 JavaScript？
>
> JavaScript 是 web 开发者必学的三种语言之一：
>
> - *HTML* 定义网页的内容
> - *CSS* 规定网页的布局
> - *JavaScript* 对网页行为进行编程  为了给个页面加动态效果的
>
> 本教程提供关于 JavaScript，以及 JavaScript 如何与 HTML 和 CSS 协同工作的知识。
>
> ### 您知道吗？
>
> JavaScript 和 Java 是完全不同的语言，不论是概念还是设计。
>
> JavaScript 在 1995 年由 Brendan Eich 发明，并于 1997 年成为一部 ECMA 标准。
>
> ECMA-262 是其官方名称。ECMAScript 6 （发布于 2015 年）是最新的 [JavaScript 版本](https://www.w3school.com.cn/js/js_versions.asp)。
>
> 总结：就是JS是和html  css 协同工作的给页面添加动态效果

#### 1.2js的三种引入方式

> css是用来修饰html标签的
>
> 同理js也是对html标签进行修饰的给标签加上动态效果的
>
> js也有三种引入方式

```html
<!DOCTYPE html>

<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<!-- 第三种引入方式
		 在head标签中书写script标签引入外部的js文件类似于咱们的css的外联方式
		 src属性很重要哦   放外部js文件路径的
		 charset:是设置js的编码格式的
		 type="text/javascript"  告知浏览器 当前的文档类型
		 -->
		 <script type="text/javascript" src="./test.js" charset="utf-8"></script>
		 	
		 
		 
	</head>
	<body>
		<!-- 第一种写法 js的引入方式
		button就是一个按钮的标签
		onclick:事件属性 当我点击按钮的时候会触发这个事件
		oncclic后面的属性值是js代码
		alert('呵呵哒') 就是一个js代码  js封装好的一个方法，方法的功能是弹框效果
		-->
		<button onclick="alert('马驰,征婚,只要人妖')">点我啊！！！</button>
		
	</body>
	<!-- 第二种方式书写script标签（双边标签） 
		在script标签中写js代码即可
		script代码可以放在咱们html页面的任意位置
	-->
	<script>
		var num = 20;//声明一个一个变量叫num   将20赋值给num变量  声明变量的时候不用指定数据类型
		//注释 js注释和java注释一样
		//在java中打印这个变量，在js中能打印这个变量？能的 用啥
		//System.out.println(num);
		//	console.log(num);  是js的控制台
		console.log(num);//是在浏览器的控制台显示的
		document.write("呵呵哒");//h会在浏览器的页面显示  写入到咱们当前页面上面
	</script>
</html>

```

js是独立的语言，他有自己的编程语法格式

#### 1.3JS的数据类型

> number  数字类型（包含整数和小数）
>
> string   字符串类型的数据
>
> boolean  布尔类型
>
> object  对象【重点】
>
> array  数组

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
	</body>
	<script>
		/*
		JS基本数据类型:
			number  数字（包含了整数和小数）
			string  字符串
			boolean 布尔类型的数据
		*/
	   //在js中声明一个变量的语法格式  var  变量名字 = 初始的值;  var  可以省略
	   var num = 25.6;
	   console.log(num);
	   //查看一些数据类型  typeof  num 
	   console.log(typeof num);//number
	   num1 = 34;//注意写在一行的时候，代码结束要加分号的
	   console.log(num1)
	   
	   console.log(typeof num1)//number
	   //布尔类型的数据
	   var ret = true
	   document.write(ret)
	   console.log(typeof ret)//boolean
	   //声明一个字符串类型的数据
	   var str = "马驰大肠赤身";//使用双引号声明的字符串
	   console.log(str)
	   console.log(typeof str)//string
	   var str1 = '浩然爱吃大肠';//也可以使用单引号声明的字符串
	   console.log(str1)
	   console.log(typeof str1)//string
	   //关于字符串类型的数据 来一点扩展   java中string有一些方法
	   //同理js中也有关于字符串的方法
	   //1.字符串拼接  +
	   str1 = str1 + ",爱吃肉肠";
	   console.log(str1)
	   //2.字符串拼接，使用一个方法 concat
	   str3 = "羊眼赤身".concat(",大肠蜂蜜")
	   document.write(str3)
	   //3.获取字符串里面的一个字符
	   //借助于c语言写法，将一个字符串按照数组的形式通过索引将一个字符取出来
	   console.log("银屏砸破脑浆蹦"[0])//银
	   //4.拆分一个字符串 split
	   var str2 = "生吃韭菜,生吃鸡蛋,生吃番茄".split(",")
	   console.log(str2)//拆完以后是一个数组
	   //取值  通过索引取数组里面的值
	   console.log(str2[1])
	   //5.去除字符串左右两边的空格
	   var str3 = "     干锅茶树菇    "
	   str4 = str3.trim()
	   console.log(str4)
	   //请去除字符串左边空格   trimLeft()   去除右边空格  trimRight
	   
	   //6.将字符串类型的数据转为number类型的数据
	   var i = parseInt("12");//解析成为int类型 就是 number
	   console.log(i)
	   console.log(typeof i)
	   var i1 = parseFloat("23.4")
	   console.log(i1)
	   console.log(typeof i1)
	   //7.打印字符串的长度  是属性不是方法
	   console.log("没啥意思".length)
	   /*
	   toUpperCase()
	   toLowerCase()
	   endWidth()
	   charAt()
	   subString()
	   这些都是java学过的！！！自己找官方手册演示
	   */
	   
	</script>
</html>

```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
	</body>
	<script type="text/javascript">
		//数据类型 对象 object  和json 有关 以后开发 前后端进行交互的数据形式就是json  xml
		//后面会详细讲json
		//声明一个object类型的语法格式
		//{键1:值1, 键2:值2,.....}
		var student = {"name":"老邢", "age":12, "info":"行走的猪头肉"};
		console.log(student)
		console.log(typeof student)
		//获取对象的数据   和java类似 对象.键
		console.log(student.name)
		console.log(student.age)
		
		console.log(student.info)
		//扩展 还可以写成另外一种形式 js 太6了
		console.log(student["name"])
		//数组 是一个在js中是一个特殊的object类型的数据
		//声明数组
		//第一种声明方式 很少用
		var arr1 = new Array()//空的数组对象  没有初始化容量
		arr1[0] = 12;
		arr1[1] = "狗蛋"
		arr1[2] = true
		//除了使用下标 还可以使用另外一种方式 push方法写值进数组
		arr1.push(45)
		arr1.push("浩然")
		console.log(typeof arr1)//object
		console.log(arr1)//[12, "狗蛋", true]  数据类型不一致也可以存进去 太随意了
	
		//第二种声明方式 常用的
		var arr2 = [1,2,3,4,5,"马也", true];
		console.log(arr2)
		//通过索引下面取数据的值
		
		//object和数组可以组成咱们以后讲的json数据 数组和对象可以组合写
		var students = [
			{"name":"老邢", "age":78,"hobby":["洗脚", "猪头肉"]},
			{"name":"骚磊", "age":67,"hobby":["玩", "做饭"]},
			{"name":"帅栋", "age":45,"hobby":["打游戏","直播"]}
		];
		//以上这个对象能不能看懂？ 数c组里面放了三个象对象
		//想要打印骚磊
		console.log(students[1].name)
		console.log(students[0].hobby)//这是一个个数组
		console.log(students[0].hobby[1])
		
		//总结：碰到中括号就是一个数组 通过索引下标来取  碰到大括号就是一个对象  .键来取对象的值
	</script>
</html>

```

#### 1.4js中的运算符

> 算术运算符
>
> ```
> +    -  *  /  %  ++  --
> ```
>
> 关系运算符
>
> ```
> >  <  >=   <=  == !=  ===
> ===只能是number类型的数据
> ```
>
> 逻辑运算符
>
> ```
> &&  ||   !
> ```
>
> 这些除了===没有见过其他都见过

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
	</body>
	<script type="text/javascript">
		//算术运算符
		var ret = 4 + 5;
		console.log(ret)
		//关系运算符
		num1 = 5;num2 = 10;
		console.log(num1 > num2)//false
		//==   和===
		console.log(1 == "1")//true  == 不看数据类型 只看内容
		console.log(1==="1")//false === 严格一点   判断是的内容和类型
		//逻辑运算符  &&  ||  ！
		console.log((3 > 4) && (5 < 6))
		
	</script>
</html>

```

#### 1.4js分支结构

> if
>
> if-else
>
> if-else if
>
> swicth-case

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
	</body>
	<script>
		var num = 4;
		
		if (num > 3) {
			console.log("呵呵哒");
		}
		var num1 = 200
		if (num1 > 300) {
			console.log("大于300")
		} else {
			console.log("小于300")
		}
		var score = 70;
		if (score > 90) {
			document.write("这位同学很优秀");//写在页面上面了
		} else if (score > 80) {
			document.write("良好")
		} else if (score > 60) {
			document.write("及格")
		} else {
			document.write("叫家长吧")
		}
		var num = 2;
		switch (num){
			case 1:
				document.write("给爸爸打电话")
				break;
			case 2:
				document.write("给妈妈打电话")
				break;
			case 3:
				document.write("给爷爷打电话")
				break;
			case 4:
				document.write("给奶奶打电话")
				break;
			default:
				document.write("给警察打电话")
				break;
		}
		//和java一模一样的
	</script>
</html>

```

#### 1.5循环结构

> JavaScript 支持不同类型的循环：
>
> - `for` - 多次遍历代码块（和java一模一样）
> - `for/in` - 遍历对象属性
> - `while` - 当指定条件为 true 时循环一段代码块（和java一模一样）
> - `do/while` - 当指定条件为 true 时循环一段代码块（和java一模一样）

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
	</body>
	<script type="text/javascript">
		// while循环
		var a = 0;
		while  (a < 4) {
			document.write("浩然又想挨打了<br>")
			a++
		}
		document.write("=============<br>")
		//do-while循环
		var b = 10;
		do {
			document.write("回锅肉" + b + "<br>")
			b--;
		}while (b > 0);
		//for循环
		for(var i= 0; i < 10; i++) {
			document.write("麻辣小龙虾"+ "<br>")
		}
		//for-in 循环遍历对象的 很6 啊
		var stu = {"name":"浩然","age":89,"info":"是我心目中的黑马王子"};
		//stuKey  会把in后面对象的键给遍历出来
		for (var stukey in stu) {
			document.write(stukey + "<br>")
			//对象.键   要么  对象[键]
			//for-in循环中只能使用  对象[键]
			document.write(stu[stukey] + "<br>")
		}
	</script>
</html>

```

练习：使用js打印一个99乘法表，在页面上打印！！！

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
	</body>
	<script type="text/javascript">
		// while循环
		var a = 0;
		while  (a < 4) {
			document.write("浩然又想挨打了<br>")
			a++
		}
		document.write("=============<br>")
		//do-while循环
		var b = 10;
		do {
			document.write("回锅肉" + b + "<br>")
			b--;
		}while (b > 0);
		//for循环
		for(var i= 0; i < 10; i++) {
			document.write("麻辣小龙虾"+ "<br>")
		}
		//for-in 循环遍历对象的 很6 啊
		var stu = {"name":"浩然","age":89,"info":"是我心目中的黑马王子"};
		//stuKey  会把in后面对象的键给遍历出来
		for (var stukey in stu) {
			document.write(stukey + "<br>")
			//对象.键   要么  对象[键]
			//for-in循环中只能使用  对象[键]
			document.write(stu[stukey] + "<br>")
		}
		//99乘法表
		for(var i = 1; i < 10; i++) {
			for (var j = 1; j <= i; j++) {
				document.write(j + "*" + i + "=" + i*j+ "&nbsp;&nbsp;&nbsp;&nbsp;")
			}
			document.write("<br>")
		}
	</script>
</html>

```

#### 1.6js函数【重点】

> java中方法用的很多，在js中叫函数，就是java中的方法。定义语法格式完全不一样的，但是你得知道
>
> 函数就是一个功能而已

> 语法格式:
>
> JavaScript 函数通过 `function` 关键词进行定义，其后是*函数名*和括号 ()。
>
> 函数名可包含字母、数字、下划线和美元符号（规则与变量名相同）。
>
> 圆括号可包括由逗号分隔的参数：
>
> ```
> (参数 1, 参数 2, ...)
> ```
>
> 由函数执行的代码被放置在花括号中：*{}*
>
> ```
> function name(参数 1, 参数 2, 参数 3) {
>     要执行的代码
> }
> ```
>
> *函数参数（Function parameters）*是在函数定义中所列的名称。
>
> *函数参数（Function arguments）*是当调用函数时由函数接收的真实的*值*
>
> ## 函数调用
>
> 函数中的代码将在其他代码调用该函数时执行：
>
> - 当事件发生时（当用户点击按钮时）
>
> - 当 JavaScript 代码调用时
>
>

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- onclick  是一个单击事件
			onclick的属性值是js代码
			alterInfo() 下面script里面的函数
			当触发onclick事件的时候，会执行alterInfo()函数
		 -->
		<button onclick="alterInfo()">快点我啊</button>
		
	</body>
	<script>
		//function 函数名字 () {} 方法的调用
		function alterInfo() {
			//代码块
			alert("嘻嘻哒")
		}
		// 第一种调用方式调用方法通过script代码里面来调用的
		//alterInfo()
		
		//有参数无返回值的函数 和java不一样参数不用带数据类型
		function add (a, b) {
			document.write( a + b)
		}
		add(1,2)
		//无参有返回值的函数
		function printNum () {
			return 1;
		}
		var i = printNum();
		console.log(i)
		//有参有返回值的函数
		function sum (a, b) {
			return a + b
		}
		var i2  = sum(4,5)
		console.log(i2)
		
		//匿名函数 很常用
		var fun = function () {
			console.log("我是匿名的")
		}
		//把一个函数赋值给一个变量了
		//使用变量名字调用方法
		fun()//
	</script>
</html>

```

#### 1.7js中事件【入门事件】

> onclick:单击事件
>
> ondblclick:双击事件
>
> onmouseover:鼠标移动到元素上面的时候触发的事件
>
> onmouseout：鼠标移开的时候触发的事件
>
> onkleydown:点击键盘任意键触发的事件

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<button onclick="alert('单击事件')">点我啊</button>
		<button ondblclick="alert('双击事件')">连着点我两下啊</button>
		<button onmouseover="alert('鼠标移进来')">鼠标移进来</button>
		<button onmouseout="alert('鼠标移出')">鼠标移出来</button>
		<button onkeydown="alert('你在点击键盘')">点击键盘的任意一个键</button>
		
	</body>
</html>

```

#### 1.8js中的正则表达式【千万不要去记】

校验工作

> 面试也不问，百度一下就出来了，开发中有手机号码的验证，邮箱验证等等通过正则表达式验证的。
>
> ## 正则表达式修饰符
>
> *修饰符*可用于大小写不敏感的更全局的搜素：
>
> | 修饰符  | 描述                           | 试一试                                      |
> | :--- | :--------------------------- | :--------------------------------------- |
> | i    | 执行对大小写不敏感的匹配。                | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_i) |
> | g    | 执行全局匹配（查找所有匹配而非在找到第一个匹配后停止）。 | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_g) |
> | m    | 执行多行匹配。                      | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_m) |
>
> ## 正则表达式模式
>
> *括号*用于查找一定范围的字符串：
>
> | 表达式    | 描述               | 试一试                                      |
> | :----- | :--------------- | :--------------------------------------- |
> | [abc]  | 查找方括号之间的任何字符。    | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_abc) |
> | [0-9]  | 查找任何从 0 至 9 的数字。 | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_0-9) |
> | (x\|y) | 查找由 \| 分隔的任何选项。  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_xy) |
>
> *元字符（Metacharacter）*是拥有特殊含义的字符：
>
> | 元字符    | 描述                            | 试一试                                      |
> | :----- | :---------------------------- | :--------------------------------------- |
> | \d     | 查找数字。                         | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_d) |
> | \s     | 查找空白字符。                       | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_s) |
> | \b     | 匹配单词边界。                       | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_b) |
> | \uxxxx | 查找以十六进制数 xxxx 规定的 Unicode 字符。 | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_ux) |
>
> *Quantifiers* 定义量词：
>
> | 量词   | 描述                  | 试一试                                      |
> | :--- | :------------------ | :--------------------------------------- |
> | n+   | 匹配任何包含至少一个 n 的字符串。  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_n_1) |
> | n*   | 匹配任何包含零个或多个 n 的字符串。 | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=eg_js_regexp_n_2) |
> | n?   | 匹配任何包含零个或一个 n 的字符串。 |                                          |

> 用来在匹配用的，匹配字符串的

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
	</body>
	<script>
		var pattern = /\d///正则表达式
		//去查找"abc"里面有没有数字 如果有就返回true  如果没有就返回false
		console.log(/\d/.test("abc"))
		//匹配手机号码，如果你是一个合法的手机号返回true，不是一个合法的手机号码返回一个false
		//n那么这个正则怎么来写
		//解释一句
		/*
			^ 抑扬符: 第一位代表起始位
			[356789]：第二位 在356789任意一个数字
			\d:带表0-9数字
			{n}：代表n个数字
		*/
		//18203601672
		var pattern1 = /^1[356789]\d{9}/
		console.log(pattern1.test(11203601672))
		//世界上又三大难懂的语言：道士的符  医生的处方  码农的正则
		//千万不要自己写
		//在真实的开发的时候，只要会手机号码 邮箱咋验证的通过js
		
		//验证邮箱的
		var pattern2 = /^[0-9a-zA-Z]+[@][0-9A-Za-z]+([.][a-zA-Z]+){1,2}$/
		console.log(pattern2.test("994739768@qq.com"))
		//身份证验证的正则
		//身份证号码是15位或者18位的，15位全部是数字，18位的时候前17位全部是数字，后一位有可能是数字有可能是字母
		
		var pattern3 = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/
		//只有有英文字符的哦匹配都是加""h或者单引号
		console.log(pattern3.test("41282619890417421X"))
	</script>
</html>

```

### 2.DOM【重点】

JS的核心

> #### HTML DOM（文档对象模型）
>
> 当网页被加载时，浏览器会创建页面的文档对象模型（*D*ocument *O*bject *M*odel）。
>
> *HTML DOM* 模型被结构化为*对象树*：
>
> ### 对象的 HTML DOM 树
>
> ![DOM HTML 树](https://www.w3school.com.cn/i/ct_htmltree.gif)
>
> 通过这个对象模型，JavaScript 获得创建动态 HTML 的所有形式（标签）：
>
> - JavaScript 能改变页面中的所有 HTML 元素
> - JavaScript 能改变页面中的所有 HTML 属性
> - JavaScript 能改变页面中的所有 CSS 样式
> - JavaScript 能删除已有的 HTML 元素和属性
> - JavaScript 能添加新的 HTML 元素和属性
> - JavaScript 能对页面中所有已有的 HTML 事件作出反应
> - JavaScript 能在页面中创建新的 HTML 事件
> - 总结：就是可以把一个网页看成一个对象，然后拿对象调用属性和方法对标签进行操作的
> - DOM很重要

#### 2.1查找html元素【重要】

为啥要学习以下的几个方法？

dom就是对标签元素进行操作的，那么首先得找到这个标签元素，咋找，靠下面几个方法
如果连标签元素都找不到，何谈对标签加js动态效果呢

| 方法                                    | 描述                                   |
| :-------------------------------------- | :------------------------------------- |
| document.getElementById(*id*)           | 通过元素 id 来查找元素返回一个元素对象 |
| document.getElementsByTagName(*name*)   | 通过标签名来查找元素烦的是数组         |
| document.getElementsByClassName(*name*) | 通过类名来查找元素返回的是数组         |

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<div id="div1">
			<span >
				浩然❤马驰
			</span>
		</div>
		<p>红旗渠</p>
		<p>利群</p>
		<p>散花</p>
		<span class="cls1">飞天</span>
		<span class="cls1">梦之蓝</span>
		<span class="cls1">散酒</span>
		<span class="cls1">杜康</span>
	</body>
	<script>
		var div1 = document.getElementById("div1");//通过标签的额id属性的属性值获取当前标签前对象
		console.log(div1)
		var ps = document.getElementsByTagName("p")//通过标签的名字获取标签对象 返回值是一个数组
		console.log(ps)
		var clss = document.getElementsByClassName("cls1");//通过标签的class属性的属性值来获取元素对象，返回值是一个数组
		console.log(clss)
		/*
			id  只要一个
			标签  可以有多个
			class  可以有多个
		*/
	</script>
</html>

```

#### 2.2改变html元素的

| 方法                                       | 描述                   |
| :----------------------------------------- | :--------------------- |
| element.innerHTML = *new html content*     | 改变元素的 inner HTML  |
| element.attribute = *new value*            | 改变 HTML 元素的属性值 |
| element.setAttribute(*attribute*, *value*) | 改变 HTML 元素的属性值 |
| element.style.property = *new style*       | 改变 HTML 元素的样式   |

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			#goudan1 {
				color:red;
			}
		</style>
	</head>
	<body>
		<div id="div1">
			<span>嘻嘻哒</span>
		</div>
		<span class="cls1" id="goudan">剑南春</span>
		<span class="cls1" name="mt">茅台</span>
		<span class="cls1" style="color:red">习酒</span>
	</body>
	<script>
		var div1 = document.getElementById("div1");
		//div1的innerHTML  div1所内容（包含html标签）
		//标签的对象.innerHTML  是关乎标签元素里面的内容的
		console.log(div1.innerHTML)//单纯的打印
		console.log(div1.innerText)
		div1.innerHTML = "<p>狗蛋</p>"//在对div内容进行赋值
		console.log(div1.innerText)//狗蛋  
		//innerHTML 和innerText  区别   
		/*
			innertHTML  获取标签里面扥内容的包含了html标签
			innerText  获取标签里面扥内容的 不包含html标签
		*/
	   var spans = document.getElementsByClassName("cls1");
	   console.log(spans[0].innerHTML)
	   console.log(spans[1].innerHTML)
		console.log(spans[2].innerHTML)
		
		//注意事项:z在使用属性innerHTML的时候一定是单个对象元素调用的，不是数组！！！
		
		//获取元素的属性值
		console.log(spans[0].id)
		//改变元素的id属性的值
		spans[0].id = "goudan1"
		
		//改变元素的属性值  使用这个方法可以改变元素对象的属性
		spans[1].setAttribute("name", "heheda")
		
		//改变html标签样式
		//首先找到span标签对象
		//style样式的意思
		spans[2].style.color = "green";
		//设置字体的大小，通过css来设置  font-size
		//这个属性不是font-size  是fontSize  在js中通所有的css样式都变成了小驼峰的命名规则
		//例如  css  backgroound-color   js style属性 backgroundColor
		spans[2].style.fontSize = "50px";
		spans[2].style.fontWeight = "bold"
	</script>
</html>

```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<div class="div1">
			<span>马驰❤浩然</span>
		</div>
		<span class="cls1">飞天</span>
		<span class="cls1">梦之蓝</span>
		<span class="cls1">散酒</span>
		<span class="cls1">杜康</span>
		<button onclick="divChange()">点一下有惊喜哦</button>
		<button onclick="clsChange()">点一下</button>
	</body>
	<script>
		//点击上面的按钮 修改div 里面的内容，随便修改一句话
		function divChange() {
			var divs = document.getElementsByClassName("div1")//返回是一个数组
			console.log(divs[0])
			//对元素的那内容进行修改
			divs[0].innerHTML = "樯橹灰飞烟灭"
			
		}
		//点第二个按钮的时候上面span标签的内文字变成红色 字体大小50px 加粗字体
		function clsChange () {
			var spans = document.getElementsByClassName("cls1")//是一个数组
			//就可以使用for循环进行遍历
			for(var i = 0; i < spans.length;i++) {
				spans[i].style.color = "red";
				spans[i].style.fontSize = "50px"
				spans[i].style.fontWeight = "bold"
			}
		}
		
	</script>
</html>

```

总结:

1.js获取或者改变html元素的内容【innerHTML或者innerText】

2.js获取或者改变html元素属性的属性值【setAttribute("属性", "值")】

3.js或者或者改变html元素的css的样式  style.css属性

#### 2.3可以动态的添加和删除和修改html元素

| 方法                              | 描述           |
| :-------------------------------- | :------------- |
| document.createElement(*element*) | 创建 HTML 元素 |
| document.removeChild(*element*)   | 删除 HTML 元素 |
| document.appendChild(*element*)   | 添加 HTML 元素 |
| document.replaceChild(*element*)  | 替换 HTML 元素 |

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body id="b1">
		<!-- 在body标签中创建一个div标签 -->
		<button onclick="test()">点我添加</button>
		<button onclick="test1()">点我删除</button>
		<button onclick="test2()">点我替换</button>
	</body>
	<script>
		function test () {
			//通过代码来创建标签元素
			//1.先找到在哪个元素下面去添加 先找到这个元素
			var body1 = document.getElementById("b1");
			//2.创建标签 元素对象 div  w为啥要创建一个div对象出来
			var div = document.createElement("div");
			//3.给这个div添加一些css样式
			div.style.width = "200px"
			div.style.height = "300px"
			div.style.backgroundColor = "red"
			//3.1可以对div标签加一些属性
			div.setAttribute("id", "div1")
			div.setAttribute("class", "cls")
			//4.将创建好的div对象放到body标签中
			body1.appendChild(div)
		}
		function test1() {
			var body1 = document.getElementById("b1");
			var div1 = document.getElementById("div1");
			body1.removeChild(div1)//删除一个子元素
			
			//总结：就是通过id  class找到标签，把标签变成一个js对象，然后拿对象调用属性和方法来
			//改变元素的对象的操作s
		}
		function test2(){
			var body1 = document.getElementById("b1");
			var div1 = document.getElementById("div1");
			var div2 = document.createElement("div")
			div2.style.width = "100px"
			div2.style.height = "100px"
			div2.style.backgroundColor = "pink"
			//replaceChild  第一个参数是替换的元素 第二个参数被替换的元素
			//把div1替换成div2
			body1.replaceChild(div2, div1);
		}
	</script>
</html>

```

#### 2.4事件操作

> onclick：单击事件
>
> onfoucs:获取焦点事件
>
> onblur:失去焦点事件

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		姓名:<input type="text" name="name" id="i1"/>
		<button id="btn">点我</button>
	</body>
	<script>
		var btn = document.getElementById("btn")
		//加点击事件,执行一个功能
		//btn的点击事件 当点击按钮的时候会执行后面的匿名函数
		btn.onclick = function() {
			alert("嘻嘻哒")
		}
		var input = document.getElementById("i1")
		//当鼠标放进点击input输入框的时候，获取焦点事件
		input.onfocus = function () {
			input.style.backgroundColor = "red"
		}
		//当鼠标从输入框中移出来的时候，并点击了input输入外部的区域 失去焦点
		input.onblur = function () {
			input.style.backgroundColor = "green"
		}
	</script>
</html>

```

#### 2.5扩展一个知识点：

```
关于input输入框的
div span标签可以获取里面内容 innerText 或者innerHTML，那么input输入框呢？怎么获取input输入框中你输入的内容
```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<input type="text" id="name"/>
		<input type="password" id="pwd"/>
		<button id="btn">点我获取</button>
	</body>
	<script>
		var btn = document.getElementById("btn");
		btn.onclick = function () {
			var name = document.getElementById("name")
			var pwd = document.getElementById("pwd")
			//输入框对象.value 获取输入框中的输入的值
			console.log(name.value)
			console.log(pwd.value)
		}
	</script>
</html>

```

总结：先找到对象，对象是标签对象，找到对象以后再进行操作，那些属性和方法记住就可以了

```html
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			div {
				border: solid 2px seagreen;
				width: 400px;
				height: 600px;
				background-color: skyblue;
				text-align: center;	
				border-radius: 15px;
				}
				#but1 {
					background-color:lightseagreen;
					border: none;
					border-radius: 3px;
				}
				
		</style>
	</head>
	<body>
		<div>
			<h4>玩具直升机在线预订</h4>
		
			<form>
				<table border="0" cellspacing="" cellpadding="" align="center">
					
					<tr><td>购买价格:</td>
					<td><input type="text" name="price" class="price"/></td>
					</tr>
					<tr><td>购买数量:</td>
					<td><input type="text" name="num" class="num"/></td>
					</tr>
					<tr><td>支付方式:</td>
					<td><select id="zhifu">
					<option value="1">邮政汇款</option>
					<option value="2">银行转账</option>
					<option value="3">电话汇款</option>
					<option value="4">现金支付</option>
				</select></td>
					</tr>
					<tr><td>预计总价:</td>
					<td>	<input type="text" name="" class="sum"/></td>
					</tr>
					
				</table>
				
				
				
			
				<input type="button" id="but1" value="计算查看" onclick=" dianji()"/>
			</form>
		</div>
		</body>
		<script>
			function dianji() {
				var prices = document.getElementsByClassName("price")
				console.log(prices[0].value)//获取input输入框中的值
				var nums = document.getElementsByClassName("num")
				console.log(nums[0].value)//获取input输入框中的值
				var zhifu = document.getElementById("zhifu")
				var sums = document.getElementsByClassName("sum")
				
				console.log(zhifu.value)
				switch (zhifu.value) {
					
					case "1":
					sums[0].value = prices[0].value * nums[0].value * 0.6
					break;
					case "2":
					sums[0].value = prices[0].value * nums[0].value * 0.7
					break;
					case "3":
					sums[0].value = prices[0].value * nums[0].value * 0.8
					break;
					case "4":
					sums[0].value = prices[0].value * nums[0].value * 0.9
					break;
						
				}
				
				
			}
		</script>
</html>

```

#### 2.6关于checkbox全选取消全选

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<input type="checkbox" id="qx"/>全选
		<input type="checkbox" id="qxqx"/>取消全选<br>
		<input type="checkbox" class="cls"/>篮球<br>
		<input type="checkbox" class="cls"/>足球<br>
		<input type="checkbox" class="cls"/>猫球<br>
		<input type="checkbox" class="cls"/>排球<br>
	</body>
	<script type="text/javascript">
			var quanxuan = document.getElementById("qx")
			//点击上以后有个点击事件
			var checkAll = document.getElementsByClassName("cls");//数组
			var quxiao = document.getElementById("qxqx")
			quanxuan.onclick = function () {
				for (var i = 0; i < checkAll.length; i++) {
					//checkbox 有个属性叫 checked 这值为true的话，就勾选，这个值为false就不勾选s
					checkAll[i].checked = true
				}
				quxiao.checked = false
			}
			
			quxiao.onclick = function () {
				for (var i = 0; i < checkAll.length; i++) {
					//checkbox 有个属性叫 checked 这值为true的话，就勾选，这个值为false就不勾选s
					checkAll[i].checked = false
				}
				quanxuan.checked = false
			}
			//遍历每一个的checkebox的状态 只要勾选一个 取消全选和全选按钮不能被勾选
			for (var j = 0; j < checkAll.length; j++) {
				checkAll[j].onclick = function () {
					
					quanxuan.checked = false
					quxiao.checked = false
				}
			}
	</script>
</html>

```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<input type="checkbox" id="quanxuan">全选<br>
		
		<input type="checkbox" class="cls" >抽烟<br>
		<input type="checkbox" class="cls">喝酒<br>
		<input type="checkbox" class="cls">烫头<br>
		<input type="checkbox" class="cls">烫头<br>
		
		
	</body>
	<script>
		var quanxuan = document.getElementById("quanxuan")//元素
		console.log(quanxuan.checked)
		var allBox = document.getElementsByClassName("cls")//数组
		quanxuan.onclick = function () {
			if (quanxuan.checked) {
				for (var i = 0; i < allBox.length; i++) {
					//每一个checkbox这个对象都有一个属性叫checked
					
					allBox[i].checked = true
				}
			} else {
				for (var i = 0; i < allBox.length; i++) {
					//每一个checkbox这个对象都有一个属性叫checked
					
					allBox[i].checked = false
				}
			
			
		}
		
		
	</script>
</html>
```

### 3.BOM

> 浏览器对象模型  Browser  Object Model
>
> 封装了一个全局的对象window

#### 3.1window.location 对象可用于获取当前页面地址（URL）并把浏览器重定向到新页面。

*window.location* 对象可不带 window 前缀书写。

一些例子：

- window.location.href 返回当前页面的 href (URL)

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<button onclick="test()">点我跳转</button>
	</body>
	<script>
		function test() {
			//window.location.href = "http://www.baidu.com"
			window.location.href = "7练习.html"
		}
	</script>
</html>

```

#### 3.2**JavaScript 有三种类型的弹出框：警告框、确认框和提示框**

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<button onclick="test1()">警告框</button>
		<button onclick="test2()">确认框</button>
		<button onclick="test3()">提示框</button>
	</body>
	<script>
		function test1 () {
			//window可以省略的
			window.alert("呵呵哒")//警告框
		}
		function test2 () {
			var ret = confirm("你是单身狗吗?")//确认框
			console.log(ret)
			if (ret) {
				document.write("那单身的感觉很好的")
			} else {
				document.write("有个女朋友真好")
			}
		}
		function test3() {
			var ret = prompt("请问你口袋里面有多少钱")//提示框
			console.log(ret)//提示框中输入的一个值
			if (ret>10) {
				alert("土豪")
			} else{
				alert("穷")
			}
		}
	</script>
</html>

```



### 4.练习表单验证

> 原生的js来写

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- 
		 onsubmit="return inputConfirm()"
		 当return是一个false的话，咱们的数据是提交不到action后面的地址的
		 当return 是一个true的话，才会提交到咱们action地址里面
		 -->
		<form action="10弹框效果.html" onsubmit="return inputConfirm()">
			姓名:<input type="text" name="user" id="nid" onfocus="clearAttr()"/>
			<span id="nameAttr" class="attr"></span>
			<br>
			
			手机号码:<input type="text" name="phone" id="tid" onfocus="clearAttr()"/>
			<span id="phoneAttr" class="attr"></span><br>
			<input type="submit" value="注册"/>
			
		</form>
		
	</body>
	<script>
		function inputConfirm () {
			var nameInput = document.getElementById("nid")
			var telInput = document.getElementById("tid")
			//获取input输入框中数据
			var name = nameInput.value
			//判断名字是否合法
			if (name == null || name == "") {
				//name 不合法
				var span = document.getElementById("nameAttr")
				span.innerHTML = "名字不能为空"
				span.style.color = "red"
				//不合法就不能带着数据跳转到另外一个页面
				return false;
			}
			//判断手机号码
			var tel = telInput.value
			if (tel == null || tel == "") {
				//手机号码不合法
				var span = document.getElementById("phoneAttr")
				span.innerHTML = "手机号码不能为空"
				span.style.color = "red"
				//不合法就不能带着数据跳转到另外一个页面
				return false;
			}
			//手机号码不合法的验证
			var reg = /^1[3456789]\d{9}$/
			if (!reg.test(tel)) {
				//手机号码不合法的情况
				var span = document.getElementById("phoneAttr")
				span.innerHTML = "手机号码不合法"
				span.style.color = "red"
				//不合法就不能带着数据跳转到另外一个页面
				return false;
			}
			return true;
		}
		function clearAttr() {
			var spans = document.getElementsByClassName("attr")
			for (var i = 0;i < spans.length;i++) {
				spans[i].innerHTML = ""
			}
		}
	</script>
</html>

```

今天作业：允许百度 原生的js写购物车功能

https://www.jb51.net/article/224906.html





