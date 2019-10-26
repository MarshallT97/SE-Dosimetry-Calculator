package Core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * Check username and password against database 
		 * (Right now just using an example array)
		 */
		String username = request.getParameter("username");
		String password = request.getParameter("password");
			
		int ID = 12345;
		System.out.println(username + "   " + password);
		if (username.equals("Hello") && password.equals("1234")) {
			Cookie userCookie = new Cookie(username, String.valueOf(ID));
			response.addCookie(userCookie);
			response.sendRedirect("create.html");
		} else {
			PrintWriter writer = response.getWriter();
			writer.println("Bad Username or Password");
		}
		
		
	}

}
