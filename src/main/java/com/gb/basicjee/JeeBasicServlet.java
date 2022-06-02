package com.gb.basicjee;

import com.gb.basicjee.entity.Product;
import com.gb.basicjee.service.ProductProducer;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name="jeebasic", urlPatterns = "/jeeservlet")
public class JeeBasicServlet implements Servlet {

    ProductProducer pp = new ProductProducer();
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init proc");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ArrayList<String> response= new ArrayList<>();
        for(int i=0; i<10; i++){
           response.add(pp.createProduct(i,"Product"+i , 0.1+i).toString());
        }
       servletResponse.getWriter().println(response.toString());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroying");
    }
}
