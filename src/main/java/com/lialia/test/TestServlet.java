package com.lialia.test;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by yangz on 2017/8/10.
 */
public class TestServlet implements Servlet{
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write("welcome to my lia lia");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
