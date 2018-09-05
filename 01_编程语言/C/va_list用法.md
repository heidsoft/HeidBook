va_list�÷�

����д��һ�����Դ�����printfһ���ܹ�����ɱ䳤�����ĺ����ء�

��printf�Ķ���:

int printf(char *fmt�� ...)��

C���Ա�׼����ͷ�ļ�stdarg.h�����Ľӿڰ�����һ���ܹ������䳤�����б�ĺꡣ��Ҫ�������漸����

1��va_list ��������һ����ʾ�������и��������ı�����

2��va_start ��ʼ��һ��ָ����ָ��䳤�����б��ͷһ��������ע�⣬...ֻ�ܳ����ڲ���������

3��va_argÿ�ε���ʱ���᷵�ص�ǰָ��ָ��ı���������ָ��Ų����һ��λ�ã�������������Ҫ��������õĵڶ���������ָ����va_argҲ�Ǹ�������������ж�ƫ�Ƶľ��롣

4��va_end��Ҫ�ں��������ã�������һЩ��������

������һ���򵥵����ӡ�

�� Ctrl+C ���ƴ���
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
�� Ctrl+C ���ƴ���
��������

[wren@buster c_prime]$ ./read_num
my_log_prehead-hello world!
111 222 333

vsprintf��va_list���÷�Ҳ�Ǿ�����������ĵط�����������Թ��ο���







////////////////////////////////////////////////////////////////////

1:���޷��г����ݺ���������ʵ�ε����ͺ���Ŀʱ,����ʡ�Ժ�ָ��������
void foo(...);
void 
foo(parm_list,...);

 

2:���������Ĵ���ԭ��
���������������ݽṹ:ջ����ʽ��ȡ,����������ջ.eg:
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

 

3:��ȡʡ�Ժ�ָ���Ĳ���
�ں�����������һ��va_list��Ȼ����va_start��������ȡ�����б��еĲ�����ʹ����Ϻ����va_end()����������δ��룺
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

 

4.va_startʹargpָ���һ����ѡ������va_arg���ز����б��еĵ�ǰ������ʹargpָ������б��е���һ��������va_end��argpָ����ΪNULL���������ڿ��Զ�α�����Щ���������Ƕ�������va_start��ʼ������va_end��β��

 

����1).��ʾ���ʹ�ò��������ɱ�ĺ���������ANSI��׼��ʽ
����#include ��stdio.h��
����#include 
��string.h��
����#include ��stdarg.h��
����
����int demo( char, ... );
����void 
main( void )
����{
����   demo("DEMO", "This", "is", "a", "demo!", 
"");
����}
����
����int demo( char msg, ... 
)
����{
      
����   va_list 
argp;
����   int argno = 0;
����   char para;

 

����  
����   va_start( argp, msg 
);
����   while (1)
       
{
����    para = va_arg( argp, 
char);
����       if ( strcmp( para, "") == 0 
)
       
break;
����       printf("Parameter #%d is: 
%s\n", argno, para);
����       argno++;
���� 
}
���� va_end( argp );
����
������return 0;
����}

 

2)//ʾ������1���ɱ����������ʹ��
#include "stdio.h"
#include "stdarg.h"
void 
simple_va_fun(int start, ...)
{
    va_list 
arg_ptr;
   int nArgValue =start;
    int 
nArgCout=0;     //�ɱ��������Ŀ
    va_start(arg_ptr,start); 
//�Թ̶������ĵ�ַΪ���ȷ����ε��ڴ���ʼ��ַ��
    do
    
{
        
++nArgCout;
        printf("the %d th arg: 
%d\n",nArgCout,nArgValue);     
//�����������ֵ
        nArgValue = 
va_arg(arg_ptr,int);                      
//�õ���һ���ɱ������ֵ
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

 

3)//ʾ������2:��չ�����Լ�ʵ�ּ򵥵Ŀɱ�����ĺ�����
������һ���򵥵�printf������ʵ�֣��ο���<The C Programming 
Language>�е�����
#include "stdio.h"
#include "stdlib.h"
void 
myprintf(char* fmt, ...)        
//һ���򵥵�������printf��ʵ�֣�//�������붼��int ����
{
    char* 
pArg=NULL;               
//�ȼ���ԭ����va_list
    char 
c;
   
    pArg = (char*) 
&fmt;          //ע�ⲻҪд��p = fmt 
!!��Ϊ����Ҫ��//����ȡַ��������ȡֵ
    pArg += 
sizeof(fmt);         //�ȼ���ԭ����va_start         

    
do
    {
        c 
=*fmt;
        if (c != 
'%')
        
{
            
putchar(c);            
//��ԭ������ַ�
        
}
        
else
        
{
           
//����ʽ�ַ��������
           
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
//�ȼ���ԭ����va_arg
        
}
        ++fmt;
    
}while (*fmt != '\0');
    pArg = 
NULL;                               
//�ȼ���va_end
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

