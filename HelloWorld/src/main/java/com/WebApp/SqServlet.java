package com.WebApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SqServlet
 */
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = 0;
		/*
		 *  URL rewriting
		 *  
		 *  int k  = Integer.parseInt(req.getParameter("k")) ;
		 */
		
		
		/*
		 *  RequestDispatcher
		 *  
		 *   int k = (int)req.getAttribute("k");
		 */
		
		
		/*
		 * Session Management
		 * 
		 *  HttpSession session = req.getSession();
		 *	int k = (int)session.getAttribute("k"); 
		 *  session.removeAttribute("k); // to remove the data from session, after that you can't fetch the k in future
		 */
		
		/*
		 * Cookie
		 */
		Cookie[] cookies = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("result:"+k);
		
		/*
		 * ServletContext - gets the details stored in web.xml , like initial details 
		 * 				  - contains only object , the same data is stored among all servlets
		 * 
		 * ServletContext servletContextObj = getServletContext();
		 *  String myName = servletContextObj.getInitParameter("name");
		 *  out.println(myName);
		 */
		
		/*
		 * ServletConfig - if we have different servlets and it wants different data that is particular to that servlet then we can config that details in that servlet tag of web.xml 
		 */
		 ServletConfig servletContextObj = getServletConfig();
		 String myName = servletContextObj.getInitParameter("name");
		 out.println(myName);
		
	}

}
