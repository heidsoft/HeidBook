һ��page ����
    page�������JSP������׼ȷ��˵������JSP��ת����Servlet�������Ե���Servlet��������ķ�����
        
    ����config ����
    config ����������һЩServlet ��ʼ�����ݽṹ��
    config ����ʵ����javax.servlet.ServletConfig �ӿڣ��������������ַ�����
        public String getInitParameter(name)
        public java.util.Enumeration getInitParameterNames( )
        public ServletContext getServletContext( )
        public Sring getServletName( ) 

    ����request ����
    request ������������������Ϣ���磺�������Դ����ͷ��cookies��������صĲ���ֵ�ȵȡ�
    request ����ʵ��javax.servlet.http.HttpServletRequest�ӿڵģ����ṩ�ķ������Խ�����Ϊ�Ĵ��ࣺ
    1.�����ȡ�����Է�����
        void setAttribute(String name, Object value)    �趨name���Ե�ֵΪvalue
        Enumeration getAttributeNamesInScope(int scope)    ȡ������scope ��Χ������
        Object getAttribute(String name)                ȡ��name ���Ե�ֵ
        void removeAttribute(String name)                �Ƴ�name ���Ե�ֵ
    2.ȡ����������ķ���
        String getParameter(String name)                ȡ��name �Ĳ���ֵ
        Enumeration getParameterNames( )                ȡ�����еĲ�������
        String [] getParameterValues(String name)         ȡ������name �Ĳ���ֵ
        Map getParameterMap( )                             ȡ��һ��Ҫ�������Map
    3.�ܹ�ȡ������HTTP ��ͷ�ķ���
        String getHeader(String name)                     ȡ��name �ı�ͷ
        Enumeration getHeaderNames()                     ȡ�����еı�ͷ����
        Enumeration getHeaders(String name)             ȡ������name �ı�ͷ
        int getIntHeader(String name)                     ȡ����������name �ı�ͷ
        long getDateHeader(String name)                 ȡ����������name �ı�ͷ
        Cookie [] getCookies( )                         ȡ���������йص�cookies
    4.�����ķ���
        String getContextPath( )                         ȡ��Context ·��(��վ̨����)
        String getMethod( )                             ȡ��HTTP �ķ���(GET��POST)
        String getProtocol( )                             ȡ��ʹ�õ�Э�� (HTTP/1.1��HTTP/1.0 )
        String getQueryString( )                        ȡ������Ĳ����ַ�����������HTTP�ķ�������ΪGET
        String getRequestedSessionId( )                 ȡ���û��˵�Session ID
        String getRequestURI( )                            ȡ�������URL�����ǲ���������Ĳ����ַ���
        String getRemoteAddr( )                            ȡ���û���IP ��ַ
        String getRemoteHost( )                            ȡ���û�����������
        int getRemotePort( )                            ȡ���û��������˿�
        String getRemoteUser( )                         ȡ���û�������
        void etCharacterEncoding(String    encoding)        �趨�����ʽ������������崫�����ĵ�����

    �ġ�response ����
    response ������Ҫ��JSP �������ݺ�Ľ�����ص��ͻ��ˡ�
    response ������ʵ��javax.servlet.http.HttpServletResponse �ӿڡ�response�������ṩ�ķ�����
    1.�趨��ͷ�ķ���
        void addCookie(Cookie cookie)                     ����cookie
        void addDateHeader(String name, long date)        ����long���͵�ֵ��name��ͷ
        void addHeader(String name, String value)        ����String���͵�ֵ��name��ͷ
        void addIntHeader(String name, int value)         ����int���͵�ֵ��name��ͷ
        void setDateHeader(String name, long date)        ָ��long���͵�ֵ��name��ͷ
        void setHeader(String name, String value)        ָ��String���͵�ֵ��name��ͷ
        void setIntHeader(String name, int value)         ָ��int���͵�ֵ��name��ͷ
    2.�趨��Ӧ״̬��ķ���
        void sendError(int sc)                             ����״̬��(status code)
        void sendError(int sc, String msg)                ����״̬��ʹ�����Ϣ
        void setStatus(int sc)                             �趨״̬��
    3.����URL ��д(rewriting)�ķ���    
        String encodeRedirectURL(String    url)            ��ʹ��sendRedirect( )������URL���Ա���

    �塢out ����
    out �����ܰѽ���������ҳ�ϡ�
    out��Ҫ���������ƹ�������Ļ�����(buffer)�������(output stream)��
        void clear( )                                     ������������������
        void clearBuffer( )                             ������������������
        void close( )                                     �ر��������������е�����
        int getBufferSize( )                             ȡ��Ŀǰ�������Ĵ�С(KB)
        int getRemaining( )                             ȡ��Ŀǰʹ�ú�ʣ�µĻ�������С(KB)
        boolean isAutoFlush( )                            �ش�true��ʾ��������ʱ���Զ������false��ʾ�����Զ�������Ҳ����쳣����
        
    ����session ����
    session�����ʾĿǰ�����û��ĻỰ(session)״����
    session����ʵ��javax.servlet.http.HttpSession�ӿڣ�HttpSession�ӿ����ṩ�ķ���
        long getCreationTime()                            ȡ��session������ʱ�䣬��λ�Ǻ���
        String getId()                                     ȡ��session ��ID
        long getLastAccessedTime()                        ȡ���û����ͨ�����session�ͳ������ʱ��
        long getMaxInactiveInterval()                    ȡ�����session�����ʱ�䣬��������ʱ�䣬session ����ʧЧ
        void invalidate()                                ȡ��session ���󣬲��������ŵ�������ȫ����
        boolean isNew()                                    �ж�session �Ƿ�Ϊ"��"��
        void setMaxInactiveInterval(int    interval)        �趨���session�����ʱ�䣬��������ʱ�䣬session ����ʧЧ

    �ߡ�application����
    application�������ʹ���ڴ�ȡ��������Ϣ��
    ��Ϊ��������Ϣͨ����������ServletContext�У����Գ�����application��������ȡServletContext�е���Ϣ��
    application ����ʵ��javax.servlet.ServletContext �ӿڣ�ServletContext�ӿ��������ṩ�ķ���
        int getMajorVersion( )                             ȡ��Container��Ҫ��Servlet API�汾
        int getMinorVersion( )                             ȡ��Container��Ҫ��Servlet API �汾
        String getServerInfo( )                         ȡ��Container�����ƺͰ汾
        String getMimeType(String file)                 ȡ��ָ���ļ���MIME ����
        ServletContext getContext(String uripath)        ȡ��ָ��Local URL��Application context
        String getRealPath(String path)                 ȡ�ñ��ض�path�ľ���·��
        void log(String message)                         ����Ϣд��log�ļ���
        void log(String message, Throwable throwable)    ��stack trace ���������쳣��Ϣд��log�ļ���

    �ˡ�pageContext����
    pageContext�����ܹ���ȡ������������
    1.pageContext�����ȡ���������������Եķ�������ʱ��Ҫָ����Χ�Ĳ�����
        Object getAttribute(String name, int scope)
        Enumeration getAttributeNamesInScope(int scope)
        void removeAttribute(String name, int scope)
        void setAttribute(String name, Object value, int scope)
    ��Χ�������ĸ����ֱ�������ַ�Χ��PAGE_SCOPE��REQUEST_SCOPE��SESSION_SCOPE��APPLICATION_SCOPE
    2.PageContext����ȡ��������������ķ���
        Exception getException( )                        �ش�Ŀǰ��ҳ���쳣����������ҳҪΪerror page��
        JspWriter getOut( )                             �ش�Ŀǰ��ҳ������������磺out 
        Object getPage( )                                �ش�Ŀǰ��ҳ��Servlet ʵ��(instance)�����磺page
        ServletRequest getRequest( )                    �ش�Ŀǰ��ҳ���������磺request
        ServletResponse getResponse( )                    �ش�Ŀǰ��ҳ����Ӧ�����磺response
        ServletConfig getServletConfig( )                �ش�Ŀǰ����ҳ��ServletConfig �������磺config
        ServletContext getServletContext( )                �ش�Ŀǰ����ҳ��ִ�л���(context)�����磺application
        HttpSession getSession( )                        �ش���Ŀǰ��ҳ����ϵ�ĻỰ(session)�����磺session
    3.PageContext�����ṩȡ�����Եķ���
        Object getAttribute(String name, int scope)        �ش�name ���ԣ���ΧΪscope�����Զ��󣬻ش�����ΪObject
        Enumeration getAttributeNamesInScope(int scope)    �ش��������Է�ΧΪscope ���������ƣ��ش�����ΪEnumeration
        int getAttributesScope(String name)             �ش���������Ϊname �����Է�Χ
        void removeAttribute(String name)                 �Ƴ���������Ϊname �����Զ���
        void removeAttribute(String name, int scope)    �Ƴ���������Ϊname����ΧΪscope �����Զ���
        void setAttribute(String name, Object value, int scope)        ָ�����Զ��������Ϊname��ֵΪvalue����ΧΪscope
        Object findAttribute(String name)                Ѱ�������з�Χ����������Ϊname �����Զ���

    �š�exception����
    ��Ҫʹ��exception ����ʱ��������page ָ�����趨��<%@ page isErrorPage="true" %>����ʹ�á�
    exception�ṩ������������
        getMessage( )
        getLocalizedMessage( )��
        printStackTrace(new java.io.PrintWriter(out))

 

 

EL���ʽ�е�11����������

pageContext, pageScope, requestScope, sessionScope, applicationScope, param, paramValues, header, headerValues, cookies, initParam

��������ݶ�����map��ʽ��ŵģ���ȡ�����磺param.name, header.User_Agent, cookie.userinfo�õ���Ӧ�����ݡ�

${requestScope.origin_uri} ��ȡ��ǰURI

 

 JSP��6������������

jsp:include         ��ҳ�汻�����ʱ������һ���ļ�

jsp:forward        ������ת��һ���µ�ҳ��

jsp:plugin          �������������Ϊjava�������object��embed���

jsp:useBean     Ѱ�һ�ʵ����һ��JavaBean

jsp:getProperty    ���JavaBean��ĳ������

jsp:setProperty     ����JavaBean��ĳ������
