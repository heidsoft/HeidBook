va_list用法

怎样写出一个可以处理想printf一样能够处理可变长参数的函数呢。

看printf的定义:

int printf(char *fmt， ...)；

C语言标准库中头文件stdarg.h索引的接口包含了一组能够遍历变长参数列表的宏。主要包含下面几个：

1、va_list 用来声明一个表示参数表中各个参数的变量。

2、va_start 初始化一个指针来指向变长参数列表的头一个变量（注意，...只能出现在参数表的最后）

3、va_arg每次调用时都会返回当前指针指向的变量，并将指针挪至下一个位置，参数的类型需要在这个调用的第二个参数来指定，va_arg也是根据这个参数来判断偏移的距离。

4、va_end需要在函数最后调用，来进行一些清理工作。

下面上一个简单的例子。

按 Ctrl+C 复制代码
#include <stdio.h>
 #include <stdarg.h>
 #include <string.h>
 
 
 void write_log( char *fmt, ...)
 {
     va_list va;
     char buf[1024];
     
     va_start(va, fmt);
     memset(buf, 0, 1024);
     (void) vsprintf(buf, fmt, va);
     va_end(va);
     
     printf("%s-%s", "my_log_prehead", buf);
 }
 
 
 void read_num(int num, ...)
 {
     va_list va;             /*point to each unamed variables in arg list*/
     va_start(va, num);      /*start va_list from num, and va goes to the second one, and this is the first vary variable*/
     while(num--)
     {
         printf("%d\t", va_arg(va, int)); /*get a arg, va goes to the next*/
     }
     va_end(va);             /*end the va*/29 }
 
 int main()
 {
     write_log("%s\n", "hello world!");
     read_num(3, 111, 222, 333);
     return 0;
 }
按 Ctrl+C 复制代码
结果输出：

[wren@buster c_prime]$ ./read_num
my_log_prehead-hello world!
111 222 333

vsprintf中va_list的用法也是经常会产生误会的地方，留在这里，以供参考。







////////////////////////////////////////////////////////////////////

1:当无法列出传递函数的所有实参的类型和数目时,可用省略号指定参数表
void foo(...);
void 
foo(parm_list,...);

 

2:函数参数的传递原理
函数参数是以数据结构:栈的形式存取,从右至左入栈.eg:
#include 
<iostream>
void fun(int a, ...)
{
int *temp = 
&a;
temp++;
for (int i = 0; i < a; ++i)
{
cout << *temp 
<< endl;
temp++;
}
}

 

int main()
{
int a = 1;
int b = 2;
int c = 3;
int d = 
4;
fun(4, a, b, c, d);
system("pause");
return 
0;
}
Output::
1
2
3
4

 

3:获取省略号指定的参数
在函数体中声明一个va_list，然后用va_start函数来获取参数列表中的参数，使用完毕后调用va_end()结束。像这段代码：
void 
TestFun(char* pszDest, int DestLen, const char* pszFormat, ...)
{
va_list 
args;
va_start(args, 
pszFormat);
_vsnprintf(pszDest, DestLen, pszFormat, 
args);
va_end(args);
}

 

4.va_start使argp指向第一个可选参数。va_arg返回参数列表中的当前参数并使argp指向参数列表中的下一个参数。va_end把argp指针清为NULL。函数体内可以多次遍历这些参数，但是都必须以va_start开始，并以va_end结尾。

 

　　1).演示如何使用参数个数可变的函数，采用ANSI标准形式
　　#include 〈stdio.h〉
　　#include 
〈string.h〉
　　#include 〈stdarg.h〉
　　
　　int demo( char, ... );
　　void 
main( void )
　　{
　　   demo("DEMO", "This", "is", "a", "demo!", 
"");
　　}
　　
　　int demo( char msg, ... 
)
　　{
      
　　   va_list 
argp;
　　   int argno = 0;
　　   char para;

 

　　  
　　   va_start( argp, msg 
);
　　   while (1)
       
{
　　    para = va_arg( argp, 
char);
　　       if ( strcmp( para, "") == 0 
)
       
break;
　　       printf("Parameter #%d is: 
%s\n", argno, para);
　　       argno++;
　　 
}
　　 va_end( argp );
　　
　　　return 0;
　　}

 

2)//示例代码1：可变参数函数的使用
#include "stdio.h"
#include "stdarg.h"
void 
simple_va_fun(int start, ...)
{
    va_list 
arg_ptr;
   int nArgValue =start;
    int 
nArgCout=0;     //可变参数的数目
    va_start(arg_ptr,start); 
//以固定参数的地址为起点确定变参的内存起始地址。
    do
    
{
        
++nArgCout;
        printf("the %d th arg: 
%d\n",nArgCout,nArgValue);     
//输出各参数的值
        nArgValue = 
va_arg(arg_ptr,int);                      
//得到下一个可变参数的值
    } while(nArgValue != 
-1);               
    
return;
}
int main(int argc, char* argv[])
{
    
simple_va_fun(100,-1);
    
simple_va_fun(100,200,-1);
    return 0;
}

 

3)//示例代码2:扩展——自己实现简单的可变参数的函数。
下面是一个简单的printf函数的实现，参考了<The C Programming 
Language>中的例子
#include "stdio.h"
#include "stdlib.h"
void 
myprintf(char* fmt, ...)        
//一个简单的类似于printf的实现，//参数必须都是int 类型
{
    char* 
pArg=NULL;               
//等价于原来的va_list
    char 
c;
   
    pArg = (char*) 
&fmt;          //注意不要写成p = fmt 
!!因为这里要对//参数取址，而不是取值
    pArg += 
sizeof(fmt);         //等价于原来的va_start         

    
do
    {
        c 
=*fmt;
        if (c != 
'%')
        
{
            
putchar(c);            
//照原样输出字符
        
}
        
else
        
{
           
//按格式字符输出数据
           
switch(*++fmt)
           
{
            
case'd':
                
printf("%d",*((int*)pArg));          
                
break;
            
case'x':
                
printf("%#x",*((int*)pArg));
                
break;
            
default:
                
break;
            
}
            pArg += 
sizeof(int);               
//等价于原来的va_arg
        
}
        ++fmt;
    
}while (*fmt != '\0');
    pArg = 
NULL;                               
//等价于va_end
    return;
}
int main(int argc, char* 
argv[])
{
    int i = 1234;
    int j = 
5678;
   
    myprintf("the first 
test:i=%d\n",i,j);
    myprintf("the secend test:i=%d; 
%x;j=%d;\n",i,0xabcd,j);
    
system("pause");
    return 0;
}

