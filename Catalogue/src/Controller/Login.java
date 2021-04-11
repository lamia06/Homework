package Controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Internaute;

public class Login extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 public Login() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	request.getRequestDispatcher("accueil1.jsp").forward(request, response);
			
		}
	 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Internaute intr = new Internaute();
    	intr.setEmail(request.getParameter("email"));
    	intr.setMotPasse(request.getParameter("motPasse"));
		
		 
    	request.setAttribute("email",intr);
		request.getRequestDispatcher("accueil1.jsp").forward(request, response);
	}
	
}
