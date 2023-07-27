![](Pictures\logo.jpg)

> Author：wangbo
>

[TOC]

### 一、引言

---

#### 1.1 jQuery概述

> jQuery是一个快速、简洁的JavaScript代码库。jQuery设计的宗旨是“Write Less，Do More”，即倡导写更少的代码，做更多的事情。它封装JavaScript常用的功能代码，提供一种简便的JavaScript操作方式，优化HTML文档操作、事件处理、动画设计和Ajax交互。
>
> 重点！！！是对js的封装
>
> BaseDao 是对数据库增删改查的封装  用起来很方便
>
> 和js效果一样，但是比js的代码更少更简洁

#### 1.2 jQuery特点

> - 具有独特的链式语法。     
>
> - 支持高效灵活的CSS选择器。 div.style.color = ”red“
>
>   
>
> - 拥有丰富的插件。
>
> - 兼容各种主流浏览器，如IE 6.0+、FF 1.5+、Safari 2.0+、Opera 9.0+等。

#### 1.3 为什么要用jQuery

> - 目前网络上有大量开源的 JS 框架, 但是 jQuery 是目前最流行的 JS 框架，而且提供了大量的扩展。很多大公司都在使用 jQuery， 例如：Google、Microsoft、IBM、Netflix

### 二、jQuery引入

---

#### 2.1 直接引用jQuerys

jquery  是对js的封装，  封装成了一个后缀为外部的js文件。

引入外部的js文件

> 从 [jQuery.com](http://jquery.com/download/) 官网或从[GitHub](https://github.com/jquery/jquery/releases)下载合适版本（本课程使用3.4.1版本，兼容性更好，最新版本为3.x），放入服务器的合适目录中，在页面中直接引用。
> 
> 有两个版本的 jQuery 可供下载：
> 
> - Production version - 用于实际的网站中，已被精简和压缩。
> - Development version - 用于测试和开发（未压缩，便于可读）。

jQuery 库是一个 JavaScript 文件，使用 HTML 的 < script src="">< /script> 标签引用

和因为外部的js文件是一模一样的，如果想用Jquery语法格式来书写的代码的话，必须引入外部的js文件

```html
<head>
	<script src="jquery-1.12.2.min.js"></script>
</head>
```

#### 2.2 CDN引用

##### 2.2.1 什么是CDN？

> CDN的全称是Content Delivery Network，即[内容分发网络](https://baike.baidu.com/item/内容分发网络/4034265) , 使用户就近获取所需内容，降低网络拥塞，提高用户访问响应速度和命中率。

##### 2.2.2 常见 CDN

> 百度 CDN

```html
<head>
	<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js">
	</script>
</head>
```

> 新浪 CDN

```html
<head>
	<script src="http://lib.sinaapp.com/js/jquery/2.0.2/jquery-2.0.2.min.js">
	</script>
</head>
```

> Google CDN

```html
<head>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
	</script>
</head>
```

> Microsoft CDN

```html
<head>
	<script src="http://ajax.htmlnetcdn.com/ajax/jQuery/jquery-1.10.2.min.js">
	</script>
</head>
```

想要在html的页面中去写jquery的语法格式，必须引入  jquery.min.js文件

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<!--    <script src="js/test.js"></script>-->
<!--    引入外部的js的文件 一旦引入之后，就可以使用jQuery的语法格式-->
<!--    1.本地引入方式-->
    <script src="js/jquery-3.4.1.min.js"></script>
    <!--    jQuery是对js的封装， 肯定官方弄了一个外部的js文件
        你要想用jQuery，要在html页面中引入外部js文件中
    -->
<!--    2.CDN引入方式  没网络 CDN就无法访问  就无法使用-->
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js">
    </script>
</head>
<body>

</body>
<script>
<!--    当页面加载的时候，要执行$后面的匿名函数  -->
    $(function() {
        alert("弹框")
    })
</script>
</html>
```



### 三、jQuery语法【`重点`】

---

#### 3.1 基本使用

> + [$(匿名函数)]()：表示页面DOM加载完毕，则执行，比onload事件执行早，并且可以写多个。$是jQuery函数的简写。

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>

</body>
<script>
<!--    会执行匿名函数中的代码-->
    $(function () {
        alert("嘻嘻");
    })
</script>
</html>
```

> -  [$(selector).action()]()：通过选取 HTML 元素，并对选取的元素执行某些操作。
> 
> 
>   - 选择符（selector）表示"查找" HTML 元素
>   - jQuery 的 action() 执行对元素的操作，就是一个函数   封装好的
>   - 找到某一个标签对象，然后对其操作（函数）！！！

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
    <div>嘻嘻</div>
    <div id="ha">haha</div>
    <div class="he">呵呵</div>
</body>
<script>
    //js咋写的？
    var elementById = document.getElementById("ha");
    console.log(elementById)
    //这是通过jQuery找到元素
    //[$(selector).action()]()：通过选取 HTML 元素，并对选取的元素执行某些操作。
    //找到某一个标签对象，然后对其操作（函数）！！！
    console.log($("div"))
    console.log($("#ha"))
    console.log($(".he"))
    $("#ha").hide()
    //$(".he").hide("slow")
    $(".he").hide(30000,function(){
        alert("小死了吧");
    });
    //总结：先找到标签然后再调用方法即可
</script>
</html>
```



#### 3.2 jQuery选择器

https://jquery.cuishifeng.cn/   jquery网站

目的：为了找到标签元素的

在js里面找到标签对象  getElementById()  getElementsByTagName getElementsByCLassName

> - 元素（标签）选择器：jQuery 元素选择器基于元素名选取元素。
>
> - 示例：在页面中选取所有 <p> 元素

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<script src="jquery-3.4.1.min.js"></script>
	</head>
	<body>
		<p>注意个人防护</p>
		<button>点我啊</button>
	</body>
	<script type="text/javascript">
		//点击上面button按钮  让p标签消失 隐藏
		// 标签选择器  是click方法不是onclick方法
		//点击事件是一个功能  是匿名函数
		//找到button按钮 然后点击会触发click事件 就会执行click下面的匿名函数
		$("button").click(function () {
			$("p").hide()
		})
	</script>
</html>

```

> -  id选择器：jQuery #id 选择器通过 HTML 元素的 id 属性选取指定的元素。
>
> - 页面中元素的 id 应该是唯一的，所以您要在页面中选取唯一的元素需要通过 #id 选择器。通过 id 选取元素语法如下：
>

```javascript
$(function(){
  $("button").click(function(){
    $("#test").hide();
  });
});
```

> - class选择器：jQuery 类选择器可以通过指定的 class 查找元素。
>
> - 语法如下：

```javascript
$(function(){
  $("button").click(function(){
    $(".test").hide();
  });
});
```

扩展：看官方手册https://jquery.cuishifeng.cn/

#### 3.3 jQuery事件及常用事件方法

> - 什么是事件？
>   - 页面对不同访问者的响应叫做事件。
> - 事件处理程序指的是当 HTML 中发生某些事件时所调用的方法。
> - 实例：
>   - 在元素上移动鼠标。
>   - 选取单选按钮
> - 点击元素：在事件中经常使用术语"触发"（或"激发"）例如： "当您按下按键时触发 keypress 事件"。
>   常见 DOM 事件：
>

| 鼠标事件   | 键盘事件 | 表单事件 | 文档/窗口事件 |
| ---------- | -------- | -------- | ------------- |
| click      | keypress | submit   | load          |
| dblclick   | keydown  | change   | resize        |
| mouseenter | keyup    | focus    | scroll        |
| mouseleave |          | blur     | unload        |

> - ######  jQuery 事件方法语法：
>
>
> - 在 jQuery 中，大多数 DOM 事件都有一个等效的 jQuery 方法。
>   - 页面中指定一个点击事件：

```javascript
$("p").click();
```

> 下一步是定义什么时间触发事件。您可以通过一个事件函数实现：
>

```javascript
$("p").click(function(){
    // 动作触发后执行的代码!!
});
```

+ [总结：也就是说，不传参数是点击，传参数是设置事件。]()

> - 常用的 jQuery 事件方法
> - $(document).ready() 方法允许我们在文档完全加载完后执行函数。该事件方法在 [jQuery 语法](http://www.runoob.com/jquery/jquery-syntax.html) 章节中已经提到过。

> - click()：当按钮点击事件被触发时会调用一个函数。
> - 该函数在用户点击 HTML 元素时执行。

在下面的实例中，当点击事件在某个 <p> 元素上触发时，隐藏当前的 <p> 元素：

```javascript
$("p").click(function(){
  $(this).hide();
});
```

> - dblclick()：当双击元素时，会发生 dblclick 事件。
>
> - dblclick() 方法触发 dblclick 事件，或规定当发生 dblclick 事件时运行的函数：

```javascript
$("p").dblclick(function(){
  $(this).hide();
});
```

> - mouseenter()：当鼠标指针穿过元素时，会发生 mouseenter 事件。
> - mouseenter() 方法触发 mouseenter 事件，或规定当发生 mouseenter 事件时运行的函数：

```javascript
$("#p1").mouseenter(function(){
    alert('您的鼠标移到了 id="p1" 的元素上!');
});
```

> - mouseleave()：当鼠标指针离开元素时，会发生 mouseleave 事件。
>
> - mouseleave() 方法触发 mouseleave 事件，或规定当发生 mouseleave 事件时运行的函数：

```javascript
$("#p1").mouseleave(function(){
    alert("再见，您的鼠标离开了该段落。");
});
```

> - mousedown()：当鼠标指针移动到元素上方，并按下鼠标按键时，会发生 mousedown 事件。
>
> - mousedown() 方法触发 mousedown 事件，或规定当发生 mousedown 事件时运行的函数：

```javascript
$("#p1").mousedown(function(){
    alert("鼠标在该段落上按下！");
});
```

> - mouseup()：当在元素上松开鼠标按钮时，会发生 mouseup 事件。
>
> - mouseup() 方法触发 mouseup 事件，或规定当发生 mouseup 事件时运行的函数：

```javascript
$("#p1").mouseup(function(){
    alert("鼠标在段落上松开。");
});
```

> - hover()：hover()方法用于模拟光标悬停事件。
>
> - 当鼠标移动到元素上时，会触发指定的第一个函数(mouseenter);当鼠标移出这个元素时，会触发指定的第二个函数(mouseleave)。

```javascript
$("#p1").hover(
    function(){
        alert("你进入了 p1!");
    },
    function(){
        alert("拜拜! 现在你离开了 p1!");
    }
);
```

> - focus()：当元素获得焦点时，发生 focus 事件。
>
> - 当通过鼠标点击选中元素或通过 tab 键定位到元素时，该元素就会获得焦点。
>   focus() 方法触发 focus 事件，或规定当发生 focus 事件时运行的函数：

```javascript
$("input").focus(function(){
  $(this).css("background-color","#cccccc");
});
```

> - blur()：当元素失去焦点时，发生 blur 事件。
>
> - blur() 方法触发 blur 事件，或规定当发生 blur 事件时运行的函数：

```javascript
$("input").blur(function(){
  $(this).css("background-color","#ffffff");
});
```

示例

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
    <p>上山打老鼠</p>
    <div>门前大桥下 </div>
    <span>你是个傻子吧，不知道涮双击</span>
    <input type="text" id="input1">
</body>
<script>
    //单击事件
    $("p").click(function () {
        $(this).hide();
    })
    //双击事件
    $("div").dblclick(function () {
        $("div").hide()

    })
    //鼠标移入事件
    // $("span").mouseenter(function () {
    //     $(this).hide();
    // })
    //鼠标移出事件
    // $("span").mouseleave(function () {
    //     $(this).hide();
    // })
    //鼠标按下去的触发的事件
    // $("span").mousedown(function () {
    //     $(this).hide();
    // })
    //鼠标悬浮状态
    // $("span").hover(function () {
    //     $(this).hide();
    // })
    //获取焦点
    $("#input1").focus(function () {
        $(this).css("background-color", "red")
    })
    //失去焦点
    $("#input1").blur(function () {
        $(this).css("background-color", "green")
    })
    //js中都是带on的，jquery都是不带on的关于事件
</script>
</html>
```



### 四、 jQuery DOM操作【`重点`】

---

#### 4.1 捕获(获取)



目的：访问和操作元素和属性变得很容易。

> - jQuery 拥有可操作 HTML 元素和属性的强大方法。
>
>   ​	js操作元素方法和属性有哪些？
>
>   ```
>   setAttribute()
>   innerHTML
>   innerText
>   style
>   ```
>
>   
>
> - jQuery 中非常重要的部分，就是操作 DOM 的能力。
>
> - jQuery 提供一系列与 DOM 相关的方法，这使访问和操作元素和属性变得很容易。
>
> - 三个简单实用的用于 DOM 操作的 jQuery 方法：
>   - text() - 设置或返回所选元素的文本内容      ===》js中 innerText属性  
>
>   - html() - 设置或返回所选元素的内容（包括 HTML 标记）====》js中innerHTML
>
>   - val() - 设置或返回表单字段的值   input.value
>
>     总结：在js中是属性的，在jQuery中都是方法
>
> - 下面的例子演示如何通过 jQuery text() 和 html() 方法来获得内容：

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
    <div id="div1">
        <div>嘻嘻呵呵</div>
    </div>
    <input type="text" value="goudan">
    <a href="https://www.baidu.com">去百度</a>
    <button>点我</button>
</body>
    <script>
        //innerHTML
        //方法里面不带参数的时候获取
        console.log($("#div1").html())//获取指定标签中的内容的。包含了html标签
        console.log($("#div1").text())//获取指定标签中的内容的。不包含html
        console.log($("input").val())//获取input输入框中的value值
        //获取一个标签的属性  attr(“属性名字”)
        console.log($("a").attr("href"))

        //以上是获取。能不能修改？
        //点击一个按钮将 嘻嘻哈哈变成 呵呵
        $("button").click(function () {
            //方法里面带参数的时候是设置
            $("#div1").html("呵呵")
            $("input").val("狗蛋")
            //找到a标签 然后将a的href属性设置为http://www.4399.com
            $("a").attr("href", "http://www.4399.com")
        })
        //好理解，但是难记  不能不会用！！！百度


    </script>
</html>
```

> - 获取属性-attr()
>- jQuery attr() 方法用于获取属性值。  很重要
> - 下面的例子演示如何获得链接中 href 属性的值：
>- setAttrbute()    js
> 

```javascript
$("#btn2").click(function(){
		// 获取值			
		console.log($("#a1").attr("href"));
		// 设置 值			
		$("#a1").attr("href","04.html");
});
```

#### 4.2 设置

> - 我们将使用前一章中的三个相同的方法来设置内容：
>   - text() - 设置或返回所选元素的文本内容
>   - html() - 设置或返回所选元素的内容（包括 HTML 标记）
>   - val() - 设置或返回表单字段的值
> - 下面的例子演示如何通过 text()、html() 以及 val() 方法来设置内容：
>

```javascript
$("#btn1").click(function(){
    $("#test1").text("Hello world!");
});
$("#btn2").click(function(){
    $("#test2").html("<b>Hello world!</b>");
});
$("#btn3").click(function(){
    $("#test3").val("Hello world!");
});
```

> - 上面的三个 jQuery 方法：text()、html() 以及 val()，同样拥有回调函数。回调函数有两个参数：被选元素列表中当前元素的下标，以及原始（旧的）值。然后以函数新值返回您希望使用的字符串。
>
> - 下面的例子演示带有回调函数的 text() 和 html()：   没有讲
>

```javascript
$("#btn1").click(function(){
    $("#test1").text(function(i,origText){
        return "旧文本: " + origText + " 新文本: Hello world! (index: " + i + ")"; 
    });
});
 
$("#btn2").click(function(){
    $("#test2").html(function(i,origText){
        return "旧 html: " + origText + " 新 html: Hello <b>world!</b> (index: " + i + ")"; 
    });
});
```

> - jQuery attr() 方法也用于设置/改变属性值。
>
> - 下面的例子演示如何改变（设置）文本中 color属性的值：
>

```javascript
$("button").click(function(){
  $("#font1").attr("color","red");
});
```

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
    <style>
        .p3 {
            color:red;
            font-size: 40px;
        }
    </style>
</head>
<body>
  <div><a>夜里走夜路的时候碰到乱坟岗，然后走不出来了</a></div>
    <input type="text" value="goudan">
  <p id="p1" class="p2">欣赏你的那句</p>
    <button>点我啊</button>
</body>
<script>
    //js来写
    // var divs = document.getElementsByTagName("div");
    // console.log(divs[0].innerText)
    // console.log(divs[0].innerHTML)
    //jquery
    console.log($("div").text())//返回
    console.log($("div").html())//返回
    console.log($("input").val())//返回
    console.log($("p").attr("id"))//获取p标签的id属性的属性值
    console.log($("p").attr("class"))//获取p标签的class属性的属性值
    $("button").click(function () {
        $("div").text("一定要睡一觉")//设置  将一定要睡一觉 设置给div文本
        $("input").val("李宁")
        $("p").attr("class", "p3");//将p3设置class
    })
</script>
</html>
```

总结以下：text()  html()  val()  attr()   既可以获取内容又可以设置内容

#### 4.3 添加元素

js   body.appendChild(div)

> - 我们将学习用于添加新内容的四个 jQuery 方法：
>   - append() - 在被选元素的内容的结尾插入内容
>   - prepend() - 在被选元素的内容的开头插入内容
>   - after() - 在被选元素之后插入内容
>   - before() - 在被选元素之前插入内容
> - jQuery append() 方法在被选元素的结尾插入内容。

```javascript
$("p").append("追加文本");
```

> jQuery prepend() 方法在被选元素的开头插入内容。
>

```javascript
$("p").prepend("v文本");
```

> - 在上面的例子中，我们只在被选元素的开头/结尾插入文本/HTML。
>
> - 不过，append() 和 prepend() 方法能够通过参数接收无限数量的新元素。可以通过 jQuery 来生成文本/HTML（就像上面的例子那样），或者通过 JavaScript 代码和 DOM 元素。
>
> 



> - jQuery after() 方法在被选元素之后插入内容。
>
> - jQuery before() 方法在被选元素之前插入内容。
>

```javascript
$("img").after("在后面添加文本");
 
$("img").before("在前面添加文本");
```

> - after() 和 before() 方法能够通过参数接收无限数量的新元素。可以通过 text/HTML、jQuery 或者 JavaScript/DOM 来创建新元素。
>
>
> ```html
> <!DOCTYPE html>
> <html lang="en">
> <head>
>     <meta charset="UTF-8">
>     <title>Title</title>
>     <script src="js/jquery-3.4.1.min.js"></script>
> </head>
> <body>
>     <p id="p1">段落1</p>
>     <button id="append">追加</button>
>     <button id="prepend">在内容的开头追加</button>
>     <button id="after">被选元素之后插入</button>
>     <button id="before">被选元素之前插入</button>
> </body>
> <script>
>     //append() - 在被选元素的内容的结尾插入内容
>     $("#append").click(function () {
>         $("#p1").append("<span>嘻嘻</span>")
>     })
>     //prepend() - 在被选元素的内容的开头插入内容
>     $("#prepend").click(function () {
>         $("#p1").prepend("<span>哈哈</span>")
>     })
>     //after() - 在被选元素之后插入内容
>     $("#after").click(function () {
>         $("#p1").after("<div>晚上回家的时候小心一点</div>")
>     })
>     //before() - 在被选元素之前插入内容
>     $("#before").click(function () {
>         $("#p1").before("<div>xixihaha</div>")
>     })
> </script>
> </html>
> ```
> 
> 



#### 4.4 删除元素

> - 如需删除元素和内容，一般可使用以下两个 jQuery 方法：
>   - remove() - 删除被选元素（及其子元素）
>   - empty() - 从被选元素中删除子元素

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
    <div id="div1">
        <a>嘻嘻</a>
    </div>
    <button>点我啊</button>
</body>
<script>
    $("button").click(function () {
        //删除被选元素（及其子元素）
        //$("#div1").remove()
        //$("#div1").remove();

        $("#div1").empty()
    })
</script>
</html>
```

> - jQuery remove() 方法也可接受一个参数，允许您对被删元素进行过滤。
>
> - 该参数可以是任何 jQuery 选择器的语法。
>
>   
>
>

```javascript
$("#div1").remove(".hello");
```

#### 4.5 CSS类【和style有关系】

> - jQuery 拥有若干进行 CSS 操作的方法。我们将学习下面这些：
>   - addClass() - 向被选元素添加一个或多个类属性
>   - removeClass() - 从被选元素删除一个或多个类属性
>   - toggleClass() - 对被选元素进行添加/删除类的切换操作
>   - css() - 设置或返回样式属性  重点！！！
> - 下面的样式表将用于本页的所有例子：
>

```css
.success{
				background-color: greenyellow;
				color: red;
}
.error{
				background-color: red;
				color: gray;
}	
```

> 下面的例子展示如何向不同的元素添加 class 属性。当然，在添加类时，您也可以选取多个元素：
>

```javascript
$("button").click(function(){
 $("#btn").addClass("success");
});
```



> 下面的例子演示如何在不同的元素中删除指定的 class 属性：
>

```javascript
$("button").click(function(){
  $("#btn").removeClass("success");
});
```

> 下面的例子将展示如何使用 jQuery toggleClass() 方法。该方法对被选元素进行添加/删除类的切换操作：
>

```javascript
$("button").click(function(){
  $("#btn").toggleClass("success");
});
```

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
    <style>
        .div1 {
            width: 200px;
            height: 200px;
            background-color: aqua;
        }
    </style>
</head>
<body>
    <div >
        齐乐有灵性
    </div>
    <button id="btn1">点我添加</button>
    <button id="btn2">点我移除</button>
    <button id="btn3">点我切换</button>
</body>
<script>
    $("#btn1").click(function () {
        //给选中的标签加class属性
        $("div").addClass("div1 div2 div3")
    })
    $("#btn2").click(function () {
        //给选中的标签加class属性
        $("div").removeClass("div1")
    })
    $("#btn3").click(function () {
        //给选中的标签加class属性  如果有class=div1就移除  如果没就添加
        $("div").toggleClass("div1")
    })
</script>
</html>
```



#### 4.6 css()方法【重要】

z主要是设置标签元素的样式的 和CSS样式有关的

> - css() 方法设置或返回被选元素的一个或多个样式属性。
>
> - 如需返回指定的 CSS 属性的值，请使用如下语法：
>

```javascript
css("propertyname");
```

> 下面的例子将返回首个匹配元素的 background-color 值：
>

```javascript
$("p").css("background-color");
```

> 如需设置指定的 CSS 属性，请使用如下语法：
>

```javascript
css("propertyname","value");
```

> 下面的例子将为所有匹配元素设置 background-color 值：
>

```javascript
$("p").css("background-color","yellow");
```

> 如需设置多个 CSS 属性，请使用如下语法：
>

```javascript
css({"propertyname":"value","propertyname":"value",...});
```

> 下面的例子将为所有匹配元素设置 background-color 和 font-size：
>

```javascript
$("p").css({"background-color":"yellow","font-size":"200%"});
```

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
  <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
    <div id="div1" style="width: 200px; height: 200px;background-color: red"></div>
    <button>点我啊</button>
</body>
<script>
    $("button").click(function() {
        //获取css样式
        console.log($("#div1").css("width"))
        console.log($("#div1").css("height"))
        console.log($("#div1").css("background-color"))
        //设置值？
        $("#div1").css("width", "400px")
        $("#div1").css("height", "400px")
        $("#div1").css("background-color", "green")
        //上面写的太麻烦了，写了三行代码,可以写一行代码
        $("#div1").css({"width":"300px", "height":"300px", "background-color":"blue"})
    })
</script>
</html>
```

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
    <style>
        .cls2 {
            width:100px;
            height: 100px;
            background-color: red;
            border: 3px solid blue;
        }
    </style>
</head>
<body>
    <div id="d1" class="cls1 cls2"></div>
    <button id="btn1">点我</button>
    <button id="btn2">点我</button>
</body>
<script>
    $("#btn1").click(function () {
        //addClass对元素添加class属性
        //$("#d1").addClass("cls2 cls3 cls4")
        //removeClass() - 从被选元素删除一个或多个类属性
        //$("#d1").removeClass("cls2")
        //toggleClass() - 对被选元素进行添加/删除类的切换操作  当有了就删除 当没有就添加
        $("#d1").toggleClass("cls2")

    })
    $("#btn2").click(function () {
        console.log($("#d1").css("height"))//获取style中的height属性的属性值
        console.log($("#d1").css("width"))//获取style中的height属性的属性值
        console.log($("#d1").css("background-color"))//获取style中的height属性的属性值
        //以上在获取
        //以下设置
        // $("#d1").css("height", "300px")
        // $("#d1").css("width", "300px")
        // $("#d1").css("background-color", "aqua")
        $("#d1").css({"height":"200px", "width":"200px"})
    })
</script>
</html>
```



#### 4.7 尺寸

$("选择器").函数()  目的是找到元素,让这个元素做一个事情

text()

html()

val()

attr()

css()

append

prepend

after

before

remove

empty

addClass

removeClass



innerWidth  innerHeight

> - jQuery 提供多个处理尺寸的重要方法：
>   - width()	
>   - height()
>   - innerWidth()
>   - innerHeight()
>   - outerWidth()
>   - outerHeight()

|         尺寸         |
| :------------------: |
| ![1](Pictures/1.png) |



> - width() 方法设置或返回元素的宽度（不包括内边距、边框或外边距）。
>
> - height() 方法设置或返回元素的高度（不包括内边距、边框或外边距）。
>
> - 下面的例子返回指定的 &lt;div&gt; 元素的宽度和高度：
>

```javascript
$("button").click(function(){
  var txt="";
  txt+="div 的宽度是: " + $("#div1").width() + "</br>";
  txt+="div 的高度是: " + $("#div1").height();
  $("#div1").html(txt);
});
```

> - innerWidth() 方法返回元素的宽度（包括内边距）。
>
> - innerHeight() 方法返回元素的高度（包括内边距）。
>
> - 下面的例子返回指定的 &lt;div&gt; 元素的 inner-width/height：
>

```javascript
$("button").click(function(){
  var txt="";
  txt+="div 宽度，包含内边距: " + $("#div1").innerWidth() + "</br>";
    txt+="div 高度，包含内边距: " + $("#div1").innerHeight();
  $("#div1").html(txt);
});
```

> - outerWidth() 方法返回元素的宽度（包括内边距和边框）。
>
> - outerHeight() 方法返回元素的高度（包括内边距和边框）。
>
> - 下面的例子返回指定的 &lt;div&gt; 元素的 outer-width/height：
>

```javascript
$("button").click(function(){
  var txt="";
  txt+="div 宽度，包含内边距和边框: " + $("#div1").outerWidth() + "</br>";
  txt+="div 高度，包含内边距和边框: " + $("#div1").outerHeight();
  $("#div1").html(txt);
});
```

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        #d1 {
            width: 20px;
            height: 20px;
            background-color: aqua;
            border: 1px solid red;
            padding: 10px;
            margin: 5px;
        }
    </style>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
  <div id="d1"></div>
</body>
<script>
    console.log($("#d1").width("40px"))
    console.log($("#d1").height())
    console.log($("#d1").innerWidth()) //元素的宽+ 内边距
    console.log($("#d1").innerHeight()) //元素的宽+ 内边距
    console.log($("#d1").outerWidth())//元素的宽+ 内边距 + 边框的宽度
    console.log($("#d1").outerWidth(true))//元素的宽+ 内边距 + 边框的宽度 + 外边距的

</script>
</html>
```

学习jquery 任何人都帮助不了你，但是授人以鱼不如授人以渔。

是一个诀窍，先找到标签元素对象，然后再调用jquery封装好的方法

实现你想要的效果！！！ 方法很多记不住

没关系，暂时能百度看懂即可，因为开发使用vue或者layui等人家自己封装的js不是jquery

### 五、jQuery遍历

学会自己看手册，并写出来案例

1.作业

---

#### 5.1 遍历

> - jQuery 遍历，意为"移动"，用于根据其相对于其他元素的关系来"查找"（或选取）HTML 元素。以某项选择开始，并沿着这个选择移动，直到抵达您期望的元素为止。
>
> - 下图展示了一个家族树。通过 jQuery 遍历，您能够从被选（当前的）元素开始，轻松地在家族树中向上移动（祖先），向下移动（子孙），水平移动（同胞）。这种移动被称为对 DOM 进行遍历。
>

#### 5.2 祖先 jQuery parent() 方法

> - parent() 方法返回被选元素的直接父元素。
>
> - 该方法只会向上一级对 DOM 树进行遍历。
>
> - 下面的例子返回每个 div元素的直接父元素：
>

```javascript
$("#div3").parent().css("background-color","green");
```

> - parents() 方法返回被选元素的所有祖先元素，它一路向上直到文档的根元素 (html)。
>
> - 下面的例子返回所有 div元素的所有祖先：
>

```javascript
			$("#div3")获取所有父类 是数组 包括 html body
			$("#div3").parents("#div1").css("border","solid 3px #f00");;
```

> - 您也可以使用可选参数来过滤对祖先元素的搜索。
>
> - 下面的例子返回所有 span  元素的所有祖先，并且它是 url 元素：
>

```javascript
$(document).ready(function(){
  $("span").parents("ul");
});
```

> - parentsUntil() 方法返回介于两个给定元素之间的所有祖先元素。
>
> - 下面的例子返回介于 span  与 di v 元素之间的所有祖先元素：
>

```javascript
	$("#div3").parentsUntil("body").css("border","solid 3px #f00");
```

#### 5.3 后代 jQuery children() 方法

> - children() 方法返回被选元素的所有直接子元素。
>
> - 该方法只会向下一级对 DOM 树进行遍历。
>
> - 下面的例子返回每个div 元素的所有直接子元素：
>

```javascript
$("#div1").children().css("border","solid 3px grey");;
```

> - find() 方法返回被选元素的后代元素，一路向下直到最后一个后代。
>
> - 下面的例子返回属于 div 后代的所有 类为cla1元素：
>

```javascript
// 获取后代中 类为.cla1 的点
$("#div1").find(".cla1").css("border","solid 3px grey");;

```

> 下面的例子返回 div 的所有后代：
>

```javascript
$("#div1").find("*").css("border","solid 3px grey");;
```

#### 5.4 同胞 jQuery siblings() 方法

> - siblings() 方法返回被选元素的所有同胞元素。
>
> - 下面的例子返回 h2 的所有同胞元素：
>

```javascript
$("#d2").siblings().html("siblings")
```



> - next() 方法返回被选元素的下一个同胞元素。
>
> - 该方法只返回一个元素。
>
> - 下面的例子返回h2的下一个同胞元素：
>

```javascript
$("#d2").next().html("next");
```

> - nextAll() 方法返回被选元素的所有跟随的同胞元素。
>
> - 下面的例子返回 h2 的所有跟随的同胞元素：
>

```javascript
$("#d2").nextAll().html("nextAll");
```

> - nextUntil() 方法返回介于两个给定参数之间的所有跟随的同胞元素。
>
> - 下面的例子返回介于d2与 d4 元素之间的所有同胞元素：
>

```javascript
$("#d2").nextUntil("#d4").html("nextAll");
```

> - prev()方法取得一个包含匹配的元素集合中每一个元素紧邻的前一个同辈元素的元素集合
> - 下面的例子返回 d2的下一个同胞元素

```javascript
$("#d2").prev().html("prev");
```

> prevAll() 方法查找当前元素之前所有的同辈元素
>
> prevUntil() 方法查找当前元素之前所有的同辈元素，直到遇到匹配的那个元素为止

#### 5.5 过滤 jQuery first() 方法

> - first() 方法返回被选元素的首个元素。
>
> - 下面的例子选取首个div 元素内部的第一个 p 元素：
>

```javascript
$("#d").children().first().html("first");
```

> - last() 方法返回被选元素的最后一个元素。
>
> - 下面的例子选择最后一个div 元素中的最后一个 p 元素：
>

```javascript
$("#d").children().last().html("last");
```

> - eq() 方法返回被选元素中带有指定索引号的元素。
>
> - 索引号从 0 开始，因此首个元素的索引号是 0 而不是 1。下面的例子选取第二个p 元素（索引号 1）：
>

```javascript
$("#d").children().eq(1).html("eq(1)");
```

> - filter() 方法允许您规定一个标准。不匹配这个标准的元素会被从集合中删除，匹配的元素会被返回。
>
> - 下面的例子返回带有类名 "url" 的所有div 元素：
>

```javascript
$("#d").children().filter("#url").html("filter");
```

> - not() 方法返回不匹配标准的所有元素。
>
> - 提示：not() 方法与 filter() 相反。
> - 下面的例子返回除id为 "#d4" 的所有p元素：

```javascript
$("#d").children().not("#d4").html("not");
```

https://www.94xh.com/学习网站

### 六、jQuery AJAX

---

#### 6.1 jQuery AJAX简介

> - AJAX = 异步 JavaScript 和 XML（Asynchronous JavaScript and XML）。
>
> - 简短地说，在不重载整个网页的情况下，AJAX 通过后台加载数据，并在网页上进行显示。
>
> - 使用 AJAX 的应用程序案例：谷歌地图、腾讯微博、优酷视频、人人网等等。
>

#### 6.2 get和post方法

> $.get() 方法通过 HTTP GET 请求从服务器上请求数据。
>

```javascript
$.get(URL,callback);
```

> - 必需的 *URL* 参数规定您希望请求的 URL。
>
> - 可选的 *callback* 参数是请求成功后所执行的函数名。
>
> - 下面的例子使用 $.get() 方法从服务器上的一个文件中取回数据：
>

```javascript
$("button").click(function(){
 $.get("LoginServlet",{username:username,password:password},function (data) {// 处理服务正常返回的数据
                alert("服务端正常数据");
                // 如果使用这样方式能捕获服务端错误，但是不能给我转json,需要手动
                var  response = JSON.parse(data);
                alert(data);
                alert("message:"+response.message);
                alert("status:"+response.status);
                $("#message").text(response.message);

            }).fail(function () {
                alert("服务端错误");
            });
});
```

> - $.post() 方法通过 HTTP POST 请求从服务器上请求数据。
>   - $.post(*URL,data,callback*);
>   - 必需的 *URL* 参数规定您希望请求的 URL。
>   - 可选的 *data* 参数规定连同请求发送的数据。
>   - 可选的 *callback* 参数是请求成功后所执行的函数名。
> - 下面的例子使用 $.post() 连同请求一起发送数据：

```javascript
$("button").click(function(){
    $.post("LoginServlet",{username:username,password:password},function (data) {// 处理服务正常返回的数据
                alert("服务端正常数据");
                // 如果使用这样方式能捕获服务端错误，但是不能给我转json,需要手动
                var  response = JSON.parse(data);
                alert(data);
                alert("message:"+response.message);
                alert("status:"+response.status);
                $("#message").text(response.message);

            }).fail(function () {
                alert("服务端错误");
            });
});
```

#### 6.3 ajax()方法

> - jQuery 底层 AJAX 实现。简单易用的高层实现见 $.get, $.post 等。$.ajax() 返回其创建的 XMLHttpRequest  对象。大多数情况下你无需直接操作该函数，除非你需要操作不常用的选项，以获得更多的灵活性。
> - 最简单的情况下，$.ajax()可以不带任何参数直接使用

```
 // 异步请求数据
            $.ajax({
                url:"LoginServlet",
                type:"get",  // post
                // data 可以式js 对象
               //1.方式 data:{username:username,password:password},

               //2.方式 data:'username='+username+"&password="+password,
                // 3.方式 上传form表单
               data:$("#form").serialize(),
                success:function (data) {  //服务器成功返回的数据
                    alert(data);
                    alert("message:"+data.message);
                    alert("status:"+data.status);
                    $("#message").text(data.message);
                },
                error:function (data) {// 服务器返回失败的数据
                    alert(data);
                },
                //ajax 会将服务器返回的json字符串-----》js对象
                dataType:"json"
            });
```



---





### 七、Bootstrap

> Bootstrap 是最受欢迎的 HTML、CSS 和 JS 框架，用于开发响应式布局、移动设备优先的 WEB 项目。
>
> Bootstrap 让前端开发更快速、简单。所有开发者都能快速上手、所有设备都可以适配、所有项目都适用。
>
> 是别人给咱们封装好的，只需要复制别人写好的css  js即可就可以来使用了
>
> Boostraps使用
>
> 1.下载bootstsrap的压缩包
>
> ​		压缩包中有css 文件和js文件
>
> 2.解压之后，放到咱们的项目中
>
> 3.书写html页面的时候引入外部的css文件和js文件即可

这个项目是只需要看懂前端代码即可，我给大家前端代码！！！，你们看懂之后去写Java代码

不用写前端代码  逐层递进，慢慢发展！！！

今天的作业：

```
1.jquery中的遍历的方法
2.对之前写的 增删改查 想办法  百度  把表格弄好看一点
```



### 八、MVC框架(Model-View-Controller)

------

#### 8.1 MVC概念

> MVC又称为编程模式，是一种软件设计思想，将数据操作、页面展示、业务逻辑分为三个层级（模块），独立完成，相互调用    
>
> - 模型层（Model） 
>
> - 视图（View）       
>
> - 控制器（Controller）



#### 8.2 MVC模式详解

> MVC并不是Java独有的，现在几乎所有的B/S的架构都采用了MVC模式。
>
> * 视图View：视图即是用户看到并与之交互的界面，比如HTML（静态资源），JSP（动态资源）等等。 
>
> * 控制器Controller：控制器即是控制请求的处理逻辑，对请求进行处理，负责流程跳转(转发和重定向)。 servlet
>
> * 模型Model：对客观世界的一种代表和模拟(业务模拟、对象模拟)。
>
>   dao

|                   MVC流程                    |
| :------------------------------------------: |
| ![image-20200428212659150](Pictures\mvc.png) |



#### 8.3 优点

> - 低耦合性：模块与模块之间的关联性不强，不与某一种具体实现产生密不可分的关联性
> - 高维护性：基于低耦合性，可做到不同层级的功能模块灵活更换、插拔
> - 高重用性：相同的数据库操作，可以服务于不同的业务处理。将数据作为独立模块，提高重用性



#### 8.4 MVC在框架中应用

> MVC模式被广泛用于Java的各种框架中，比如Struts2、SpringMVC等等都用到了这种思想。



#### 8.5 三层架构与MVC

##### 8.5.1 三层架构

> View层（表示|界面层）、Service层（业务逻辑层）、DAO层(数据访问层)

|        三层架构流程        |
| :------------------------: |
| ![](Pictures\三层架构.png) |



##### 8.5.2 MVC与三层架构的区别

> - MVC强调的是视图和业务代码的分离。严格的说MVC其实关注的是Web层。View就是单独的页面，如JSP、HTML等，不负责业务处理，只负责数据的展示。而数据封装到Model里，由Controller负责在V和M之间传递。MVC强调业务和视图分离。
> - 三层架构是“数据访问层”、“业务逻辑层”、“表示层”，指的是代码之间的解耦，方便维护和复用。

![1 (2)](\1 (2).png)





```
MVC:
	model(模型层)：
		上面项目中的dao entity service
	controller(控制器层)：
		上面项目的controller
	view（视图层）：
		就是web文件夹下面的html，和jsp页面
		
	执行流程：
		先执行页面login.jsp
		->控制器层 Servlet
		->在servlet去调用service里面的方法
		->service再调用dao里面方法
		->dao里面方法去操作咱们的数据库的
		->响应给前端页面
		
		之前写的代码是 在servlet中去实例化dao然后去执行数据库
		mvc思想：在servlet里面去实例化service-》在service里面去实例化dao
```

```
前台和后台的思想:
	你们用的淘宝页面是前台还是后台？
		前台
	大家想一个问题：商家入驻，咋办？
	淘宝还有一个网站，后台管理的网站
	商家入驻的话，要在淘宝数据库中添加商家信息，淘宝给商家说，安装一个SQLyog
	给你一个数据库账号，你写SQL命令 然后把你商品添加到数据库。玛德，这是在扯犊子。
	所以淘宝会提供一个后台管理的页面给商家，然后操作页面把你的商品添加到数据库
	前台获取的数据就是你添加之后的数据。
```

咱们这个网站分前台和后台

先开发后台，将数据添加 删除 修改。然后再开发前台，前台只是展示数据而已

后台操作（增删改查）数据库，前台查询数据库展示数据非时候就是你展示的数据

### 项目的准备工作

> 1.新建好项目架子
>
> 2.因为要操作数据库，所以先把数据库和表建好，数据建成功
>
> 3.复制druid.properties文件到src文件夹下面
>
> 4.复制第三方的jar到咱们的lib文件夹下面
>
> 5.复制JdbcUtil和BaseDao到utils文件夹下面
>
> 6.书写login.jsp放到咱们的web/after文件夹下面
>
> 7.在web文件夹下面黏贴复制css,js,font,image文件夹  静态资源的
>
> 8.将login.jsp点击登录按钮之后，把input输入框中的数据带给LoginServlet，写在controller文件夹下面
>
> 9.写service层
>
> 10写dao层

servlet-》将前端发送的数据给service（）-》dao-》返回service（service做判断）-》返回servlet