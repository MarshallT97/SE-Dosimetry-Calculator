package Core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Router
 */
@WebServlet("/Results")
public class Results extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Results() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		//Get Inputted String From Header
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		//testing:
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		
		//Here is where we call the calculations:
		//code stubs:
		//RadiationCalculator RadiationCalculator = new RadiationCalculator();
		//var RadiationDose = RadiationCalculator.getRadiation(pt anatomy variables);
		//print radiation to screen as output
		
		
		
		
		//Build HTML Output
		
		
		
		//Return the output
		writer.println(firstName);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
