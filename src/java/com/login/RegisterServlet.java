
package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
   {
    response.setContentType("text/html");
     PrintWriter out = response.getWriter();
     
     out.println("<h2> Welcome to Register servlet</h2>");
     String name=request.getParameter("user_name");
     String password=request.getParameter("user_password");
     String email=request.getParameter("user_email");
     String gender=request.getParameter("user_gender");
     String course=request.getParameter("user_course");
        
        String cond=request.getParameter("conditon");
        
        if(cond!=null)
        {
        if(cond.equals("checked"))
        {
            out.println("<h2> Name : "+ name + " <h2>");
                        out.println("<h2> Password : "+ password + " <h2>");

                                    out.println("<h2> Email : "+ email + " <h2>");

                                                out.println("<h2> Gender : "+ gender + " <h2>");

                                                            out.println("<h2> Course : " + course + " <h2>");

                                                            //java
                                               //saved to db  
                                               
         try
{
   
 Class.forName("com.mysql.cj.jdbc.Driver");
 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginservlet","root","#Lenovo1326");
    String sql = "INSERT INTO students (user_name, user_password, user_email,user_gender,user_course) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement pstmt = con.prepareStatement(sql);
    
     pstmt.setString(1, name);
    pstmt.setString(2, password);
    pstmt.setString(3, email);
     pstmt.setString(4, gender);
     pstmt.setString(5,course);
     pstmt.executeUpdate();
    
    
}
         
catch (Exception e)
        {
            e.printStackTrace();
            
            out.println("<h2> error</h2>");
        }

                                               
                                                RequestDispatcher rd= request.getRequestDispatcher("success");
                                                rd.forward(request, response);
        }
        else
        {
           out.println("<h2> you have not accepted terms and conditions</h2>");
        }
        }
        else{
                       out.println("<h2> you have not accepted terms and conditions</h2>");
                       RequestDispatcher rd= request.getRequestDispatcher("index.html");
                       
                       rd.include(request,response);
                       
        }
   }
    
    

}

