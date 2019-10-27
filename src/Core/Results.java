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
		
		//Get Input patient data From Header
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String ID = request.getParameter("ID");
		double height = Double.parseDouble(request.getParameter("height"));
		String gender = request.getParameter("Gender");
		int age = Integer.parseInt(request.getParameter("age"));

		String tumorlocation = request.getParameter("tumorLocation");
		double organmass = Double.parseDouble(request.getParameter("organMass"));
		int cancerstage = Integer.parseInt(request.getParameter("cancerStage"));
		double tumormass = Double.parseDouble(request.getParameter("tumorMass"));
		int tumorquantity = Integer.parseInt(request.getParameter("tumorQuantity"));

		double redblood = Double.parseDouble(request.getParameter("redBlood"));
		double whiteblood = Double.parseDouble(request.getParameter("whiteBlood"));
		double glucose = Double.parseDouble(request.getParameter("glucose"));
		double sodium = Double.parseDouble(request.getParameter("sodium"));
		double chloride = Double.parseDouble(request.getParameter("chloride"));
		double albumin = Double.parseDouble(request.getParameter("albumin"));

		//Construct the PatientData object from the patient data
		PatientData patient = new PatientData(firstName, lastName, ID, height, gender, age, tumorlocation, organmass, cancerstage, tumormass, tumorquantity,
											  redblood, whiteblood, glucose, sodium, chloride, albumin);
		
		//testing:
		patient.Print();
		
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
		
		
		
	}

}
