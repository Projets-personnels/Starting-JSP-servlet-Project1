package com.anurag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddFunc extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int ans = i + j;
//		System.out.println("Result is "+ ans);
		
		req.setAttribute("ans", ans);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
		PrintWriter out = res.getWriter();
		
		out.println("The result is " + ans);
	}
}
