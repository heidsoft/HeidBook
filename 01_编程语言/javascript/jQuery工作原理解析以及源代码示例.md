

jQuery�Ŀ�ƪ��������һ�ηǳ���Ҫ�Ļ���jQuery��Ϊ�˸ı�javascript�ı��뷽ʽ����Ƶġ�����λ����Կ���jQuery��������UI������������һ��AJAX��⡣jQuery�ı�javascript���뷽ʽ��

��ô�������ʵ�������������أ���������µ�һ�μ�̵�ʹ�����̣�

1������(����)jQuery����$("selector");

2������jQuery����ķ������������Ҫ��ɵĹ�����$("selector").doOurWork();

���ˣ�jQuery���������ֿ���˵����򵥵ı����߼����ı�javascript���뷽ʽ�ġ�������������jQuery�ı����߼����ģ�

Ҫʵ�����ּ����뷽ʽ������jQuery������һ����������Ҫ����ˣ�jQuery��domԪ�ز��������൱ǿ�������⣬jQuery����ķ����϶������޵ģ����޵ķ������㲻�������������������Ҫ�����ԣ������ṩjQuery���󷽷�����չ������

ǿ����domԪ�ز����������Լ����������ķ�����չ������������jQuery�ĺ������ڣ�

��һ���򵥵�ʾ������˵��jQuery����ι����ģ� 

< !DOCTYPE html PUBLIC ��-//W3C//DTD XHTML 1.0 Transitional//EN�� ��http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd��> 
<html xmlns=��http://www.w3.org/1999/xhtml�� > 
<head> 
<title>�ޱ���ҳ</title> 
</head> 
<body id=��bd��> 
<a href=��http://www.baidu.com��>baidu</a> 
</body> 
</html> 
<script type=��text/javascript�� src=��../Script/jquery.js��></script> 
<script type=��text/javascript�� > 
$(function(){ 
$(��a��).click(function(e){//1)����$(��a��);2)jQuery�����¼�click;3)jQuery���󷽷�hide 
$(this).hide(��slow��); 
return false; 
}); 
}); 
</script> 

jQuery����һ�������á���˼�룬��һ��ʹ�ö��������/�¼������ñ�����������ʮ�ּ�㣬����һ����ק����ĳ�ʼ���� 

$(document).ready( 
function() 
{ 
$(��#drag1��).Draggable({ 
handle: ��ax��, //�������� 
onStart: function(el,x,y){ //�¼����������� 
} 
}); 
} 
); 

���Կ�����$("#drag1")�ǲ��Ҳ�����һ��jquery����Ȼ�����Draggable����������ק��ʼ�����ڴ˷�������ʱ������һ�������á����󣬽�����ק�����ĳ�ʼ�����á���һ�����á���˼�룬�������һЩ���벽�裬���൱ֱ�ۺ��׶���

�����ҽ��������ʴ�

1���ʣ�Ϊʲô$(selector)֮�󣬷��ص���jQuery����

�𣺴�jQuery��Դ�����У����ǿ���֪����var $ = jQuery ����˵�����$(selector)����ʱ����ʵ����jQuery(selector)����������һ��jQuery���󡣵�Ȼ��ȷ��д��Ӧ���������ģ�var jq = new $(selector); ��jQueryʹ����һ��С�������ⲿ������new����jquery�����ڲ���if ( window == this ) return new jQuery(selector);

2���ʣ�Ϊʲô����һ��jQuery����֮�����ǿ�������д$(selector).each(function(index){��});���б��������أ�
����ʵjQuery(selector)��������ʱ����jQuery(selector)�����ڲ�����󷵻ص���һ�����飺return this.setArray(a); ��each�������ڲ���һ��forѭ������ѭ���������������õģ�method.call(this[i]��i) ��

3���ʣ�ΪʲôjQuery������jQuery��������/����/�¼��Ĳ��ʽ��չ��
���������һЩjavasciprt������������֪ʶ���ͻ�֪����jQuery.prototypeԭ�Ͷ����ϵ���չ����/�������¼��������jQuery�Ķ�����չ����������һ�㣬jQuery������д�ģ�jQuery.fn = jQuery.prototype �����ԣ���������չһ���������ʱ�����£�

jQuery.fn.check = function() { 
return this.each(function() { 
this.checked = true; 
}); 
}; 

��ʵ���ǣ�

jQuery.prototype.check = function() { 
return this.each(function() { 
this.checked = true; 
}); 
}; 

��������,jQuery�����Ǵ�����һ����෽��ı���ģ��(1>����jQuery����;2>ֱ��ʹ��jQuery���������/����/�¼�),һ��ǿ����domԪ�ز�����($),���ʽ��̽ӿ�(jQuery.fn),�Լ������ʼ���ġ����á�����˼��.

��:ʵ���Լ���jQuery

< !DOCTYPE html PUBLIC ��-//W3C//DTD XHTML 1.0 Transitional//EN�� ��http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd��> 

<html xmlns=��http://www.w3.org/1999/xhtml��> 
<head> 
<title>Untitled Page</title> 
</head> 
<body> 
<div id=��d��>divvv</div> 
<div id=��fsd��>fdsf</div> 
</body> 
</html> 
<script type=��text/javascript��> 
//ʵ���Լ���MyQuery��� 
var MyQuery = function(selector){ 
if ( window == this ) return new MyQuery(selector); 
//����ֻʵ��dom���͵ļ򵥲���,�ٺ� 
var doms = document.getElementsByTagName(selector); 
var arr = []; 
for(var i=0; i<doms .length; i++){ 
arr.push(doms.item(i)); 
} 
return this.setArray(arr); 
} 
MyQuery.prototype.setArray = function( arr ) { 
this.length = 0; 
[].push.apply( this, arr ); 
return this; 
} 
MyQuery.fn = MyQuery.prototype; 
var $ = MyQuery; 

//�����չ1)each 
MyQuery.fn.each = function(method){ 
for(var i=0,l=this.length; i<l; i++){ 
method.call(this[i],i); 
} 
} 
//�����չ2)show 
MyQuery.fn.show = function(){ 
this.each(function(i){ 
alert(i+��:��+this.id+��:��+this.innerHTML); 
}); 
} 
//debugger 
$(��div��).show(); 
</script></doms></script> 
