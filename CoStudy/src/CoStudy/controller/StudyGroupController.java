package CoStudy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.studyGroup.MakeGroupAction;
import CoStudy.action.studyGroup.MakeGroupFormAction;
import CoStudy.action.studyGroup.StudyGroupDetailAction;
import CoStudy.action.studyGroup.StudyGroupListAction;
import CoStudy.action.user.LoginAction;
import CoStudy.action.user.LoginFormAction;
import CoStudy.action.user.MyPageAction;
import CoStudy.action.user.SignUpAction;
import CoStudy.action.user.SignUpFormAction;

/**
 * Servlet implementation class StudyGroupController
 */
@WebServlet("/studyGroup/*")
public class StudyGroupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudyGroupController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		System.out.println("requestURI:"+requestURI);
    	String contextPath = request.getContextPath();
    	System.out.println("contextPath:"+contextPath);
    	String command = requestURI.substring(contextPath.length()+12);
    	System.out.println("studyGroup/최종요청: "+command);
    	
    	CoStudy.action.Action action = null;
    	CoStudy.action.ActionForward forward = null;
    	
    	if(command.equals("makeGroupFormAction.do")) {
    		action = new MakeGroupFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}    		
    	}else if(command.equals("makeGroupAction.do")) {
    		action = new MakeGroupAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("studyGroupListAction.do")) {
    		action = new StudyGroupListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("studyGroupDetailAction.do")) {
    		action = new StudyGroupDetailAction();
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
