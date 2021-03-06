package com.team2.paintGame;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team2.login.Account;

@WebServlet("/PrintGroupDetail")
public class PrintGroupDetail extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintDAO.getPdao().showPrint(request);
		
		
		PrintDAO.getPdao().showComment(request);
		PrintDAO.getPdao().calc(request);
		PrintDAO.getPdao().comment_paging(1, request);
		
		HttpSession hs = request.getSession();
		Account a = (Account) hs.getAttribute("accountInfo");
		request.setAttribute("user_session", a);
		request.setAttribute("contentPage", "paintGame/paintDetail.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

	}

}
