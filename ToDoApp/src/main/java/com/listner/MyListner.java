package com.listner;

import java.util.ArrayList;
import java.util.List;

import com.entities.Todo;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyListner implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context created.......");
		List<Todo> list = new ArrayList<Todo>();
		ServletContext context = sce.getServletContext();
		context.setAttribute("list", list);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	
	

}
