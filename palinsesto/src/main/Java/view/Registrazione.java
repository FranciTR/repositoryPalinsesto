package view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registrazione extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	
	
	String nome = request.getParameter("nome");
	
	request.setAttribute("nome",nome);
	
	String cognome = request.getParameter("cognome");
	
	request.setAttribute("cognome",cognome);
	
	String email = request.getParameter("email");
	
	request.setAttribute("email",email);
	
	int datadinascita = request.getParameter("datadinascita");
	
	request.setAttribute("dtadinascita",datadinascita);
	
	String password = request.getParameter("password");
	
	request.setAttribute("password",password);
	
	String username = request.getParameter("username");
	
	request.setAttribute("username",username);
	
	String nextjsp = "/Registrazione.jsp";
	
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextjsp);
	dispatcher.forward(request,response);
	
	
	
	
	
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
