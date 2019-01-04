JSP 指令 小结


JSP 页面中的应用指令的格式：

<%@指令名 属性1="属性值" 属性2="属性值"...%>
JSP中共有三个指令：

(1)page: 用于定义JSP文件中的全局属性

(2)include: 用于在JSP页面中包含另外一个文件的内容

(3)taglib: 此指令能够让用户自定义新的标签

第三个指令是用户根据业务需求定义标签，便于功能的实现，但是导致代码不容易读，所以，标签都是一些具有实例的公司开发。下面主要介绍前两个指令的使用。

1.page 指令的常用属性及使用方法

(1) language  声明脚本语言，目前只能使用Java

<%@page language="java" %>
(2) extends  继承的超类

<%@page extends="com.lihui.util" %>
(3) import  设置JSP文件的脚本元素中要使用的文件，引入的类文件可以使系统环境变量中所指定的目录下的类文件，或者是容器Tomcat根目录下 \common\lib 子目录中的Jar包，或者是所建Web项目下 WEB_INF\lib 中存放的jar包。例如：

<%@page import="java.sql.*" %>
(4) session  设置该页面是否需要session会话，默认为可用。

<%@page session="false" %>
(5) info  指定JSP页面的信息，可以使用getServletInfo()方法获取到该字符串

<%@page info="this is my info" %>
(6) isELIgnored  是否支持EL表达式

<%@page isELIgnored="false" %>
(7) isErrorPage  说明该页面是否可以作为其他页面的错误处理

<%@page isErrorPage="false" %>
(8) errorPage  和上一个属性配合使用。例如 a.jsp 文件中定义上面属性为 true，则可以在 b.jsp 中如下使用

<%@page errorPage="a.jsp" %>
(9) contentType  指定JSP页面的MIME类型，以及此JSP页面采用的字符编码格式，这个属性最先传递给客户端。MIME类型有以下几种： text/plain  text/HTML  text/xml  image/gif  image/jpeg 。默认的字符编码为 ISO-8859-1。设置如下：

<%@page contentType="text/html; charset=ISO-8859-1" %>
 

2. include 指令使用方法

该指令用于将包含进来的文件和当前文件进行合并，可以实现在JSP中包含文本、JSP或其他格式的文件，可以实现网页的模块化编辑。通常当应用程序中许多页面的某些部分都相同时使用，以减少代码重复。

<%@include file="\page\lihui.jsp" %>
 这里的路径是相对路径，比如，a.jsp 要加载 lihui.jsp , a.jsp存放在..\webapps\test\page 下，lihui.jsp 存放在 ..\webapps\test\lihui 下，则路径应该是  ..\test\lihui


