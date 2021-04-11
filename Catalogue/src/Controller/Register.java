package Controller;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Internaute;


//@WebServlet( name="Identifier", urlPatterns = "/Identifier.jsp" )
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setAttribute("nom",new Internaute());
    	request.getRequestDispatcher("accueil1.jsp").forward(request, response);
		
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//doGet(request,response);
    	Internaute intr = new Internaute();
    	intr.setNom(request.getParameter("nom"));
    	intr.setPrenom(request.getParameter("nom"));
    	intr.setEmail(request.getParameter("email"));
		
    	intr.setAdresse(request.getParameter("adresse"));
    	intr.setVille(request.getParameter("ville"));
    	intr.setMotPasse(request.getParameter("motPasse"));
    	intr.setCodePostal(request.getParameter("codePostal"));
		
		
		 
		 
		 
			
			
			request.setAttribute("name",intr);
			request.getRequestDispatcher("accueil1.jsp").forward(request, response);
			
			
		}
    	
 	}




