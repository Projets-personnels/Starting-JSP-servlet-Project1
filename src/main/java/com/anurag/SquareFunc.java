package com.anurag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareFunc extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		int ans = (int)req.getAttribute("ans");
		
		int ans2 = ans * ans;
		
		PrintWriter out = res.getWriter();
		
		out.println("The answer of the square is " + ans2);
	}
		
}
