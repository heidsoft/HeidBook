一、null是代表不确定的对象
 
Java中，null是一个关键字，用来标识一个不确定的对象。因此可以将null赋给引用类型变量，但不可以将null赋给基本类型变量。
 
比如：int a = null;是错误的。Ojbect o = null是正确的。
 
Java中，变量的适用都遵循一个原则，先定义，并且初始化后，才可以使用。我们不能int a后，不给a指定值，就去打印a的值。这条对对于引用类型变量也是适用的。
 
有时候，我们定义一个引用类型变量，在刚开始的时候，无法给出一个确定的值，但是不指定值，程序可能会在try语句块中初始化值。这时候，我们下面使用变量的时候就会报错。这时候，可以先给变量指定一个null值，问题就解决了。例如：
 
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("url", "user", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        String catalog = conn.getCatalog();
 
如果刚开始的时候不指定conn = null，则最后一句就会报错。
 
二、null本身不是对象，也不是Objcet的实例
 
null本身虽然能代表一个不确定的对象，但就null本身来说，它不是对象，也不知道什么类型，也不是java.lang.Object的实例。
可以做一个简单的例子：
 
        //null是对象吗? 属于Object类型吗?
        if (null instanceof java.lang.Object) {
            System.out.println("null属于java.lang.Object类型");
        } else {
            System.out.println("null不属于java.lang.Object类型");
        }
 
结果会输出：null不属于java.lang.Object类型
 
三、Java默认给变量赋值
 
在定义变量的时候，如果定义后没有给变量赋值，则Java在运行时会自动给变量赋值。赋值原则是整数类型int、byte、short、long的自动赋值为0，带小数点的float、double自动赋值为0.0，boolean的自动赋值为false，其他各供引用类型变量自动赋值为null。
这个具体可以通过调试来看。
 
四、容器类型与null
 
List：允许重复元素，可以加入任意多个null。
Set：不允许重复元素，最多可以加入一个null。
Map：Map的key最多可以加入一个null，value字段没有限制。
数组：基本类型数组，定义后，如果不给定初始值，则java运行时会自动给定值。引用类型数组，不给定初始值，则所有的元素值为null。
 
五、null的其他作用
 
1、判断一个引用类型数据是否null。 用==来判断。
2、释放内存，让一个非null的引用类型变量指向null。这样这个对象就不再被任何对象应用了。等待JVM垃圾回收机制去回收。
