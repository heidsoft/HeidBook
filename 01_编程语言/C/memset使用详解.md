������ ��: ��s��ָ���ĳһ���ڴ��е�ÿ���ֽڵ�����ȫ������Ϊchָ����ASCIIֵ,

������Ĵ�С�ɵ���������ָ��,�������ͨ��Ϊ��������ڴ�����ʼ������

������ ��: void *memset(void *s, char ch, unsigned n);

����������:

����#include <string.h>

����#include <stdio.h>

����#include <mem.h>

����int main(void)

����{

����char buffer[] = "Hello world\n";

����printf("Buffer before memset: %s\n", buffer);

����memset(buffer, '*', strlen(buffer) );

����printf("Buffer after memset: %s\n", buffer);

����return 0;

����} 

������������

����Buffer before memset: Hello world

����Buffer after memset: ***********

��������ƽ̨��

����Microsoft Visual C++ 6.0

����Ҳ��һ�����ǰ�����ȫ������Ϊchָ����ASCIIֵ�����Ҹô���ch��Ϊint�����������ͣ�����һ��Ҫ��char���͡���������������

����int array[5] = {1,4,3,5,2};

����for(int i = 0; i < 5; i++)

����cout<<array<<" ";

����cout<<endl;

����memset(array,0,5*sizeof(int));

����for(int k = 0; k < 5; k++)

����cout<<array[k]<<" ";

����cout<<endl;

��������Ľ�����ǣ�1 4 3 5 2

����0 0 0 0 0

��������ı��С�Ĳ��������ֽ�Ϊ��λ�����ԣ�����int�������ľͲ����Ƕ���Ĭ�ϵ�1���ַ��ͣ��ˡ����Ҳ�ͬ�Ļ�����int�Ĵ�СҲ���ܲ�ͬ�����������sizeof������ 

����Ҫע����ǣ�memset�Ƕ��ֽڽ��в����������������������Ϊ

����int array[5] = {1,4,3,5,2};

����for(int i = 0; i < 5; i++)

����cout<<array<<" ";

����cout<<endl;

����memset(array,1,5*sizeof(int));// ע�� ����������ĳ���ͬ

����for(int k = 0; k < 5; k++) 

����cout<<array[k]<<" ";

����cout<<endl;

��������Ľ�����ǣ�1 4 3 5 2

����16843009 16843009 16843009 16843009 16843009

����Ϊʲô�أ�

������Ϊmemset�����ֽ�Ϊ��λ���Ƕ�arrayָ����ڴ��5���ֽڽ��и� ֵ��ÿ������ASCIIΪ1���ַ�ȥ��䣬תΪ�����ƺ�1����00000001,ռһ���ֽڡ�һ��INTԪ����4�ֽڣ���һ����� 1000000010000000100000001���͵���16843009��������˶�һ��INTԪ�صĸ�ֵ�ˡ�

����������memset�Է��ַ������鸳��ֵ�ǲ���ȡ�ģ�

����¥��˵�ĺܶԣ�ֻ�ǳ���ִ�н����0 0 0 0������ͬ�ĵط���������������£�

����int array[5] = {1,4,3,5,2};

����for(int i = 0; i < 5; i++)

����cout<<array<<" ";

����cout<<endl;

����memset(array,1,5*sizeof(int)); //������ǲ�ͬ�ĵط�

����for(int k = 0; k < 5; k++) //��ͬ�������k=1ֻ����ѭ����һ�ζ���

����cout<<array[k]<<" ";

����cout<<endl;

����������һ���ṹ��Some x�������������㣺

����memset( &x, 0, sizeof(Some) );

���������һ���ṹ�������Some x[10]������������

����menset( x, 0, sizeof(Some)*10 );


memset������ϸ˵��

����1��void *memset(void *s,int c,size_t n)

�����ܵ����ã����ѿ����ڴ�ռ� s ���� n ���ֽڵ�ֵ��Ϊֵ c��

����2������

����main(){

����char *s="Golden Global View";

����clrscr();

����memset(s,'G',6);//ò�������е�����//

����printf("%s",s);

����getchar();

����return 0;

����}��

��������������൱�󣬳�����������в���ȥ�ˣ��������S־�����һ��ֻ�����ڴ棬����memset����ͼ�޸�������������ʱҪ�����޸İ취char *s�޸�Ϊchar s[]��

����3��memset() �����������ڴ�ռ��ʼ�����磺

����char str[100];

����memset(str,0,100);

����4��memset()������ں���������һ���ڴ�ռ�ȫ������Ϊĳ���ַ���һ�����ڶԶ�����ַ������г�ʼ��Ϊ��memset(a, '\0', sizeof(a));

����memcpy�������ڴ濽������������������κ��������͵Ķ��󣬿���ָ�����������ݳ��ȣ�����char a[100],b[50]; memcpy(b, a, sizeof(b));ע������sizeof(a)�������b���ڴ��ַ�����

����strcpy��ֻ�ܿ����ַ����ˣ�������'\0'�ͽ�������������char a[100],b[50];strcpy(a,b);����strcpy(b,a)��Ҫע��a�е��ַ������ȣ���һ����\0��֮ǰ���Ƿ񳬹�50λ���糬����������b���ڴ��ַ�����

����5.���䣺ĳ�˵�һ���ĵ�

����memset���Է�������һ���ṹ���͵ı��������顣

�����磺

����struct sample_struct

����{

����char csName[16];

����int iSeq;

����int iType;

����};

�������ڱ���

����struct sample_strcut stTest;

����һ������£����stTest�ķ�����

����stTest.csName[0]='\0';

����stTest.iSeq=0;

����stTest.iType=0;

������memset�ͷǳ����㣺

����memset(&stTest,0,sizeof(struct sample_struct));

������������飺

����struct sample_struct TEST[10];

������

����memset(TEST,0,sizeof(struct sample_struct)*10);

����6��strcpy

����ԭ�ͣ�extern char *strcpy(char *dest,char *src);

�����÷�����i nclude

�������ܣ���src��ָ��NULL�������ַ������Ƶ�dest��ָ�������С�

����˵����src��dest��ָ�ڴ����򲻿����ص���dest�������㹻�Ŀռ�������src���ַ�����

��������ָ��dest��ָ�롣

����memcpy

����ԭ�ͣ�extern void *memcpy(void *dest, void *src, unsigned int count);

�����÷�����i nclude

�������ܣ���src��ָ�ڴ�������count���ֽڵ�dest��ָ�ڴ�����

����˵����src��dest��ָ�ڴ��������ص�����������ָ��dest��ָ�롣

����memset

����ԭ�ͣ�extern void *memset(void *buffer, int c, int count);

�����÷�����i nclude

�������ܣ���buffer��ָ�ڴ������ǰcount���ֽ����ó��ַ�c��

����˵��������ָ��buffer��ָ�롣



ԭ�����ӣ�http://baike.baidu.com/view/982208.htm
<====================================================================================================>

1��void *memset(void *s,int c,size_t n)
�ܵ����ã����ѿ����ڴ�ռ� s ���� n ���ֽڵ�ֵ��Ϊֵ c��

2������

main(){
char *s="Golden Global View";

clrscr();

memset(s,'G',6);//ò�������е�����//
printf("%s",s);

getchar();
return 0;
}��
3��memset() �����������ڴ�ռ��ʼ�����磺
char str[100];
memset(str,0,100);

4��memset()������ں���������һ���ڴ�ռ�ȫ������Ϊĳ���ַ���һ�����ڶԶ�����ַ������г�ʼ��Ϊ��memset(a, '\0', sizeof(a));

memcpy�������ڴ濽������������������κ��������͵Ķ��󣬿���ָ�����������ݳ��ȣ�����char a[100],b[50]; memcpy(b, a, sizeof(b));ע������sizeof(a)�������b���ڴ��ַ�����

strcpy��ֻ�ܿ����ַ����ˣ�������'\0'�ͽ�������������char a[100],b[50];strcpy(a,b);����strcpy(b,a)��Ҫע��a�е��ַ������ȣ���һ����\0��֮ǰ���Ƿ񳬹�50λ���糬����������b���ڴ��ַ�����

5.���䣺ĳ�˵�һ���ĵ�
memset���Է�������һ���ṹ���͵ı��������顣

�磺
struct sample_struct
{
char csName[16];
int iSeq;
int iType;
};

���ڱ���
struct sample_strcut stTest;

һ������£����stTest�ķ�����
stTest.csName[0]='\0';
stTest.iSeq=0;
stTest.iType=0;

��memset�ͷǳ����㣺
memset(&stTest,0,sizeof(struct sample_struct));

��������飺
struct sample_struct TEST[10];
��
memset(TEST,0,sizeof(struct sample_struct)*10);

6��strcpy
ԭ�ͣ�extern char *strcpy(char *dest,char *src);
�÷�����i nclude
���ܣ���src��ָ��NULL�������ַ������Ƶ�dest��ָ�������С�
˵����src��dest��ָ�ڴ����򲻿����ص���dest�������㹻�Ŀռ�������src���ַ�����
����ָ��dest��ָ�롣


memcpy
ԭ�ͣ�extern void *memcpy(void *dest, void *src, unsigned int count);
�÷�����i nclude
���ܣ���src��ָ�ڴ�������count���ֽڵ�dest��ָ�ڴ�����
˵����src��dest��ָ�ڴ��������ص�����������ָ��dest��ָ�롣



memset
ԭ�ͣ�extern void *memset(void *buffer, int c, int count);
�÷�����i nclude
���ܣ���buffer��ָ�ڴ������ǰcount���ֽ����ó��ַ�c��
˵��������ָ��buffer��ָ�롣

ԭ�����ӣ�http://www.azure.net.ru/read.php/137.htm 
