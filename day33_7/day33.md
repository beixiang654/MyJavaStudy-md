



### 今天的内容

> Html

### 1.什么是浏览器

> 浏览器是咱们学前端开发必要的一个运行工具，写完前端的代码以后，把代码运行起来，靠浏览器
>
> 浏览器就是显示网站的一个工具
>
> 谷歌  火狐     （开发也要用的，因为有代码的调试功能）如果你们现在电脑没有谷歌（我用的）或者火狐下载一个
>
> 夸克  UC  360  ie  猎豹 欧朋  等
>
> 见过网站不？见过的，但是一个网站有什么组成的啊？
>
> 一个网站由三部分组成:  html   css   javaScript
>
> html:是架子  
>
> css:对这个架子进行修饰的
>
> JavaScript:对架子加一些动态的效果的

### 2.什么是html

> 超文本标记语言（Hyper text markup language）
>
> 不是一门编程语言。所见即所得
>
> runoob.com  可以来学习咱们的前端知识
>
> 两种模式:
>
> ​	B/S:
>
> ​		B： Browser  浏览器的意思
>
> ​		S:   Server   服务器的意思
>
> ​		浏览器服务器模式
>
> ​			1.安装一个浏览器，浏览器输入网址，浏览器打开网址，这叫浏览器服务器模式  比如 网页版的扣扣
>
> ​	C/S：
>
> ​		C: Client  客户端
>
> ​		S： Server 服务器
>
> ​		客户端服务器模式
>
> ​			1.安装装一个软件淘宝客户端，手机上面的使用客户端打开，然后这叫客户端服务器模式 电脑上面安装一个扣扣软件

### 3.html语法格式

```
标签：是组成html最小的基本单位
语法格式：
	双边标签：<开始标签名字 属性1="属性值1" 属性2="属性值2">内容</结束标签名字>
	单边标签：<标签名字/>
	记标签的功能：
		marquee  滚动标签  双边标签
		hr   分割线标签  单边标签
```

现在得安装一个开发工具  HbuilderX  这个工具是前端开发神器

```html
<marquee direction="right" scrollamount="80">天太困了，昨天四点半睡得所见即所得</marquee>
<hr/>
```

以上的代码不和规范！！！

#### 3.1结构标签

> 咱们在写网站的时候，都要加上结构标签，以显示结构
>
> 重要，固定结构

```html
<html>
	<!-- 这个是html注释  快捷键  Ctrl+ ? -->
	<!-- head标签是头标签，在网页中不显示的，只在浏览器的头部显示 -->
	<head>
		<!--  meta标签是单边标签  为了设置咱们当前也页面的编码格式的  utf-8-->
		<meta charset="utf-8"/>
		<!-- title标签是双边标签内容会显示在浏览器的头部 -->
		<title>百度一下,你就知道了</title>
	</head>
	<!-- body标签是网页的身体 网页的内容 -->
	<BODY>
		所见即所得
		<marquee>滚犊子，接着滚吧</marquee>
	</body>
	<!-- 注意事项：
		1.html标签都是<>括起来的
		2.html双边标签和单边标签
		3.html标签不区分大小写
		4.标签是可以加属性的
		5.标签之间是可以相互嵌套的，但是一定要注意缩进，在一个标签中写子标签，子标签要缩进一格
	 -->
</html>
```

练习结构标签

#### 3.2排版标签

> 1.换行标签  <br/>
>
> 2.分割线标签  <hr/>
>
> 3.段落标签<p></p>

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>排版标签</title>
	</head>
	<body>
		<!-- h换行标签 -->
		锄禾日当午<br> 
		悍然二百五
		<!-- 分割线标签 -->
		<hr />
		和并行数据和集合就不会叫沙河街
		<!-- 段与段之间是有留白的 -->
		<p>不喝酒好潇洒三年级哪些技能</p>
		<p>进行数据加你叫你说得对d</p>
		<p>你进行洒金你就快捷键生产就是</p>
	</body>
</html>

```

#### 3.3文本标签

> h1~h6标签    标题标签
>
> font  标签  双边标签  字体标签

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- h1~h6都是双边的标签  标题标签  word 文档里面也有标题-->
		烤羊排
		<h1>烤羊排</h1>
		<h2>烤羊排</h2>
		<h3>烤羊排</h3>
		<h4>烤羊排</h4>
		<h5>烤羊排</h5>
		<h6>烤羊排</h6>
		黄河大鲤鱼
		<!-- font标签可以加属性，如果不加属性的话相当于没写 
			size: 设置字体大小的取值范围 1-7
			color:设置字体颜色  颜色值可以使用英文单词
			face:设置字体的样式   属性值  楷体  宋体  微软雅黑
			-->
		<font size="7" color="pink" face="微软雅黑">黄河大鲤鱼</font>
	</body>
</html>

```

#### 3.4列表标签

> 1.无序列表
>
> ```
> <ul>
> 	<li></li>
> </ul>
> ```
>
> ul标签有一些属性：
>
> 	type 属性值：
> 			circle 显示空心的圆
> 			disc  实心的圆 默认的
> 			square  实心方块
>
>
> ​	

> 2.有序列表
>
> ```
> <ol>
> 	<li></li>
> </ol>
> ```
>
> ol的属性
> 			type:  控制要有序列表类型的
> 			属性值: 1  i  I   a  A
> 			start:  设置从哪个值开始  顺序往下排
> 			属性值是一个数字

> 3.自定义列表【不用】
>
> ```
> <dl>
> 	<dt></dt>
> 	<dd></dd>
> </dl>
> ```
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
		<!-- 无序列表 
		type 属性值：
			circle 显示空心的圆
			disc  实心的圆 默认的
			square  实心方块
		-->
		<ul type="square">
			<li>牛二</li>
			<li>红星</li>
			<li>茅台</li>
		</ul>
		<!-- 有序列表
		 ol的属性
			type:  控制要有序列表类型的
			属性值: 1  i  I   a  A
			start:  设置从哪个值开始  顺序往下排
			属性值是一个数字
		 -->
		<ol type="I" start="3">
			<li>郑州</li>
			<li>洛阳</li>
			<li>开封</li>
		</ol>
		<!-- 自定义列表 -->
		<dl>
			<dt>茶</dt>
			<dd>毛尖</dd>
			<dd>碧螺春</dd>
			<dd>大红袍</dd>
		</dl>
	</body>
</html>

```

按照英文单词来记

```
ul: unorder list    无序列表
ol: order list   有序列表
li: list  列表
dl: define list  自定义列表
dt: define title  自定义标题
dd: define description  
```

#### 3.5块标签和行标签【重要】

> 没有实际的意义，但是会结合以后讲的css和js来使用
>
> div标签  块标签
>
> span  行标签
>
> footer 块标签
>
> header 块标签
>
> 没有实际效果演示，但是控制行和块的

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- 块级标签 被修饰的内容单独成一行 -->
		<div>云台山</div>
		<div>伏羲山</div>
		<div>老君山</div>
		<!-- 行级标签  被的内容在一行显示 -->
		<span>哈啤</span>
		<span>青岛</span>
		<span>纯生</span>
		<!-- 块级标签 -->
		<footer>红旗渠</footer>
		<footer>中南海</footer>
		<header>帝豪</header>
		<header>散花</header>
		
	</body>
</html>

```

后面结合css和js一起使用  重要

#### 3.6图片标签

> 可以在网站中显示图片的
>
> ## 图像标签（<img>）和源属性（Src）
>
> ​	<img> 是空标签，意思是说，它只包含属性，并且没有闭合标签。
>
> 要在页面上显示图像，你需要使用源属性（src）。src 指 "source"。源属性的值是图像的 URL 地址。
>
> 定义图像的语法是：
>
> ```
> <img src="url" />
> ```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- 图片标签在运行代码的时候  不要使用Hbuild的运行按钮 用本地运行-->
		<!-- img标签有属性
			src属性：source  资源  属性值是图片的资源
			width属性: s设置图片的宽度  如果只设置这一个  宽和高会原图上面等比缩放
			height 属性:设置图片得到高度  
			 width和height 在设置的时候，如果两个值都设置的话 会原图的基础上变形
			 一般只设置一个属性
			 alt属性：对当前图片的描述，只有图片加载失败的时候才进行描述
			 title属性：当鼠标移动上去后，鼠标的下面会显示属性值
		 -->
		 <!-- 相对路径 -->
		<img src="../../2.jpeg" width="100px" height="300px" alt="一个人" title="美吗？"/>
		<!-- 绝对路径 -->
		<!-- <img src="C:\Users\wangbo\Desktop\zz2204\day29\2.jpeg" /> -->
		<!-- 网路上的图片地址 -->
		<!-- <img src="https://img2.baidu.com/it/u=1035642524,295393204&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=470" />
	 -->
	</body>
</html>

```

#### 3.7超链接标签

> 超链接可以是一个字，一个词，或者一组词，也可以是一幅图像，您可以点击这些内容来跳转到新的文档或者当前文档中的某个部分。
>
> 当您把鼠标指针移动到网页中的某个链接上时，箭头会变为一只小手。
>
> 我们通过使用 <a> 标签在 HTML 中创建链接。

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- 
		 通过使用 href 属性 - 创建指向另一个文档的链接
		 使用 Target 属性，你可以定义被链接的文档在何处显示
		 target属性用的多不多？多 为啥多 用户的体验是非常好的s
			属性值  _blank  会重新开一个页面
		 -->
		<a href="1入门.html">点我到入门</a>
		<a href="http://www.baidu.com" target="_blank">点我到百度</a>
	</body>
</html>

```

自己百度一个东西  基于a标签的锚点功能（在同一个页面中，点击一个a标签可以跳转到想去的地方）

#### 3.8表格标签

> 表格由 <table> 标签来定义。每个表格均有若干行（由 <tr> 标签定义），每行被分割为若干单元格（由 <td> 标签定义）。字母 td 指表格数据（table data），即数据单元格的内容。数据单元格可以包含文本、图片、列表、段落、表单、水平线、表格等等。

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- 类似于咱们的excel
			一个tr代表一行
			一个td代表一列
			注意：先有行后有列！！！  在行中写列
		 -->
		 <!-- 如果不定义边框属性，表格将不显示边框。
		 有时这很有用，但是大多数时候，我们希望显示边框 
		 table标签的属性
			border属性：设置边框的宽度的
			width属性：设置表格宽度的
			height属性：设置给表格的高度的
			align属性：对齐方式 （左对齐left，右对齐right，居中显示center）
			bordercolor属性：设置边框颜色的
			-->
		<table border="8" width="300px" align="center" bordercolor="red">
			
			<!-- 表头 -->
			<caption>成绩单</caption>
			<tr>
				<!-- th和td一样也是列，但是比td字体加粗了，颜色重了 -->
				<th>语文</th>
				<th>数学</th>
				<th>英语</th>
			</tr>
			<!-- tr的属性
				align：对齐方式  对当前文本进行居中显示的 left  right  center
			 -->
			<tr align="center">
				<!-- td的属性 偏难
					rowspan:行合并
					colspan:列合并
				 -->
				<td colspan="2">1</td>
				
				<td>3</td>
			</tr>
			<tr align="center">
				<td rowspan="2">4</td>
				<td>5</td>
				<td>6</td>
			</tr>
			<tr align="center">
				
				<td>8</td>
				<td>9</td>
			</tr>
		</table>
	</body>
</html>

```

#### 3.9文本话格式标签

> b   定义加粗的字体
>
> big 定义大号字体
>
> em  定义斜体
>
> i   定义斜体
>
> samll 定义小号字体
>
> strong 加重字体
>
> sub  定义下标字体
>
> sup  定义上标
>
> ins 定义的插入字体
>
> del  定义删除字体

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		今天太冷了<b>今天太冷了</b>
		<big>今天太冷了</big>
		<!-- 即变粗又变大 -->
		<b><big>今天太冷了</big></b>
		<em>今天太冷了</em>
		<i>今天太冷了</i>
		<strong>今天太冷了</strong>
		2<sup>3</sup>
		2<sub>4</sub>
		<ins>今天太冷了</ins>
		<del>今天太冷了</del>
	</body>
</html>

```

#### 3.10字符实体

> 在 HTML 中，某些字符是预留的。
>
> 在 HTML 中不能使用小于号（<）和大于号（>），这是因为浏览器会误认为它们是标签。
>
> 如果希望正确地显示预留字符，我们必须在 HTML 源代码中使用字符实体（character entities）

| 显示结果 | 描述              | 实体名称          | 实体编号 |
| :------- | :---------------- | :---------------- | :------- |
|          | 空格              | &nbsp;            | &#160;   |
| <        | 小于号            | &lt;              | &#60;    |
| >        | 大于号            | &gt;              | &#62;    |
| &        | 和号              | &amp;             | &#38;    |
| "        | 引号              | &quot;            | &#34;    |
| '        | 撇号              | &apos; (IE不支持) | &#39;    |
| ￠       | 分（cent）        | &cent;            | &#162;   |
| £        | 镑（pound）       | &pound;           | &#163;   |
| ¥        | 元（yen）         | &yen;             | &#165;   |
| €        | 欧元（euro）      | &euro;            | &#8364;  |
| §        | 小节              | &sect;            | &#167;   |
| ©        | 版权（copyright） | &copy;            | &#169;   |
| ®        | 注册商标          | &reg;             | &#174;   |
| ™        | 商标              | &trade;           | &#8482;  |
| ×        | 乘号              | &times;           | &#215;   |
| ÷        | 除号              | &divide;          | &#247;   |

字符实体不需要记，查手册即可吗，但是空格，> <  得记住

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		狗蛋  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   浩然
		&lt;&lt;金瓶梅&gt;&gt;
	</body>
</html>

```

#### 3.11使用上面的基本标签写一个综合案例

![h1](\h1.png)

从上往下布，从左向右布

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- 顶部的头   -->
		<div>
			<table width="100%">
				<tr>
					<td width="22%">浩然传媒-稀有面授网站</td>
					<td width="46%"></td>
					<td width="32%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;浩然性感特训营 &nbsp;&nbsp;&nbsp; 精品扣丁&nbsp;&nbsp;&nbsp; 联系浩然 &nbsp;&nbsp;&nbsp;加入收藏</td>
				</tr>
			</table>
		</div>
		<!-- 第二行的数据  两张图片 -->
		<div>
			<table width="100%">
				<tr>
					<td width="15%">
						<img src="http://www.mobiletrain.org/images/index/new_logo.png?t=5.28ssss"/>
					</td>
					<td width="65%"></td>
					<td>
						<img src="http://www.mobiletrain.org/images/index/nav_r_ico.png" >
					</td>
				</tr>
			</table>
		</div>
		<!-- 分割线 -->
		<hr />
		<!-- 分割线中间的东西 -->
		<div align="center">
				<span>&nbsp;&nbsp;首页&nbsp;&nbsp;</span>
				<span>&nbsp;&nbsp;课程培训&nbsp;&nbsp;</span>
				<span>&nbsp;&nbsp;教学保障&nbsp;&nbsp;</span>
				<span>&nbsp;&nbsp;免费视频&nbsp;&nbsp;</span>
				<span>&nbsp;&nbsp;公开课&nbsp;&nbsp;</span>
				<span>&nbsp;&nbsp;企业合作&nbsp;&nbsp;</span>
				<span>&nbsp;&nbsp;就业喜报&nbsp;&nbsp;</span>
				<span>&nbsp;&nbsp;学员天地&nbsp;&nbsp;</span>
				<span>&nbsp;&nbsp;关于千锋&nbsp;&nbsp;</span>
		</div>
		<!-- 分割线 -->
		<hr />
		<div align="right">
			首页&gt;课程培训&gt;JavaEE列表
		</div>
		<div>
			<h2>课程培训</h2>
			<h4>共67中课程</h4>
			<hr />
		</div>
		<!-- 分割图片 -->
		<div >
			<img src="./综合案例素材/001.png" width="100%"/>
		</div>
		<!-- 接下来放图片 表格两行五列 -->
		<div>
			<table width="100%">
				<tr>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/002.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>
								
							
						</div>
					</td>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/003.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>
								
							
						</div>
					</td>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/004.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>
								
							
						</div>
					</td>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/005.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>
								
							
						</div>
					</td>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/006.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>
								
							
						</div>
					</td>
				</tr>
				<tr>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/007.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>
								
							
						</div>
					</td>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/008.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>
								
							
						</div>
					</td>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/009.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>
								
							
						</div>
					</td>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/010.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>
								
							
						</div>
					</td>
					<td width="20%" align="center">
						<div >
							<img src="综合案例素材/011.png"/>
							<div>书名:xx</div>
							<div >售价:xx</div>						
							
						</div>
					</td>
				</tr>
			</table>
		</div>
		<div >
			<img src="./综合案例素材/012.png" width="100%"/>
		</div>
	</body>
</html>

```

作业：

```

1.书旗小说
照着人家网站布
```

