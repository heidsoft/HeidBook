JSP ָ�� С��


JSP ҳ���е�Ӧ��ָ��ĸ�ʽ��

<%@ָ���� ����1="����ֵ" ����2="����ֵ"...%>
JSP�й�������ָ�

(1)page: ���ڶ���JSP�ļ��е�ȫ������

(2)include: ������JSPҳ���а�������һ���ļ�������

(3)taglib: ��ָ���ܹ����û��Զ����µı�ǩ

������ָ�����û�����ҵ���������ǩ�����ڹ��ܵ�ʵ�֣����ǵ��´��벻���׶������ԣ���ǩ����һЩ����ʵ���Ĺ�˾������������Ҫ����ǰ����ָ���ʹ�á�

1.page ָ��ĳ������Լ�ʹ�÷���

(1) language  �����ű����ԣ�Ŀǰֻ��ʹ��Java

<%@page language="java" %>
(2) extends  �̳еĳ���

<%@page extends="com.lihui.util" %>
(3) import  ����JSP�ļ��Ľű�Ԫ����Ҫʹ�õ��ļ�����������ļ�����ʹϵͳ������������ָ����Ŀ¼�µ����ļ�������������Tomcat��Ŀ¼�� \common\lib ��Ŀ¼�е�Jar��������������Web��Ŀ�� WEB_INF\lib �д�ŵ�jar�������磺

<%@page import="java.sql.*" %>
(4) session  ���ø�ҳ���Ƿ���Ҫsession�Ự��Ĭ��Ϊ���á�

<%@page session="false" %>
(5) info  ָ��JSPҳ�����Ϣ������ʹ��getServletInfo()������ȡ�����ַ���

<%@page info="this is my info" %>
(6) isELIgnored  �Ƿ�֧��EL���ʽ

<%@page isELIgnored="false" %>
(7) isErrorPage  ˵����ҳ���Ƿ������Ϊ����ҳ��Ĵ�����

<%@page isErrorPage="false" %>
(8) errorPage  ����һ���������ʹ�á����� a.jsp �ļ��ж�����������Ϊ true��������� b.jsp ������ʹ��

<%@page errorPage="a.jsp" %>
(9) contentType  ָ��JSPҳ���MIME���ͣ��Լ���JSPҳ����õ��ַ������ʽ������������ȴ��ݸ��ͻ��ˡ�MIME���������¼��֣� text/plain  text/HTML  text/xml  image/gif  image/jpeg ��Ĭ�ϵ��ַ�����Ϊ ISO-8859-1���������£�

<%@page contentType="text/html; charset=ISO-8859-1" %>
 

2. include ָ��ʹ�÷���

��ָ�����ڽ������������ļ��͵�ǰ�ļ����кϲ�������ʵ����JSP�а����ı���JSP��������ʽ���ļ�������ʵ����ҳ��ģ�黯�༭��ͨ����Ӧ�ó��������ҳ���ĳЩ���ֶ���ͬʱʹ�ã��Լ��ٴ����ظ���

<%@include file="\page\lihui.jsp" %>
 �����·�������·�������磬a.jsp Ҫ���� lihui.jsp , a.jsp�����..\webapps\test\page �£�lihui.jsp ����� ..\webapps\test\lihui �£���·��Ӧ����  ..\test\lihui


