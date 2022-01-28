package com.web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/auth")
public class Auth extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
   {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");

//		Get a reference to the session
		HttpSession session = request.getSession();

//		Get a reference to the context
		ServletContext context = getServletContext();
		
//		Check whether parameter exists in the request
		if(userName != null) {
//			Save the userName(coming from the request) into the session
			session.setAttribute("userName", userName);
			
//			Save the userName(coming from the request) into the context
			context.setAttribute("userName", userName);
		}
		
//		Print userName from request
		out.println("<h3>From request, username : " + userName + "</h3><br>");
		
		//Print userName from session
		out.println("<h3>From session, username : " + session.getAttribute("userName") +"</h3><br>");
		
		//Print userName from context
		out.println("<h3>From context, username : " + context.getAttribute("userName") +"</h3>");
		}

}
