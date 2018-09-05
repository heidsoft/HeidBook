�������� Win32 ��Ӧ�ó��� (C++)

1.�ڡ��ļ����˵��ϣ��������½�����Ȼ�󵥻�����Ŀ����

2.�ڡ��½���Ŀ���Ի������ര���У��������Ѱ�װ��ģ�塱��������Visual C++����Ȼ��ѡ��Win32���� ���м䴰���У�ѡ��Win32 ��Ŀ���� 

�ڡ����ơ����У�������Ŀ���ƣ����� win32app�� ������ȷ������ 

3.�ڡ�Win32 Ӧ�ó����򵼡��ġ���ӭ��ҳ�ϣ���������һ������

4.�ڡ�Ӧ�ó������á�ҳ�ϵ��ڡ�Ӧ�ó������͡��£�ѡ��Windows Ӧ�ó��򡱡� �ڡ�����ѡ��£�ѡ�񡰿���Ŀ���� ��������ɡ�������Ŀ�� 

5.�ڡ����������Դ���������У��һ� Win32app ��Ŀ����������ӡ���Ȼ�󵥻����½���� �ڡ��������Ի�����ѡ��C++ �ļ�(.cpp)���� �ڡ����ơ����У������ļ����ƣ����� GT_HelloWorldWin32.cpp�� ��������ӡ��� 

�������� Win32 ��Ӧ�ó���
1.����ÿ�� C Ӧ�ó���� C++ Ӧ�ó����� main ������Ϊ���������ÿ������ Win32 ��Ӧ�ó���ͬ������Ҫ�� WinMain ������ WinMain ���������﷨�� 

���ƴ��� int WINAPI WinMain(HINSTANCE hInstance,
                   HINSTANCE hPrevInstance,
                   LPSTR lpCmdLine,
                   int nCmdShow);�йش˺����Ĳ����ͷ���ֵ����Ϣ����μ� WinMain ������

2.����Ӧ�ó���������ʹ�����ж��壬���Ӧ�� include �����ӵ��ļ��С�

���ƴ��� #include <windows.h>
#include <stdlib.h>
#include <string.h>
#include <tchar.h>3.�� WinMain �����⣬ÿ������ Win32 ��Ӧ�ó��򻹱������һ�����ڹ��̺����� �˺���ͨ����Ϊ WndProc�� WndProc ���������﷨�� 

���ƴ��� LRESULT CALLBACK WndProc(HWND, UINT, WPARAM, LPARAM);�˺�������Ӧ�ó���Ӳ���ϵͳ���յ������Ϣ�� ���磬�ھ��жԻ��򣨸öԻ�������һ����ȷ������ť����Ӧ�ó����У�����û������ð�ť������ϵͳ�ͻ����Ӧ�ó�����һ����Ϣ����֪�ѵ����ð�ť�� WndProc ������Ӧ���¼��� �ڴ�ʾ���У���Ӧ����Ӧ�����ǹرոöԻ��� 

�йظ�����Ϣ����μ����ڹ��̡�

�� WinMain ������ӹ���
1.�� WinMain �����У����� WNDCLASSEX ���͵Ĵ�����ṹ�� �˽ṹ�����йظô��ڵ���Ϣ�����磬Ӧ�ó���ͼ�ꡢ���ڵı���ɫ��Ҫ�ڱ���������ʾ�����ơ����ڹ��̺��������Ƶȵȡ� �����ʾ����ʾһ������ WNDCLASSEX �ṹ�� 

���ƴ���     WNDCLASSEX wcex;

    wcex.cbSize = sizeof(WNDCLASSEX);
    wcex.style          = CS_HREDRAW | CS_VREDRAW;
    wcex.lpfnWndProc    = WndProc;
    wcex.cbClsExtra     = 0;
    wcex.cbWndExtra     = 0;
    wcex.hInstance      = hInstance;
    wcex.hIcon          = LoadIcon(hInstance, MAKEINTRESOURCE(IDI_APPLICATION));
    wcex.hCursor        = LoadCursor(NULL, IDC_ARROW);
    wcex.hbrBackground  = (HBRUSH)(COLOR_WINDOW+1);
    wcex.lpszMenuName   = NULL;
    wcex.lpszClassName  = szWindowClass;
    wcex.hIconSm        = LoadIcon(wcex.hInstance, MAKEINTRESOURCE(IDI_APPLICATION));�йش˽ṹ�ĸ��ֶε���Ϣ����μ� WNDCLASSEX��

2.�������Ѿ�����һ�������࣬���������뽫��ע�ᡣ ʹ�� RegisterClassEx ����������������ṹ��Ϊ�������д��ݡ� 

���ƴ���     if (!RegisterClassEx(&wcex))
    {
        MessageBox(NULL,
            _T("Call to RegisterClassEx failed!"),
            _T("Win32 Guided Tour"),
            NULL);

        return 1;
    }3.���ڿ��Դ���һ�����ڡ� ʹ�� CreateWindow ������ 

���ƴ��� static TCHAR szWindowClass[] = _T("win32app");
static TCHAR szTitle[] = _T("Win32 Guided Tour Application");

// The parameters to CreateWindow explained:
// szWindowClass: the name of the application
// szTitle: the text that appears in the title bar
// WS_OVERLAPPEDWINDOW: the type of window to create
// CW_USEDEFAULT, CW_USEDEFAULT: initial position (x, y)
// 500, 100: initial size (width, length)
// NULL: the parent of this window
// NULL: this application does not have a menu bar
// hInstance: the first parameter from WinMain
// NULL: not used in this application
HWND hWnd = CreateWindow(
    szWindowClass,
    szTitle,
    WS_OVERLAPPEDWINDOW,
    CW_USEDEFAULT, CW_USEDEFAULT,
    500, 100,
    NULL,
    NULL,
    hInstance,
    NULL
);
if (!hWnd)
{
    MessageBox(NULL,
        _T("Call to CreateWindow failed!"),
        _T("Win32 Guided Tour"),
        NULL);

    return 1;
}�˺������� HWND������ĳ�����ڵľ���� �йظ�����Ϣ����μ� Windows �������͡� 

4.���ڣ�ʹ�����д�������ʾ���ڡ�

���ƴ��� // The parameters to ShowWindow explained:
// hWnd: the value returned from CreateWindow
// nCmdShow: the fourth parameter from WinMain
ShowWindow(hWnd,
    nCmdShow);
UpdateWindow(hWnd);��ʱ������ʾ�Ĵ��ڲ�����̫�����ݣ���Ϊ����δʵ�� WndProc ������

5.�������һ����Ϣѭ������������ϵͳ���͵���Ϣ�� ���Ӧ�ó����յ�һ����Ϣ�����ѭ���Ὣ����Ϣ������ WndProc �����Խ��ܴ��� ��Ϣѭ�����������д��롣 

���ƴ���     MSG msg;
    while (GetMessage(&msg, NULL, 0, 0))
    {
        TranslateMessage(&msg);
        DispatchMessage(&msg);
    }

    return (int) msg.wParam;�й���Ϣѭ���и��ṹ�ͺ����ĸ�����Ϣ����μ� MSG��GetMessage��TranslateMessage �� DispatchMessage��

��ʱ��WinMain ����Ӧ�����д������ơ�

���ƴ��� int WINAPI WinMain(HINSTANCE hInstance,
                   HINSTANCE hPrevInstance,
                   LPSTR lpCmdLine,
                   int nCmdShow)
{
    WNDCLASSEX wcex;

    wcex.cbSize = sizeof(WNDCLASSEX);
    wcex.style          = CS_HREDRAW | CS_VREDRAW;
    wcex.lpfnWndProc    = WndProc;
    wcex.cbClsExtra     = 0;
    wcex.cbWndExtra     = 0;
    wcex.hInstance      = hInstance;
    wcex.hIcon          = LoadIcon(hInstance, MAKEINTRESOURCE(IDI_APPLICATION));
    wcex.hCursor        = LoadCursor(NULL, IDC_ARROW);
    wcex.hbrBackground  = (HBRUSH)(COLOR_WINDOW+1);
    wcex.lpszMenuName   = NULL;
    wcex.lpszClassName  = szWindowClass;
    wcex.hIconSm        = LoadIcon(wcex.hInstance, MAKEINTRESOURCE(IDI_APPLICATION));

    if (!RegisterClassEx(&wcex))
    {
        MessageBox(NULL,
            _T("Call to RegisterClassEx failed!"),
            _T("Win32 Guided Tour"),
            NULL);

        return 1;
    }

    hInst = hInstance; // Store instance handle in our global variable

    // The parameters to CreateWindow explained:
    // szWindowClass: the name of the application
    // szTitle: the text that appears in the title bar
    // WS_OVERLAPPEDWINDOW: the type of window to create
    // CW_USEDEFAULT, CW_USEDEFAULT: initial position (x, y)
    // 500, 100: initial size (width, length)
    // NULL: the parent of this window
    // NULL: this application dows not have a menu bar
    // hInstance: the first parameter from WinMain
    // NULL: not used in this application
    HWND hWnd = CreateWindow(
        szWindowClass,
        szTitle,
        WS_OVERLAPPEDWINDOW,
        CW_USEDEFAULT, CW_USEDEFAULT,
        500, 100,
        NULL,
        NULL,
        hInstance,
        NULL
    );

    if (!hWnd)
    {
        MessageBox(NULL,
            _T("Call to CreateWindow failed!"),
            _T("Win32 Guided Tour"),
            NULL);

        return 1;
    }

    // The parameters to ShowWindow explained:
    // hWnd: the value returned from CreateWindow
    // nCmdShow: the fourth parameter from WinMain
    ShowWindow(hWnd,
        nCmdShow);
    UpdateWindow(hWnd);

    // Main message loop:
    MSG msg;
    while (GetMessage(&msg, NULL, 0, 0))
    {
        TranslateMessage(&msg);
        DispatchMessage(&msg);
    }

    return (int) msg.wParam;
}�� WndProc ������ӹ���
1.��Ҫ���� WndProc ����������Ӧ�ó������յ�����Ϣ����ʵ�� switch ��䡣

Ҫ����ĵ�һ����Ϣ�� WM_PAINT ��Ϣ�� ��������������ʾ��Ӧ�ó��򴰿ڵ�һ���֣���Ӧ�ó���ͻ��յ�����Ϣ�� ���״���ʾ�ô���ʱ�����뽫��ȫ�����¡��� 

��Ҫ���� WM_PAINT ��Ϣ�������ȵ��� BeginPaint��Ȼ�������ڲ��ָô����е��ı�����ť�������ؼ��������߼����ٵ��� EndPaint�� ���ڴ�Ӧ�ó��򣬿�ʼ���úͽ�������֮����߼����ڴ�������ʾ�ַ�����Hello, World!���� �����д����У���ע�� TextOut ����������ʾ���ַ����� 

���ƴ��� PAINTSTRUCT ps;
HDC hdc;
TCHAR greeting[] = _T("Hello, World!");

switch (message)
{
case WM_PAINT:
    hdc = BeginPaint(hWnd, &ps);

    // Here your application is laid out.
    // For this introduction, we just print out "Hello, World!"
    // in the top left corner.
    TextOut(hdc,
        5, 5,
        greeting, _tcslen(greeting));
    // End application-specific layout section.

    EndPaint(hWnd, &ps);
    break;
}2.Ӧ�ó���ͨ���ᴦ�����������Ϣ������ WM_CREATE �� WM_DESTROY�� ���д���չʾ��һ�������������� WndProc ������ 

���ƴ��� LRESULT CALLBACK WndProc(HWND hWnd, UINT message, WPARAM wParam, LPARAM lParam)
{
    PAINTSTRUCT ps;
    HDC hdc;
    TCHAR greeting[] = _T("Hello, World!");

    switch (message)
    {
    case WM_PAINT:
        hdc = BeginPaint(hWnd, &ps);

        // Here your application is laid out.
        // For this introduction, we just print out "Hello, World!"
        // in the top left corner.
        TextOut(hdc,
            5, 5,
            greeting, _tcslen(greeting));
        // End application specific layout section.

        EndPaint(hWnd, &ps);
        break;
    case WM_DESTROY:
        PostQuitMessage(0);
        break;
    default:
        return DefWindowProc(hWnd, message, wParam, lParam);
        break;
    }

    return 0;
}  ʾ�� 
���ɴ�ʾ��
1.������������֮ǰ���������� Win32 ����Ŀ���еĻ��� Win32 ����Ŀ��

2.������Щ����֮��Ĵ��룬Ȼ����ճ���� GT_HelloWorldWin32.cpp Դ�ļ��С�

3.�ڡ����ɡ��˵��ϣ����������ɽ����������

4.��Ҫ���и�Ӧ�ó����밴 F5�� ����ʾ�������Ͻ�Ӧ����һ�����ڣ������к����ı���Hello World!���� 

����
���ƴ��� // GT_HelloWorldWin32.cpp
// compile with: /D_UNICODE /DUNICODE /DWIN32 /D_WINDOWS /c

#include <windows.h>
#include <stdlib.h>
#include <string.h>
#include <tchar.h>

// Global variables

// The main window class name.
static TCHAR szWindowClass[] = _T("win32app");

// The string that appears in the application's title bar.
static TCHAR szTitle[] = _T("Win32 Guided Tour Application");

HINSTANCE hInst;

// Forward declarations of functions included in this code module:
LRESULT CALLBACK WndProc(HWND, UINT, WPARAM, LPARAM);

int WINAPI WinMain(HINSTANCE hInstance,
                   HINSTANCE hPrevInstance,
                   LPSTR lpCmdLine,
                   int nCmdShow)
{
    WNDCLASSEX wcex;

    wcex.cbSize = sizeof(WNDCLASSEX);
    wcex.style          = CS_HREDRAW | CS_VREDRAW;
    wcex.lpfnWndProc    = WndProc;
    wcex.cbClsExtra     = 0;
    wcex.cbWndExtra     = 0;
    wcex.hInstance      = hInstance;
    wcex.hIcon          = LoadIcon(hInstance, MAKEINTRESOURCE(IDI_APPLICATION));
    wcex.hCursor        = LoadCursor(NULL, IDC_ARROW);
    wcex.hbrBackground  = (HBRUSH)(COLOR_WINDOW+1);
    wcex.lpszMenuName   = NULL;
    wcex.lpszClassName  = szWindowClass;
    wcex.hIconSm        = LoadIcon(wcex.hInstance, MAKEINTRESOURCE(IDI_APPLICATION));

    if (!RegisterClassEx(&wcex))
    {
        MessageBox(NULL,
            _T("Call to RegisterClassEx failed!"),
            _T("Win32 Guided Tour"),
            NULL);

        return 1;
    }

    hInst = hInstance; // Store instance handle in our global variable

    // The parameters to CreateWindow explained:
    // szWindowClass: the name of the application
    // szTitle: the text that appears in the title bar
    // WS_OVERLAPPEDWINDOW: the type of window to create
    // CW_USEDEFAULT, CW_USEDEFAULT: initial position (x, y)
    // 500, 100: initial size (width, length)
    // NULL: the parent of this window
    // NULL: this application does not have a menu bar
    // hInstance: the first parameter from WinMain
    // NULL: not used in this application
    HWND hWnd = CreateWindow(
        szWindowClass,
        szTitle,
        WS_OVERLAPPEDWINDOW,
        CW_USEDEFAULT, CW_USEDEFAULT,
        500, 100,
        NULL,
        NULL,
        hInstance,
        NULL
    );

    if (!hWnd)
    {
        MessageBox(NULL,
            _T("Call to CreateWindow failed!"),
            _T("Win32 Guided Tour"),
            NULL);

        return 1;
    }

    // The parameters to ShowWindow explained:
    // hWnd: the value returned from CreateWindow
    // nCmdShow: the fourth parameter from WinMain
    ShowWindow(hWnd,
        nCmdShow);
    UpdateWindow(hWnd);

    // Main message loop:
    MSG msg;
    while (GetMessage(&msg, NULL, 0, 0))
    {
        TranslateMessage(&msg);
        DispatchMessage(&msg);
    }

    return (int) msg.wParam;
}

//
//  FUNCTION: WndProc(HWND, UINT, WPARAM, LPARAM)
//
//  PURPOSE:  Processes messages for the main window.
//
//  WM_PAINT    - Paint the main window
//  WM_DESTROY  - post a quit message and return
//
//
LRESULT CALLBACK WndProc(HWND hWnd, UINT message, WPARAM wParam, LPARAM lParam)
{
    PAINTSTRUCT ps;
    HDC hdc;
    TCHAR greeting[] = _T("Hello, World!");

    switch (message)
    {
    case WM_PAINT:
        hdc = BeginPaint(hWnd, &ps);

        // Here your application is laid out.
        // For this introduction, we just print out "Hello, World!"
        // in the top left corner.
        TextOut(hdc,
            5, 5,
            greeting, _tcslen(greeting));
        // End application-specific layout section.

        EndPaint(hWnd, &ps);
        break;
    case WM_DESTROY:
        PostQuitMessage(0);
        break;
    default:
        return DefWindowProc(hWnd, message, wParam, lParam);
        break;
    }

    return 0;
}