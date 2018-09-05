Window.Open参数、返回值

一、window.open()支持环境：
 
JavaScript1.0+/JScript1.0+/Nav2+/IE3+/Opera3+
 

二、基本语法：
 
window.open(pageURL,name,parameters)
 
其中：
 
pageURL为子窗口路径
 
name为子窗口句柄
 
parameters为窗口参数(各参数用逗号分隔)
 

三、示例：
 
<SCRIPT>
 
<!--
 
window.open('page.html','newwindow','height=100,width=400,top=0,left=0,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no')
 
//写成一行
 
-->
 
</SCRIPT>
 
脚本运行后，page.html将在新窗体newwindow中打开，宽为100，高为400，距屏顶0象素，屏左0象素，无工具条，无菜单条，无滚动条，不可调整大小，无地址栏，无状态栏。请对照。
 
　　上例中涉及的为常用的几个参数，除此以外还有很多其他参数，请见四。四、各项参数
 
　　其中yes/no也可使用1/0；pixelvalue为具体的数值，单位象素。
 

参数|取值范围|说明
 

alwaysLowered|yes/no|指定窗口隐藏在所有窗口之后
 
alwaysRaised|yes/no|指定窗口悬浮在所有窗口之上
 
depended|yes/no|是否和父窗口同时关闭
 
directories|yes/no|Nav2和3的目录栏是否可见
 
height|pixelvalue|窗口高度
 
hotkeys|yes/no|在没菜单栏的窗口中设安全退出热键
 
innerHeight|pixelvalue|窗口中文档的像素高度
 
innerWidth|pixelvalue|窗口中文档的像素宽度
 
location|yes/no|位置栏是否可见
 
menubar|yes/no|菜单栏是否可见
 
outerHeight|pixelvalue|设定窗口(包括装饰边框)的像素高度
 
outerWidth|pixelvalue|设定窗口(包括装饰边框)的像素宽度
 
resizable|yes/no|窗口大小是否可调整
 
screenX|pixelvalue|窗口距屏幕左边界的像素长度
 
screenY|pixelvalue|窗口距屏幕上边界的像素长度
 
scrollbars|yes/no|窗口是否可有滚动栏
 
titlebar|yes/no|窗口题目栏是否可见
 
toolbar|yes/no|窗口工具栏是否可见
 
Width|pixelvalue|窗口的像素宽度
 
z-look|yes/no|窗口被激活后是否浮在其它窗口之上
 


【1、最基本的弹出窗口代码】
 
　　其实代码非常简单：<SCRIPTLANGUAGE="javascript">
 
<!--
 
window.open('page.html')
 
-->
 
</SCRIPT因为着是一段javascripts代码，所以它们应该放在<SCRIPTLANGUAGE="javascript">标签和</script>之间。<!--和-->是对一些版本低的浏览器起作用，在这些老浏览器中不会将标签中的代码作为文本显示出来。要养成这个好习惯啊。
 
　　Window.open('page.html')用于控制弹出新的窗口page.html，如果page.html不与主窗口在同一路径下，前面应写明路径，绝对路径(http://)和相对路径(../)均可。用单引号和双引号都可以，只是不要混用。
 
　　这一段代码可以加入HTML的任意位置，<head>和</head>之间可以，<body>间</body>也可以，越前越早执行，尤其是页面代码长，又想使页面早点弹出就尽量往前放。
 
【2、经过设置后的弹出窗口】
 

下面再说一说弹出窗口的设置。只要再往上面的代码中加一点东西就可以了。
 
我们来定制这个弹出的窗口的外观，尺寸大小，弹出的位置以适应该页面的具体情况。<SCRIPTLANGUAGE="javascript">
 
<!--
 
window.open('page.html','newwindow','height=100,width=400,top=0,left=0,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no')
 
//写成一行
 
-->
 
</SCRIPT>参数解释：
 
<SCRIPTLANGUAGE="javascript">js脚本开始；
 
window.open弹出新窗口的命令；
 
'page.html'弹出窗口的文件名；
 
'newwindow'弹出窗口的名字（不是文件名），非必须，可用空''代替；
 
height=100窗口高度；
 
width=400窗口宽度；
 
top=0窗口距离屏幕上方的象素值；
 
left=0窗口距离屏幕左侧的象素值；
 
toolbar=no是否显示工具栏，yes为显示；
 
menubar，scrollbars表示菜单栏和滚动栏。
 
Resizable=no是否允许改变窗口大小，yes为允许；
 
location=no是否显示地址栏，yes为允许；
 
status=no是否显示状态栏内的信息（通常是文件已经打开），yes为允许；
 
</SCRIPT>js脚本结束
 

【3、用函数控制弹出窗口】<html>
 
下面是一个完整的代码
 
<head>
 
<scriptLANGUAGE="JavaScript">
 
<!--
 
functionopenwin(){window.open("page.html","newwindow","height=100,width=400,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no")
 
//写成一行
 
}
 
//-->
 
</script>
 
</head>
 
<bodyonload="openwin()">
 
…任意的页面内容…
 
</body>
 
</html>
 
这里定义了一个函数openwin(),函数内容就是打开一个窗口。在调用它之前没有任何用途。
 
怎么调用呢？
 
方法一：<bodyonload="openwin()">浏览器读页面时弹出窗口；
 
方法二：<bodyonunload="openwin()">浏览器离开页面时弹出窗口；
 
方法三：用一个连接调用：
 
<ahref="#"onclick="openwin()">打开一个窗口</a>
 
注意：使用的"#"是虚连接。
 
方法四：用一个按钮调用：
 
<inputtype="button"onclick="openwin()"value="打开窗口">
 

【4、同时弹出2个窗口】
 

对源代码稍微改动一下：
 
<scriptLANGUAGE="JavaScript">
 
<!--
 
functionopenwin()
 
{window.open("page.html","newwindow","height=100,width=100,top=0,left=0,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no")
 
//写成一行
 
window.open("page2.html","newwindow2","height=100,width=100,top=100,left=100,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no")
 
//写成一行
 
}
 
//-->
 
</script>
 

为避免弹出的2个窗口覆盖，用top和left控制一下弹出的位置不要相互覆盖即可。最后用上面说过的四种方法调用即可。
 
注意：2个窗口的name(newwindows和newwindow2)不要相同，或者干脆全部为空。OK？
 

【5、主窗口打开文件1.htm，同时弹出小窗口page.html】
 

如下代码加入主窗口<head>区：
 
<scriptlanguage="javascript">
 
<!--
 
functionopenwin()
 
{window.open("page.html","","width=200,height=200")
 
}
 
//-->
 
</script>
 
加入<body>区：
 
<ahref="1.htm"onclick="openwin()">open</a>即可。
 

【6、弹出的窗口之定时关闭控制】
 

下面我们再对弹出的窗口进行一些控制，效果就更好了。如果我们再将一小段代码加入弹出的页面(注意是加入到page.html的HTML中，可不是主页面中，否则…)，让它10秒后自动关闭是不是更酷了？
 
首先，将如下代码加入page.html文件的<head>区：
 
<scriptlanguage="JavaScript">
 
functioncloseit()
 
{setTimeout("self.close()",10000)//毫秒}
 
</script>
 
然后，再用<bodyonload="closeit()">这一句话代替page.html中原有的<BODY>这一句就可以了。(这一句话千万不要忘记写啊！这一句的作用是调用关闭窗口的代码，10秒钟后就自行关闭该窗口。)
 

【7、在弹出窗口中加上一个关闭按钮】
 
<FORM>
 
<INPUTTYPE='BUTTON'VALUE='关闭'onClick='window.close()'>
 
</FORM>
 
呵呵，现在更加完美了！
 
【8、内包含的弹出窗口-一个页面两个窗口】
 

上面的例子都包含两个窗口，一个是主窗口，另一个是弹出的小窗口。
 
通过下面的例子，你可以在一个页面内完成上面的效果。
 
<html>
 
<head>
 
<SCRIPTLANGUAGE="JavaScript">
 
functionopenwin()
 
{OpenWindow=window.open("","newwin","height=250,width=250,toolbar=no,scrollbars="+scroll+",menubar=no");
 
//写成一行
 
OpenWindow.document.write("<TITLE>例子</TITLE>")
 
OpenWindow.document.write("<BODYBGCOLOR=#ffffff>")
 
OpenWindow.document.write("<h1>Hello!</h1>")
 
OpenWindow.document.write("Newwindowopened!")
 
OpenWindow.document.write("</BODY>")
 
OpenWindow.document.write("</HTML>")
 
OpenWindow.document.close()}
 
</SCRIPT>
 
</head>
 
<body>
 
<ahref="#"onclick="openwin()">打开一个窗口</a>
 
<inputtype="button"onclick="openwin()"value="打开窗口">
 
</body>
 
</html>
 
看看OpenWindow.document.write()里面的代码不就是标准的HTML吗？只要按照格式写更多的行即可。千万注意多一个标签或少一个标签就会出现错误。记得用OpenWindow.document.close()结束啊。
 

【9、终极应用--弹出的窗口之Cookie控制】
 

回想一下，上面的弹出窗口虽然酷，但是有一点小毛病(沉浸在喜悦之中，一定没有发现吧？)比如你将上面的脚本放在一个需要频繁经过的页面里(例如首页)，那么每次刷新这个页面，窗口都会弹出一次，是不是非常烦人？:-(有解决的办法吗？Yes!;-)Followme.
 
我们使用cookie来控制一下就可以了。
 
首先，将如下代码加入主页面HTML的<HEAD>区：
 
<script>
 
functionopenwin()
 
{window.open("page.html","","width=200,height=200")}
 
functionget_cookie(Name)
 
{varsearch=Name+"="
 
varreturnvalue="";
 
if(document.cookie.length>0){
 
offset=document.cookie.indexOf(search)
 
if(offset!=-1){
 
offset+=search.length
 
end=document.cookie.indexOf(";",offset);
 
if(end==-1)
 
end=document.cookie.length;
 
returnvalue=unescape(document.cookie.substring(offset,end))
 
}
 
}
 
returnreturnvalue;
 
}
 
functionloadpopup(){
 
if(get_cookie('popped')==''){
 
openwin()
 
document.cookie="popped=yes"
 
}
 
}
 
</script>
 
然后，用<bodyonload="loadpopup()">（注意不是openwin而是loadpop啊！）替换主页面中原有的<BODY>这一句即可。你可以试着刷新一下这个页面或重新进入该页面，窗口再也不会弹出了。真正的Pop-Only-Once！
 
写到这里弹出窗口的制作和应用技巧基本上算是完成了，俺也累坏了，一口气说了这么多，希望对正在制作网页的朋友有所帮助俺就非常欣慰了。
 
需要注意的是，JS脚本中的的大小写最好前后保持一致。
 
【10、关闭弹出窗口时候刷新父窗体】
 
引用下面的JS方法，实现关闭弹出窗口刷新父窗体
 
javascript:opener.location.href=opener.location.href;opener=null;window.close()
