package Register_package;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/regform")
public class Register_class extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	PrintWriter out = resp.getWriter();	
		
		
	String myname = req.getParameter("name");
	
	String myemail = req.getParameter("email");
	
	String mypassword = req.getParameter("password");
	
	String mymobile = req.getParameter("mobile");
	
	try 
	
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mustakim",
                "root",
                "root"
            );
		String sql = "INSERT INTO registerform (name,email,password,mobile) VALUES (?, ?, ?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        // 4. Set Values
        ps.setString(1, myname);
        ps.setString(2, myemail);
        ps.setString(3, mypassword);
        ps.setString(4, mymobile);
        
        int count = ps.executeUpdate();
        
        if (count>0) {
        	
        	resp.setContentType("text/html");
        	out.print("<h3 style = 'color:green'> user registered successfully </h3>");
        	
        	RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
        	rd.include(req, resp);

        }
        else {
        	resp.setContentType("text/html");
        	out.print("<h3 style = 'color:red'> user not registered successfully </h3>");
        	
        	RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
        	rd.include(req, resp);
        }
        	        
        
	
	}
	
	catch (Exception e) 

	{
		e.printStackTrace();
		resp.setContentType("text/html");
    	out.print("<h3 style = 'color:red'> exception occured :"+e.getMessage()+ "</h3>");
    	
    	RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
    	rd.include(req, resp);

		
		
	}
}
	}