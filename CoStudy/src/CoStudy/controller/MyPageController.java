package CoStudy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.myPage.ApplyQuitUserAction;
import CoStudy.action.myPage.ApplyQuitUserCheckFormAction;
import CoStudy.action.myPage.ApplyQuitUserFormAction;
import CoStudy.action.myPage.CategoryUpdateAction;
import CoStudy.action.myPage.CategoryUpdateFormAction;
import CoStudy.action.myPage.JoinGroupListAction;
import CoStudy.action.myPage.ScheduleListAction;
import CoStudy.action.myPage.ScheduleManagementAction;
import CoStudy.action.myPage.StudyDiaryAction;
import CoStudy.action.myPage.StudyDiaryFormAction;
import CoStudy.action.myPage.StudyDiaryListAction;
import CoStudy.action.myPage.UserUpdateAction;
import CoStudy.action.myPage.UserUpdateFormAction;


/**
 * Servlet implementation class MyPageController
 */
@WebServlet("/myPage/*")
public class MyPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MyPageController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+8);
    	System.out.println("최종요청: "+command);
    	
    	CoStudy.action.Action action = null;
    	CoStudy.action.ActionForward forward = null;
    	
    	if(command.equals("applyQuitUserAction")) {
    		action = new ApplyQuitUserAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("applyQuitUserCheckFormAction")) {
    		action = new ApplyQuitUserCheckFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("applyQuitUserFormAction")) {
    		action = new ApplyQuitUserFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("categoryUpdateAction")) {
    		action = new CategoryUpdateAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("categoryUpdateFormAction")) {
    		action = new CategoryUpdateFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("joinGroupListAction")) {
    		action = new JoinGroupListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("scheduleListAction")) {
    		action = new ScheduleListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("scheduleManagementAction")) {
    		action = new ScheduleManagementAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("studyDiaryAction")) {
    		action = new StudyDiaryAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("studyDiaryFormAction")) {
    		action = new StudyDiaryFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("studyDiaryListAction")) {
    		action = new StudyDiaryListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("userUpdateAction")) {
    		action = new UserUpdateAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}   
    	}else if(command.equals("userUpdateFormAction")) {
    		action = new UserUpdateFormAction();
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
