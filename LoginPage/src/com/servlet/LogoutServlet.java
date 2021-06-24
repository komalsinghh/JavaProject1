package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		
		
		
		HttpSession session=request.getSession();
		session.removeAttribute("user-ob");
		HttpSession session2=request.getSession();
		session.setAttribute("logout-msg","Logout Sucessfully");
		response.sendRedirect("Login.jsp");
		
}


}
