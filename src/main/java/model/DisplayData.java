package model;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class DisplayData
 */
public class DisplayData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		try {
			final String url = "jdbc:mysql:///employee";
		      final String user = "root";
		      final String password = "root123";

		      // establish the connection
		      Connection con = DriverManager.getConnection(url, user, password);

		      // create JDBC statement object
		      Statement st = con.createStatement();

		      // prepare SQL query
		      String query = "SELECT * FROM productdetails";

		      // send and execute SQL query in Database software
		      ResultSet rs = st.executeQuery(query);

		      // process the ResultSet object
		     
		      while(rs.next()) {
					 out.print("<html><body><center>"+"Id: "+ rs.getString(1) + "<br/> " + "Product-Name:"+rs.getNString(2)+
			                  "<br/> " + "Price: "+rs.getString(3)+"<hr><br> "+"</center></body></html");
				 }
		      // close JDBC objects
		      rs.close();
		      st.close();
		      con.close();
			
			
		}catch(Exception e) {
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
