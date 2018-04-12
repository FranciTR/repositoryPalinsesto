package view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {


	private String utente;
	private String recuperopassword;
	private String password;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	
	
	String utente = request.getParameter("utente");
	
	request.setAttribute("utente",utente);
	
	String password = request.getParameter("password");
	
	request.setAttribute("password",password);
	
	String nextjsp = "/login.jsp";
	
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextjsp);
	dispatcher.forward(request,response);
	
	
	
	
	
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
