package com.WebApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionServlet
 */
@WebServlet("/add")
public class AdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int result = a+b;
		
		/*
		 * Render on screen
		 * 
		 * out.println("Result : "+result);
		 */
		
		
		/*
		 * RequestDispatcher - to pass request to or call other servlet 
		 * 
		 * req.setAttribute("k",result);
		 *	RequestDispatcher addToSquare = req.getRequestDispatcher("sq"); 
		 *	addToSquare.forward(req,res);
		 */
		
		
		/*
		 * URL Rewriting - to pass values to other servlets
		 * drawbacks : what if we what to pass same data to several servlets, pass multiple data.
		 * 
		 * res.sendRedirect("sq?k="+result); 
		 */
		
		
		/*
		 * Session Management - to maintain details through out the session , at the time of login we can validate
		 * 
		 *  HttpSession session = req.getSession();
		 *  session.setAttribute("k", result);
		 *  res.sendRedirect("sq");
		 */
		
		/*
		 * Cookie - when client sends request ,then server sends a cookie again that cookie will send to server by client.
		 */
			Cookie cookie = new Cookie("k",result+"");
			res.addCookie(cookie);
			res.sendRedirect("sq");
	
			
		
	}

}
