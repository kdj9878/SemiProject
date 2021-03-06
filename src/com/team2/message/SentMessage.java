package com.team2.message;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SentMessage")
public class SentMessage extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
			MessageA.getAdao().sentMessage(request);
			MessageA.getAdao().MessagePageing(1, request);

			request.setAttribute("messageContentPage", "sentMessage.jsp");
			request.getRequestDispatcher("jsp/message.jsp").forward(request, response);
			request.setAttribute("j", "sent");
	
		}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
