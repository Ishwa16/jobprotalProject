package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DBConnect;
import com.dao.appDAO;
import com.entity.Application;

@WebServlet("/successfully_applied.jsp")
public class SuccessfullyAppliedServlet extends HttpServlet {

	@Override
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

			Application a = new Application();
			a.setName(name);
			a.setEmail(email);
			a.setPhone(phone);
			a.setMessage(message);

			appDAO appdao = new appDAO(DBConnect.getConn());
			
			boolean isSuccess = appdao.addApplication(a);

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
