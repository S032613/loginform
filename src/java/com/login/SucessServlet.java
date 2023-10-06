/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 *
 * @author lenovo
 */
public class SucessServlet extends HttpServlet  {
    
 @Override
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {  
     res.setContentType("text/html");
     PrintWriter out = res.getWriter();
     out.println("This is Success sevlet");
     out.println("<h2>Successfully  regiser </h2>");
    
}
}