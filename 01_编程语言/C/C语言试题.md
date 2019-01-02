1、局部变量能否和全局变量重名？ 

答：能，局部会屏蔽全局。要用全局变量，需要使用"::" ;局部变量可以与全局变量同名，在函数内引用这个变量时，会用到同名的局部变量，而不会用到全局变量。对于有些编译器而言，在同一个函数内可以定义多个同名的局部变量，比如在两个循环体内都定义一个同名的局部变量，而那个局部变量的作用域就在那个循环体内。

2、如何引用一个已经定义过的全局变量？ 

答：extern 

可以用引用头文件的方式，也可以用extern关键字，如果用引用头文件方式来引用某个在头文件中声明的全局变理，假定你将那个编写错了，那么在编译期间会报错，如果你用extern方式引用时，假定你犯了同样的错误，那么在编译期间不会报错，而在连接期间报错。 

3、全局变量可不可以定义在可被多个.C文件包含的头文件中？为什么？ 

答：可以，在不同的C文件中以static形式来声明同名全局变量。 

可以在不同的C文件中声明同名的全局变量，前提是其中只能有一个C文件中对此变量赋初值，此时连接不会出错. 

4、请写出下列代码的输出内容 

#include  <stdio.h> 

int main(void) 

{ 

int a,b,c,d; 

a=10; 

b=a++; 

c=++a; 

  d=10*a++; 

printf("b，c，d：%d，%d，%d"，b，c，d）; 

return 0; 

} 

答：10，12，120 

5、static全局变量与普通的全局变量有什么区别？static局部变量和普通局部变量有什么区别？static函数与普通函数有什么区别？ 

答: 1) 全局变量(外部变量)的说明之前再冠以static 就构成了静态的全局变量。全局变量本身就是静态存储方式， 静态全局变量当然也是静态存储方式。 这两者在存储方式上并无不同。这两者的区别在于非静态全局变量的作用域是整个源程序， 当一个源程序由多个源文件组成时，非静态的全局变量在各个源文件中都是有效的。 而静态全局变量则限制了其作用域， 即只在定义该变量的源文件内有效， 在同一源程序的其它源文件中不能使用它。由于静态全局变量的作用域局限于一个源文件内，只能为该源文件内的函数公用， 因此可以避免在其它源文件中引起错误。 

2) 从以上分析可以看出， 把局部变量改变为静态变量后是改变了它的存储方式即改变了它的生存期。把全局变量改变为静态变量后是改变了它的作用域，限制了它的使用范围。                   3) static函数与普通函数作用域不同,仅在本文件。只在当前源文件中使用的函数应该说明为内部函数(static)，内部函数应该在当前源文件中说明和定义。对于可在当前源文件以外使用的函数，应该在一个头文件中说明，要使用这些函数的源文件要包含这个头文件 

综上所述:

static全局变量与普通的全局变量有什么区别：

static全局变量只初使化一次，防止在其他文件单元中被引用; 

static局部变量和普通局部变量有什么区别：

static局部变量只被初始化一次，下一次依据上一次结果值； 

static函数与普通函数有什么区别：

static函数在内存中只有一份，普通函数在每个被调用中维持一份拷贝

6、程序的局部变量存在于（堆栈）中，全局变量存在于（静态区 ）中，动态申请数据存在于（ 堆）中。 

7、设有以下说明和定义： 

typedef union 

{

long i; 

int k[5];

char c;

} DATE; 

struct data

{

   int cat;

   DATE cow; 

double dog;

} too; 

DATE max; 

则语句 printf("%d",sizeof(struct data)+sizeof(max));的执行结果是：___52____ 

考点:区别struct与union.(一般假定在32位机器上) 

答：DATE是一个union, 变量公用空间. 里面最大的变量类型是int[5], 占用20个字节. 所以它的大小是20. data是一个struct, 每个变量分开占用空间. 依次为int4 + DATE20 + double8 = 32. 所以结果是 20 + 32 = 52. 当然...在某些16位编辑器下, int可能是2字节,那么结果是 int2 + DATE10 + double8 = 20 

8、队列和栈有什么区别？

  队列先进先出，栈后进先出 

9、写出下列代码的输出内容 

#include <stdio.h> 

int inc(int a) 

{ return(++a); } 

int multi(int*a,int*b,int*c) 

{ return(*c=*a**b); } 

typedef int(FUNC1)(int in); 

typedef int(FUNC2) (int*,int*,int*); 

void show(FUNC2 fun,int arg1, int*arg2) 

{ 

  FUNC1 p=&inc; 

int temp =p(arg1); 

fun(&temp,&arg1, arg2); 

printf("%dn",*arg2); 

} 

main() 

{ 

int a;        //局部变量a为0;

show(multi,10,&a); 

return 0; 

} 

答：110 

10、请找出下面代码中的所有错误 (题目不错,值得一看)

说明：以下代码是把一个字符串倒序，如“abcd”倒序后变为“dcba” 

#include"string.h" 

main() 

{ 

char*src="hello,world"; 

char* dest=NULL; 

int len=strlen(src); 

dest=(char*)malloc(len); 

char* d=dest; 

char* s=src[len]; 

while(len--!=0) 

d++=s--; 

printf("%s",dest); 

return 0; 

} 

答： 

方法1：一共有4个错误; 

int main() 

{ 

char* src = "hello,world"; 

int len = strlen(src); 

char* dest = (char*)malloc(len+1);//要为分配一个空间 char* d = dest; 

char* s = &src[len-1];   //指向最后一个字符

while( len-- != 0 ) 

*d++=*s--; 

*d = 0;           //尾部要加’\0’ 

printf("%sn",dest); 

free(dest);        // 使用完，应当释放空间，以免造成内存汇泄露 

dest = NULL; //防止产生野指针 

return 0; 

} 

方法2： (方法一需要额外的存储空间,效率不高.) 不错的想法

#include <stdio.h>

#include <string.h>

main()

{

char str[]="hello,world";

int len=strlen(str);

char t;

for(int i=0; i<len/2; i++)

{

t=str[i]; 

str[i]=str[len-i-1]; //小心一点

str[len-i-1]=t;

}

printf("%s",str);

return 0;

}

11.对于一个频繁使用的短小函数,在C语言中应用什么实现,在C++中应用什么实现? 

c用宏定义，c++用inline 

12.直接链接两个信令点的一组链路称作什么? 

PPP点到点连接 

13.接入网用的是什么接口?

V5接口 

14.voip都用了那些协议? 

H.323协议簇、SIP协议、Skype协议、H.248和MGCP协议 

15.软件测试都有那些种类? 

黑盒：针对系统功能的测试 

白盒：测试函数功能，各函数接口 

16.确定模块的功能和模块的接口是在软件设计的那个队段完成的? 

概要设计阶段 

17. 

unsigned char *p1;

unsigned long *p2;

p1=(unsigned char *)0x801000; 

p2=(unsigned long *)0x810000;

请问p1+5=  ;

p2+5=  ;

答案:0x801005(相当于加上5位) 0x810014(相当于加上20位);

逻辑题：

18.-1,2,7,28,,126请问28和126中间那个数是什么？为什么？

第一题的答案应该是4^3-1=63

规律是n^3-1(当n为偶数0，2，4)n^3+1(当n为奇数1，3，5)

答案：63

19.用两个栈实现一个队列的功能？要求给出算法和思路！

设2个栈为A,B, 一开始均为空.

入队: 
将新元素push入栈A;

出队: 
(1)判断栈B是否为空； 
(2)如果不为空，则将栈A中所有元素依次pop出并push到栈B； 
(3)将栈B的栈顶元素pop出；

这样实现的队列入队和出队的平摊复杂度都还是O(1), 比上面的几种方法要好。

20.在c语言库函数中将一个字符转换成整型的函数是atool()吗，这个函数的原型是什么？

函数名: atol 
功 能: 把字符串转换成长整型数 
用 法: long atol(const char *nptr); 
程序例: 
＃i nclude <stdlib.h> 
＃i nclude <stdio.h> 
int main(void) 
{ 
long l; 
char *str = "98765432"; 
l = atol(lstr); 
printf("string = %s integer = %ld\n", str, l); 
return(0); 
}

选择题: 

21.Ethternet链接到Internet用到以下那个协议? D 

A.HDLC;B.ARP;C.UDP;D.TCP;E.ID 

22.属于网络层协议的是:( B C) 

  A.TCP;B.IP;C.ICMP;D.X.25 

23.Windows消息调度机制是:(C) 

A.指令队列;B.指令堆栈;C.消息队列;D.消息堆栈; 

24. 
unsigned short hash(unsigned short key) 
{ 
return (key>>)%256 
} 
请问hash(16),hash(256)的值分别是: 
A.1.16;B.8.32;C.4.16;D.1.32

找错题: 

25.请问下面程序有什么错误? 
int a[60][250][1000],i,j,k; 
for(k=0;k<=1000;k++) 
for(j=0;j<250;j++) 
for(i=0;i<60;i++) 
a[i][j][k]=0;

把循环语句内外换一下 
26. 
#define Max_CB 500 
void LmiQueryCSmd(Struct MSgCB * pmsg) 
{ 
unsigned char ucCmdNum; 
...... 
for(ucCmdNum=0;ucCmdNum<Max_CB;ucCmdNum++) 
{ 
......; 
}

死循环,unsigned int的取值范围是0~255 
27.以下是求一个数的平方的程序,请找出错误: 
#define SQUARE(a)((a)*(a)) 
int a=5; 
int b; 
b=SQUARE(a++);

答:结果与编译器相关,得到的可能不是平方值. 
28. 
typedef unsigned char BYTE 
int examply_fun(BYTE gt_len; BYTE *gt_code) 
{   
BYTE *gt_buf; 
gt_buf=(BYTE *)MALLOC(Max_GT_Length); 
...... 
if(gt_len>Max_GT_Length) 
{ 
return GT_Length_ERROR;   
} 
....... 
}


问答题: 

29.IP Phone的原理是什么? 

IP电话（又称IP PHONE或VoIP）是建立在IP技术上的分组化、数字化传输技术,其基本原理是：通过语音压缩算法对语音数据进行压缩编码处理,然后把这些语音数据按IP等相关协议进行打包,经过IP网络把数据包传输到接收地,再把这些语音数据包串起来,经过解码解压处理后,恢复成原来的语音信号,从而达到由IP网络传送语音的目的。

30.TCP/IP通信建立的过程怎样，端口有什么作用？ 

三次握手，确定是哪个应用程序使用该协议 

31.1号信令和7号信令有什么区别，我国某前广泛使用的是那一种？

  1号信令接续慢，但是稳定，可靠。

7号信令的特点是：信令速度快，具有提供大量信令的潜力，具有改变和增加信令的灵活性，便于开放新业务，在通话时可以随意处理信令，成本低。目前得到广泛应用。

32.列举5种以上的电话新业务 

如“闹钟服务”、“免干扰服务”、“热线服务”、“转移呼叫”、“遇忙回叫”、“缺席用户服务”、“追查恶意呼叫”、“三方通话”、“会议电话”、“呼出限制”、“来电显示”、“虚拟网电话”等

int b;

b=SQUARE(a++);

答:结果与编译器相关,得到的可能不是平方值.
