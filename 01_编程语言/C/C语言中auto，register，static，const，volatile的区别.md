(1)auto
　　这个关键字用于声明变量的生存期为自动，即将不在任何类、结构、枚举、联合和函数中定义的变量视为全局变量，而在函数中定义的变量视为局部变量。这个关键字不怎么多写，因为所有的变量默认就是auto的。 

(2)register
　　这个关键字命令编译器尽可能的将变量存在CPU内部寄存器中而不是通过内存寻址访问以提高效率。 

(3)static
　　常见的两种用途:
　　　　1>统计函数被调用的次数;
　　　　2>减少局部数组建立和赋值的开销.变量的建立和赋值是需要一定的处理器开销的，特别是数组等含有较多元素的存储类型。在一些含有较多的变量并且被经常调用的函数中，可以将一些数组声明为static类型，以减少建立或者初始化这些变量的开销. 
　　详细说明:
　　　　1>、变量会被放在程序的全局存储区中，这样可以在下一次调用的时候还可以保持原来的赋值。这一点是它与栈变量和堆变量的区别。
　　　　2>、变量用static告知编译器，自己仅仅在变量的作用范围内可见。这一点是它与全局变量的区别。
　　　　3>当static用来修饰全局变量时，它就改变了全局变量的作用域，使其不能被别的程序extern，限制在了当前文件里，但是没有改变其存放位置，还是在全局静态储存区。

　　使用注意:
　　　　1>若全局变量仅在单个C文件中访问，则可以将这个变量修改为静态全局变量，以降低模块间的耦合度；
　　　　2>若全局变量仅由单个函数访问，则可以将这个变量改为该函数的静态局部变量，以降低模块间的耦合度；
　　　　3>设计和使用访问动态全局变量、静态全局变量、静态局部变量的函数时，需要考虑重入问题(只要输入数据相同就应产生相同的输出)。 

(4)const
　　被const修饰的东西都受到强制保护，可以预防意外的变动，能提高程序的健壮性。它可以修饰函数的参数、返回值，甚至函数的定义体。 
　　作用:
　　　　1>修饰输入参数
　　　　　　a.对于非内部数据类型的输入参数，应该将“值传递”的方式改为“const引用传递”，目的是提高效率。例如将void Func(A a) 改为void Func(const A &a)。
　　　　　　b.对于内部数据类型的输入参数，不要将“值传递”的方式改为“const引用传递”。否则既达不到提高效率的目的，又降低了函数的可理解性。例如void Func(int x) 不应该改为void Func(const int &x)。
　　　　2>用const修饰函数的返回值
　　　　　　a.如果给以“指针传递”方式的函数返回值加const修饰，那么函数返回值（即指针）的内容不能被修改，该返回值只能被赋给加const修饰的同类型指针。
　　　　　　　如对于： const char * GetString(void);
　　　　　　　如下语句将出现编译错误：
　　　　　　 　char *str = GetString();//cannot convert from 'const char *' to 'char *'；
　　　　　　　正确的用法是：
　　　　　　　const char *str = GetString();
　　　　　　b.如果函数返回值采用“值传递方式”，由于函数会把返回值复制到外部临时的存储单元中，加const修饰没有任何价值。如不要把函数int GetInt(void) 写成const int GetInt(void)。
　　　　3>const成员函数的声明中，const关键字只能放在函数声明的尾部,表示该类成员不修改对象.

　　　说明：
　　　　const type m; //修饰m为不可改变
　　　示例：
　　　　typedef char * pStr; //新的类型pStr;
　　　　char string[4] = "abc";
　　　　const char *p1 = string；
　　　　p1++; //正确，上边修饰的是*p1,p1可变
　　　　const pStr p2 = string;
　　　　p2++; //错误，上边修饰的是p2，p2不可变,*p2可变
　　　同理，const修饰指针时用此原则判断就不会混淆了。
　　　　const int *value; //*value不可变，value可变
　　　　int* const value; //value不可变，*value可变
　　　　const (int *) value; //(int *)是一种type,value不可变,*value可变
　　　　　　　　　　　　　　//逻辑上这样理解，编译不能通过，需要tydef int* NewType;
　　　　const int* const value;//*value,value都不可变 

(5)volatile
　　表明某个变量的值可能在外部被改变，优化器在用到这个变量时必须每次都小心地重新读取这个变量的值，而不是使用保存在寄存器里的备份。它可以适用于基础类型如：int,char,long......也适用于C的结构和C++的类。当对结构或者类对象使用volatile修饰的时候，结构或者类的所有成员都会被视为volatile.
　　该关键字在多线程环境下经常使用，因为在编写多线程的程序时，同一个变量可能被多个线程修改，而程序通过该变量同步各个线程。
　　简单示例：
　　　DWORD __stdcall threadFunc(LPVOID signal)
　　　{
　　　　　int* intSignal="reinterdivt"_cast(signal);
　　　　　*intSignal=2;
　　　　　while(*intSignal!=1)
　　　　　sleep(1000);
　　　　　return 0;
　　　}
　　该线程启动时将intSignal 置为2，然后循环等待直到intSignal 为1 时退出。显然intSignal的值必须在外部被改变，否则该线程不会退出。但是实际运行的时候该线程却不会退出，即使在外部将它的值改为1，看一下对应的伪汇编代码就明白了：
　　　　　mov ax,signal
　　　　　label:
　　　　　if(ax!=1)
　　　　　goto label
　　对于C编译器来说，它并不知道这个值会被其他线程修改。自然就把它cache在寄存器里面。C 编译器是没有线程概念的,这时候就需要用到volatile。volatile 的本意是指：这个值可能会在当前线程外部被改变。也就是说，我们要在threadFunc中的intSignal前面加上volatile关键字，这时候，编译器知道该变量的值会在外部改变，因此每次访问该变量时会重新读取，所作的循环变为如下面伪码所示：
　　　　　label:
　　　　　mov ax,signal
　　　　　if(ax!=1)
　　　　　goto label 
　　注意：一个参数既可以是const同时是volatile，是volatile因为它可能被意想不到地改变。它是const因为程序不应该试图去修改它。 

(6)extern
　　extern 意为“外来的”···它的作用在于告诉编译器：有这个变量，它可能不存在当前的文件中，但它肯定要存在于工程中的某一个源文件中或者一个Dll的输出中。 