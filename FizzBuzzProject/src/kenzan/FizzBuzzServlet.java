package kenzan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FizzBuzzServlet
 * @author Demonna Evelyn Wade
 */
@WebServlet(description = "Kenzan Interview Project", urlPatterns = { "/FizzBuzzServlet/*" })
public class FizzBuzzServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String pathInfo;
    private FizzBuzzSolver solve;
    private String result;
    /**
     * @see HttpServlet#HttpServlet()
     * @param no parameters required for default constructor
     * initializes all the variables used in this class
     */
    public FizzBuzzServlet() {
        super();
        this.pathInfo = "0";
        this.result = "";
        solve = new FizzBuzzSolver(Integer.parseInt(pathInfo));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * @param HTTP Server request, HTTP Server Response
	 * This is communicating with the server through the web page.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("\n");
		// get the value entered in the url path
		this.pathInfo = request.getPathInfo();
		// making sure the value received does not have extra characters
		this.pathInfo = this.pathInfo.replace("/", "");
		// telling the user the information/value received for the FizzBuzz problem 
		response.getWriter().write("Testing FizzBuzz from 1 to " + this.pathInfo + "\n");
		// using the solve Object, call the solveFizzBizz that calculate the answers to the FizzBuzz problem
		solve.solveFizzBuzz(Integer.parseInt(this.pathInfo));
		// grab the results in a string from 
		this.result = solve.printAnswers();
		// write those results to the web browser page
		response.getWriter().write(result + "\n");
	}

}
