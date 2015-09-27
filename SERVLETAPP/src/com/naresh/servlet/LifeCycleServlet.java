/**
 * 
 */
package com.naresh.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Naresh
 *
 */
public class LifeCycleServlet extends GenericServlet {

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#service(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
	 */
	public LifeCycleServlet() {
		System.out.println("Constructor called...");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method called...");
		super.init(config);
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("service method called...");

	}
	@Override
	public void destroy() {
		System.out.println("destroy method is called...");
		super.destroy();
	}

}
