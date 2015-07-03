package com.xanne.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xanne.rh.BaseRH;

/**
 * Servlet implementation class CaseStudyController
 */
@WebServlet("/case")
public class CaseStudyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the request handler
		String nextPage;
		BaseRH rh = getRequestHandler(request);
		rh.handle(request, response);
	}

	private BaseRH getRequestHandler(HttpServletRequest request) {
		BaseRH baseRH = null;
		String rh = request.getParameter("rh");
		rh = rh == null ? "" : rh.trim();
		if (rh.length() < 2) {
			throw new RuntimeException("Invalid request handler.");
		}
		
		// convert the first character to uppercase
		rh = rh.substring(0, 1).toUpperCase() + rh.substring(1) + "RH";
		try {
			Class<?> rhClass = Class.forName("com.xanne.rh.impl." + rh);
			Object rhInstance = rhClass.newInstance();
			if (rhInstance instanceof BaseRH) {
				baseRH = (BaseRH) rhInstance;
				
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
		//return baseRH;
		return baseRH;
	}

}
