/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.filters;

import java.io.IOException;
import javax.servlet.*;


/**
 *
 * @author Reginaldo
 */
public class LoginFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String userName = SecurityManager.class.getName();
        
        System.out.println("Yeeey! Get me here and find me in the database:" + userName);
        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
       
    }
    
}
