package com.veckon.hack.neo2rewa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import static com.veckon.hack.neo2rewa.objectify.OfyService.ofy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.veckon.hack.neo2rewa.datastore.User;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = "".equals(req.getParameter("loginid")) ? "guest" : req.getParameter("loginid")  ;
		String password = "".equals(req.getParameter("password")) ? "guest" : req.getParameter("password")  ;
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		User user = ofy().load().type(User.class).filter("name", name).first().now();
		if(user != null) {
			if(!user.getPassword().equals(password)) {
				out.println("Not Collect Password");
			}else{
				User temp = new User();
				temp.setEmail(user.getEmail());
				temp.setName(user.getName());
				session.setAttribute("user",temp);
				out.println("Login Success");
			}
		}else{
			out.println("Not Exist LoginId");
		}
		out.flush();
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
}
