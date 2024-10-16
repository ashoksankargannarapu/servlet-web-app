package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckVotingEligibilityServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("CheckVotingEligibilityServlet.doPost()");
		//get printwriter stream from res obj
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read form data as req param value
		String name=req.getParameter("pname");
		String addrs=req.getParameter("paddrs");
		int age=Integer.parseInt(req.getParameter("page"));
		pw.println("<h1 style='color:green;text-align:center'>name is::"+name);
		pw.println("<h1 style='color:yellow;text-align:center'>address is::"+addrs);
		pw.println("<h1 style='color:orange;text-align:center'>age is::"+age);
		
		//write the b.logic
		if(age>=12) {
			pw.println("<h1 style='color:green;text-align:center'>"+name+"  u are eligible for corona vaccination</h1>");
		}else {
			pw.println("<h1 style='color:green;text-align:center'>"+name+"  u are not eligible for corona vaccination</h1>");
		}
		//add home hyperlink(graphical link)
		pw.println("<a style='text-align:center' href='input.html'><center><img src='images/home.jfif' width='100px' height='100px' ></center></a>");
		//close the stream
		pw.close();
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("CheckVotingEligibilityServlet.doGet()");
		//get printwriter stream from res obj
				PrintWriter pw=res.getWriter();
				//set response content type
				res.setContentType("text/html");
				//write the output to the browser
				pw.println("<h1 style='color:green;text-align:center'>Date and Time is::"+new java.util.Date()+"</h1>");
				//add home hyperlink(graphical link)
				pw.println("<center><a href='input.html'><img src='images/home.jfif' height='60px' width='40px'></a></center>");
				//close stream
				pw.close();
				
				
	}

	
}
