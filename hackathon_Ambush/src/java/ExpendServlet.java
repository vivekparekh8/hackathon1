

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExpendServlet")
public class ExpendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ExpendServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		//Budgeted input
		int budEnt = Integer.parseInt(request.getParameter("bEnt"));
		int budGros = Integer.parseInt(request.getParameter("bGros"));
		int budHouse = Integer.parseInt(request.getParameter("bHouse"));
		int budSave = Integer.parseInt(request.getParameter("bSave"));
		int budTel = Integer.parseInt(request.getParameter("bTel"));
		int budTotal = budEnt + budGros + budHouse + budSave + budTel;
		
		//Expected input
		int expEnt = Integer.parseInt(request.getParameter("eEnt"));
		int expGros = Integer.parseInt(request.getParameter("eGros"));
		int expHouse = Integer.parseInt(request.getParameter("eHouse"));
		int expSave = Integer.parseInt(request.getParameter("eSave"));
		int expTel = Integer.parseInt(request.getParameter("eTel"));
		int expTotal = expEnt + expGros + expHouse + expSave + expTel;
		
		//Whats left
		int dEnt = budEnt - expEnt;
		int dGros = budGros - expGros;
		int dHouse = budHouse - expHouse;
		int dSave = budSave - expSave;
		int dTel = budTel - expTel;
		int dTotal = dEnt + dGros + dHouse + dSave + dTel;
		
		String title = "Money Advisor";

		PrintWriter out = response.getWriter();
		
		out.println("<html>" + "<head><title>" + title
				+ "</title></head><body>"
				+ "<center><h1>" + title + "</h1>"
				+"<p>Following are the statistics of you expenditure</p>"
				+ "<table border='1'>"
				+"<thead>"
				+"<tr>"
				+"<th>Category</th>"
				+"<th>Budgeted</th>"
				+"<th>Actual</th>"
				+"<th>Whats left</th>"
				+"</tr>"
				+"</thead>"
				+"<tbody>"
				+"<tr>"
				+"<td>Entertainment</td>"
				+"<td>" + budEnt + "</td>"
				+"<td>" + expEnt + "</td>"
				+"<td>" + dEnt + "</td>"
				+"</tr>"
				+"<tr>"
				+"<td>Groceries</td>"
				+"<td>" + budGros + "</td>"
				+"<td>" + expGros + "</td>"
				+"<td>" + dGros + "</td>"
				+"</tr>"
				+"<tr>"
				+"<td>Housing</td>"
				+"<td>" + budHouse + "</td>"
				+"<td>" + expHouse + "</td>"
				+"<td>" + dHouse + "</td>"
				+"</tr>"
				+"<tr>"
				+"<td>Saving</td>"
				+"<td>" + budSave + "</td>"
				+"<td>" + expSave + "</td>"
				+"<td>" + dSave + "</td>"
				+"</tr>"
				+"<tr>"
				+"<td>Telephone</td>"
				+"<td>" + budTel + "</td>"
				+"<td>" + expTel + "</td>"
				+"<td>" + dTel + "</td>"
				+"</tr>"
				+"<tbody>"
				+"<tfoot>"
				+"<tr>"
				+"<td>Total</td>"
				+"<td>" + budTotal + "</td>"
				+"<td>" + expTotal + "</td>"
				+"<td>" + dTotal + "</td>"
				+"</tr>"
				+"</tfoot>"
				+"</table> <br/>"
				+"</center>"
				+ "</body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
