package com.initpar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Dashboard"},
initParams = { 
		@WebInitParam(name = "appName", value = "sample one just for pract"),
		@WebInitParam(name = "appDescription", value = "We are working on a Web App"),
		@WebInitParam(name = "jdbcDriver", value = "org.postgresql.Driver")
})
public class Dashboard extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("Welcome " 
		+ request.getParameter("userName")
		+ ". You are now logged in...");
		
		out.println("<br>");
		
//		Get a reference to the ServletConfig
		ServletConfig config = getServletConfig();
		
		
		out.println("App Name : " + config.getInitParameter("appName") + "<br>");
		out.println("Description : " + config.getInitParameter("appDescription"));
	}

}
