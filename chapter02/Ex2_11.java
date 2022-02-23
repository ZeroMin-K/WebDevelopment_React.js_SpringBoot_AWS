package chapter02;

public class Ex2_11 {

}

package com.example.Demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletREsponse response) throws ServeletException, IOException {
		// parameter �ؼ�
		String name = request.getParameter("name");
		
		// business logic ����
		process(name);
		
		// response ����
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		
		// UI�κ�
		out.print("</html>");
	}
	
	private void process(String name) {
		// business logic 
	}
}