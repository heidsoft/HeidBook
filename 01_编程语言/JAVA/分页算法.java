<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%> 
  
<%@ page import="java.sql.*;"%> 
  
<% 
  
    String path = request.getContextPath(); 
  
    String basePath = request.getScheme() + "://"
  
           + request.getServerName() + ":" + request.getServerPort() 
  
           + path + "/"; 
  
%> 
  
   
  
<%!boolean flag = false; 
  
    String str = "";%> 
  
   
  
<% 
  
    String login = (String) session.getAttribute("login"); 
  
    if (login != null && login.equals("true")) { 
  
       flag = true; 
  
    } 
  
%> 
  
   
  
<% 
  
    int pageSize = 3; //ÿҳ��¼������ 
  
    int pageNo = 0; //�ڼ�ҳ 
  
    int tolPage = 0; //����ҳ 
  
    Class.forName("com.mysql.jdbc.Driver"); 
  
    String url = "jdbc:mysql://localhost/bbs?user=root&password=wangkang"; 
  
    Connection conn = DriverManager.getConnection(url); 
  
   
  
    Statement stmt = conn.createStatement(); 
  
    ResultSet rs = null; 
  
   
  
    //���ڷ�ҳ���㷨--������ҳ�� 
  
    Statement stmt1 = conn.createStatement(); 
  
    rs = null; 
  
    rs = stmt1 
  
           .executeQuery("select count(*) from article where pid = 0"); 
  
    rs.next(); 
  
    int tolNum = rs.getInt(1); 
  
    stmt1.close(); 
  
      
  
     //������ҳ�� 
  
    if (tolNum % pageSize == 0) { 
  
       tolPage = tolNum / pageSize; 
  
    } else { 
  
       tolPage = tolNum / pageSize + 1; 
  
    } 
  
   
  
    /** 
  
     *��ҳ�㷨 
  
     */
  
   
  
    String pageStr = request.getParameter("pageNo"); 
  
   
  
    if (pageStr == null || pageStr.equals("")) { 
  
       pageNo = 1; 
  
    } else { 
  
       if (Integer.parseInt(pageStr) <= 0) { 
  
           pageNo = 1; 
  
       } else if (Integer.parseInt(pageStr) >= tolPage) { 
  
           pageNo = tolPage; 
  
       } else { 
  
           pageNo = Integer.parseInt(pageStr); 
  
       } 
  
    } 
  
   
  
    int pagePos = (pageNo - 1) * pageSize; //��ʼ��¼λ�� 
  
   
  
    //Mysql�й��ڷ�ҳ��sql��� 
  
    rs = stmt 
  
           .executeQuery("select * from article where pid=0 order by pdate desc limit "
  
                  + pagePos + "," + pageSize); 
  
    String strLogin = ""; 
  
    String fStr = ""; 
  
   
  
    while (rs.next()) { 
  
       if (flag) { 
  
           fStr = "<a href='Delete.jsp?pid=" + rs.getInt("pid") 
  
                  + "&id=" + rs.getInt("id") + "'>ɾ��</a>"; 
  
       } 
  
   
  
       str += "<tr><td>" + rs.getInt("id") + "</td><td>"
  
              + "<a href='ShowDetail.jsp?id=" + rs.getInt("id") 
  
              + "'>" + rs.getString("title") + "</a>" + "</td><td>"
  
              + fStr + "</td></tr>"; 
  
    } 
  
   
  
    /* 
  
    //���ڷ�ҳ���㷨--������ҳ�� 
  
    Statement stmt1 = conn.createStatement(); 
  
    rs = null; 
  
    rs = stmt1 
  
           .executeQuery("select count(*) from article where pid = 0"); 
  
    rs.next(); 
  
    int tolNum = rs.getInt(1); 
  
    stmt1.close(); 
  
   
  
    if (tolNum % 3 == 0) { 
  
       tolPage = tolNum / 3; 
  
    } else { 
  
       tolPage = tolNum / 3 + 1; 
  
    } 
  
     */ 
  
   
  
    /* 
  
    if (pageStr == null || pageStr.equals("")) { 
  
       pageNo = 1; 
  
    } else { 
  
       if (Integer.parseInt(pageStr) <= 0) { 
  
           pageNo = 1; 
  
       } else if(pageNo >= tolPage){ 
  
           pageNo = tolPage; 
  
       } else { 
  
           pageNo = Integer.parseInt(pageStr); 
  
       } 
  
    } 
  
     */
  
     
  
    rs.close(); 
  
    stmt.close(); 
  
    conn.close(); 
  
%> 
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 
  
<html> 
  
    <head> 
  
       <base href="<%=basePath%>"> 
  
   
  
       <title>My JSP 'ShowArticleTree.jsp' starting page</title> 
  
   
  
       <meta http-equiv="pragma" content="no-cache"> 
  
       <meta http-equiv="cache-control" content="no-cache"> 
  
       <meta http-equiv="expires" content="0"> 
  
       <meta http-equiv="keywords" content="keyword1,keyword2,keyword3"> 
  
       <meta http-equiv="description" content="This is my page"> 
  
       <!-- 
  
    <link rel="stylesheet" type="text/css" href="styles.css"> 
  
    --> 
  
   
  
    </head> 
  
   
  
    <body> 
  
       <a href="Post.jsp">�����»���</a> 
  
       <table border="1"> 
  
           <%=str%> 
  
           <% 
  
              str = ""; 
  
              flag = false; 
  
           %> 
  
       </table> 
  
       ��<%=tolPage%>ҳ  ��<%=pageNo%>ҳ 
  
       <br> 
  
            
  
       <!-- ��ӷ�ҳ��� --> 
  
        <!-- ��ҳ��һ����ʾ���� --> 
  
       <a href="ShowArticleFlat.jsp?pageNo=<%=pageNo - 1%>"> < </a>   
  
       <a href="ShowArticleFlat.jsp?pageNo=<%=pageNo + 1%>"> > </a> 
  
       <br> 
  
       <br> 
  
         <!-- ��ҳ�ڶ�����ʾ���� --> 
  
       <form name="form1" action="ShowArticleFlat.jsp"> 
  
           <select name="pageNo" onchange="document.form1.submit()"> 
  
              <% 
  
                  for (int i = 1; i <= tolPage; i++) { 
  
              %> 
  
              <option value=<%=i%> <%=(pageNo == i) ? "selected" : ""%>> 
  
                  ��<%=i%>ҳ 
  
                  <% 
  
                  } 
  
              %> 
  
               
  
           </select> 
  
       </form> 
  
   
  
        <!-- ��ҳ��������ʾ���� --> 
  
       <form name="form2" action="ShowArticleFlat.jsp"> 
  
           <input type="text" size=4 value=<%=pageNo%> name="pageNo"> 
  
           <input type="submit" value="GO"> 
  
       </form> 
  
    </body> 
  
</html>