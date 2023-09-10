package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DBConnect;
import com.entity.Application;
import com.dao.appDAO;

@WebServlet("/apply")
public class SubmitFormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
		try {
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String message = req.getParameter("message");
			
			System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("Phone: " + phone);
	        System.out.println("Message: " + message);

			Application application = new Application();
			application.setName(name);
			application.setEmail(email);
			application.setPhone(phone);
			application.setMessage(message);

			appDAO appdao = new appDAO(DBConnect.getConn());
			boolean isSuccess = appdao.addApplication(application);

//			Application ap = new Application(name, email, phone, message,"Application");
//			boolean f1 = appdao.addApplication(a);

			HttpSession session = req.getSession();

			if (isSuccess) {
				session.setAttribute("succMsg", "JOB APPLIED SUCESSFULLY..");
				resp.sendRedirect("add_job.jsp");
			} else {
				session.setAttribute("succMsg", "SOMETHING WRONG ON SERVER..");
				resp.sendRedirect("/home.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

    
    
    
    

//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        // Retrieve form data
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//        String phone = request.getParameter("phone");
//        String message = request.getParameter("message");
//
//        // Create an instance of the Application class
//        Application application = new Application(name, email, phone, message);
//
//        // Create a database connection
//        Connection connection = DBConnect.getConn();
//
//        // Create an instance of the appDAO class
//        appDAO dao = new appDAO(connection);
//
//        // Add the application to the database
//        boolean isSuccess = dao.addApplication(application);
//
//        if (isSuccess) {
//            // Redirect to a success page
//            response.sendRedirect("successfully_applied.jsp");
//        } else {
//            // Redirect to an error page
//            response.sendRedirect("error.jsp");
//        }
//    }
//}
