package CoStudy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.main.MainPageAction;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/main/*")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/** 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 6);
		System.out.println("최종요청2: " + command);

		CoStudy.action.Action action = null;
		CoStudy.action.ActionForward forward = null;

		if (command.equals("mainPage.do")) {
			action = new MainPageAction();
			try {
				forward = action.execute(request, response);
//		    	System.out.println("mainController 실행");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}else {
			action = new MainPageAction();
			try {
				forward = action.execute(request, response);
//		    	System.out.println("mainController 실행");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    	
       	if(forward != null) {
    		if(forward.isRedirect()) {
//    			System.out.println("sendRedirect");
    			response.sendRedirect(forward.getPath());
    		}else {
//    			System.out.println("dispatcher");
    			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request,response);
    		}
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
