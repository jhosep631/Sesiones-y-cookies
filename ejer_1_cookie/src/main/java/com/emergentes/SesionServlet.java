/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP-J
 */
@WebServlet(name = "SesionServlet", urlPatterns = {"/SesionServlet"})
public class SesionServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        response.setContentType("text/html");
    
        Cookie cokis = new Cookie("color", "123");
        cokis.setComment("prueba");
        cokis.setMaxAge(60*60*24);
        response.addCookie(cokis);
        
        PrintWriter out = response.getWriter();
        out.print("<html><head></head><body>");
        Cookie ck[] = request.getCookies();
        
        if (ck == null){
            out.println("<h1 style='text-align: center' >Bienvenido a nuestro sitio Web</h1>");
        } else {
            out.print("<h1 style='text-align: center'>Gracias por visitarnos nuevamente</h1>");
        }
        out.print("<body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       
    }

}
