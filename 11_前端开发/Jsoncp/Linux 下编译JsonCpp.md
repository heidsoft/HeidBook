安装JsonCpp需要下载JsonCpp和Scon还需要机器上有python

wget http://sourceforge.net/projects/jsoncpp/files/latest/download?_test=goal          下载JsonCpp

wget http://sourceforge.net/projects/scons/files/scons/2.1.0/scons-2.1.0.tar.gz/download     下载scons-2.1.0

scons又是一个牛叉的工具，功能和GNU make一样，又比make简单多了。scons是python工具，需要先安装好python。

 

下载scons 在这里http://www.scons.org/
解压  tar -zxvf scons-2.0.1.tar.gz
设定环境变量 
# export MYSCONS=解压的路径

# export SCONS_LIB_DIR=$MYSCONS/engine

  

开始编译jsoncpp
# cd jsoncpp-src-0.5.0 
# python $MYSCONS/script/scons platform=linux-gcc

注释：网上有一些错误的 也可能是早期的版本   # python $MYSCONS/script/scons.py platform=linux-gcc
经过测试 发现报错 查看路径下 没有scons.py文件 故改为scons

之后编译

生成静态和动态库文件

在jsoncpp-src-0.5.0/libs/linux-gcc-4.1.2目录下

libjson_linux-gcc-4.4.4_libmt.a
libjson_linux-gcc-4.4.4_libmt.so
使用时 需要把头文件 即 include下的文件复制到工程下

-------------------------------------------------

使用示例

#include "json/json.h"
#include <string>
#include <iostream>
using namespace std;
int main()
{
 string test ="{\"id\":1,\"name\":\"kurama\"}";
 Json::Reader reader;
 Json::Value value;
 if(reader.parse(test,value))
 {
  if(!value["id"].isNull())
  {
   cout<<value["id"].asInt()<<endl;
   cout<<value["name"].asString()<<endl;
  }
 }
 return 0;
}

编译 为了方便编译 我将静态库文件命名为libjson-0.5.0.a

建立一个新的文件夹json-test  把libjson-0.5.0.a 复制过去

mv  /jsoncpp-src-0.5.0/include/json/    json-test/


g++ -o main main.cpp -L. -ljson-0.5.0 

就可以了~~

-------------------------------------------------------------------------------

示例demo：

Json::Value 表示一个json值对象，后面会频繁用到

Json::Reader read对象，用来解析josn字符串，有reader就有writer --Json::Writer

假设有这么个json字符串，这里主要讲一下带数组这种的串，象最简单的{"key":"value"}就不讲了 - -

string strJson ="{\"key1\":\"value1\",\"array\":[{\"key2\":\"value2\",\"key3\":\"aa\"},{\"key2\":\"value3\",\"key3\":\"bb\"},{\"key2\":\"value4\",\"key3\":\"cc\"}]}";

一种方法:

Json::Reader reader;

Json::Value val;

if(!reader.parse(strJson,val))

return -1;

std::string str = val["key1"].asString();
Json::Value obj_array = val["array"];

for (int i = 0; i< obj_array.size();i++)
{
  str =obj_array[i]["key2"].asString();
  str =obj_array[i]["key3"].asString();
}

一次for循环就全部解析出来了

另一种，用他内建的迭代器，其实也就是他自己的一个vector<string>成员，可以自己去看json:value的定义

Json::Value::Membersmember;//Members  这玩意就是vector<string>，typedef了而已
 for (Json::Value::iterator itr =obj_array.begin(); itr != obj_array.end(); itr++)
 {
  member =(*itr).getMemberNames();
  for(Json::Value::Members::iterator iter = member.begin(); iter !=member.end(); iter++)
  {
   stringstr_temp = (*itr)[(*iter)].asString();
  }
 }

-------------------------------------------------------------

示例demo：

JSONCPP的应用例子。

#include "json.h"
#include <string>
using namespace std;

int Parse()
{
 std::string strValue = "{\"key1\":\"value1\",\"array\":[{\"key2\":\"value2\"},{\"key2\":\"value3\"},{\"key2\":\"value4\"}]}";
 Json::Reader reader;
 Json::Value value;
 if (reader.parse(strValue, value))
 {
  std::string out = value["key1"].asString();
  std::cout << out << std::endl;
  const Json::Value arrayObj = value["array"];
  for (int i=0; i<arrayObj.size(); i++)
  {
   out = arrayObj[i]["key2"].asString();
   std::cout << out;
   if (i != arrayObj.size() - 1 )
   std::cout << std::endl;
  }
 }
 std::cout << std::endl << std::endl << std::endl;
 return 0;
}

int Build()
{
 Json::Value root;
 root["key1"] = "value1";
 root["key2"] = "value2";

 Json::Value arrayObj;
 Json::Value item;
 for (int i=0; i<10; i++)
 {
  item["key"] = i;
  arrayObj.append(item);
 }
 root["array"] = arrayObj;
 root.toStyledString();
 std::string out = root.toStyledString();
 std::cout << out << std::endl;
 return 0;
}


void main()
{
 Parse();
 Build();
 system("pause");
}

 

 

 

 

 

引用代码里面的“json.h”


(1)解析json的方法


Json::Value json;     // 表示一个json格式的对象
Json::Reader reader;     //json解析


reader.parse(json_buf/*json格式的字符串*/,json,false);     //解析出json放到json中




(2) 数组访问
Json::Value input 是类似这种格式
[["key1":value1],["key2":value2] ]


Json::Value::const_iterator iter;          //迭代器


for(iter = input.begin();iter != input.end();iter++ )
      Json::Value::Members member=(*iter).getMemberNames();
      *(member.begin());          // 输出 key1,key2
     (*iter)[*(member.begin())];     //输出 value1,value2


(3) 对象访问


直接用 value["key"]即可
(4) 输出json格式串
调用 Json::FastWriter 的writer
不支持utf-8格式的输出，需要自己调用writer之后，用iconv转化成utf-8字符串


