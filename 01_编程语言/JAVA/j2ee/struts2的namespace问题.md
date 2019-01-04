struts2的namespace问题 


如果在struts.xml中设定某action的命名空间 namespace="/test"，如：
<package name="mywork" extends="struts-default" namespace="/test">

如果在根目录的jsp文件(如 /login.jsp)中将s:form标签的指向某action的地址设为：
<s:form action="test/login.action">

则生成的相应页面代码为：
<form id="login" onsubmit="return true;" action="test/login.action" method="post">

当多次执行这一页面时(如每次登陆验证都不通过)，则浏览器url地址中的namespace将会重复出现，如：
http：//localhost:8080/webAppName/test/test/test/test/login.action


而如果将s:form标签中的指向某action的地址设为：
<s:form action="/test/login.action">

生成的相应页面代码为：
<form id="login" onsubmit="return true;" action="/webAppName/test/login.action" method="post">

此时多次执行这一页面url地址中的namespace也不会重复出现，浏览器url地址为

http：//localhost:8080/webAppName/test/login.action

运行正常。