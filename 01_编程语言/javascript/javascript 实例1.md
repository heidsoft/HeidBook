event.srcElement.setCapture();  
event.srcElement.releaseCapture();   
�¼����� 
event.keyCode 
event.shiftKey 
event.altKey 
event.ctrlKey 
�¼�����ֵ 
event.returnValue 
���λ�� 
event.x 
event.y 
����Ԫ�� 
document.activeElement 
���¼� 
document.captureEvents(Event.KEYDOWN); 
���ʴ���Ԫ�� 
document.all("txt").focus(); 
document.all("txt").select(); 
�������� 
document.execCommand 
����COOKIE 
document.cookie 
�˵��¼� 
document.oncontextmenu 
����Ԫ�� 
document.createElement("SPAN");   
���������Ԫ�أ� 
document.elementFromPoint(event.x,event.y).tagName=="TD 
document.elementFromPoint(event.x,event.y).appendChild(ms)   
����ͼƬ 
document.images[����] 
�����¼��� 
document.onmousedown=scrollwindow; 
Ԫ�� 
document.����.elements[����] 
������¼� 
document.all.xxx.detachEvent('onclick',a); 
�����Ŀ 
navigator.plugins 
ȡ�������� 
typeof($js_libpath) == "undefined" 
������ 
������.options[����] 
������.options.length 
���Ҷ��� 
document.getElementsByName("r1"); 
document.getElementById(id); 
��ʱ 
timer=setInterval('scrollwindow()',delay); 
clearInterval(timer); 
UNCODE���� 
escape() ,unescape 
������ 
obj.parentElement(dhtml) 
obj.parentNode(dom) 
��������� 
TableID.moveRow(2,1) 
�滻CSS 
document.all.csss.href = "a.css"; 
������ʾ 
display:inline 
���ؽ��� 
hidefocus=true 
���ݿ�Ȼ��� 
style="word-break:break-all" 
�Զ�ˢ�� 
<meta HTTP-EQUIV="refresh" C> 
���ʼ� 
<a  href="[email=aaa@bbb.com?subject=ccc&body=xxxyyy]mailto:aaa@bbb.com?subject=ccc&body=xxxyyy[/email]">   
����ת��λ�� 
obj.scrollIntoView(true) 
ê 
<a name="first"> 
<a href="#first">anchors</a> 
��ҳ���ݲ��� 
location.search(); 
�ɱ༭ 
obj.contenteditable=true 
ִ�в˵����� 
obj.execCommand 
˫�ֽ��ַ� 
/[^\x00-\xff]/ 
���� 
/[\u4e00-\u9fa5]/ 
��Ӣ���ַ�������������Զ����� 
word-wrap: break-word; word-break: break-all; 
͸������ 
<IFRAME src="1.htm" width=300 height=180 allowtransparency></iframe> 
���style���� 
obj.style.cssText 
HTML��ǩ 
document.documentElement.innerHTML 
��һ��style��ǩ 
document.styleSheets[0] 
style��ǩ��ĵ�һ����ʽ 
document.styleSheets[0].rules[0] 
��ֹ���������ʱ��ҳ���������õ�ҳ�׶ˡ� 
<a href="javascript:function()">word</a> 
��һ��ҳԴ 
asp: 
request.servervariables("HTTP_REFERER") 
javascript: 
document.referrer 
�ͷ��ڴ� 
CollectGarbage(); 
��ֹ�Ҽ� 
document.oncontextmenu = function() { return false;} 
��ֹ���� 
<noscript><iframe src="*.htm"></iframe></noscript> 
��ֹѡȡ<body      Shortcut Icon" href="favicon.ico"> 
favicon.ico ������ò���16*16��16ɫ,������Ŀ¼��Ŀ¼�� 
�ղ���ͼ�� 
<link rel="Bookmark" href="favicon.ico"> 
�鿴Դ�� 
<input type=button value=�鿴��ҳԴ���� > 
�ر����뷨 
<input style="ime-mode:disabled"> 
�Զ�ȫѡ 
<input type=text name=text1 value="123" > 
ENTER�������ù���Ƶ���һ������� 
<input > 
�ı����Ĭ��ֵ 
<input type=text value="123" > 
title���� 
obj.title = "123 sdfs " 
���ʱ���������΢�� 
var n1 = new Date("2004-10-10".replace(/-/g, "\/")).getTime() 
�����Ƿ�ر� 
win.closed 

checkbox��ƽ 
<input type=checkbox style="position: absolute; clip:rect(5px 15px 15px 5px)"><br> 
��ȡѡ������ 
document.selection.createRange().duplicate().text 
�Զ���ɹ��� 
<input  type=text  autocomplete=on>�򿪸ù���  
<input  type=text  autocomplete=off>�رոù��� 
������� 
<body > 
�޹رհ�ťIE window.open("aa.htm", "meizz", "fullscreen=7"); 
ͳһ����/���� alert(decodeURIComponent(encodeURIComponent("http://���.com?as= hehe"))) 
encodeURIComponent��":"��"/"��";" �� "?"Ҳ���� 
 


[ ��������� ݸ��֮�� �� 2007-4-17 13:27 �༭ ] 
���»ظ�
ݸ��֮�� at 2007-4-17 11:29:12 
�߼�Ӧ��(һ) ~~~~~~~~~~~~~~


//���ֳߴ� 

s  +=  "\r\n��ҳ�ɼ������"+  document.body.clientWidth;   
s  +=  "\r\n��ҳ�ɼ�����ߣ�"+  document.body.clientHeight;   
s  +=  "\r\n��ҳ�ɼ�����ߣ�"+  document.body.offsetWeight  +"  (�������ߵĿ�)";   
s  +=  "\r\n��ҳ�ɼ�����ߣ�"+  document.body.offsetHeight  +"  (�������ߵĿ�)";   
s  +=  "\r\n��ҳ����ȫ�Ŀ�"+  document.body.scrollWidth;   
s  +=  "\r\n��ҳ����ȫ�ĸߣ�"+  document.body.scrollHeight;   
s  +=  "\r\n��ҳ����ȥ�ĸߣ�"+  document.body.scrollTop;   
s  +=  "\r\n��ҳ����ȥ����"+  document.body.scrollLeft;   
s  +=  "\r\n��ҳ���Ĳ����ϣ�"+  window.screenTop;   
s  +=  "\r\n��ҳ���Ĳ�����"+  window.screenLeft;   
s  +=  "\r\n��Ļ�ֱ��ʵĸߣ�"+  window.screen.height;   
s  +=  "\r\n��Ļ�ֱ��ʵĿ�"+  window.screen.width;   
s  +=  "\r\n��Ļ���ù������߶ȣ�"+  window.screen.availHeight;   
s  +=  "\r\n��Ļ���ù�������ȣ�"+  window.screen.availWidth;   



//�������� 

<input type=text onkeypress="return event.keyCode>=48&&event.keyCode<=57||(this.value.indexOf('.')<0?event.keyCode==46:false)" onpaste="return !clipboardData.getData('text').match(/\D/)" ondragenter="return false"> 


//������; 

<input type=button value=�����ղؼ� onclick="window.external.ImportExportFavorites(true,'http://localhost');"> 
<input type=button value=�����ղؼ� onclick="window.external.ImportExportFavorites(false,'http://localhost');"> 
<input type=button value=�����ղؼ� onclick="window.external.ShowBrowserUI('OrganizeFavorites', null)"> 
<input type=button value=��������   onclick="window.external.ShowBrowserUI('LanguageDialog', null)"> 
<input type=button value=�����ղؼ� onclick="window.external.AddFavorite('http://www.google.com/', 'google')"> 
<input type=button value=���뵽Ƶ�� onclick="window.external.addChannel('http://www.google.com/')"> 
<input type=button value=���뵽Ƶ�� onclick="window.external.showBrowserUI('PrivacySettings',null)"> 


//������ 

<META HTTP-EQUIV="pragma" CONTENT="no-cache"> 
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate"> 
<META HTTP-EQUIV="expires" CONTENT="0"> 


//����ƥ�� 

ƥ�������ַ���������ʽ�� [\u4e00-\u9fa5] 
ƥ��˫�ֽ��ַ�(������������)��[^\x00-\xff] 
ƥ����е�������ʽ��\n[\s| ]*\r 
ƥ��HTML��ǵ�������ʽ��/<(.*)>.*<\/\1>|<(.*) \/>/  
ƥ����β�ո��������ʽ��(^\s*)|(\s*$)����vbscript������trim������ 
ƥ��Email��ַ��������ʽ��\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)* 
ƥ����ַURL��������ʽ��http://([\w-]+\.)+[\w-]+(/[\w- ./?%&=]*)? 
���������ӣ� 
����������ʽ������ҳ������ı����������ݣ� 
��������ʽ����ֻ���������ģ�onkeyup="value=value.replace(/[^\u4E00-\u9FA5]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))" 
1.��������ʽ����ֻ������ȫ���ַ��� onkeyup="value=value.replace(/[^\uFF00-\uFFFF]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\uFF00-\uFFFF]/g,''))" 
2.��������ʽ����ֻ���������֣�onkeyup="value=value.replace(/[^\d]/g,'') "onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))" 
3.��������ʽ����ֻ���������ֺ�Ӣ�ģ�onkeyup="value=value.replace(/[\W]/g,'') "onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))" 


//����ͼ�񹤾���

<IMG SRC="mypicture.jpg" HEIGHT="100px" WIDTH="100px" GALLERYIMG="false">  
or 
<head> 
<meta http-equiv="imagetoolbar" content="no"> 
</head> 


//����ʾ�ر� 

function Close() 
{ 
var ua=navigator.userAgent 
var ie=navigator.appName=="Microsoft Internet Explorer"?true:false 
if(ie) 
{ 
      var IEversion=parseFloat(ua.substring(ua.indexOf("MSIE ")+5,ua.indexOf(";",ua.indexOf("MSIE ")))) 
  if(IEversion< 5.5) 
  { 
   var str  = '<object id=noTipClose classid="clsid:ADB880A6-D8FF-11CF-9377-00AA003B7A11">' 
       str += '<param name="Command" value="Close"></object>'; 
       document.body.insertAdjacentHTML("beforeEnd", str); 
       document.all.noTipClose.Click(); 
  } 
      else 
  { 
       window.opener =null; 
       window.close(); 
      } 
   } 
else 
{ 
  window.close() 
   } 
} 



//ȡ�ÿؼ��þ���λ��(1) 

<script language="javascript">  
function getoffset(e) 
{  
var t=e.offsetTop;  
var l=e.offsetLeft;  
while(e=e.offsetParent) 
{  
  t+=e.offsetTop;  
  l+=e.offsetLeft;  
}  
var rec = new Array(1); 
rec[0]  = t; 
rec[1] = l; 
return rec 
}  
</script> 



//��ÿؼ��ľ���λ��(2) 

oRect = obj.getBoundingClientRect(); 
oRect.left 
oRect. 


//��С��,���,�ر�

<object id=min classid="clsid:ADB880A6-D8FF-11CF-9377-00AA003B7A11">  
<param name="Command" value="Minimize"></object>  
<object id=max classid="clsid:ADB880A6-D8FF-11CF-9377-00AA003B7A11">  
<param name="Command" value="Maximize"></object>  
<OBJECT id=close classid="clsid:adb880a6-d8ff-11cf-9377-00aa003b7a11">  
<PARAM NAME="Command" value="Close"></OBJECT>  
<input type=button value=��С�� onclick=min.Click()>  
<input type=button value=��� onclick=max.Click()>  
<input type=button value=�ر� onclick=close.Click()>  



[ ��������� ݸ��֮�� �� 2007-4-17 13:21 �༭ ]
ݸ��֮�� at 2007-4-17 11:30:53 
����~~~~~~~~~

//���ͣ��������� 


<script language="javascript"> 
function cc() 
{ 
var e = event.srcElement; 
var r =e.createTextRange(); 
r.moveStart('character',e.value.length); 
r.collapse(true); 
r.select(); 
} 
</script> 
<input type=text name=text1 value="123" onfocus="cc()"> 

//ҳ�������˳�����Ч 

����ҳ��<meta http-equiv="Page-Enter" content="revealTrans(duration=x, transition=y)"> 
�Ƴ�ҳ��<meta http-equiv="Page-Exit" content="revealTrans(duration=x, transition=y)">  
�����ҳ�汻����͵���ʱ��һЩ��Ч��duration��ʾ��Ч�ĳ���ʱ�䣬����Ϊ��λ��transition��ʾʹ 
��������Ч��ȡֵΪ1-23: 
����0 ������С  
����1 ��������  
����2 Բ����С 
����3 Բ������  
����4 �µ���ˢ��  
����5 �ϵ���ˢ�� 
����6 ����ˢ��  
����7 �ҵ���ˢ��  
����8 ����Ҷ�� 
����9 ���Ҷ��  
����10 ��λ���Ҷ��  
����11 ��λ����Ҷ�� 
����12 ����ɢ  
����13 ���ҵ��м�ˢ��  
����14 �м䵽����ˢ�� 
����15 �м䵽���� 
����16 ���µ��м�  
����17 ���µ����� 
����18 ���ϵ�����  
����19 ���ϵ�����  
����20 ���µ����� 
����21 ����  
����22 ����  
����23  


//��ҳ�Ƿ񱻼��� <meta name="ROBOTS" content="����ֵ"> 
������������ֵ������һЩ: 
��������ֵΪ"all": �ļ�������������ҳ�����ӿɱ���ѯ�� 
��������ֵΪ"none": �ļ��������������Ҳ���ѯҳ�ϵ����ӣ� 
��������ֵΪ"index": �ļ����������� 
��������ֵΪ"follow": ��ѯҳ�ϵ����ӣ� 
��������ֵΪ"noindex": �ļ������������ɱ���ѯ���ӣ� 
��������ֵΪ"nofollow":  


//��ӡ��ҳ <p  style="page-break-after:always">page1</p>   
<p  style="page-break-after:always">page2</p>   



//���ô�ӡ 

<object id="factory" style="display:none" viewastext 
  classid="clsid:1663ed61-23eb-11d2-b92f-008048fdd814" 
  codebase="http://www.meadroid.com/scriptx/ScriptX.cab#Version=5,60,0,360" 
></object> 
<input type=button value=ҳ������ onclick="factory.printing.PageSetup()"> 
<input type=button value=��ӡԤ�� onclick="factory.printing.Preview()"> 
  
<script language=javascript> 
function window.onload() 
{ 
   // -- advanced features 
   factory.printing.SetMarginMeasure(2) // measure margins in inches 
   factory.printing.SetPageRange(false, 1, 3) // need pages from 1 to 3 
   factory.printing.printer = "HP DeskJet 870C" 
   factory.printing.copies = 2 
   factory.printing.collate = true 
   factory.printing.paperSize = "A4" 
   factory.printing.paperSource = "Manual feed" 
   // -- basic features 
   factory.printing.header = "������ʾ&b������ʾ&b������ʾҳ�룬��&pҳ/��&Pҳ" 
   factory.printing.footer = "���Զ���ҳ�ţ�" 
   factory.printing.portrait = false 
   factory.printing.leftMargin = 0.75 
   factory.printing.topMargin = 1.5 
   factory.printing.rightMargin = 0.75 
   factory.printing.bottomMargin = 1.5 
} 
function Print(frame) { 
  factory.printing.Print(true, frame) // print with prompt 
} 
</script> 
<input type=button value="��ӡ��ҳ" onclick="factory.printing.Print(false)"> 
<input type=button value="ҳ������" onclick="factory.printing.PageSetup()"> 
<input type=button value="��ӡԤ��" onclick="factory.printing.Preview()"><br> 
<a href="http://www.meadroid.com/scriptx/docs/printdoc.htm?static"  target=_blank>����ʹ���ֲᣬ������Ϣ��������</a> 


//�Դ��Ĵ�ӡԤ�� 
WebBrowser.ExecWB(1,1) ��  
Web.ExecWB(2,1) �ر��������е�IE���ڣ�����һ���´���  
Web.ExecWB(4,1) ������ҳ  
Web.ExecWB(6,1) ��ӡ  
Web.ExecWB(7,1) ��ӡԤ��  
Web.ExecWB(8,1) ��ӡҳ������  
Web.ExecWB(10,1) �鿴ҳ������  
Web.ExecWB(15,1) �����ǳ������д�ȷ��  
Web.ExecWB(17,1) ȫѡ  
Web.ExecWB(22,1) ˢ��  
Web.ExecWB(45,1) �رմ�������ʾ  
<style media=print>  
.Noprint{display:none;}<!--�ñ���ʽ�ڴ�ӡʱ���طǴ�ӡ��Ŀ-->  
.PageNext{page-break-after: always;}<!--���Ʒ�ҳ-->  
</style>  
<object  id="WebBrowser"  width=0  height=0  classid="CLSID:8856F961-340A-11D0-A96B-00C04FD705A2">     
</object>     
  
<center class="Noprint" > 
<input type=button value=��ӡ onclick=document.all.WebBrowser.ExecWB(6,1)>  
<input type=button value=ֱ�Ӵ�ӡ onclick=document.all.WebBrowser.ExecWB(6,6)>  
<input type=button value=ҳ������ onclick=document.all.WebBrowser.ExecWB(8,1)>  
</p>  
<p> <input type=button value=��ӡԤ�� onclick=document.all.WebBrowser.ExecWB(7,1)>  
</center> 



//ȥ����ӡʱ��ҳüҳ�� 

<script  language="JavaScript">   
var HKEY_Root,HKEY_Path,HKEY_Key; 
HKEY_Root="HKEY_CURRENT_USER"; 
HKEY_Path="\\Software\\Microsoft\\Internet Explorer\\PageSetup\\"; 
//������ҳ��ӡ��ҳüҳ��Ϊ�� 
function PageSetup_Null() 
{ 
try 
{ 
         var Wsh=new ActiveXObject("WScript.Shell"); 
  HKEY_Key="header"; 
  Wsh.RegWrite(HKEY_Root+HKEY_Path+HKEY_Key,""); 
  HKEY_Key="footer"; 
  Wsh.RegWrite(HKEY_Root+HKEY_Path+HKEY_Key,""); 
} 
catch(e){} 
} 
//������ҳ��ӡ��ҳüҳ��ΪĬ��ֵ 
function  PageSetup_Default() 
{   
try 
{ 
  var Wsh=new ActiveXObject("WScript.Shell"); 
  HKEY_Key="header"; 
  Wsh.RegWrite(HKEY_Root+HKEY_Path+HKEY_Key,"&w&bҳ��,&p/&P"); 
  HKEY_Key="footer"; 
  Wsh.RegWrite(HKEY_Root+HKEY_Path+HKEY_Key,"&u&b&d"); 
} 
catch(e){} 
} 
</script> 
<input type="button" value="���ҳ��" onclick=PageSetup_Null()> 
<input type="button" value="�ָ�ҳ��" onclick=PageSetup_Default()> 


//�������֤ 

function checkBrowser() 
{  
   this.ver=navigator.appVersion  
   this.dom=document.getElementById?1:0  
   this.ie6=(this.ver.indexOf("MSIE 6")>-1 && this.dom)?1:0;  
   this.ie5=(this.ver.indexOf("MSIE 5")>-1 && this.dom)?1:0;  
   this.ie4=(document.all && !this.dom)?1:0;  
   this.ns5=(this.dom && parseInt(this.ver) >= 5) ?1:0;  
   this.ns4=(document.layers && !this.dom)?1:0;  
   this.mac=(this.ver.indexOf('Mac') > -1) ?1:0;  
   this.ope=(navigator.userAgent.indexOf('Opera')>-1);  
   this.ie=(this.ie6 || this.ie5 || this.ie4)  
   this.ns=(this.ns4 || this.ns5)  
   this.bw=(this.ie6 || this.ie5 || this.ie4 || this.ns5 || this.ns4 || this.mac || this.ope)  
   this.nbw=(!this.bw)  
   return this; 
} 




[ ��������� ݸ��֮�� �� 2007-4-17 11:36 �༭ ]
ݸ��֮�� at 2007-4-17 11:31:45 
�ټ���~~~~~~~~~~~

//�������ݿ�͸�

<SCRIPT  language="javascript">   
function  test(obj)   
{   
       var  range  =  obj.createTextRange();   
       alert("���������:  "  +  range.boundingWidth     
                                                 +  "px\r\n�������߶�:  "  +  range.boundingHeight  +  "px");   
              
}   
</SCRIPT>   
<BODY>   
<Textarea id="txt" height="150">sdf</textarea><INPUT  type="button"  value="�������ݿ��"  onClick="test(txt)">   
</BODY> 



//��ģʽ����ʾ�� function modelessAlert(Msg) 
{ 
   window.showModelessDialog("javascript:alert(\""+escape(Msg)+"\");window.close();","","status:no;resizable:no;help:no;dialogHeight:height:30px;dialogHeight:40px;"); 
} 



//���ΰ��� 
<html> 
<head> 
  <meta http-equiv="Content-Type" content="text/html; charset=gb2312"> 
  <noscript><meta http-equiv="refresh" content="0;url=about:noscript"></noscript> 
  <title>��������Ҽ���Ctrl+N��Shift+F10��Alt+F4��F11��F5ˢ�¡��˸��</title> 
</head> 
<body> 
<script language="Javascript"><!-- 
  //��������Ҽ���Ctrl+N��Shift+F10��F11��F5ˢ�¡��˸�� 
  //Author: meizz(÷����) 2002-6-18 
function document.oncontextmenu(){event.returnValue=false;}//��������Ҽ� 
function window.onhelp(){return false} //����F1���� 
function document.onkeydown() 
{ 
  if ((window.event.altKey)&& 
      ((window.event.keyCode==37)||   //���� Alt+ ����� �� 
       (window.event.keyCode==39)))   //���� Alt+ ����� �� 
  { 
     alert("��׼��ʹ��ALT+�����ǰ���������ҳ��"); 
     event.returnValue=false; 
  } 
     /* ע���⻹�������������� Alt+ ������� 
     ��Ϊ Alt+ ��������������ʱ����ס Alt �����ţ� 
     �������������������η�����ʧЧ�ˡ��Ժ��� 
     ����λ�������������� Alt ���ķ��������֪��*/ 
  if ((event.keyCode==8)  ||                 //�����˸�ɾ���� 
      (event.keyCode==116)||                 //���� F5 ˢ�¼� 
      (event.ctrlKey && event.keyCode==82)){ //Ctrl + R 
     event.keyCode=0; 
     event.returnValue=false; 
     } 
  if (event.keyCode==122){event.keyCode=0;event.returnValue=false;}  //����F11 
  if (event.ctrlKey && event.keyCode==78) event.returnValue=false;   //���� Ctrl+n 
  if (event.shiftKey && event.keyCode==121)event.returnValue=false;  //���� shift+F10 
  if (window.event.srcElement.tagName == "A" && window.event.shiftKey)  
      window.event.returnValue = false;             //���� shift ���������¿�һ��ҳ 
  if ((window.event.altKey)&&(window.event.keyCode==115))             //����Alt+F4 
  { 
      window.showModelessDialog("about:blank","","dialogWidth:1px;dialogheight:1px"); 
      return false; 
  } 
} 
</script> 
��������Ҽ���Ctrl+N��Shift+F10��Alt+F4��F11��F5ˢ�¡��˸�� 
</body> 
</html> 


//���δ�ӡ 
<style> 
@media print{ 
* {display:none} 
} 
</style> 


//�ƶ���ͼ�㣬�϶� 

1.<span style='position:absolute;width:200;height:200;background:red' onmousedown=MouseDown(this) onmousemove=MouseMove() onmouseup=MouseUp()>meizz</span> 
<script language=javascript> 
var Obj; 
function MouseDown(obj) 
{ 
  Obj=obj; 
  Obj.setCapture(); 
  Obj.l=event.x-Obj.style.pixelLeft; 
  Obj.t=event.y-Obj.style.pixelTop; 
} 
function MouseMove() 
{ 
  if(Obj!=null) 
  { 
    Obj.style.left = event.x-Obj.l; 
    Obj.style.top = event.y-Obj.t; 
  } 
} 
function MouseUp() 
{ 
  if(Obj!=null) 
  { 
    Obj.releaseCapture(); 
    Obj=null; 
  } 
} 
</script> 
2. 
<div id="myDiv" src="logo.gif" ondrag="doDrag();" onmouseover="this.style.cursor='hand'" style="position:absolute;left=100;top=100;" onmousedown="doMouseDown();"> 
<a href="#" onclick="return false"><h1>wlecome</h1></a> 
</div> 
<script language="JavaScript" type="text/javascript"> 
var orgMouseX; 
var orgMouseY; 
var orgObjX; 
var orgObjY; 
function doDrag() 
{ 
var myObject=document.all.myDiv; 

var x=event.clientX; 
var y=event.clientY; 
myObject.style.left=x-(orgMouseX-orgObjX); 
myObject.style.top=y-(orgMouseY-orgObjY); 
  
} 
function doMouseDown() 
{ 
orgMouseX=event.clientX; 
orgMouseY=event.clientY; 
orgObjX=parseInt(document.all.myDiv.style.left); 
orgObjY=parseInt(document.all.myDiv.style.top); 
} 

</script> 
  
//�ĵ�״̬�ı� 

<iframe src="a.html" id="f" name="f" scrolling="no" frameborder=0 marginwidth=0 marginheight=0></iframe> 
<script> 
var doc=window.frames["f"].document; 
function s(){ 
if (doc.readyState=="complete"){ 
  document.all.f.style.height=doc.body.scrollHeight 
  document.all.f.style.width=doc.body.scrollWidth 
} 
} 
doc.onreadystatechange=s 
</script> 


//ˢ�º󲻱���ı��� <HTML> 
<HEAD> 
<META NAME="save" CONTENT="history"> 
<STYLE> 
   .sHistory {behavior:url(#default#savehistory);} 
</STYLE> 
</HEAD> 
<BODY> 
<INPUT class=sHistory type=text id=oPersistInput> 
</BODY> 
</HTML> 



[ ��������� ݸ��֮�� �� 2007-4-17 11:34 �༭ ]
ݸ��֮�� at 2007-4-17 11:33:22 
���ڼ���~~~~~~~~~~~~ 


//���ʼ����� 

event.dataTransfer.setData("URL", oImage.src); 
sImageURL = event.dataTransfer.getData("URL") 
(2)��ͨ���� 
window.clipboardData.setData("Text",oSource.innerText); 
window.clipboardData.getData("Text"); 


//����COOKIE 

function SetCookie(sName, sValue) 
{ 
document.cookie = sName + "=" + escape(sValue) + "; "; 
} 
function GetCookie(sName) 
{ 
var aCookie = document.cookie.split("; "); 
for (var i=0; i < aCookie.length; i++) 
{ 
   
  var aCrumb = aCookie.split("="); 
  if (sName == aCrumb[0])  
  return unescape(aCrumb[1]); 
} 
  
} 
function DelCookie(sName) 
{ 
document.cookie = sName + "=" + escape(sValue) + "; expires=Fri, 31 Dec 1999 23:59:59 GMT;"; 
} 


//setTimeout���Ӳ��� 

<script> 
var _st = window.setTimeout; 
window.setTimeout = function(fRef, mDelay) { 
if(typeof fRef == 'function'){ 
  var argu = Array.prototype.slice.call(arguments,2); 
  var f = (function(){ fRef.apply(null, argu); }); 
  return _st(f, mDelay); 
} 
return _st(fRef,mDelay); 
} 
function test(x){ 
alert(x); 
} 
window.setTimeout(test,1000,'fason'); 
</script> 


//�Զ����apply,call 

Function.prototype.apply = function (obj, argu) { 
if (obj) obj.constructor.prototype._caller = this;  
var argus = new Array(); 
for (var i=0;i<argu.length;i++) 
  argus = "argu[" + i + "]"; 
var r; 
eval("r = " + (obj ? ("obj._caller(" + argus.join(",") + ");") : ("this(" + argus.join(",") + ");"))); 
return r; 
}; 
Function.prototype.call = function (obj) { 
var argu = new Array(); 
for (var i=1;i<arguments.length;i++) 
  argu[i-1] = arguments; 
return this.apply(obj, argu); 
};        

//�����ļ� 

function DownURL(strRemoteURL,strLocalURL) 
{ 
try 
{ 
  var xmlHTTP=new ActiveXObject("Microsoft.XMLHTTP"); 
  xmlHTTP.open("Get",strRemoteURL,false); 
  xmlHTTP.send(); 
  var adodbStream=new ActiveXObject("ADODB.Stream"); 
  adodbStream.Type=1;//1=adTypeBinary 
  adodbStream.Open(); 
  adodbStream.write(xmlHTTP.responseBody); 
  adodbStream.SaveToFile(strLocalURL,2); 
  adodbStream.Close(); 
  adodbStream=null; 
  xmlHTTP=null; 
   
} 
catch(e) 
{ 
  window.confirm("����URL����!"); 
} 
//window.confirm("�������."); 
} 

//���������Ƿ���Ч 

function getXML(URL)  
{ 
var xmlhttp = new ActiveXObject("microsoft.xmlhttp"); 
xmlhttp.Open("GET",URL, false);  
try 
{  
  xmlhttp.Send(); 
} 
catch(e){} 
finally  
{ 
  var result = xmlhttp.responseText; 
  if(result)  
  { 
   if(xmlhttp.Status==200) 
   { 
    return(true); 
   } 
   else  
   { 
    return(false); 
   } 
  } 
  else  
  { 
   return(false); 
  } 
} 
} 



//POST����FORM 

<SCRIPT language="VBScript"> 
Function URLEncoding(vstrIn) 
    strReturn = "" 
    For i = 1 To Len(vstrIn) 
        ThisChr = Mid(vStrIn,i,1) 
        If Abs(Asc(ThisChr)) < &HFF Then 
            strReturn = strReturn & ThisChr 
        Else 
            innerCode = Asc(ThisChr) 
            If innerCode < 0 Then 
                innerCode = innerCode + &H10000 
            End If 
            Hight8 = (innerCode  And &HFF00)\ &HFF 
            Low8 = innerCode And &HFF 
            strReturn = strReturn & "%" & Hex(Hight8) &  "%" & Hex(Low8) 
        End If 
    Next 
    URLEncoding = strReturn 
End Function 
Function bytes2BSTR(vIn) 
    strReturn = "" 
    For i = 1 To LenB(vIn) 
        ThisCharCode = AscB(MidB(vIn,i,1)) 
        If ThisCharCode < &H80 Then 
            strReturn = strReturn & Chr(ThisCharCode) 
        Else 
            NextCharCode = AscB(MidB(vIn,i+1,1)) 
            strReturn = strReturn & Chr(CLng(ThisCharCode) * &H100 + CInt(NextCharCode)) 
            i = i + 1 
        End If 
    Next 
    bytes2BSTR = strReturn 
End Function 
dim strA,oReq 
strA = URLEncoding("submit1=Submit&text1=����") 
set oReq = CreateObject("MSXML2.XMLHTTP") 
oReq.open "POST","http://ServerName/VDir/TstResult.asp",false 
oReq.setRequestHeader "Content-Length",Len(strA) 
oReq.setRequestHeader "CONTENT-TYPE","application/x-www-form-urlencoded" 
oReq.send strA 
msgbox bytes2BSTR(oReq.responseBody) 
</SCRIPT> 

//readyState��xmlhttp�������ݵĽ��ȣ�0=������,1=δ��ʼ��,2=������,3=������,4=���






[ ��������� ݸ��֮�� �� 2007-4-17 13:22 �༭ ]
��ʯ at 2007-4-17 11:36:30 
������

���ˣ���ϧ�ҿ�������
ݸ��֮�� at 2007-4-17 11:40:38 
�߼�Ӧ�ã�����~~~~~~~~~~~~~~~~


//����Ƿ�װ 

isComponentInstalled("{6B053A4B-A7EC-4D3D-4567-B8FF8A1A5739}", "componentID")) 



//�����ҳ�Ƿ���� 

function CheckURL(URL) 
{ 
  var xmlhttp = new ActiveXObject("Microsoft.XMLHTTP"); 
  xmlhttp.Open("GET",URL, false); 
  try 
  {  
    xmlhttp.Send();  
    var result = xmlhttp.status; 
  } 
  catch(e) {return(false); } 
  if(result==200) 
  {  
    return true; 
  } 
  xmlhttp = null; 
  return false; 
} 


//�������ݿ� 

<script language="javascript"> 
  //�� JavaScript д���������������ݿ�Ĵ���ʾ�� 
  var conn = new ActiveXObject("ADODB.Connection"); 
  conn.Open("Provider=SQLOLEDB.1; Data Source=localhost; User ID=sa; " 
    +"Password=; Initial Catalog=pubs"); 
  var rs = new ActiveXObject("ADODB.Recordset"); 
  var sql="select * from authors"; 
  rs.open(sql, conn); 
shtml = "<table width='100%' border=1>"; 
shtml +="<tr bgcolor='#f4f4f4'><td>au_id</td><td>au_lname</td><td>au_fname</td><td>phone</td><td>address</td><td> city</td><td>state</td><td>zip</td></tr>"; 
  while(!rs.EOF) 
  { 
shtml += "<tr><td>" + rs("au_id") + "</td><td>" + rs("au_lname") + "</td><td>" + rs("au_fname") + "</td><td>" + rs("phone") + "</td><td>" + rs("address") + "</td><td>" + rs("city") + "</td><td>" + rs("state") + "</td><td>" + rs("zip") + "</td></tr>"; 
rs.moveNext; 
  } 
  shtml += "</table>"; 
  document.write(shtml); 
  rs.close();  
  rs = null;  
  conn.close();  
  conn = null; 
</script> 


//ʹ�����ݵ� 

<html> 
<body> 
srno��<input type=text datasrc=#xmldate DataFLD=srno size="76"><BR> 
times��<input type=text datasrc=#xmldate DataFLD=times size="76"><BR> 
<input id="first" TYPE=button value="<<����һ����¼" onclick="xmldate.recordset.moveFirst()"> 
<input id="prev" TYPE=button value="<��һ����¼" onclick="xmldate.recordset.movePrevious()">   
<input id="next" TYPE=button value="��һ����¼>" onclick="xmldate.recordset.moveNext()">   
<input id="last" TYPE=button value="���һ����¼>>" onclick="xmldate.recordset.moveLast()">    
<input id="Add" TYPE=button value="����¼�¼" onclick="xmldate.recordset.addNew()">   

<XML ID="xmldate"> 
<infolist> 
<info ><srno>20041025-01</srno><times>null</times></info> 
<info ><srno>20041101-09</srno><times>2004��10��1��2��22��0��</times></info> 
</infolist> 
</XML> 
</body> 
</html> 


//��ò��� 

<body> 
<a href="javascript:location.href=location.href + '?a=1&b=2'">search</a> 
<script language="JavaScript"> 
<!-- 
var a = location.search.substr(1); 
if(a.length>0) 
{ 
var re = /([^&]*?)\=([^&]*)/g 
var s = a.match(re); 
for(var i= 0;i<s.length;i++) 
{ 
  alert(s); 
  alert(s.split("=")[1]); 
} 
} 
//--> 
</script> 
</body> 



//�ɱ༭SELECT 

<input type=text name=re_name style="width:100px;height:21px;font-size:10pt;"><span style="width:18px;border:0px solid red;"><select name="r00" style="margin-left:-100px;width:118px; background-color:#FFEEEE;" onChange="document.all.re_name.value=this.value;"> 
                <option value="1">11111111<option> 
                <option value="2">222222</option> 
                <option value="3">333333</option> 
              </select> 
              </span> 



//���ù��λ�� 

function getCaret(textbox) 
{ 
var control = document.activeElement; 
textbox.focus(); 
var rang = document.selection.createRange(); 
  rang.setEndPoint("StartToStart",textbox.createTextRange()) 
control.focus(); 
return rang.text.length; 
} 
function setCaret(textbox,pos) 
{ 
try 
{ 
  var r =textbox.createTextRange(); 
   r.moveStart('character',pos); 
   r.collapse(true); 
   r.select(); 
} 
catch(e) 
{} 
} 
function selectLength(textbox,start,len) 
{ 
try 
{ 
  var r =textbox.createTextRange(); 
  
  r.moveEnd('character',len-(textbox.value.length-start)); 
  r.moveStart('character',start); 
   
  r.select(); 
} 
catch(e) 
{//alert(e.description)} 
} 
function insertAtCaret(textbox,text) 
{ 
textbox.focus(); 
document.selection.createRange().text = text; 
} 





[ ��������� ݸ��֮�� �� 2007-4-17 13:23 �༭ ]
ݸ��֮�� at 2007-4-17 11:46:52 
������Ϣһ��~~~~~��������~~~~


//ҳ�ڲ��� 

function findInPage(str) 
{ 
var txt, i, found,n = 0; 
if (str == "") 
{ 
  return false; 
} 
txt = document.body.createTextRange(); 
for (i = 0; i <= n && (found = txt.findText(str)) != false; i++) 
{ 
  txt.moveStart("character", 1); 
  txt.moveEnd("textedit"); 
} 
if (found) 
{ 
  txt.moveStart("character", -1); 
  txt.findText(str); 
  txt.select(); 
  txt.scrollIntoView(); 
  n++;   
} 
else 
{ 
  if (n > 0) 
  { 
   n = 0; 
   findInPage(str); 
  } 
  else 
  { 
   alert(str + "...            ��Ҫ�ҵ����ֲ����ڡ�\n \n����������ҳ���еĹؼ����ٴβ��ң�"); 
  } 
} 
return false; 
} 




//����EXECL 

<script language="javascript"> 
function jStartExcel() { 
var xls = new ActiveXObject ( "Excel.Application" ); 
xls.visible = true; 
var newBook = xls.Workbooks.Add; 
newBook.Worksheets.Add; 
newBook.Worksheets(1).Activate; 
xls.ActiveWorkBook.ActiveSheet.PageSetup.Orientation = 2; 
xls.ActiveWorkBook.ActiveSheet.PageSetup.PaperSize = 5; 
newBook.Worksheets(1).Columns("A").columnwidth=50; 
newBook.Worksheets(1).Columns("A").WrapText = true; 
newBook.Worksheets(1).Columns("B").columnwidth=50; 
newBook.Worksheets(1).Columns("B").WrapText = true; 
newBook.Worksheets(1).Range("A1:B1000").NumberFormat = "0"; 
newBook.Worksheets(1).Range("A1:B1000").HorizontalAlignment = -4131; 
newBook.Worksheets(1).Cells(1,1).Interior.ColorIndex="15"; 
newBook.Worksheets(1).Cells(1,1).value="First Column, First Cell"; 
newBook.Worksheets(1).Cells(2,1).value="First Column, Second Cell"; 
newBook.Worksheets(1).Cells(1,2).value="Second Column, First Cell"; 
newBook.Worksheets(1).Cells(2,2).value="Second Column, Second Cell"; 
newBook.Worksheets(1).Name="My First WorkSheet"; 
} 
</script> 


//�Զ�����ʾ�� 

<a href="#" title="������ʾ">tip</a> 
<script Language="JavaScript"> 
//***********Ĭ�����ö���.********************* 
tPopWait=50;//ͣ��tWait�������ʾ��ʾ�� 
tPopShow=5000;//��ʾtShow�����ر���ʾ 
showPopStep=20; 
popOpacity=99; 
//***************�ڲ���������***************** 
sPop=null; 
curShow=null; 
tFadeOut=null; 
tFadeIn=null; 
tFadeWaiting=null; 
document.write("<style type='text/css'id='defaultPopStyle'>"); 
document.write(".cPopText {  background-color: #F8F8F5;color:#000000; border: 1px #000000 solid;font-color: font-size: 12px; padding-right: 4px; padding-left: 4px; height: 20px; padding-top: 2px; padding-bottom: 2px; filter: Alpha(Opacity=0)}"); 
document.write("</style>"); 
document.write("<div id='dypopLayer' style='position:absolute;z-index:1000;' class='cPopText'></div>"); 

function showPopupText(){ 
var o=event.srcElement; 
MouseX=event.x; 
MouseY=event.y; 
if(o.alt!=null && o.alt!=""){o.dypop=o.alt;o.alt=""}; 
        if(o.title!=null && o.title!=""){o.dypop=o.title;o.title=""}; 
if(o.dypop!=sPop) { 
sPop=o.dypop; 
clearTimeout(curShow); 
clearTimeout(tFadeOut); 
clearTimeout(tFadeIn); 
clearTimeout(tFadeWaiting); 
if(sPop==null || sPop=="") { 
dypopLayer.innerHTML=""; 
dypopLayer.style.filter="Alpha()"; 
dypopLayer.filters.Alpha.opacity=0; 
} 
else { 
if(o.dyclass!=null) popStyle=o.dyclass  
else popStyle="cPopText"; 
curShow=setTimeout("showIt()",tPopWait); 
} 
} 
} 
function showIt(){ 
dypopLayer.className=popStyle; 
dypopLayer.innerHTML=sPop; 
popWidth=dypopLayer.clientWidth; 
popHeight=dypopLayer.clientHeight; 
if(MouseX+12+popWidth>document.body.clientWidth) popLeftAdjust=-popWidth-24 
else popLeftAdjust=0; 
if(MouseY+12+popHeight>document.body.clientHeight) popTopAdjust=-popHeight-24 
else popTopAdjust=0; 
dypopLayer.style.left=MouseX+12+document.body.scrollLeft+popLeftAdjust; 
dypopLayer.style.top=MouseY+12+document.body.scrollTop+popTopAdjust; 
dypopLayer.style.filter="Alpha(Opacity=0)"; 
fadeOut(); 
} 
function fadeOut(){ 
if(dypopLayer.filters.Alpha.opacity<popOpacity) { 
dypopLayer.filters.Alpha.opacity+=showPopStep; 
tFadeOut=setTimeout("fadeOut()",1); 
} 
else { 
dypopLayer.filters.Alpha.opacity=popOpacity; 
tFadeWaiting=setTimeout("fadeIn()",tPopShow); 
} 
} 
function fadeIn(){ 
if(dypopLayer.filters.Alpha.opacity>0) { 
dypopLayer.filters.Alpha.opacity-=1; 
tFadeIn=setTimeout("fadeIn()",1); 
} 
} 
document.onmouseover=showPopupText; 
</script> 


//�������� 

document.onclick =function(){  
var oSource = window.event.srcElement;  
if(oSource.tagName!="DIV")  
return false;  
var sel = document.selection;  
if (sel!=null) {  
var rng = sel.createRange();  
if (rng!=null)  
rng.pasteHTML("<font color=red>��������</font>");  
}  
}  



//netscapte�²���xml 

doc = new ActiveXObject("Msxml2.DOMDocument"); 
doc = new ActiveXObject("Microsoft.XMLDOM") 
->> 
doc = (new DOMParser()).parseFromString(sXML,'text/xml') 


//��ֹFSO 

1.ע����� 
regsvr32 /u scrrun.dll 
2.�޸�PROGID  
HKEY_CLASSES_ROOT\Scripting.FileSystemObject 
Scripting.FileSystemObject 
3.����ʹ��object���û����޸�HKEY_CLASSES_ROOT\Scripting. 


//ʡ�Ժ� 

<DIV STYLE="width: 120px; height: 50px; border: 1px solid blue; 
            overflow: hidden; text-overflow:ellipsis"> 
<NOBR>���Ǳ�����һ�����֣��ܳ��������һ����ʾ����.</NOBR> 
</DIV> 



[ ��������� ݸ��֮�� �� 2007-4-17 11:53 �༭ ]
ݸ��֮�� at 2007-4-17 11:48:15 
����~~~~~~����

//�жϼ�ֵ 

<html> 
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"> 
<head> 
<script language="javascript"> 
var ie  =navigator.appName=="Microsoft Internet Explorer"?true:false; 
   
function keyDown(e) 
{ 
if(!ie) 
{ 
  var nkey=e.which; 
  var iekey='������ns�����'; 
  var realkey=String.fromCharCode(e.which); 
} 
if(ie) 
{ 
  var iekey=event.keyCode; 
  var nkey='������ie�����'; 
  var realkey=String.fromCharCode(event.keyCode); 
  if(event.keyCode==32){realkey='\' �ո�\''} 
  if(event.keyCode==13){realkey='\' �س�\''} 
  if(event.keyCode==27){realkey='\' Esc\''} 
  if(event.keyCode==16){realkey='\' Shift\''} 
  if(event.keyCode==17){realkey='\' Ctrl\''} 
  if(event.keyCode==18){realkey='\' Alt\''} 
} 
alert('ns������м�ֵ:'+nkey+'\n'+'ie������м�ֵ:'+iekey+'\n'+'ʵ�ʼ�Ϊ'+realkey); 
} 
document.onkeydown = keyDown; 
</script> 
</head> 
<body> 
//Javascript Document. 
<hr> 
<center> 
<h3>�밴����һ������������</h3> 
</center> 
</body> 
</html> 



//���media play�汾 

<IE:clientCaps ID="oClientCaps" style="{behavior:url(#default#clientcaps)}" /> 
<SCRIPT> 
var flash=""; 
    WMPVersion= oClientCaps.getComponentVersion("{22D6F312-B0F6-11D0-94AB-0080C74C7E95}","ComponentID");  
    if (WMPVersion != "") { 
    flash = ""; 
    var version = WMPVersion.split(","); 
    var i; 
    for (i = 0; i < version.length; i++) { 
      if (i != 0) 
    flash += "."; 
      flash += version; 
    } 
     document.write("����Windows Media Player �汾��:"+flash+"<p>"); 
  } 
</SCRIPT> 



//ͼ�󰴱��� 

<script language="JavaScript"> 
<!-- 
//ͼƬ���������� 
var flag=false; 
function DrawImage(ImgD){ 
var image=new Image(); 
var iwidth = 80;  //��������ͼƬ��� 
var iheight = 80;  //��������ͼƬ�߶� 
image.src=ImgD.src; 
if(image.width>0 && image.height>0){ 
flag=true; 
if(image.width/image.height>= iwidth/iheight){ 
  if(image.width>iwidth){   
  ImgD.width=iwidth; 
  ImgD.height=(image.height*iwidth)/image.width; 
  }else{ 
  ImgD.width=image.width;   
  ImgD.height=image.height; 
  } 
  ImgD.alt=image.width+"��"+image.height; 
  } 
else{ 
  if(image.height>iheight){   
  ImgD.height=iheight; 
  ImgD.width=(image.width*iheight)/image.height;   
  }else{ 
  ImgD.width=image.width;   
  ImgD.height=image.height; 
  } 
  ImgD.alt=image.width+"��"+image.height; 
  } 
} 
}  
//--> 
</script> 
<img src=".." onload = "DrawImage(this)"> 



//ϸ��SELECT 

<span style="border:1px solid #000000; position:absolute; overflow:hidden;" > 
<select style="margin:-2px;"> 
<option>1111</option> 
<option>11111111111111</option> 
<option>111111111</option> 
</select></span> 


//Import 

function Import() { 
for( var i=0; i<arguments.length; i++ ) { 
  var file = arguments; 
  if ( file.match(/\.js$/i))  
   document.write('<script type=\"text/javascript\" src=\"' + file + '\"></sc' + 'ript>'); 
  else 
   document.write('<style type=\"text/css\">@import \"' + file + '\" ;</style>'); 
} 
}; 


//jsö�� 

function getComputerName() 
{ 
var objWMIService = GetObject("Winmgmts:root\cimv2"); 
for(e = new Enumerator(objWMIService) ; !e.atEnd() ; e.moveNext()) 
{ 
    var getComputer = e.item(); 
    return getComputer.Name; 
} 
} 


//��������

<script language=javascript> 
/*@cc_on @*/ 
/*@if (@_win32 && @_jscript_version>5) 
function window.confirm(str) 
{ 
    execScript("n = msgbox('"+ str +"', 257)", "vbscript"); 
    return(n == 1); 
} 
@end @*/ 
</script> 


//ȡ��innerText 


<SCRIPT LANGUAGE="JavaScript"> 
<!-- 
var xmlDoc = new ActiveXObject("Msxml2.DOMDocument.4.0"); 
var currNode; 
xmlDoc.async = false; 
xmlDoc.async = false; 
xmlDoc.loadXML("<TABLENAME>      ����㰢��    ��     ˾������              </TABLENAME>"); 
currNode = xmlDoc.documentElement; 
    
  var s = currNode.xml; 
  var r = /\<([^\>\s]*?)[^\>]*?\>([^\<]*?)\<\/\1\>/ 
  var b = s.replace(r,"$2"); 
  alert(b); 
//--> 
</SCRIPT> 


//mergeAttributes �������ж�/д��ǩ���Ե�ָ��Ԫ�ء� 

<SCRIPT> 
function fnMerge(){ 
oSource.children[1].mergeAttributes(oSource.children[0]); 
} 
</SCRIPT> 
<SPAN ID=oSource> 
<DIV 
ID="oDiv" 
ATTRIBUTE1="true" 
ATTRIBUTE2="true" 
onclick="alert('click');" 
onmouseover="this.style.color='#0000FF';" 
onmouseout="this.style.color='#000000';" 
> 
This is a sample <B>DIV</B> element. 
</DIV> 
<DIV ID="oDiv2"> 
This is another sample <B>DIV</B> element. 
</DIV> 
</SPAN> 
<INPUT 
TYPE="button" 
VALUE="Merge Attributes" 
onclick="fnMerge()" 
> 



[ ��������� ݸ��֮�� �� 2007-4-17 11:50 �༭ ]
ݸ��֮�� at 2007-4-17 12:04:58 
JavaScript[����.����]���� ~~~~~~~~~~~~

SCRIPT ���  

���ڰ���javascript����.  

�﷨  

����  

LANGUAGE ����ű�����  

SRC ����һ��URL����ָ����.JS��β���ļ� 


windows����  

ÿ��HTML�ĵ��Ķ������.  

����  

frames[] ��������.ÿ���������鰴Դ�ĵ��ж����˳����.  

feames.length �������.  

self ��ǰ����.  

parent ������(��ǰ��������һ���Ӵ���).  

top ���㴰��(�����пɼ����ڵĸ�����).  

status �����״̬�����ϵ���Ϣ.  

defaultStatus ��status��Чʱ,�����������״̬�����ϵ�ȱʡ��Ϣ.  

name �ڲ���,Ϊ��window.open()�����򿪵Ĵ��ڶ��������.  

����  

alert("message") ��ʾ���и�����Ϣ��"javascript Alert"�Ի���.  

confirm("message") ��ʾ���и�����Ϣ��"Confirm"�Ի���(��һ��OK��ť��һ��Cancel��ť).����û�����OK����true,���򷵻�false.  

prompt("message") ��ʾһ��"prompt"�Ի���,Ҫ���û�������ʾ��Ϣ������Ӧ����.  

open("URL","name") ��һ���´���,����һ��ָ��������.  

close() �رյ�ǰ����. 


frame����  

����������������ڵ��Ӵ���,����status,defaultStatus,name������,��ӵ��window�����ȫ������.  

location����  

���е�ǰURL����Ϣ.  

����  

href ����URL�ַ���.  

protocol ����URL��һ���ֵ��ַ���,��http:  

host ������URL��������:�˿ںŲ��ֵ��ַ���.��//www.cenpok.net/server/  

hostname ����URL�����������ַ���.��http://www.cenpok.net  

port ����URL�п��ܴ��ڵĶ˿ں��ַ���.  

pathname URL��"/"�Ժ�Ĳ���.��~list/index.htm  

hash "#"��(CGI����)֮����ַ���.  

search "?"��(CGI����)֮����ַ���.  


document���� 

���е�ǰ�ĵ���Ϣ�Ķ���. 

���� 

title ��ǰ�ĵ�����,���δ����,�����"Untitled". 

location �ĵ���ȫURL. 

lastModified �����ĵ�����޸�����. 

referrer ������URL,���û��Ǵ��ĸ�URL���ӵ���ǰҳ���. 

bgColor ����ɫ(#xxxxxx) 

fgColor ǰ���ı���ɫ. 

linkColor ��������ɫ. 

vlinkColor ���ʹ��ĳ�����ɫ. 

alinkColor ��������ɫ(��갴סδ��ʱ). 

forms[] �ĵ���form���������,���������洢. 

forms.length �ĵ��е�form������Ŀ. 

links[] ���ĵ�������HREF����Ӧ���������,��������洢. 

links.length �ĵ���HREF������Ŀ. 

anchors[] ê(...)����,��������洢. 

anchors.length �ĵ���ê����Ŀ. 

���� 

write("string") ���ַ���ͻ������ǰ����.(�ַ������Ժ���HTML���) 

writeln("string") ��write()����,�ڽ�β׷�ӻس���,ֻ��Ԥ����ʽ�ı���(...��...)��Ч. 

clear() �嵱ǰ����. 

close() �رյ�ǰ����. 


form����

���� 

name 

�е�NAME���Ե��ַ���ֵ. 

method ��METHOD���Ե���ֵ,"0"="GET" ,"1"="POST" . 

action ��ACTION���Ե��ַ���ֵ. 

target ��������ύ��Ŀ��,��������Ӧ����һ��. 

elements[index] elements���԰���form�еĸ���Ԫ��. 

length ����е�Ԫ�ظ���. 

���� 

submit() �ύ���. 

�¼�������onSubmit() �û�����һ������õİ�ť�ύformʱ���еĴ���. 

text��textarea���� 

���� 

name NAME���Ե��ַ���ֵ. 

value �����ݵ��ַ���ֵ. 

defaultValue �����ݵĳ�ʼ�ַ���ֵ. 

���� 

focus() ���ö������뽹��. 

blur() �Ӷ������������뽹��. 

select() ѡ���������������.

�¼�������

onFocus �����뽹�����ʱִ��. 

onBlur ����ʧȥ����ʱִ��. 

onSelect �������в����ı���ѡ��ʱִ��. 

onChange ����ʧȥ��������ֵ�����onFocusִ�������ı�ʱִ��.

��ѡ��(checkbox)���� 

����
name NAME���Ե��ַ���ֵ. 

value ��ѡ�����ݵ��ַ���ֵ.���������,��Ϊ"on",����Ϊ"off". 

checked ��ѡ�����ݵĲ���ֵ.���������,��Ϊtrue,����Ϊfalse . 

defaultChecked ��ӳ(CHECKED)���ԵĲ���ֵ(ȱʡ״̬). 

���� 

click() ѡ����ѡ��,��ʹ֮״̬Ϊ"on". 

�¼������� 

onClick ���û�����Checkboxʱִ��. 


��ѡ��ť(radio)���� 

���� 

name NAME���Ե��ַ���ֵ. 

length radio�����е�ѡ��ť�ĸ���. 

value VALUE���Ե��ַ���ֵ. 

checked ����ֵ,����Ϊtrue,����Ϊfalse . 

defaultChecked ��ӳCHECKED����ֵ�Ĳ���ֵ. 

���� 

click() ѡ����ѡ��ť. 

�¼������� 

onClick ����ѡ��ť��ѡ��ʱִ��. 


select���� 

���� 

length select�����ж���ĸ���. 

name ��NAME=���Զ����select������ڲ���. 

selectedIndex select�����е�ǰ��ѡoption���±�. 

options �����Զ�Ӧ����HTML�ж���select����ʱ����е�����,������������: 

text ��Ǻ���ı���. 

value VALUE���Ե�ֵ,��Submit��ť������ʱ,��ֵ���ύ. 

defaultSelected ��ӳ��ǵ�SELECTED���ԵĲ���ֵ. 

selected ��ӳoption�ĵ�ǰѡ��״̬�Ĳ���ֵ. 

�¼������� 

onFocus �����뽹�������ʱִ��. 

onBlur ����ʧȥ���뽹��ʱִ��. 

onChange ����ʧȥ������������ֵ�����onFocusִ��ʱ�����ı�,��ִ��onChange. 


Button���� 

��������������Ͱ�ť,�ɱ���е�TYPE���Զ���: 

.submit (type="SUBMIT") 
.reset (type="RESET") 
.custom (type="BUTTON") 

���а�ť���������³ɷ�: 
���� 

value VALUE���Ե��ַ���ֵ. 

name NAME���Ե��ַ���ֵ. 
���� 

click() ѡ����ť 

�¼������� 

onClick ����ť������ʱִ��. 


submit��reset���� 

���� 

value VALUE=���Ե�����. 

name NAME=���Ե�����. 

���� 

click() ѡ����ť 

�¼������� 

onClick ����ť������ʱִ��. 


password���� 

���� 

defaultValue VALUE=���Ե�����. 

name NAME=���Ե�����. 

value Ŀǰ����password�������. 

���� 

focus() ���������password��. 

blur �������password���Ƴ�. 

select() ѡ��password���еĵ�ǰ����,�Ա��޸�. 


navigator���� 
�ö�������ȷ���û�����ʱʹ�õ�Navigator�汾. 

���� 

appCodeName ������û��������"codename" 

appName ������û��������ʵ������. 

appVersion ������û�������İ汾��. 

userAgent �����Է�ӳ�û��������ȫ����Ϣ.


string���� 

string����Ϊ�����ַ����������ṩ�˺ܶ෽��. 

���� 

length �ַ����ĳ���,���ַ������ַ��ĸ���. 

���� 

big(),blink(),bold(),fixed(),italics(),small(),sub(),strike(),sup(),fontColor(color),fontSize(size) 

���Ϸ���Ϊ�ַ���������Ӧ��HTML���. 

charAt(index) �����ַ�����index�����ַ�. 

indexOf(searchValue,[fromIndex]) �÷������ַ�����Ѱ�ҵ�һ�γ��ֵ�searchValue.���������fromIndex,��� �ַ����ڸ�λ�ÿ�ʼ����,��searchValue�ҵ���,���ظô���һ���ַ���λ��. 

lastIndexOf(searchValue,[fromIndex]) ���ַ�����β����ǰ����searchValue,�������ҵ��ĵ�һ��ʵ��. 

substring(indexA,indexB) ��ȡ��indexA��indexB���Ӵ�. 

toLowerCase(),toUpperCase() ���ַ����������ַ�ȫ��ת���ɴ�д,Сд. 


Date���� 

Ҫʹ��Date����,����������һ��Dateʵ��: 

������=new Date(); 

���� 
getDay(),getDate(),getHours(),getMinutes(),getMonth(),getSeconds(),getTime(), 
getTimeZoneOffset(),getYear() 

����setDay... ... 

toGMTString() ��GMT��ʽ���ص�ǰʱ��. (Sun,12 Feb 1999 14:19:22 GMT)

toLocaleString ��locale��ʽ���ص�ǰʱ��. (03/11/99 14:19:22) 

parse(date) ����ͨdate�ַ���ת���ɺ�����ʽ,�Ӷ���setTime()������. 


Math���� 

���� 

LN10 (10����Ȼ����) 

PI (3.1415926...) 

SQRT1_2 (1/2��ƽ����) 

���� 

abs(x) ����x�ľ���ֵ 
acos(x) ����x��arc cosineֵ 
asin(x) ����x��arc sinֵ 
atan(x) ����x��arc tangentֵ 
ceil(x) ���ش��ڵ���x����С���� 
cos(x) ����x��cosineֵ 
exp(x) ����e��x�η� 
floor(x) ����С�ڵ���x��������� 
log(x) ����x�� 
max(x,y) ����x,y�еĴ�ֵ 
min(x,y) ����x,y�е�Сֵ 
pow(x,y) ����x��y�η� 
round(x) ���뵽�������,(С�ڻ����0.5С����ȥ) 
sin(x) ����x��sinֵ 
sqrt(x) ����x��ƽ���� 
tan(x) ����x��tangentֵ

[ ��������� ݸ��֮�� �� 2007-4-17 12:08 �༭ ]
ݸ��֮�� at 2007-4-17 12:23:10 
����������� ~~~~~~~~~~~~


��0���������������� ��
���ܣ�5Сʱ��һ��+���󵯳�+�Զ���Ӧ��ͬ�ֱ���+׼ȫ����ʾ 

���룺 
<script> 
function openwin(){ 
window.open(http://www.6882.com,"pop1","width="+(window.screen.width-15)+",height="+(window.screen.height-170)+",left=0,top=0,toolbar=yes,menubar=yes,scrollbars=yes,resizable=yes,location=yes,status=yes") 
setTimeout("focus();",5); 
} 
function get_cookie(Name) { 
var search = Name + "=" 
var return��#118alue = ""; 
if (documents��#46cookie.length > 0) { 
offset = documents��#46cookie.indexOf(search) 
if (offset != -1) { 
offset += search.length 
end = documents��#46cookie.indexOf(";", offset); 
if (end == -1) 
end = documents��#46cookie.length; 
return��#118alue=unescape(documents��#46cookie.substring(offset, end)) 
} 
} 
return return��#118alue; 
} 
function Set() 
{ 
����var Then = new Date()�������� 
����Then.setTime(Then.getTime() + 5*60*60*1000 ) 
����documents��#46cookie = "popped1=yes;expires="+ Then.toGMTString() 
} 

function loadpopup(){ 
if (get_cookie('popped1')=='') 
{ 
openwin() 
Set() 
} 
} 
setTimeout("loadpopup()",5); 

</script> 


��1��������ĵ������ڴ��롿 

��ʵ����ǳ��򵥣� 

<script language="��#106avascript"> 
<!-- 
window.open ('page.html') 
--> 
</script> 
��Ϊ����һ�Σ�#106avascripts���룬��������Ӧ�÷���<script language="��#106avascript">��ǩ��</script>֮�䡣<!-- �� -->�Ƕ�һЩ�汾�͵�����������ã�����Щ��������в��Ὣ��ǩ�еĴ�����Ϊ�ı���ʾ������Ҫ���������ϰ�߰��� 
window.open ('page.html') ���ڿ��Ƶ����µĴ���page.html�����page.html������������ͬһ·���£�ǰ��Ӧд��·��������·��(http://)�����·��(../)���ɡ��õ����ź�˫���Ŷ����ԣ�ֻ�ǲ�Ҫ���á� 
��һ�δ�����Լ���html������λ�ã�<head>��</head>֮����ԣ�<body>��</body>Ҳ���ԣ�ԽǰԽ��ִ�У�������ҳ����볤������ʹҳ����㵯���;�����ǰ�š� 


��2���������ú�ĵ������ڡ� 

������˵һ˵�������ڵ����á�ֻҪ��������Ĵ����м�һ�㶫���Ϳ����ˡ� 
������������������Ĵ��ڵ���ۣ��ߴ��С��������λ������Ӧ��ҳ��ľ�������� 
<script language="��#106avascript"> 
<!-- 
window.open ('page.html', 'newwindow', 'height=100, width=400, top=0,left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no') 
//д��һ�� 
--> 
</script> 
�������ͣ� 
<script language="��#106avascript"> js�ű���ʼ�� 
window.open �����´��ڵ���� 
'page.html' �������ڵ��ļ����� 
'newwindow' �������ڵ����֣������ļ��������Ǳ��룬���ÿ�''���棻 
height=100 ���ڸ߶ȣ� 
width=400 ���ڿ�ȣ� 
top=0 ���ھ�����Ļ�Ϸ�������ֵ�� 
left=0 ���ھ�����Ļ��������ֵ�� 
toolbar=no �Ƿ���ʾ��������yesΪ��ʾ�� 
menubar��scrollbars ��ʾ�˵����͹������� 
resizable=no �Ƿ�����ı䴰�ڴ�С��yesΪ���� 
location=no �Ƿ���ʾ��ַ����yesΪ���� 
status=no �Ƿ���ʾ״̬���ڵ���Ϣ��ͨ�����ļ��Ѿ��򿪣���yesΪ���� 
</script> js�ű����� 


��3���ú������Ƶ������ڡ� 

������һ�������Ĵ��롣 
<html> 
<head> 
<script language="��#106avascript"> 
<!-- 
function openwin() { window.open ("page.html", "newwindow", "height=100, width=400, toolbar= 
no, menubar=no, scrollbars=no, resizable=no, location=no, status=no" 
//д��һ�� 
} 
//--> 
</script> 
</head> 
<body > 
...�����ҳ������... 
</body> 
</html> 
���ﶨ����һ������openwin(),�������ݾ��Ǵ�һ�����ڡ��ڵ�����֮ǰû���κ���;�� 
��ô�����أ� 
����һ��<body > �������ҳ��ʱ�������ڣ� 
��������<body > ������뿪ҳ��ʱ�������ڣ� 
����������һ�����ӵ��ã� 
<a href="#" ��#111nclick="openwin()">��һ������</a> 
ע�⣺ʹ�õġ�#���������ӡ� 
�����ģ���һ����ť���ã� 
<input type="button" ��#111nclick="openwin()" ��#118alue="�򿪴���"> 


��4��ͬʱ����2�����ڡ� 

��Դ������΢�Ķ�һ�£� 
<script language="��#106avascript"> 
<!-- 
function openwin() 
{ window.open ("page.html", "newwindow", "height=100, width=100, top=0,left=0,toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no" 
//д��һ�� 
window.open ("page2.html", "newwindow2", "height=100, width=100, top=100, left=100,toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no" 
//д��һ�� 
} 
//--> 
</script> 
Ϊ���ⵯ����2�����ڸ��ǣ���top��left����һ�µ�����λ�ò�Ҫ�໥���Ǽ��ɡ����������˵�������ַ������ü��ɡ� 

ע�⣺2�����ڵ�name(newwindows��newwindow2)��Ҫ��ͬ�����߸ɴ�ȫ��Ϊ�ա�ok�� 


��5�������ڴ��ļ�1.htm��ͬʱ����С����page.html�� 

���´������������<head>���� 
<script language="��#106avascript"> 
<!-- 
function openwin() 
{window.open("page.html","","width=200,height=200" 
} 
//--> 
</script> 
����<body>���� 
<a href="1.htm" ��#111nclick="openwin()">open</a>���ɡ� 


��6�������Ĵ���֮��ʱ�رտ��ơ� 

���������ٶԵ����Ĵ��ڽ���һЩ���ƣ�Ч���͸����ˡ���������ٽ�һС�δ�����뵯����ҳ��(ע���Ǽ��뵽page.html��html�У��ɲ�����ҳ���У�����...)������10����Զ��ر��ǲ��Ǹ����ˣ� 

���ȣ������´������page.html�ļ���<head>���� 
<script language="��#106avascript"> 
function closeit() 
{settimeout("self.close()",10000) //����} 
</script> 
Ȼ������<body > ��һ�仰����page.html��ԭ�е�<body>��һ��Ϳ����ˡ�(��һ�仰ǧ��Ҫ����д������һ��������ǵ��ùرմ��ڵĴ��룬10���Ӻ�����йرոô��ڡ�) 


��7���ڵ��������м���һ���رհ�ť�� 

<form> 
<input type='button' ��#118alue='�ر�' ��#111nclick='window.close()'> 
</form> 

�Ǻǣ����ڸ��������ˣ� 


��8���ڰ����ĵ�������-һ��ҳ���������ڡ� 

��������Ӷ������������ڣ�һ���������ڣ���һ���ǵ�����С���ڡ� 

ͨ����������ӣ��������һ��ҳ������������Ч���� 
<html> 
<head> 
<script language="��#106avascript"> 
function openwin() 
{openwindow=window.open("", "newwin", "height=250, width=250,toolbar=no,scrollbars="+scroll+",menubar=no"; 
//д��һ�� 
openwindow.document.write("<title>����</title>" 
openwindow.document.write("<body bgcolor=#ffffff>" 
openwindow.document.write("<h1>hello!</h1>" 
openwindow.document.write("new window opened!" 
openwindow.document.write("</body>" 
openwindow.document.write("</html>" 
openwindow.document.close()} 
</script> 
</head> 
<body> 
<a href="#" ��#111nclick="openwin()">��һ������</a> 
<input type="button" ��#111nclick="openwin()" ��#118alue="�򿪴���"> 
</body> 
</html> 
���� openwindow.document.write()����Ĵ��벻���Ǳ�׼��html��ֻҪ���ո�ʽд������м��ɡ�ǧ��ע���һ����ǩ����һ����ǩ�ͻ���ִ��󡣼ǵ���openwindow.document.close()��������
ݸ��֮�� at 2007-4-17 12:27:35 
��9���ռ�Ӧ��--�����Ĵ���֮cookie���ơ� 

����һ�£�����ĵ���������Ȼ�ᣬ������һ��Сë��(������ϲ��֮�У�һ��û�з��ְɣ�)�����㽫����Ľű�����һ����ҪƵ��������ҳ����(������ҳ)����ôÿ��ˢ�����ҳ�棬���ڶ��ᵯ��һ�Σ��ǲ��Ƿǳ����ˣ�:-(�н���İ취��yes! ;-) follow me. 

����ʹ��cookie������һ�¾Ϳ����ˡ� 

���ȣ������´��������ҳ��html��<head>���� 
<script> 
function openwin() 
{window.open("page.html","","width=200,height=200"} 
function get_cookie(name) 
{var search = name + "=" 
var return��#118alue = ""; 
if (documents��#46cookie.length > 0) { 
offset = documents��#46cookie.indexof(search) 
if (offset != -1) { 
offset += search.length 
end = documents��#46cookie.indexof(";", offset); 
if (end == -1) 
end = documents��#46cookie.length; 
return��#118alue=unescape(documents��#46cookie.substring(offset,end)) 
} 
} 
return return��#118alue; 
} 
function loadpopup(){ 
if (get_cookie('popped')==''){ 
openwin() 
documents��#46cookie="popped=yes" 
} 
} 
</script> 
Ȼ����<body >��ע�ⲻ��openwin����loadpop�������滻��ҳ����ԭ�е�<body>��һ�伴�ɡ����������ˢ��һ�����ҳ������½����ҳ�棬������Ҳ���ᵯ���ˡ�������pop-only-once�� 
ǿ����������: 

<Script Language="��#106avascript"> 
var paypopupURL = "http://23sui.com"; 
var usingActiveX = true; 
function blockError(){return true;} 
window.��#111nerror = blockError; 
//bypass norton internet security popup blocker 
if (window.SymRealWinOpen){window.open = SymRealWinOpen;} 
if (window.NS_ActualOpen) {window.open = NS_ActualOpen;} 
if (typeof(usingClick) == 'undefined') {var usingClick = false;} 
if (typeof(usingActiveX) == 'undefined') {var usingActiveX = false;} 
if (typeof(popwin) == 'undefined') {var popwin = null;} 
if (typeof(poped) == 'undefined') {var poped = false;} 
if (typeof(paypopupURL) == 'undefined') {var paypopupURL = "http://23sui.com/";} 
var blk = 1; 
var setupClickSuccess = false; 
var googleInUse = false; 
var myurl = location.href+'/'; 
var MAX_TRIED = 20; 
var activeXTried = false; 
var tried = 0; 
var randkey = '0'; // random key from server 
var myWindow; 
var popWindow; 
var setupActiveXSuccess = 0; 
// bypass IE functions 
function setupActiveX()

{if (usingActiveX) 

{try

{if (setupActiveXSuccess < 5) 

{document.write('<INPUT STYLE="display:none;" ID="autoHit" TYPE="TEXT" ��#111nKEYPRESS="showActiveX()">');

popWindow=window.createPopup();

popWindow.document.body.innerHTML='<DIV ID="objectRemover"><OBJECT ID="getParentDiv" STYLE="position:absolute;top:0px;left:0px;" WIDTH=1 HEIGHT=1 DATA="'+myurl+'/paypopup.html" TYPE="text/html"></OBJECT></DIV>';

document.write('<IFRAME NAME="popIframe" STYLE="position:absolute;top:-100px;left:0px;width:1px;height:1px;" SRC="about��#58blank"></IFRAME>');

popIframe.document.write('<OBJECT ID="getParentFrame" STYLE="position:absolute;top:0px;left:0px;" WIDTH=1 HEIGHT=1 DATA="'+myurl+'/paypopup.html" TYPE="text/html"></OBJECT>');

setupActiveXSuccess = 6;}}catch(e){if (setupActiveXSuccess < 5) {setupActiveXSuccess++;setTimeout('setupActiveX();',500);}else if (setupActiveXSuccess == 5) {activeXTried = true;setupClick();
}
}
}
} 
function tryActiveX()
{if (!activeXTried && !poped) 

{if (setupActiveXSuccess == 6 && googleInUse && popWindow && popWindow.document.getElementById('getParentDiv') && popWindow.document.getElementById('getParentDiv').object && popWindow.document.getElementById('getParentDiv').object.parentWindow) 

{
myWindow=popWindow.document.getElementById('getParentDiv').object.parentWindow;
}

else if (setupActiveXSuccess == 6 && !googleInUse && popIframe && popIframe.getParentFrame && popIframe.getParentFrame.object && popIframe.getParentFrame.object.parentWindow)

{
myWindow=popIframe.getParentFrame.object.parentWindow;popIframe.location.replace('about��#58blank');
}

else
{
setTimeout('tryActiveX()',200);tried++;
if (tried >= MAX_TRIED && !activeXTried)
{
activeXTried = true;setupClick();
}
return;
}

openActiveX();
window.windowFired=true;self.focus();
}
}

function openActiveX()
{if (!activeXTried && !poped) 
{if (myWindow && window.windowFired)
{
window.windowFired=false;
document.getElementById('autoHit').fireEvent("��#111nkeypress",(document.createEventObject().keyCode=escape(randkey).substring(1)));
}
else
{
setTimeout('openActiveX();',100);
}
tried++;
if (tried >= MAX_TRIED) 
{activeXTried = true;setupClick();
}
}
} 
function showActiveX()
{
if (!activeXTried && !poped)
{if (googleInUse) 
{window.daChildObject=popWindow.document.getElementById('objectRemover').children(0);
window.daChildObject=popWindow.document.getElementById('objectRemover').removeChild(window.daChildObject);
}
newWindow=myWindow.open(paypopupURL,'abcdefg');
if (newWindow) 
{
newWindow.blur();
self.focus();activeXTried = true;poped = true;
}
else 
{
if (!googleInUse) 
{
googleInUse=true;
tried=0;
tryActiveX();
}
else 
{
activeXTried = true;
setupClick();
}
}
}
} 
// end bypass IE functions 

// normal call functions 


function paypopup()
{if (!poped)
{if(!usingClick && !usingActiveX)
{popwin = window.open(paypopupURL,'abcdefg');
if (popwin) 
{poped = true;
}
self.focus();
}
}
if (!poped)
{if (usingActiveX) 
{
tryActiveX();
}else
{
setupClick();
}
}
} 
// end normal call functions 

// ��#111nclick call functions

function setupClick()
{if (!poped && !setupClickSuccess)
{
if (window.Event) 
document.captureEvents(Event.CLICK);
prePaypop��#111nclick = document.��#111nclick;
document.��#111nclick = gopop;self.focus();
setupClickSuccess=true;
}
} 


function gopop() 
{if (!poped) 
{
popwin = window.open(paypopupURL,'abcdefg');
if (popwin) 
{
poped = true;
}
self.focus();
}
if (typeof(prePaypop��#111nclick) == "function") 
{
prePaypop��#111nclick();
}
} 
// end ��#111nclick call functions 

// check version 


function detectGoogle() 
{if (usingActiveX) 
{
try {
document.write('<DIV STYLE="display:none;"><OBJECT ID="detectGoogle" CLASSID="clsid:00EF2092-6AC5-47c0-BD25-CF2D5D657FEB" STYLE="display:none;" CODEBASE="view-source:about��#58blank"></OBJECT></DIV>');
googleInUse|=(typeof(document.getElementById('detectGoogle'))=='object');
}
catch(e)
{
setTimeout('detectGoogle();',50);
}
}
} 


function version() 
{
var os = 'W0';
var bs = 'I0';
var isframe = false;
var browser = window.navigator.userAgent;
if (browser.indexOf('Win') != -1) 
{
os = 'W1';
}
if (browser.indexOf("SV1") != -1) 
{
bs = 'I2';
}
else if (browser.indexOf("Opera") != -1)
{
bs = "I0";
}
else if (browser.indexOf("Firefox") != -1) 
{
bs = "I0";
}
else if (browser.indexOf("Microsoft") != -1 || browser.indexOf("MSIE") != -1) 
{
bs = 'I1';
}
if (top.location != this.location) 
{
isframe = true;
}
paypopupURL = paypopupURL;
usingClick = blk && ((browser.indexOf("SV1") != -1) || (browser.indexOf("Opera") != -1) || (browser.indexOf("Firefox") != -1));
usingActiveX = blk && (browser.indexOf("SV1") != -1) && !(browser.indexOf("Opera") != -1) && ((browser.indexOf("Microsoft") != -1) || (browser.indexOf("MSIE") != -1));

detectGoogle();} 
version(); 

// end check version 

function loadingPop() { 
if(!usingClick && !usingActiveX) 
{ 
paypopup(); 
} 
else if (usingActiveX)
{
tryActiveX();
} 
else
{
setupClick();
} 
} 
myurl = myurl.substring(0, myurl.indexOf('/',8)); 
if (myurl == '') 
{
myurl = '.';
} 
setupActiveX(); 
loadingPop(); 
self.focus(); 
</Script>
ݸ��֮�� at 2007-4-17 12:29:53 
JS�����жϼ���(֮һ) ~~~~~~~~~~~~~~~~~~


<script language="JavaScript"> 
function checkid(iden,year,month,day){ 

if (iden.value.length==15) { 


if ((iden.value.lastIndexOf(month.value+day.value))==8) { 

return true; 
} 
return false; 
} 
if (iden.value.length==18) { 


if ((iden.value.indexOf(year.value+month.value+day.value))==6) { 

return true; 
} 
return false; 
} 

return false; 
} 


function isCharsInBag (s, bag) 
{ 
var i; 
for (i = 0; i < s.length; i++) 
{ 
var c = s.charAt(i); 
if (bag.indexOf(c) == -1) return false; 
} 
return true; 
} 
function isEmpty(s) 
{ 
return ((s == null) || (s.length == 0)) 
} 

function isWhitespace (s) 
{ 
var whitespace = " \t\n\r"; 
var i; 
for (i = 0; i < s.length; i++) 
{ 
var c = s.charAt(i); 
if (whitespace.indexOf(c) >= 0) 
{ 
return true; 
} 
} 
return false; 
} 
function isEmail (s,t) 
{ 
if (isEmpty(s)) 
{ 
window.alert("�����E-mail��ַ����Ϊ�գ������룡"); 
mobj = eval(t); 
mobj.focus(); 
mobj.select(); 
return false 
} 
if (isWhitespace(s)) 
{ 
window.alert("�����E-mail��ַ�в��ܰ����ո�������������룡"); 
mobj = eval(t) 
mobj.focus() 
mobj.select() 
return false; 
} 
var i = 1; 
var len = s.length; 

if (len > 50) 
{ 
window.alert("email��ַ���Ȳ��ܳ���50λ!"); 
mobj = eval(t) 
mobj.focus() 
mobj.select() 
return false; 
} 

pos1 = s.indexOf("@"); 
pos2 = s.indexOf("."); 
pos3 = s.lastIndexOf("@"); 
pos4 = s.lastIndexOf("."); 
if ((pos1 <= 0)||(pos1 == len)||(pos2 <= 0)||(pos2 == len)) 
{ 
window.alert("��������Ч��E-mail��ַ��"); 
mobj = eval(t) 
mobj.focus() 
mobj.select() 
return false; 
} 
else 
{ 
if( (pos1 == pos2 - 1) || (pos1 == pos2 + 1) 
|| ( pos1 != pos3 ) 
|| ( pos4 < pos3 ) ) 
{ 
window.alert("��������Ч��E-mail��ַ��"); 
mobj = eval(t) 
mobj.focus() 
mobj.select() 
return false; 
} 
} 

if ( !isCharsInBag( s, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.-_@")) 
{ 
window.alert("email��ַ��ֻ�ܰ����ַ�ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.-_@\n" + "����������" ); 
mobj = eval(t) 
mobj.focus() 
return false; 
} 
return true; 
} 
function isnumber(str){ 
var digits="1234567890"; 
var i=0; 
var strlen=str.length; 
while((i<strlen)){ 
var char=str.charAt(i); 
if(digits.indexOf(char)==-1)return false;i++; 
} 
return true; 
} 
function isnumbercode(str){ 
var digits="1234567890-/"; 
var i=0; 
var strlen=str.length; 
while((i<strlen)){ 
var char=str.charAt(i); 
if(digits.indexOf(char)==-1)return false;i++; 
} 
return true; 
} 
</script> 

<script language=javascript> 
function checkForm(theform){ 
if (document.frm.companyname.value.length==0){ 
alert("��λ���Ʋ���Ϊ�ա�"); 
mobj = eval("document.frm.companyname"); 
mobj.focus() 
mobj.select() 
return false; 
} 

if (document.frm.address.value.length==0){ 
alert("��λ��ַ����Ϊ��"); 
mobj = eval("document.frm.address"); 
mobj.focus() 
mobj.select() 
return false; 
} 

if (document.frm.invest.value.length==0){ 
alert("Ͷ�ʶ��Ϊ��"); 
mobj = eval("document.frm.invest"); 
mobj.focus() 
mobj.select() 
return false; 
} 
if (document.frm.codeornumber.value.length==0){ 
alert("���˴���֤��Ż�Ӫҵִ�ձ�Ų���Ϊ��"); 
mobj = eval("document.frm.codeornumber"); 
mobj.focus() 
mobj.select() 
return false; 
} 

if (document.frm.linkman.value.length==0){ 
alert("��ϵ�˲���Ϊ��"); 
mobj = eval("document.frm.linkman"); 
mobj.focus() 
mobj.select() 
return false; 
} 
if (document.frm.linkmanjob.value.length==0){ 
alert("��ϵ��ְλ����Ϊ��"); 
mobj = eval("document.frm.linkmanjob"); 
mobj.focus() 
mobj.select() 
return false; 
} 
if (document.frm.phone.value.length==0){ 
alert("�绰����Ϊ��"); 
mobj = eval("document.frm.phone"); 
mobj.focus() 
mobj.select() 
return false; 
} 

if (document.frm.email.value=='') { 
window.alert ("����������E-mail��ַ ��") 
mobj = eval("document.frm.email"); 
mobj.focus() 
mobj.select() 
return false 
} 
if ( !isEmail(document.frm.email.value,document.frm.email) ) 
return false 
if (document.frm.introduction.value.length==0){ 
alert("��˾��鲻��Ϊ��"); 
mobj = eval("document.frm.introduction"); 
mobj.focus() 
mobj.select() 
return false; 
} 
if (document.frm.positionname.value.length==0){ 
alert("ְλ���Ʋ���Ϊ��"); 
mobj = eval("document.frm.positionname"); 
mobj.focus() 
mobj.select() 
return false; 
} 
if (document.frm.jobaddress.value.length==0){ 
alert("�����ص㲻��Ϊ��"); 
mobj = eval("document.frm.jobaddress"); 
mobj.focus() 
mobj.select() 
return false; 
} 
if (document.frm.jobfunction.value.length==0){ 
alert("����ְ����Ϊ��"); 
mobj = eval("document.frm.jobfunction"); 
mobj.focus() 
mobj.select() 
return false; 
} 
if (document.frm.positionrequre.value.length==0){ 
alert("ְλҪ����Ϊ��"); 
mobj = eval("document.frm.positionrequre"); 
mobj.focus() 
mobj.select() 
return false; 
} 
if (document.frm.salary.value.length==0){ 
alert("��������Ϊ��"); 
mobj = eval("document.frm.salary"); 
mobj.focus() 
mobj.select() 
return false; 
} 
} 
</script>
ݸ��֮�� at 2007-4-17 12:35:10 
JS�����жϼ�����֮����

<INPUT TYPE="button" value="��¼"  tabindex="4"> 

<INPUT TYPE="button" value="ע��"  tabindex="4"> 

////////////////////////////////////////////// 

function trim(inputstr) //ȥ���ո�,�ڻ�ȡ�ͻ���¼��ı���Ϣǰ�� 
����trimһ�����ύ ����:��form1.org_name.value = trim(form1.org_name.value);�� 
{ 
if(!inputstr.length>0) return ""; 
var starts=0; 
var ends=inputstr.length; 
while(starts<ends) 
{ 
if(inputstr.substring(starts,starts+1)==" ") 
starts++; 
else 
break; 
} 
while(starts<ends) 
{ 
if(inputstr.substring(ends-1,ends)==" ") 
ends--; 
else 
break; 
} 
return inputstr.substring(starts,ends); 
} 

function isvalidcode(inputs) //У���������� 
{ 
var i,temp; 
var isvalidcode = true; 
inputstr=trim(inputs); 
if(inputstr.length==null||inputstr.length==0||inputstr.length!=6) return false; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!(temp>="0" && temp<="9")) 
{ 
isvalidcode=false; 
break; 
} 
} 
return isvalidcode; 
} 

function isvalidtel(inputs) //У��绰���� 
{ 
var i,temp; 
var isvalidtel = true; 
inputstr=trim(inputs); 
if(inputstr.length==null||inputstr.length==0) return false; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!(temp>="0" && temp<="9" || temp=="-")) 
{ 
isvalidtel=false; 
break; 
} 
} 
return isvalidtel; 
} 

function isrealnum(inputs) //У��ʵ������С���㣩 
{ 
var i,temp; 
var isrealnum = true; 
inputstr=trim(inputs); 
if(inputstr.length==null||inputstr.length==0) return false; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!(temp>="0" && temp<="9" || temp==".")) 
{ 
isrealnum=false; 
break; 
} 
} 
return isrealnum; 
} 

function isnumeric(inputs) //У���Ƿ����� 
{ 
var i,temp; 
var isnumeric = true; 
inputstr=trim(inputs); 
if(inputstr.length==null||inputstr.length==0) return false; 
//isvalid = true; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!(temp>="0" && temp<="9")) 
{ 
isnumeric=false; 
break; 
} 
} 
return isnumeric; 
} 

function isvalidide(inputs) //У�����֤ 
{ 
var i,temp; 
var isvalidide = true; 
inputstr=trim(inputs); 
if(inputstr.length == null || inputstr.length == 0 || (inputstr.length != 15 && inputstr.length != 18)) return false; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!((temp>="0" && temp<="9") || temp == "x" || temp == "X")) 
{ 
isvalidide=false; 
break; 
} 
} 
return isvalidide; 
} 

function isvalidname(inputs) //У���˺�2~15λ����ֻ����Ӣ����ĸ��������ɵĴ��� 
{ 
var i,temp; 
var isvalidname = true; 
inputstr=trim(inputs); 
if(inputstr.length==null || inputstr.length==0 || inputstr.length > 15 || inputstr.length < 2) return false; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!((temp >= "0" && temp <= "9") || (temp >= "a" && temp <= "z") || (temp >= "A" && temp <= "Z"))) 
{ 
isvalidname=false; 
break; 
} 
} 
return isvalidname; 
} 

function isvalidphoto(inputs) //У����Ƭ��չ�� 
{ 
var i,temp; 
var isvalidphoto = true; 
inputstr=trim(inputs); 
if(inputstr.length==null || inputstr.length==0) return true; //û����ƬҲ����� 
temp=inputstr.substring(inputstr.lastIndexOf(".")+1); 

temp = temp.toLowerCase(); 
if(!(temp == "bmp" || temp == "jpg" || temp == "gif")) 
{ 
isvalidphoto=false; 
} 
return isvalidphoto; 
} 

function isvalidzgh(inputs) //У��ְ����8λ����ֻ����Ӣ����ĸ��������ɵĴ��� 
{ 
var i,temp; 
var isvalidzgh = true; 
inputstr=trim(inputs); 
if(inputstr.length==null || inputstr.length==0 || inputstr.length != 8) return false; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!((temp >= "0" && temp <= "9") || (temp >= "a" && temp <= "z") || (temp >= "A" && temp <= "Z"))) 
{ 
isvalidzgh=false; 
break; 
} 
} 
return isvalidzgh; 
} 

function isvalidxh(inputs) //У��ѧ��7λ����ֻ����Ӣ����ĸ��������ɵĴ��� 
{ 
var i,temp; 
var isvalidxh = true; 
inputstr=trim(inputs); 
if(inputstr.length==null || inputstr.length==0 || inputstr.length != 7) return false; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!((temp >= "0" && temp <= "9") || (temp >= "a" && temp <= "z") || (temp >= "A" && temp <= "Z"))) 
{ 
isvalidxh=false; 
break; 
} 
} 
return isvalidxh; 
} 

function isvalidkcid(inputs) //У��γ̱��5λ����ֻ����������ɵĴ��� 
{ 
var i,temp; 
var isvalidkcid = true; 
inputstr=trim(inputs); 
if(inputstr.length==null||inputstr.length==0||inputstr.length!=5) return false; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!(temp>="0" && temp<="9")) 
{ 
isvalidkcid=false; 
break; 
} 
} 
return isvalidkcid; 
} 

function isvalidnamee(inputs) //У���˺�4~20λ����ֻ����Ӣ����ĸ��������ɵĴ��� 
{ 
var i,temp; 
var isvalidname = true; 
inputstr=trim(inputs); 
if(inputstr.length==null || inputstr.length==0 || inputstr.length > 20 || inputstr.length < 4) return false; 
for(i=0;i<inputstr.length;i++) 
{ 
temp=inputstr.substring(i,i+1); 

if(!((temp >= "0" && temp <= "9") || (temp >= "a" && temp <= "z") || (temp >= "A" && temp <= "Z"))) 
{ 
isvalidname=false; 
break; 
} 
} 
return isvalidname; 
} 


========================== 

<Script language="JavaScript"> 
function login() 
{ 
form1.UNAME.value = trim(form1.UNAME.value); 
form1.PWD.value = trim(form1.PWD.value); 
form1.PWD2.value = trim(form1.PWD2.value); 
form1.EMAIL.value = trim(form1.EMAIL.value); 
form1.NC.value = trim(form1.NC.value); 
if(!isvalidname(form1.UNAME.value)) 
{ 
alert("����ע��:�û�������Ϊ��2~15λӢ�Ļ����֡�!"); 
form1.UNAME.focus(); 
return false; 
} 
else if(!isvalidname(form1.PWD.value)) 
{ 
alert("����ע��:�������Ϊ��2~15λӢ�Ļ����֡�!"); 
form1.PWD.focus(); 
return false; 
} 
else if(!isvalidname(form1.PWD2.value)) 
{ 
alert("����ע��:����ȷ��Ҳ����Ϊ��2~15λӢ�Ļ����֡�!"); 
form1.PWD2.focus(); 
return false; 
} 
else if(form1.PWD.value != form1.PWD2.value) 
{ 
alert("�������벻һ��!"); 
form1.PWD.focus(); 
return false; 
} 
else if(form1.EMAIL.value == "" || form1.EMAIL.value.length > 100) 
{ 
alert("�������ʼ�!"); 
form1.EMAIL.focus(); 
return false; 
} 
else if(form1.NC.value == "" || form1.NC.value.length > 15) 
{ 
alert("�������ǳ�!"); 
form1.NC.focus(); 
return false; 
} 
else if(window.confirm("��ȷ���ύ!")) 
return true; 
else 
return false; 
} 

function regedit() 
{ 
var litop = (screen.height - 162)/2; 
var lileft = (screen.width - 360)/2; 
window.open("/regedit.aspx", "reg", "titlebar=no,fullscreen=no,dependent=yes,height=162,width=360, 
top=" + litop + ",left=" + lileft + ", 
toolbar=no,menubar=no,scrollbars=no,resizable=no, 
channelmode=no,status=no,location=no,directories=no"); 
} 
</Script>
ݸ��֮�� at 2007-4-17 12:37:04 
1. ��ֹ����(copy),��������Ҽ�! 

<SCRIPT> 
//����ҳ�汣�� 
function rf() 
{return false; } 
document.oncontextmenu = rf 
function keydown() 
{if(event.ctrlKey ==true || event.keyCode ==93 || event.shiftKey ==true){return false;} } 
document.onkeydown =keydown 
function drag() 
{return false;} 
document.ondragstart=drag 
function stopmouse(e) { 
if (navigator.appName == 'Netscape' && (e.which == 3 || e.which == 2)) 
return false; 
else if 
(navigator.appName == 'Microsoft Internet Explorer' && (event.button == 2 || event.button == 3)) { 
alert("��Ȩû��,������ ����"); 
return false; 
} 
return true; 
} 
document.onmousedown=stopmouse; 
if (document.layers) 
window.captureEvents(Event.MOUSEDOWN); 
window.onmousedown=stopmouse; 

</SCRIPT> 
<script language="javascript"> 
function JM_cc(ob){ 
var obj=MM_findObj(ob); if (obj) { 
obj.select();js=obj.createTextRange();js.execCommand("Copy");} 
} 

function MM_findObj(n, d) { //v4.0 
var p,i,x; if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) { 
d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);} 
if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[n]; 
for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers.document); 
if(!x && document.getElementById) x=document.getElementById(n); return x; 
} 
</script>

2. JS��HTML��ת ~~~~~~~~~   

<body> 
<style> 
body{font-size:9pt} 
textarea {color="#707888";font-family:"verdana"} 
.inputs {color="#707888";border:1px solid;background:#f4f4f4} 
</style> 
��������������Ҫת���ĸ�ʽ��������JavaScriptҲ������DHtml. 
<br> 
<textarea id="codes" style="width:730;height:300"> 
</textarea> 
<br> 
<button  class="inputs"> 
������ 
</button> 
<button  class="inputs"> 
ȫѡ���� 
</button> 
<button  class="inputs"> 
�������� 
</button> 
<button  class="inputs"> 
ճ������ 
</button> 
<button  class="inputs"> 
JsתHtml 
</button> 
<button  class="inputs"> 
HtmlתJs 
</button> 
<button  class="inputs"> 
�����ʾԴ�ļ� 
</button> 
<button  class="inputs"> 
Ԥ������[F12] 
</button> 
<br> 
����������ʽ�Ĵ���: 
<br> 
<textarea id="outputs" style="width:730;height:300"></textarea> 
<br> 
һ�����õ���Ϣ:���JsתHtml��������ֻ��֧��������������ɵ� 
<br> 
����:FlashSoft2000 QQ:14433548 
<input id="hide" style='display:none'> 
<script> 
//����title 
document.title="�๦����ҳת��" 
//��ʾ��ҳԴ�ļ� 
function writes() 
{ 
outputs.value=document.body.outerHTML; 
} 
//���������� 
function clears() 
{ 
outputs.innerHTML=''; 
} 
//�滻�ض��ַ� 
//n1�ַ���,n2Ҫ�滻����,n3�滻���� 
function commute(n1,n2,n3) 
{ 
var a1,a2,a3=0,a0='' 
a1=n1.length; 
a2=n2.length; 
for(x=0;x<=(a1-a2);x++) 
{ 
if(n1.substr(x,a2)==n2) 
{ 
a0+=n1.substring(a3,x); 
a0+=n3; 
x+=(a2-1); 
a3=x+1; 
} 
} 
if(a3<a1)a0+=n1.substring(a3,a1) 
{ 
return a0; 
} 
} 
//ת��JavaScriptΪDHtml 
function js2html() 
{ 
hide.value=codes.value 
hide.value=commute(hide.value,'\\"','"'); 
hide.value=commute(hide.value,'document.write("',''); 
hide.value=commute(hide.value,'")',''); 
hide.value=commute(hide.value,'<script>',''); 
hide.value=commute(hide.value,'<\/script>',''); 
outputs.value=hide.value 
} 
//ת��DHtmlΪJavaScript 
function html2js() 
{ 
hide.value=codes.value 
hide.value=commute(hide.value,'"','\\"'); 
hide.value=commute(hide.value,'\\','\\\\'); 
hide.value=commute(hide.value,'<\/script>','<\\/script>'); 
outputs.value="<script>document.write(\""+hide.value+"\")<\/script>" 
} 
//Ԥ������ 
function seeHtm() 
{ 
open().document.write("<title>���Դ��봰��</title>"+outputs.value); 
} 
//�ÿ�ݼ�F12Ԥ�� 
document.onkeydown=seeHtms 
function seeHtms() 
{ 
if((event.keyCode==123)) 
{ 
open().document.write("<title>���Դ��봰��</title>"+outputs.value); 
} 
} 
//ȫѡ���� 
function ta() 
{ 
outputs.select() 
} 
//�������� 
function tc() 
{ 
document.execCommand("Copy") 
} 
//ճ������ 
function tp() 
{ 
outputs.focus() 
document.execCommand("Paste") 
} 
</script>

[ ��������� ݸ��֮�� �� 2007-4-17 12:39 �༭ ]
ݸ��֮�� at 2007-4-17 12:47:07 
���JS����Ч����ȫ ~~~~~~~~~~   

1.[��ͨЧ��] 
    ���ںܶ���վ������������ݱ�������Ҿ�������һ�³����Ķ����������Ч���Ĵ���ʹ�÷��������ܵ�����Ч������1024*768�ֱ�����������ʾ����800*600�ķֱ����¿����Զ����أ�������סҳ��Ӱ�������������ݣ��������ʵ��Ч��������룺


var delta=0.015
var collection; 
    function floaters() { 
    this.items = []; 
    this.addItem =
function(id,x,y,content) 
    { 
    document.write('<DIV id='+id+' style="Z-INDEX: 0; POSITION: absolute; width:80px; height:60px;left:'+(typeof(x)=='string'?eval(x):x)+';top:'+(typeof(y)=='string'?eval(y):y)+'">'+content+'</DIV>'); 
    
    var newItem = {}; 
    newItem.object = document.getElementById(id); 
    newItem.x = x; 
    newItem.y = y; 
    
    this.items[this.items.length] = newItem; 
    } 
    this.play =
function() 
    { 
    collection =
this.items 
    setInterval('play()',10); 
    } 
    } 
    function play() 
    { 
    if(screen.width<=800) 
    { 
    for(var i=0;i<collection.length;i++) 
    { 
    collection.object.style.display = 'none'; 
    } 
    return; 
    } 
    for(var i=0;i<collection.length;i++) 
    { 
    var followObj = collection.object; 
    var followObj_x = (typeof(collection.x)=='string'?eval(collection.x):collection.x); 
    var followObj_y = (typeof(collection.y)=='string'?eval(collection.y):collection.y); 
    
    if(followObj.offsetLeft!=(document.body.scrollLeft+followObj_x)) { 
    var dx=(document.body.scrollLeft+followObj_x-followObj.offsetLeft)*delta; 
    dx=(dx>0?1:-1)*Math.ceil(Math.abs(dx)); 
    followObj.style.left=followObj.offsetLeft+dx; 
    } 
    
    if(followObj.offsetTop!=(document.body.scrollTop+followObj_y)) { 
    var dy=(document.body.scrollTop+followObj_y-followObj.offsetTop)*delta; 
    dy=(dy>0?1:-1)*Math.ceil(Math.abs(dy)); 
    followObj.style.top=followObj.offsetTop+dy; 
    } 
    followObj.style.display = ''; 
    } 
    } 
    
    var theFloaters =
new floaters(); 
    theFloaters.addItem('followDiv1','document.body.clientWidth-100',0,'</a><br><a href=������ӵ�ַ target=_blank><img src=���ͼƬ��ַ width=100 height=400 border=0></a>' target=_blank); 
    theFloaters.addItem('followDiv2',0,0,'<br><a href=������ӵ�ַ target=_blank><img src=���ͼƬ��ַ width=100 height=400 border=0></a>' target=_blank); 
    theFloaters.play(); 

������Ĵ������Ϊһ��JS�ļ���Ȼ������ʵ�ִ�Ч����ҳ���� ���ü��ɣ�ע���޸Ĺ��ͼƬ��ַ�����ӵ�ַ��

[ ��������� ݸ��֮�� �� 2007-4-17 12:54 �༭ ]
ݸ��֮�� at 2007-4-17 12:52:03 
���JS����Ч����ȫ ~~~~~~~~~~

2.[����Ӧ] 
    ��ǰ��һ�����벻ͬ���ǣ�������ƶ������ͼƬ���ǿ��Ը�Ӧ��ʾ�������úõĹ���ͼЧ�����������ʵ��Ч��������룺

function bigshow(){ 
    document.all.div_250.style.visibility = 'visible'; 
    document.all.div_80.style.visibility = 'hidden'; 
    } 
    function bighide(){ 
    document.all.div_80.style.visibility = 'visible'; 
    document.all.div_250.style.visibility = 'hidden'; 
    } 
    
    var ad_80= new Array(1); 
    var ad_250= new Array(1); 
    
    ad_80[0]="<a href=http://www.dfeng.net target=_blank><img src=/skin/adv43/ad/ad_ad.gif border=0></a>"; 
    ad_250[0]="<a href=http://www.dfeng.net target=_blank><img src=/skin/adv43/ad/ad_ad2.gif border=0></a>"; 
    
    var imgheight; 
    var fubioleft; 
    window.screen.width>800 ? fubioleft=15:fubioleft=15 
    
    document.write('<DIV id=floater_left style="Z-INDEX: 25; LEFT:'+fubioleft+'px; WIDTH: 28px;POSITION: absolute; TOP: 42px; HEIGHT: 22px">'); 
    
    ad_now = new Date(); 
    ad_id= ad_now.getSeconds() %1 
    
    var adhead1="<div id=div_80 style='position:absolute; width:95px; height:62px; z-index:12' onMouseOver=bigshow();>"; 
    var adhead2="</div><div id=div_250 style='position:absolute; visibility: hidden; z-index:13;width: 80; height: 60' onMouseOut=bighide();>"; 
    
    //var adhead1="<div id=div_80 style='position:absolute; width:95px; height:62px; z-index:20' onMouseOut='//MM_showHideLayers(\"div_250\",\"\",\"hide\")' onMouseOver='MM_showHideLayers(\"div_250\",\"\",\"show\")'>"; 
    //var adhead2="</div><div id=div_250 style='position:absolute; z-index:21;visibility: hidden; width: 80; height: 60' onMouseOver='MM_showHideLayers(\"div_250\",\"\",\"show\")' onMouseOut='MM_showHideLayers(\"div_250\",\"\",\"hide\")'>"; 
    
    document.write(adhead1+ad_80[ad_id]+adhead2+ad_250[ad_id]+"</div>"); 
    
    document.write ("</div>"); 
    self.onError=null; 
    currentX = currentY = 0; 
    whichIt = null; 
    lastScrollX = 0; lastScrollY = 0; 
    NS = (document.layers) ? 1 : 0; 
    IE = (document.all) ? 1: 0; 
    function heartBeat() { 
    if(IE) { 
    diffY = document.body.scrollTop; 
    diffX = document.body.scrollLeft; } 
    if(NS) { 
    diffY = self.pageYOffset; diffX = self.pageXOffset; } 
    if(diffY != lastScrollY) { 
    percent = .5 * (diffY - lastScrollY); 
    if(percent > 0) percent = Math.ceil(percent); 
    else percent = Math.floor(percent); 
    if(IE) document.all.floater_left.style.pixelTop += percent; 
    if(NS) document.floater_left.top += percent; 
    lastScrollY = lastScrollY + percent; 
    } 
    if(diffX != lastScrollX) { 
    percent = .5 * (diffX - lastScrollX); 
    if(percent > 0) percent = Math.ceil(percent); 
    else percent = Math.floor(percent); 
    if(IE) document.all.floater_left.style.pixelLeft += percent; 
    if(NS) document.floater_left.left += percent; 
    lastScrollX = lastScrollX + percent; 
    } 
    } 
    
    if(NS || IE) action = window.setInterval("heartBeat()",1);var ad_80= new Array(1); 
    var ad_250= new Array(1); 
    
    ad_80[0]="<a href=http://www.dfeng.net target=_blank><img src=/skin/adv43/ad/ad_ad.jpg border=0></a>"; 
    ad_250[0]="<a href=http://www.dfeng.net target=_blank><img src=/skin/adv43/ad/ad_ad.jpg border=0></a>"; 
    
    var imgheight; 
    var fubioleft; 
    window.screen.width>800 ? fubioleft=15:fubioleft=15 
    
    document.write('<DIV id=floater_right style="Z-INDEX: 25; LEFT:'+fubioleft+'px; WIDTH: 28px;POSITION: absolute; TOP: 42px; HEIGHT: 22px">'); 
    
    ad_now = new Date(); 
    ad_id= ad_now.getSeconds() %1 
    
    function myload() 
    { 
    if (navigator.appName == "Netscape") 
    { 
    document.div_right_80.pageX=+window.innerWidth-130; 
    document.div_right_250.pageX=+window.innerWidth-300; 
    mymove(); 
    } 
    else 
    { 
    div_right_80.style.left=document.body.offsetWidth-130; 
    div_right_250.style.left=document.body.offsetWidth-300; 
    mymove(); 
    } 
    } 
    
    function mymove() 
    { 
    if(document.ns) 
    { 
    document.div_right_80.left=pageXOffset+window.innerWidth-130; 
    document.div_right_250.left=pageXOffset+window.innerWidth-300; 
    setTimeout("mymove();",20) 
    } 
    else 
    { 
    div_right_80.style.left=document.body.scrollLeft+document.body.offsetWidth-145; 
    div_right_250.style.left=document.body.scrollLeft+document.body.offsetWidth-300; 
    setTimeout("mymove();",20) 
    } 
    } 
    
    var adhead1="<div id=div_right_80 style='position:absolute; width:95px; height:60px; z-index:12' onMouseOver=bigshow_right();>"; 
    var adhead2="</div><div id=div_right_250 style='position:absolute; visibility: hidden; z-index:13;width: 250; height: 250' onMouseOut=bighide_right();><div align=right>"; 
    
    document.write(adhead1+ad_80[ad_id]+adhead2+ad_250[ad_id]+"</div></div>"); 
    
    myload() 
    
    document.write ("</div>"); 
    self.onError=null; 
    currentX_right = currentY_right = 0; 
    whichIt_right = null; 
    lastScrollX_right = 0; lastScrollY_right = 0; 
    NS = (document.layers) ? 1 : 0; 
    IE = (document.all) ? 1: 0; 
    function heartBeat_right() { 
    if(IE) { 
    diffY_right = document.body.scrollTop; 
    diffX_right = document.body.scrollLeft; } 
    if(NS) { 
    diffY_right = self.pageYOffset; diffX_right = self.pageXOffset; } 
    if(diffY_right != lastScrollY_right) { 
    percent_right = .5 * (diffY_right - lastScrollY_right); 
    if(percent_right > 0) percent_right = Math.ceil(percent_right); 
    else percent_right = Math.floor(percent_right); 
    if(IE) document.all.floater_right.style.pixelTop += percent_right; 
    if(NS) document.floater_right.top += percent_right; 
    lastScrollY_right = lastScrollY_right + percent_right; 
    } 
    if(diffX_right != lastScrollX_right) { 
    percent_right = .5 * (diffX_right - lastScrollX_right); 
    if(percent_right > 0) percent_right = Math.ceil(percent_right); 
    else percent_right = Math.floor(percent_right); 
    if(IE) document.all.floater_right.style.pixelLeft += percent_right; 
    if(NS) document.floater_right.left += percent_right; 
    lastScrollX_right = lastScrollX_right + percent_right; 
    } 
    } 
    
    if(NS || IE) action = window.setInterval("heartBeat_right()",1); 
    function bigshow_right(){ 
    document.all.div_right_250.style.visibility = 'visible'; 
    document.all.div_right_80.style.visibility = 'hidden'; 
    } 
    function bighide_right(){ 
    document.all.div_right_80.style.visibility = 'visible'; 
    document.all.div_right_250.style.visibility = 'hidden'; 
    }document.write(''); 
    document.write(''); 
    document.write(''); 


    
3.[����ر�] 
    ��ǰ���������벻ͬ���ǣ����ͼ�·�������һ��ͼƬ��Ŧ������ÿ͵���رչ��ͼƬ�������ı����о���ʵ��Ч��������룺 

var delta=0.015; 
    var collection; 
    var closeB=false; 
    function floaters() { 
    this.items = []; 
    this.addItem = function(id,x,y,content) 
    { 
    document.write('<DIV id='+id+' style="Z-INDEX: 10; POSITION: absolute; width:80px; height:60px;left:'+(typeof(x)=='string'?eval(x):x)+';top:'+(typeof(y)=='string'?eval(y):y)+'">'+content+'</DIV>'); 
    
    var newItem = {}; 
    newItem.object = document.getElementById(id); 
    newItem.x = x; 
    newItem.y = y; 
    
    this.items[this.items.length] = newItem; 
    } 
    this.play = function() 
    { 
    collection = this.items 
    setInterval('play()',30); 
    } 
    } 
    function play() 
    { 
    if(screen.width<=800 || closeB) 
    { 
    for(var i=0;i<collection.length;i++) 
    { 
    collection.object.style.display = 'none'; 
    } 
    return; 
    } 
    for(var i=0;i<collection.length;i++) 
    { 
    var followObj = collection.object; 
    var followObj_x = (typeof(collection.x)=='string'?eval(collection.x):collection.x); 
    var followObj_y = (typeof(collection.y)=='string'?eval(collection.y):collection.y); 
    
    if(followObj.offsetLeft!=(document.body.scrollLeft+followObj_x)) { 
    var dx=(document.body.scrollLeft+followObj_x-followObj.offsetLeft)*delta; 
    dx=(dx>0?1:-1)*Math.ceil(Math.abs(dx)); 
    followObj.style.left=followObj.offsetLeft+dx; 
    } 
    
    if(followObj.offsetTop!=(document.body.scrollTop+followObj_y)) { 
    var dy=(document.body.scrollTop+followObj_y-followObj.offsetTop)*delta; 
    dy=(dy>0?1:-1)*Math.ceil(Math.abs(dy)); 
    followObj.style.top=followObj.offsetTop+dy; 
    } 
    followObj.style.display = ''; 
    } 
    } 
    function closeBanner() 
    { 
    closeB=true; 
    return; 
    } 
    
    var theFloaters = new floaters(); 
    // 
    theFloaters.addItem('followDiv1','document.body.clientWidth-100',0,'<a  href=http://www.dfeng.net target=_blank><img src=ad/doublead/right.gif width=100 height=554 border=0></a><br><br><img src=ad/doublead/close.gif >'); 
    theFloaters.addItem('followDiv2',0,0,'<a  href=http://www.dfeng.net target=_blank><img src=ad/doublead/ad_ad.gif width=100 height=400 border=0 ></a><br><br><img src=ad/doublead/close.gif >'); 
    theFloaters.play(); 


   ������Ĵ���ֱ����Ϊ����JS�ļ���Ȼ������ʵ�ִ�Ч����ҳ���� 
    
    <script type="text/javascript" language="javascript1.2" src="*.js"></SCRIPT> 
    
    ���ü��ɣ�*�����������ļ�����ע���޸Ĺ��ͼƬ��ַ�����ӵ�ַ��

[ ��������� ݸ��֮�� �� 2007-4-17 12:59 �༭ ]
ݸ��֮�� at 2007-4-17 12:52:38 
���JS����Ч����ȫ ~~~~~~~~~~

4.[�����������---֮������] 
    
    �������ֻ��һ����ʾ�Ļ�,������ʵ�����Ч��������룺 

  var ad_float_left_src ="ͼƬ��ַ"; 
    var ad_float_left_url ="��ַ"; 
    var ad_float_left_type = ""; 
    document.ns = navigator.appName == "Microsoft Internet Explorer" 
    
    var imgheight_close 
    var imgleft 
    window.screen.width>800 ? imgheight_close=120:imgheight_close=120 
    window.screen.width>800 ? imgleft=8:imgleft=122 
    function myload() 
    { 
    myleft.style.top=document.body.scrollTop+document.body.offsetHeigh 
    t-imgheight_close; 
    myleft.style.left=imgleft; 
    leftmove(); 
    } 
    function leftmove() 
    { 
    myleft.style.top=document.body.scrollTop+document.body.offsetHeigh 
    t-imgheight_close; 
    myleft.style.left=imgleft; 
    setTimeout("leftmove();",50) 
    } 
    
    function MM_reloadPage(init) { //reloads the window if Nav4 
    resized 
    if (init==true) with (navigator) {if ((appName=="Netscape")&& 
    (parseInt(appVersion)==4)) { 
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; 
    onresize=MM_reloadPage; }} 
    else if (innerWidth!=document.MM_pgW || innerHeight! 
    =document.MM_pgH) location.reload(); 
    } 
    MM_reloadPage(true) 
    
    function close_float_left(){ 
    myleft.style.visibility='hidden'; 
    } 
    
    document.write("<div id=myleft style='position: 
    absolute;width:80;top:300;left:5;visibility: visible;z-index: 1'>" 
    +"<style>" 
    +"A.closefloat:link,A.refloat:visited {text- 
    decoration:none;color:#000000;font-size:12px}" 
    +"A.closefloat:active,A.refloat:hover {text-decoration:underline;color:#0000FF;font-size:12px}" 
    +"</style>" 
    +"<table border=0 cellpadding=0 cellspacing=0><tr><td>"); 
    
    if(document.ns){ 
    if(ad_float_left_type!="swf") 
    document.write("<a href='" + ad_float_left_url + "' target 
    = '_blank'><img src='" + ad_float_left_src + "' WIDTH=88 
    height=31 border=0></a>"); 
    else 
    document.write("<EMBED src='" + ad_float_left_src + "' 
    quality=high WIDTH=80 HEIGHT=80 TYPE='application/x-shockwave- 
    flash' id=changhongout ></EMBED>"); 
    
    document.write("</td></tr><tr><td width=80 height=20 
    align=right><a href='javascript:close_float_left( target=_blank);void(0);' 
    class=closefloat><b><font color=#ff0000>�ر�</font></b></a></td></tr>" 
    +"</table>" 
    +"</div>"); 
    
    myload()} 



    
[ 5.��Ͷ���] 

<script language="javascript"> 
    <!-- 
    var sohu=window.open('http://www.sohu.com'); 
    var ads=window.open('about:blank','ads','width=700,height=400'); 
    sohu.focus(); 
    ads.document.open(); 
    ads.document.write ("<html><head><title>ads</title></head><body>This is background ads</body></html>"); 
    ads.document.close(); 
    //--> 
    </script> 
    


[ 6.�������] 
    
    <script language="javascript"> 
    <!-- 
    var bwidth=800; 
    var bheight=400; 
    function go() { 
    bwidth = bwidth - 10; 
    bheight = bheight - 5; 
    if(bwidth <= 10) 
    { ads.style.display='none';clearTimeout("my"); } 
    else 
    { ads.outerHTML='<span id="ads" style="width:'+bwidth+'px;height:'+bheight+'px;background-color:#0099FF;"></span>';} 
    var my=setTimeout("go()",50); 
    } 
    setTimeout("go()",6000); 
    //--> 
    </script> 
    <body topmargin="0" leftmargin="0"> 
    <div align="center"><span id="ads" style="width:800px;height:400px;background-color:#0099FF"></span></div> 
    </body>

******************************************************************************
    ������Ĵ������Ϊ����*.JS�ļ���Ȼ������ʵ�ִ�Ч����ҳ���� 
     
    CODE: 
    <script src="*.js"></SCRIPT> 
    
    ���ü��ɣ�*�����������ļ�����ע���޸Ĺ��ͼƬ��ַ�����ӵ�ַ����Ӧ�Ĳ������Ը���ҳ�����е���

[ ��������� ݸ��֮�� �� 2007-4-17 13:01 �༭ ]
ݸ��֮�� at 2007-4-17 12:53:19 
js�õ�Ƭ������~~~~~~~~~~

var _c = 0;
var _i = 0;
var _v = 0;
var _l = 0;
var _sf = 3000;
var _html = null;
var _image = null;
var _mycars= new Array();
var _w = new Array();
var _h = new Array();

function adRotator() {}

function adRotator.add(p,w,h)
{
   _mycars[_c] = p;
   _w[_c] = w;
   _h[_c] = h;
   _c = _c + 1;
}

/* �������� */
function  adRotator.loads()
{
   if (_i < _mycars.length && _l < 1)
   {
     _html = '<img src="' + _mycars[_i] + '" width="' + _w[_i] + '" height="' + _h[_i] + '" style="border:1px solid #CCCCCC;">'
     if (_v < 1)
     {
        document.getElementById('image').value = _html + ',' + _i;
        document.getElementById('rotatorPlayer').innerHTML = _html;
        _i = _i + 1;
  document.getElementById('backs').disabled='';
        window.setTimeout("adRotator.loads("+_i+")",_sf);
     }
   }
   else
   {
     _html = '<img src="' + _mycars[_i] + '" width="' + _w[_i] + '" height="' + _h[_i] + '" style="border:1px solid #CCCCCC;">'
  document.getElementById('image').value = _html + ',' + _i;
     document.getElementById('rotatorPlayer').innerHTML = _html;
   }
   if (_i+1 > _mycars.length)
   {
      document.getElementById('stops').disabled='True';
   document.getElementById('play').disabled='';
   document.getElementById('backs').disabled='';
   document.getElementById('next').disabled='True';
   _i = 0;
   _v = 1;
   }
}

/* ���� */
function  adRotator.play()
{
   _v = 0;
   _l = 0;
   adRotator.loads();
}

/* ��һ�� */
function adRotator.next()
{
   _l = 1;
   if(_i+1 < _mycars.length)
   {
      _i = _i + 1;
   document.getElementById('play').disabled='';
   document.getElementById('stops').disabled='True';
   document.getElementById('backs').disabled='';
   adRotator.loads();
   }
   else
   {
      document.getElementById('next').disabled='True';
   }
}

/* ��һ�� */
function adRotator.backs()
{
   _l = 1;
   if(_i-1 < 0)
   {
      document.getElementById('backs').disabled='True';
   }
   else
   {
      _i = _i - 1;
   document.getElementById('play').disabled='';
   document.getElementById('stops').disabled='True';
   document.getElementById('next').disabled='';
   adRotator.loads();
   }
}

/* ���ʱ�� */
function adRotator.set()
{
   var _sfc = document.getElementById('second').value;
   if (isInteger(_sfc))
   {
     _sf = _sfc * 1000;
   }
   else
   {
     alert('��ʾ��ֻ���������֣�');
     document.getElementById('second').value=1;
     document.getElementById('second').select();
   }
}

/* �ַ���� */
function isInteger(str)
{  
  var regu = /^[-]{0,1}[0-9]{1,}$/;
  return regu.test(str);
}

/* ��ͣ */
function adRotator.stops()
{
   _v = 1;
}

/* ���ͼƬ,��Ҫ�ӵĻ�ע��ͼƬ���־ͺ���,����400,300�Ǵ�С */
adRotator.add("1.jpg",400,300);
adRotator.add("2.jpg",400,300);
adRotator.add("3.jpg",400,300);


�������ļ���Ϊһ��JS�ļ�

�������ļ������ü���

<style type="text/css">
<!--
body { font-size:12px;
}
input { 
    border-right: #7b9ebd 1px solid;
padding-right: 2px;
border-top: #7b9ebd 1px solid;
padding-left: 2px;
font-size: 12px;
filter: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#cecfde);
border-left: #7b9ebd 1px solid;
cursor: hand;
color: black;
padding-top: 2px;
border-bottom: #7b9ebd 1px solid;
}
button { 
    border-right: #7b9ebd 1px solid;
padding-right: 2px;
border-top: #7b9ebd 1px solid;
padding-left: 2px;
font-size: 12px;
filter: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#cecfde);
border-left: #7b9ebd 1px solid;
cursor: hand;
color: black;
padding-top: 2px;
border-bottom: #7b9ebd 1px solid;
}
-->
</style>
<script language="javascript" src="test.js">
</script>

     
<body >
<div id="rotatorPlayer"></div>



<input type="button" name="play" value="��ʼ����"  disabled="True"/>
<input type="button" name="stops" value="��ͣ" />
<input type="button" name="backs" value="��һ��"  disabled="true"/>
<input type="button" name="next" value="��һ��" />   
<input type="text" id="second" value="3" size="3" maxlength="2">
��
<input type="button" value="����ʱ��"  />



<input name="image" type="text" size="65"/>


һ���ǳ����Ĳ�����,��ϧ���ͼƬ�Ƿǳ���Ļ�,�ǽ���е��! 
