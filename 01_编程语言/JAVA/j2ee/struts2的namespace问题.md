struts2��namespace���� 


�����struts.xml���趨ĳaction�������ռ� namespace="/test"���磺
<package name="mywork" extends="struts-default" namespace="/test">

����ڸ�Ŀ¼��jsp�ļ�(�� /login.jsp)�н�s:form��ǩ��ָ��ĳaction�ĵ�ַ��Ϊ��
<s:form action="test/login.action">

�����ɵ���Ӧҳ�����Ϊ��
<form id="login" onsubmit="return true;" action="test/login.action" method="post">

�����ִ����һҳ��ʱ(��ÿ�ε�½��֤����ͨ��)���������url��ַ�е�namespace�����ظ����֣��磺
http��//localhost:8080/webAppName/test/test/test/test/login.action


�������s:form��ǩ�е�ָ��ĳaction�ĵ�ַ��Ϊ��
<s:form action="/test/login.action">

���ɵ���Ӧҳ�����Ϊ��
<form id="login" onsubmit="return true;" action="/webAppName/test/login.action" method="post">

��ʱ���ִ����һҳ��url��ַ�е�namespaceҲ�����ظ����֣������url��ַΪ

http��//localhost:8080/webAppName/test/login.action

����������