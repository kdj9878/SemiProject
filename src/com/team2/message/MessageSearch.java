package com.team2.message;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MessageSearch")
public class MessageSearch extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("messageContentPage","messageSearch.jsp" );
		request.getRequestDispatcher("jsp/message.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		MessageA.getAdao().search(request);
		request.setAttribute("messageContentPage","messageSearch.jsp" );
		request.getRequestDispatcher("jsp/message.jsp").forward(request, response);
	}

}
