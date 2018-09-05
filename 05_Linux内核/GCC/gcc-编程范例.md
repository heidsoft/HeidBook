gcc -I /usr/openwin/include fred.c 通过-I标志来引用保存在下级子目录或者非标准位置的头文件
.a 传统的静态型函数库
.so和.sa 共享型函数库
gcc -o fred fred.c /usr/lib/libm.a
gcc -o fred fred.c -lm
gcc -o x11fred -L/usr/openwin/lib x11fred.c -lX11(这条命令在编译和连接程序x11fred时将使用在子目录/usr/openwin/lib中找到的libX11函数库版本)

静态库(也称档案archive) 文件名以.a结尾.
c语言标准库/usr/lib/libc.a 和X11库/usr/X11/lib/libX11.a

gcc -c bill.c fred.c(-c选项制止编译器试图生成最终的程序，将函数分别进行编译生成二进制目标文件)
ls *.o

[root@localhost libhdt]# gcc -c bill.c fred.c 
[root@localhost libhdt]# ls
bill.c  bill.o  fred.c  fred.o
[root@localhost libhdt]# gcc -c program.c 
[root@localhost libhdt]# ls
bill.c  bill.o  fred.c  fred.o  lib.h  program.c  program.o
[root@localhost libhdt]# gcc -o program program.o bill.o
[root@localhost libhdt]# ./program 
bill: you passed Hello world
[root@localhost libhdt]# ar crv libfoo.a bill.o fred.o
a - bill.o
a - fred.o
[root@localhost libhdt]# ls
bill.c  bill.o  fred.c  fred.o  libfoo.a  lib.h  program  program.c  program.o
[root@localhost libhdt]# ranlib libfoo.a 
[root@localhost libhdt]# gcc -o program program.o libfoo.a 
[root@localhost libhdt]# ./program 
bill: you passed Hello world
[root@localhost libhdt]# gcc -o program program.o -L. -lfoo (-L选项告诉编译器在当前子目录里查找函数库
-lfoo 选项告诉编译器使用那个名为libfoo.a的函数库或者一个名为libfoo.so的共享库--如果有的话)

nm 命令查看程序使用了哪些函数

共享库（程序运行的时候才加入到其中）
c语言标准库的共享库版本是/usr/lib/libc.so.N 其中的“N” 是主版本号
共享库的动态加载器lb.so 或者ld-linux.so.2
ldd program(查看使用了那些共享库)

