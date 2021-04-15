package CoStudy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.user.LoginAction;
import CoStudy.action.user.LoginFormAction;
import CoStudy.action.user.LogoutAction;
import CoStudy.action.user.MyPageAction;
import CoStudy.action.user.SignUpAction;
import CoStudy.action.user.SignUpFormAction;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user/*")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+6);
    	System.out.println("최종요청: "+command);
    	
    	CoStudy.action.Action action = null;
    	CoStudy.action.ActionForward forward = null;
    	
    	if(command.equals("signUp.do")) {
    		action = new SignUpFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}    		
    	}else if(command.equals("signUpAction.do")) {
    		action = new SignUpAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("myPageAction.do")) {
    		action = new MyPageAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("login.do")) {
    		action = new LoginFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}  
    	}else if(command.equals("loginAction.do")) {
    		action = new LoginAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}  
    	}else if(command.equals("logout.do")) {
    		action = new LogoutAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}  
    	}
    	
    	if(forward != null) {
    		if(forward.isRedirect()) {
    			response.sendRedirect(forward.getPath());
    		}else {
    			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request,response);
    		}
    	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
