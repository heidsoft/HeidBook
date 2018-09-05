MFC设备描述表（MFC Device Context）

Windows编程中获取设备描述表的两种方法：

（1）用CWnd::GetDC和CWnd::ReleaseDC
    CDC *pDC = GetDC(); // Get DC
    // do some drawing
    ReleaseDC(pDC); // Release DC, needed

（2）CWnd::BeginPaint 和 CWnd::EndPaint
    PAINTSTRUCT ps;
    CDC *pDC = BeginPaint(&ps);  // Get DC
    // do some drawing
    EndPaint(&ps);  // Release DC

Special-Purpose Device Context Classes

Class Name Description
CPaintDC 	For drawing in a window's client area (OnPaint handlers only)
CClientDC 	For drawing in a window's client area (anywhere but OnPaint)
CWindowDC 	For drawing anywhere in a window, including the nonclient area
CMetaFileDC 	For drawing to a GDI metafile


具有特殊用途的MFC设备描述表类

类名 描述
CPaintDC 	用于在窗口客户区绘图（仅限于OnPaint处理程序）
CClientDC 	用于在窗口客户区绘图（除OnPaint外的任何处理程序）
CWindowDC 	用于在窗口内任意地方绘图，包括非客户区
CMetaFileDC 	用于向GDI元文件绘图