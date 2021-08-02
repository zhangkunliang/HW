package com.kkb;

import com.kkb.util.Application;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(value={"/*"})
public class StartFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        if((request.getRequestURI().endsWith("/")||request.getRequestURI().endsWith("index.html"))&&Application.get("user") == null){
                //未启动任务
                HttpServletResponse response = (HttpServletResponse) resp;
                response.sendRedirect("start.html");

        }else{
            chain.doFilter(req, resp);
        }






    }

    public void init(FilterConfig config) throws ServletException {

    }

}
