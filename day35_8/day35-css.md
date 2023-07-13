### 回顾

```
1.Html
前端的知识点，就是可以在浏览器上面显示出来的网页
所见所所得，你写啥就会在浏览器显示啥
1.1结构标签
<html>
	<head></head>
	<body></body>
</html>
1.2排版标签
	<br>
	<hr>
	<p></p>  段落标签
1.2文本标签
	h1~h6  类似于咱们的word文档中的标题
	font 字体标签 可以加属性
1.3列表标签
	ul  无序列表 子标签  li  必须结合使用才能实现效果
	ol   有序列表  子标签 li
	dl  自定义标签 子标签  dt  dd
1.4块标签 行标签 结合css和js使用
	div 块标签
	span 行标签
1.5图片标签
	img  有几个重要的属性 得记
1.6超链接标签
a
1.7表格标签
	table  子标签 tr   子标签 td
1.8文本格式化标签
	i
	b
	del
	ins
	sub
	sup
1.9字符实体
	&gt;    &lt;  &nbsp;
	
1.10表单标签
form  几个属性  action   method
子标签  input 很多属性  text   password  file hidden  submit  reset radio  checkbox 等‘
下拉列表 select 
文本框  textarea
1.11html框架
	framset
	frmae
```

### 今天的内容

### 1.CSS

> 一个页面由html    CSS  JS 组成的
>
> html标签已经学过了，那么对架子进行修饰，靠CSS来化妆
>
> 先有标签，然后通过css进行化妆
>
> Cascading Style Sheet   层叠样式表
>
> 

#### 1.1CSS三种引入方式

> 三种引入方式的目的:   找到标签之后，对标签进行修饰
>
> 1.css行内样式
>
> 2.css内联样式
>
> 3.css外联样式

入门案例:

```

```



##### 1.1.1css行内样式

> 每个标签都一个style属性  找到标签对其进行样式的修饰。在style属性值中去写css语法格式

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<!-- 行内样式
			html里面任何一个标签都有公共的属性叫style
			在style属性的后面写css的语法格式就行了
			css语法格式:
				属性:属性值;属性1:属性值1;属性2:属性值2;
				width:200px;height: 200px;background-color: red;
				宽200px 高200px 背景颜色  red
		 -->
		<div style="border:10px solid blue;width:200px;height: 200px;background-color: red;">
			铁马冰河入梦来
		</div>
		<!-- border: 10px solid yellow;
			简写的情况 属性:属性值1 属性值2  属性值3;
		 -->
		<div style="border: 10px solid yellow;">嘻嘻哒</div>
	
	</body>
</html>

```

##### 1.1.2css内联样式【内部CSS】

> 在head标签中，书写一个标签 style 标签双边的，里面去写css的语法格式即可

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<!-- 内联样式
		 在head标签中书写 style标签 双边标签
		 在style标签去写css语法格式
		 -->
		 <style>
			 /* 这个是css的注释和html注释不一样  快捷键ctrl +?
			  div  因为我要找到div 对其进行修饰化妆
			  后面跟的是一个大括号 ，大括号里面放的是 css‘
				语法格式
			  */
			 div {
				 width: 200px;
				 height: 200px;
				 background-color: orange;
			 }
			 span {
				 /* color属性 对文字进行颜色修饰的 */
				 color: green;
				 background-color: tomato;
			 }
		 </style>
	</head>
	<body>
		<div>无边落木萧萧下,不尽长江滚滚来</div>
		<div>南航真的是贱气啷当的</div>
		<span>小的时候，不把他当人，大了以后也做不了人。说的是南航</span>
	</body>
</html>

```

##### 1.1.3CSS外联样式【外部CSS】

> 在外部写一个css文件，然后引入到当前的httml页面中

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<!-- 外联的引入方式
			在外部写一个css文件 后缀是.css结尾的
			将外部的css文件引入到咱们的当前的html页面中
			在head标签中，写一个标签link标签
			需要以下几个属性:
				href:外部的css文件路径
				rel：连接文件的类型（stylesheet）样式表 告知浏览器当前是一个样式表
				type:属性可以省略 css文件类型
		 -->
			<link href="test.css" rel="stylesheet" type="text/css"/>
	</head>
	<body>
		<div>自挂东南枝，说的是浩然</div>
	</body>
</html>

```

以上的三种都得会！！！因为不知道css写在哪

扩展：颜色表示形式

```
因为需要加颜色 对背景  对文字
1.html给咱们提供了 140英文单词  没有必要记
2.rgb 值不用
3.十六进制的颜色的表示形式【重点】
	#rrggbb  三原色  世界上的任何颜色都是这三种组成的
	其中 rr（红色）、gg（绿色）和 bb（蓝色）是介于 00 和 ff 之间的十六进制值（与十进制 0-255 相同）。

例如，#ff0000 显示为红色，因为红色设置为最大值（ff），其他设置为最小值（00）。
 
记不住的，用吸管吸可以使用工具  Pixel Pick 点击那个吸管  点上颜色之后下面会显示十六机制的颜色直接复制即可，不要用自己眼睛观察来调色。因为是不准的

不要想着自己去记颜色，太多了记不住的用工具吸
```

### 2.CSS 选择器【重点】

> 目的：为了找到这个标签  然后对标签进行修饰的
>
> 1.标签选择器
>
> 2.class选择器
>
> 3.id选择器
>
> 4.层级选择器
>
> 5.组合选择器
>
> 6.通配选择器
> 7.伪类选择器

#### 2.1标签选择器

> 通过标签的名字来找到被修饰的标签的

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			/* 内联样式 */
			/* 标签选择器 :通过标签的名字来找到标签进行修饰的*/
			span {
				color: #FF6347;
			}
			div {
				color: #FFA500;
			}
			/* 标签选择器有个不好的地方， 当相同的标签没法改颜色的 */
		</style>
	</head>
	<body>
		<span>马驰行千里吃肉,浩然行千里吃马驰</span>
		<span>借问酒家何处</span>
		<div>一骑红尘妃子笑</div>
	</body>
</html>

```

#### 2.2class选择器

> html每一个标签都有class属性，可以写class属性的

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			/* 通过class的属性值来找到当前的标签 
			class选择器的语法格式:
				.class属性值
			*/	
			.sb {
				color: aqua;
			}
			.libai {
				color:red;
			}
			.wb {
				color: aquamarine;
			}
		</style>
	</head>
	<body>
		<!-- 每个标签都有一个class属性  属性值可以随便写 -->
		<div class="sb">大漠孤烟直</div>
		<div class="libai">飞流之下</div>
		<!-- class属性值可以有多个  中间用空格隔开  使用任意的一个值都可以找到标签进行修饰的-->
		<div class="wb xixi dada">一个青春阳光的男孩</div>
	</body>
</html>

```

#### 2.3id选择器

> 任意一个标签都有一个id属性，
>
> 通过id来找到当前标签进行修饰

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			/* id选择器 使用#号后面跟id属性值 */
			#wb {
				color: #008000;
			}
		</style>
	</head>
	<body>
		<!-- 在真实开发的时候 id的值是唯一的！！！ -->
		<div id="wb">落霞与孤鹜齐飞</div>
		<div id="wb">秋水功能国产</div>
	</body>
</html>

```

#### 2.4层级选择器

> 如果标签有嵌套，可以一层一层的往下找子标签

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			/* 层级选择器 
				一层一层的往下找
				中间用空格隔开
			*/
			#div1 .hr div {
				color: darkred;
			}
			#div1 .machi div {
				color: #00FFFF;
			}
		</style>
	</head>
	<body>
		<div id="div1">
			<div class="hr">
				<div>
					仰天大笑出门去,浩然是个小逗比
				</div>
			</div>
			<div class="machi">
				<div>风萧萧兮易水寒,马驰没有穿裤衩</div>
			</div>
		</div>
	</body>
</html>

```

#### 2.5组合选择器

> 当很多标签需要使用同一个css样式修饰的时候可以使用组合选择器

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			/* 组合选择器
			 当下面需要同一个样式的时候可以使用组合选择器
			 组合选择器用的是逗号，
			 */
			#sm, .yt, p , footer {
				color: green;
			}
		</style>
	</head>
	<body>
		<div id="sm">众里寻他千百度,世铭却在化粪池</div>
		
		<span class="yt">不教胡马度阴山,殷彤开车撞大山</span>
		<p>桃花坞里桃花庵,马驰没有女对象</p>
		<footer>落霞与孤鹜齐飞,全飞经常去洗浴</footer>
	</body>
</html>

```

#### 2.6通配选择器

```
*  代表所有的标签

```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			/* *代表通配选择器  优先级是最低的 */
			/* 验一个东西优先级的问题
			 id  > class > 标签的 > 通配
			 */
			#da {
				color: tomato;
			}
			.xixi {
				color: #00FFFF;
			}
			div {
				color: #008000;
			}
			
			* {
				color: red;
			}
		</style>
	</head>
	<body>
		<div class="xixi" id="da">嘻嘻哒</div>
		<span>呵呵哒</span>
	</body>
</html>

```

#### 2.7伪类选择器

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			
			/* 链接本身的颜色 */
			a:link {
				color:red ;
			}
			/* 链接访问过以后的颜色 */
			
			a:visited {
				color: pink;
			}
			/* 鼠标悬浮状态的设置 */
			a:hover {
				color:blue;
			}
			/* 鼠标点击以后按着不松手的状态 */
			a:active {
				color:green;
			}
			/* 注意：a:hover 必须在 CSS 定义中的 a:link 和 a:visited 之后，
			才能生效！a:active 
			必须在 CSS 定义中的 a:hover 之后才能生效！伪类名称对大小写不敏感。 */
		</style>
	</head>
	<body>
		<a href="http://www.baidu.com">滚犊子吧</a>
	</body>
</html>

```

```html

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style type="text/css">
			div {
				width: 100px;
				height: 200px;
				background-color: #008000;
			}
			div:hover {
				width: 300px;
				height: 300px;
				background-color: #FF0000;
			}
		</style>
	</head>
	<body>
		<div></div>
	</body>
</html>

```

回顾

```
1.三种引入方式
	目的为了将CSS来修饰咱们html标签
	行内样式：在标签中书写style标签属性字后去写css样式
	内联样式:在head标签中书写style标签，可以通过选择器选择某一个标签进行修饰
	外联样式:在head标签中书写link标签，在link标签使用一个属性叫href属性引入外部的css文件
2.选择器
	目的是为了找到标签，找标签的目的是为了修饰的
	1.标签选择器   直接使用标签名字来找到标签
	2.id选择器   给标签一个id和属性值  通过#属性来找到标签
	3.class选择器  给标签一个class和属性值  通过.属性值来找到标签
	4.层级选择器 空格隔开 一层一层往下找
	5.组合选择器  中间使用逗号隔开，一个样式可以修饰很多元素标签
	6.伪类选择器  a:link   a:visited   a:hover   a:active
```

回顾

```
1.form表单
	action:  跳转到的资源 
	method:  get/post
2.表单元素
	input
		属性
			type：
				text
				password
				submit
				radio
				checkbox
				button
				hidden
				email
				date
				reset
				
			name:
			value：
2.html框架
	frameset   
	frame
3.css
	对标签进行修饰的
	
4.三种引入方式
	行内:   每个标签 都有一个属性  叫style="color:red;"
	内联: 在head标签中 写style标签  通过各种选择器，找到标签 写css样式
		div {
			color:red;
		}
	外联:  外部的css文件  <link href="css路径" rel="stylesheet">
5.选择器
	目的:  找到标签
	标签选择器
	id
	clss
	层级
	组合
	通配
	伪类
```



### 3.CSS属性

> color:对文本加颜色的
>
> width:对标签设置宽度的
>
> height：对标签设置高度的
>
> background-color:设置背景颜色的
>
> 发现一个特点：见名（英语）知意，通过英语单词可以猜测属性的啥意思

#### 3.1CSS背景属性

> - background-color 设置背景颜色的
> - background-image 设置背景图片的
> -  background-repeat  设置咱们图片的平铺方式
> - background-attachment  图片的都动态效果
> - background-position 设置图片的位置

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			body {
				/* 设置背景图片   url(图片的地址)
				  默认的情况是平铺整个窗口 一张图片不够再来一张直到平铺完
				*/
				background-image: url(./002.png);
				/* 背景图片平铺的效果
				   三个值：
					no-repeat  不平铺
					repeat-x 横向平铺
					repeat-y z纵向平铺
				 */
				background-repeat: no-repeat;
				
				/* background-position 属性值: left  左边   right  右边  top顶部  bottom 底部 */
				background-position: bottom right;
				/* background-attachment
				 
					有两个属性值：
						fixed  图片相对文字是动的，相对于窗体是不动的
						scroll  图片相对是不动的，相对于窗体是动的
				 */
				background-attachment: fixed;
			}
			
		</style>
	</head>
	<body>
		<a href="http://www.baidu.com">小说</a>
		<a href="http://www.baidu.com">爱奇艺</a>
		<a href="http://www.baidu.com">书旗</a>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p><p>来上课，但是背景是黄色的哦</p><p>来上课，但是背景是黄色的哦</p><p>来上课，但是背景是黄色的哦</p><p>来上课，但是背景是黄色的哦</p>
		
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p><p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p><p>来上课，但是背景是黄色的哦</p>
		
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		
		<p>来上课，但是背景是黄色的哦</p>
		<p>来上课，但是背景是黄色的哦</p>
		
		<p>来上课，但是背景是黄色的哦</p>
		
	</body>
</html>

```

#### 3.2CSS边框属性

> border-style 属性指定要显示的边框类型。
>
> 允许以下值：
>
> - dotted - 定义点线边框
> - dashed - 定义虚线边框
> - solid - 定义实线边框【重点】
> - double - 定义双边框
> - groove - 定义 3D 坡口边框。效果取决于 border-color 值
> - ridge - 定义 3D 脊线边框。效果取决于 border-color 值
> - inset - 定义 3D inset 边框。效果取决于 border-color 值
> - outset - 定义 3D outset 边框。效果取决于 border-color 值
> - none - 定义无边框
> - hidden - 定义隐藏边框
>
> border-style 属性可以设置一到四个值（用于上边框、右边框、下边框和左边框）。

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			#div1 {
				width:300px;
				height: 300px;
				background-color: pink;
				/* border-style 属性指定要显示的边框类型。

					允许以下值：

					dotted - 定义点线边框
					dashed - 定义虚线边框
					solid - 定义实线边框【重点】
					double - 定义双边框
					groove - 定义 3D 坡口边框。效果取决于 border-color 值
					ridge - 定义 3D 脊线边框。效果取决于 border-color 值
					inset - 定义 3D inset 边框。效果取决于 border-color 值
					outset - 定义 3D outset 边框。效果取决于 border-color 值
					none - 定义无边框
					hidden - 定义隐藏边框
					border-style 属性可以设置一到四个值（用于上边框、右边框、下边框和左边框）。 */
				/* border-style: none solid double; */
				/* border-style: solid;
				/* 边框颜色 border-color 
				border-color: #0000FF;
				/* 边框的宽度 border-width 
				border-width: 10px; */
				/* 可以有简写的情况 border-style 是必须要写的！！！*/
				border: solid  10px  green;
				/* 设置圆角边框 border-radiu  可以去试一下，值越大弧度越大*/
				/* border-radius: 10px; */
				/* 左上角 */
				border-top-left-radius: 100px;
				/* 右上角 */
				border-top-right-radius: 20px;
				border-bottom-left-radius: 50px;
				border-bottom-right-radius: 30px;
			}
			
		</style>
	</head>
	<body>
		<div id="div1"></div>
	</body>
</html>

```

#### 3.3文本和字体的css属性【重点】

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			#div1 {
				width: 1000px;
				height: 100px;
				background-color: #7FFFD4;
				border: solid 3px red;
				/* 设置字体颜色 */
				color:deeppink;
				/* 设置字体的大小 */
				/* font-size: 50px; */
				/* 设置字体的样式
				  font-style  样式 
				   属性值:斜体 italic  正常字体  normal
					
				 */
				font-style: italic;
				/* 加粗字体 */
				/* font-weight: bold;
				font-family: 宋体; */
				/* 简写一种情况 */
				/* font-size 和 font-family 的值是必需的。
				如果缺少其他值之一，则会使用其默认值。 */
				font: bold  30px 楷体;
				/* 文本样式
				 文本对齐方式
				 值:左对齐(left) 右对齐(right) 居中对齐(center)
				 */
				text-align: left;
				/* 在真实开发的时候 设置行高【重要】  太牛逼了！！！
				line-height
					刚好对应着咱们div高度，那么文字就会离顶部和底部一样的高度了
				*/
			   line-height: 100px;
			   
			   /* 文本线形状 */
			   /* 
				属性值 line-through  中间线
				none  去除文本线
				overline 上划线
				underline 下划线
				*/
			   text-decoration: underline;
			   /* 文本缩进 */
			   /* em也是单位和px特别像 
			   px像素
			   em  比值 当前字体大小为30px  2em是2倍的当前字体大小  60px
			   
			   */
			   text-indent: 2em;
			}
			a {
				text-decoration: none;
			}
		</style>
		
	</head>
	<body>
		<div id="div1">身无彩凤双飞翼,超凡脱裤子放屁</div>
		<a href="#">我的淘宝</a>
	</body>
</html>

```

### 4.盒子模型【重要】

所有 HTML 元素都可以视为方框。在 CSS 中，在谈论设计和布局时，会使用术语“盒模型”或“框模型”。

CSS 框模型实质上是一个包围每个 HTML 元素的框。它包括：外边距、边框、内边距以及实际的内容。下图展示了框模型：

![boxmodel](boxmodel.gif)



```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			#div1 {
				width: 200px;
				height: 200px;
				border: 3px solid skyblue;
				background-color: yellowgreen;
				/* 内边距 */
				/* padding: 30px; */
				/* 离顶部的内边距 */
				/* padding-top: 20px;
				/* 内容离右边边框的距离 
				padding-right: 30px;
				/* 内容离下面的边框的距离 
				padding-bottom: 40px;
				/* 内容距离左边边框的距离 
				padding-left: 50px; */
				/* 简写
				 1个值：上下左右都是这个值
				 2个值:上下代表是第一个值   左右代表的是第二个值
				 3个值:第一个值代表上   第二值左右  第三个值代表下
				 4个值：上 右  下 左
				 
				 */
				padding:30px 50px 20px 40px;
			}
		</style>
	</head>
	<body>
		<div id="div1">窗含西岭千秋雪</div>
	</body>
</html>

```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			div {
				width: 200px;
				height: 200px;
				border: 3px solid red;
				background-color: burlywood;
				/* 外边距 margin */
				/* margin: 20px; */
				/* 同理和咱们讲过的内边距一模一样 */
				/* 	/* 简写
				 1个值：上下左右都是这个值
				 2个值:上下代表是第一个值   左右代表的是第二个值
				 3个值:第一个值代表上   第二值左右  第三个值代表下
				 4个值：上 右  下 左
				 
				 */ 
				margin: 20px 60px;
			}
		</style>
	</head>
	<body>
		<div>千树万树梨花开,浩然被迫菊花开</div>
	</body>
</html>

```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			/*  */
			* {
				margin: 0;
				padding: 0;
			}
			div {
				width: 200px;
				height: 200px;
				border: 3px solid red;
				background-color: burlywood;
			}
		</style>
	</head>
	<body>
		<div>浩然会不会生气呢?</div>
	</body>
</html>

```

### 5.浮动【重点】

> 可以将块标签浮动成行标签模式
>
> float属性
>
> `float` 属性用于定位和格式化内容，例如让图像向左浮动到容器中的文本那里。
>
> `float` 属性可以设置以下值之一：
>
> - left - 元素浮动到其容器的左侧
> - right - 元素浮动在其容器的右侧
> - none - 元素不会浮动（将显示在文本中刚出现的位置）。默认值。
> - inherit - 元素继承其父级的 float 值
>
> 最简单的用法是，`float` 属性可实现（报纸上）文字包围图片的效果。

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			div {
				width: 200px;
				height: 200px;
				
			}
			#div1 {
				background-color: red;
				float: left;
			}
			#div2 {
				background-color: green;
				height: 300px;
				float: left;
			}
			#div3 {
				background-color: blue;
				float: right;
			}
		</style>
	</head>
	<body>
		<!--div是块标签 换行展示了
		 上下排的
		 想排在一行 变成一个行标签
		 -->
		<div id="div1">
			
		</div>
		<div id="div2"></div>
		<div id="div3"></div>
	</body>
</html>

```

```html
<!DOCTYPE html>
<html>
<head>
<style>
img {
float: left;
}
</style>
</head>
<body>



<p><img src="002.png" alt="W3School" style="width:170px;height:170px;margin-left:15px;">
领先的 Web 技术教程 - 全部免费。在 W3School，你可以找到你所需要的所有的网站建设教程。从基础的 HTML 到 CSS，乃至进阶的 XML、SQL、JS、PHP。
我们的参考手册涵盖了网站技术的方方面面。其中包括W3C标准技术：HTML、CSS、XML 。以及其他技术，诸如 JavaScript、PHP、SQL 等。
在 W3School，我们提供上千个实例。通过使用我们的在线编辑器，你可以编辑这些例子，并对代码进行实验。在 W3School，我们提供上千个实例。通过使用我们的在线编辑器，你可以编辑这些例子，并对代码进行实验
在 W3School，我们提供上千个实例。通过使用我们的在线编辑器，你可以编辑这些例子，并对代码进行实验
在 W3School，我们提供上千个实例。通过使用我们的在线编辑器，你可以编辑这些例子，并对代码进行实验
在 W3School，我们提供上千个实例。通过使用我们的在线编辑器，你可以编辑这些例子，并对代码进行实验</p>

</body>
</html>
```

清除浮动

> 将行元素变成块元素
>
> 另起一行写
>
> clear 属性指定哪些元素可以浮动于被清除元素的旁边以及哪一侧。
>
> clear 属性可设置以下值之一：
>
> - none - 允许两侧都有浮动元素。默认值
> - left - 左侧不允许浮动元素  左侧不允许有浮动元素  再另起一行即可
> - right- 右侧不允许浮动元素
> - both - 左侧或右侧均不允许浮动元素
> - inherit - 元素继承其父级的 clear 值

```html
<!DOCTYPE html>
<html>
<head>
<style>
.div1 {
  float: left;
  width: 100px;
  height: 50px;
  margin: 10px;
  border: 3px solid #73AD21;
}

.div2 {
  border: 1px solid red;
}

.div3 {
  float: left;
  width: 100px;
  height: 50px;
  margin: 10px;
  border: 3px solid #73AD21;
}

.div4 {
  border: 1px solid red;
  /* div4左侧或右侧均不允许浮动元素 */
  clear: both;
}
</style>
</head>
<body>

<h1>不使用 clear</h1>
<div class="div1">div1</div>
<div class="div2">div2 - 请注意，在 HTML 代码中 div2 在 div1 之后。不过，由于 div1 向左浮动，div2 中的文本会流动到 div1 周围。</div>
<br><br>

<h1>使用 clear</h1>
<div class="div3">div3</div>
<div class="div4">div4 - 在此处，clear: left; 把 div4 移动到浮动的 div3 下方。值 "left" 会清除向左浮动的元素。您也可以清除 "right" 和 "both"。</div>

</body>
</html>

```

浮动的目的：将块标签变成行标签

清除浮动:both  将行标签变成块标签 另起一行

### 6.定位

#### 6.1css属性定位

> 固定定位
>
> 相对定位
>
> 绝对定位

##### 6.1.1固定定位

> `position: fixed;` 的元素是相对于视口定位的，这意味着即使滚动页面，它也始终位于同一位置。 top、right、bottom 和 left 属性用于定位此元素。
>
> 固定定位的元素不会在页面中通常应放置的位置上留出空隙。

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			div {
				width: 200px;
				height: 200px;
				background-color:blue;
			}
			#div1 {
				background-color: pink;
				height: 200px;
				color: green;
				/* 固定定位 */
				position: fixed;
				bottom: 20px;
				right: 20px;
			}
		</style>
	</head>
	<body>
		<div id="div1">
			世达 男 爱好男，现诚招一名男生共度余生。。。<br />
			&nbsp;&nbsp;&nbsp;&nbsp;留言板:<br />
			&nbsp;&nbsp;&nbsp;&nbsp;邱博:达达你好帅啊！！！<br />
			&nbsp;&nbsp;&nbsp;&nbsp;世齐:祝你们性福！！！<br />
			&nbsp;&nbsp;&nbsp;&nbsp;豪哥:你就这样把我抛弃了？？？
					</div>
		<div></div>
		<div></div>
		<div></div>
		<div></div>
		<div></div>
		<div></div>
		<div></div>
		<div></div>
		<div></div>
		<div></div>
		<div></div>
		<div></div>
		<div></div><div></div>
		<div></div>
		<div></div>
		<div></div>
		
		<div></div>
		<div></div>
		<div></div><div></div>
		
	</body>
</html>

```

##### 6.1.2相对定位

> ## position: relative;
>
> `position: relative;` 的元素相对于其正常位置进行定位。
>
> 设置相对定位的元素的 top、right、bottom 和 left 属性将导致其偏离其正常位置进行调整。不会对其余内容进行调整来适应元素留下的任何空间。

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			div {
				width: 100px;
				height: 100px;
				background-color:blue;
				/* 相对定位 原来位置的偏移*/
				position: relative;
				left: 20px;
				top: 40px;
				
			}
		</style>
	</head>
	<body>
		<div>停车坐爱枫林晚</div>
	</body>
</html>

```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			div {
				width: 200px;
				height: 200px;
				
			}
			#div1 {
				background-color: red;
			}
			#div2 {
				background-color: green;
				position: relative;
				top: 30px;
				left: 40px;
			}
		</style>
	</head>
	<body>
		<div id="div1"></div>
		<div id="div2"></div>
	</body>
</html>

```

##### 6.1.3绝对定位

> ## position: absolute;
>
> `position: absolute;` 的元素相对于最近的定位祖先元素进行定位（而不是相对于视口定位，如 fixed）。
>
> 然而，如果绝对定位的元素没有祖先，它将使用文档主体（body），并随页面滚动一起移动。

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			div {
				width: 200px;
				height: 200px;
				
			}
			#div1 {
				background-color: chartreuse;
				/*绝对定位
				 相对于body进行定位的
				 */
				position: absolute;
				top: 100px;
				left: 100px;
			}
			#div2 {
				background-color: #FFC0CB;
			}
			#div3 {
				/* 祖先元素还是body */
				background-color: blue;
				position: absolute;
				top: 150px;
				left: 150px;
			}
			#div4 {
				background-color: red;
				/* 祖先元素是div3 相对于div3进行定位的 */
				position: absolute;
				left: 20px;
				top: 20px;
			}
		</style>
	</head>
	<body>
		<div id="div1"></div>
		<div id="div2"></div>
		<div id="div3">
			<div id="div4">
				
			</div>
		</div>
	</body>
</html>

```

### 7.关于浮动扩展

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style type="text/css">
			div {
				padding-left: 350px;
				clear: both;
			}
			a {
				text-decoration: none;
				color: red;
			}
			li {
				float: left;
				margin-left: 30px;
			}
		</style>
	</head>
	<body>
		<div>
			<ul type="none">
				<li><a href="#">VIP专区</a></li>
				<li><a href="#">精美视频</a></li>
				<li><a href="#">国产精品</a></li>
				<li><a href="#">日韩专区</a></li>
				<li><a href="#">欧美专区</a></li>
			</ul>
		</div>
		<!-- 想让另起一行，浮动以后  在一行了 咋办？ -->
		<div>
			<ul type="none">
				<li><a href="#">秒杀</a></li>
				<li><a href="#">plus会员</a></li>
				<li><a href="#">品牌闪购</a></li>
				<li><a href="#">京东家电</a></li>
				<li><a href="#">京东超市</a></li>
			</ul>
		</div>
	</body>
</html>

```

### 8.综合案例

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			* {
				margin: 0;
				padding: 0;
			}
			a {
				text-decoration: none;
				color: black;
			}
			.a1 {
				color: red;
			}
			#serchText {
				width: 500px;
				height: 25px;
			}
			#serchBtn {
				height: 30px;
			}
		</style>
	</head>
	<body>
		<!-- 顶部的那个导航条 -->
		<div id="top">
			<div style="background-color: #DCDCDC;height: 35px;border-radius: 8px;line-height:35px ;">
				<div style="float: left;text-indent: 2em;">
					<a href="#" class="a1">亲,请登录</a>
					<a href="#">免费注册</a>
					<a href="#">手机逛淘宝</a>
				</div>
				<div style="float: right;">
					<a href="#" class="a1">淘宝首页</a>
					<a href="#">我的淘宝</a>
					<a href="#">购物车</a>
					<a href="#">收藏夹</a>
					<a href="#">商品分类</a>
					<a href="#">卖家中心</a>
					<a href="#">联系客户</a>
					<a href="#">网站导航</a>
					
				</div>
			</div>
			<div style="padding-top: 30px;">
				<div style="float: left;">
					<!-- logo -->
					<img src="综合案例素材/logo.png"/>
				</div>
				<div style="float: left;padding-left: 200px;">
					<!-- 搜索框和下面的文字 -->
					<input type="text" name="keyWord" id="serchText"/>
					<input type="submit" value="搜索" id="serchBtn"/>
					<div>客厅灯&nbsp;&nbsp;&nbsp;&nbsp;冲锋衣&nbsp;&nbsp;&nbsp;&nbsp;床垫&nbsp;&nbsp;&nbsp;&nbsp;沙发垫&nbsp;&nbsp;&nbsp;&nbsp;电脑桌</div>
				</div>
			</div>
		</div>
		<div id="div3" style="clear: both;background-color: #dcdcdc;height: 35px;line-height: 35px;text-indent: 2em;border-radius: 8px;">
			您是不是要找：客厅灯|冲锋衣|床垫|内衣
		</div>
		<div style="border: solid 1px #aaaaaa;height: 35px;margin-top: 15px;border-radius: 8px;line-height: 35px;">
			<div style="float: left;">价格:<input type="text" />--<input type="text" /></div>
			<div style="float: right;">
				<input type="checkbox"/>包邮
				<input type="checkbox"/>不包邮
				<input type="checkbox"/>包邮一半
			</div>
		</div>
		<!-- 布置图片 -->
		<div style="margin-top: 15px;">
			<div style="margin-left: 10px;float: left;margin-right: 15px;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
			<div style="margin-left: 10px;float: left;margin-right: 10px;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
			<div style="margin-left: 15px;float: left;margin-right: 10px;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
			<div style="margin-left: 15px;float: left;margin-right: 10px;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
			<div style="margin-left: 15px;float: left;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
			<div style="margin-left: 10px;float: left;margin-right: 15px;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
			<div style="margin-left: 10px;float: left;margin-right: 10px;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
			<div style="margin-left: 15px;float: left;margin-right: 10px;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
			<div style="margin-left: 15px;float: left;margin-right: 10px;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
			<div style="margin-left: 15px;float: left;">
				<img src="综合案例素材/003.png" />
				<div style="margin-left: 40px;"> 
					<!-- 放图片下面的文字信息 -->
					<div style="color:tomato">￥40包邮</div>
					<div>世界上最好的商品</div>
					<div style="color:#aaa">浪漫服饰专营店</div>
					<div style="text-align: right;">如实描述:4.8</div>
				</div>
			</div>
		</div>
	</body>
</html>

```









