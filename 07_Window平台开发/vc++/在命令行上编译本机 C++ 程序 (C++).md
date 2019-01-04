在命令行上编译本机 C++ 程序 (C++)

1.打开“Visual Studio 2010 命令提示”窗口，方法是单击“开始”，指向“所有程序”、“Microsoft Visual Studio 2010”、“Visual Studio 工具”，然后单击“Visual Studio 2010 命令提示”。

可能需要管理员凭据才能成功编译此演练中的代码，具体情况视计算机的操作系统和配置而定。 若要以管理员身份运行“Visual Studio 2010 命令提示”窗口，请右击“Visual Studio 2010 命令提示”，然后单击“以管理员身份运行”。 

2.在命令提示符下，键入 notepad basic.cpp，并按 Enter。

在系统提示是否创建文件时，单击“是”。

3.在记事本中，键入下列各行。

复制代码 
#include <iostream>

int main()
{
    std::cout << "This is a native C++ program." << std::endl;
    return 0;
}
4.在“文件”菜单上，单击“保存”。

这样就创建了一个 Visual C++ 源文件。

5.关闭记事本。

6.在命令提示符下，键入 cl /EHsc basic.cpp，并按 Enter。 /EHsc 命令行选项指示编译器启用 C++ 异常处理。 有关更多信息，请参见 /EH（异常处理模型）。 

cl.exe 编译器将生成一个名为 basic.exe 的可执行程序。

您可以在编译器显示的多行输出信息中看到可执行程序的名称。

7.若要查看目录中具有名称 basic 以及任何文件扩展名的文件的列表，请键入 dir basic.* 并按 Enter。

.obj 文件是一个中间格式文件，可以安全地忽略它。

8.若要运行 basic.exe 程序，请键入 basic 并按 Enter。

该程序显示以下文本并退出：

This is a native C++ program.

9.若要关闭“Visual Studio 2010 命令提示”窗口，请键入 exit 并按 Enter。

