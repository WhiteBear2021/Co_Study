package CoStudy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.group.GroupAcceptUserAction;
import CoStudy.action.group.GroupBoardListAction;
import CoStudy.action.group.GroupWritingAction;
import CoStudy.action.group.GroupWritingFormAction;
import CoStudy.action.user.SignUpFormAction;

/**
 * Servlet implementation class GroupPageController
 */
@WebServlet("/groupPage/*")
public class GroupPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GroupPageController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 11);
		System.out.println("최종요청: " + command);

		CoStudy.action.Action action = null;
		CoStudy.action.ActionForward forward = null;

		if (command.equals("groupWritingForm.do")) {

			action = new GroupWritingFormAction();
			try {
				forward = action.execute(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("groupWriting.do")) {
			action = new GroupWritingAction();
			/*
			 * System.out.println("write번호:"+Integer.parseInt(request.getParameter(
			 * "studygroup_no")));
			 */			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("groupBoardList.do")) {
			action = new GroupBoardListAction();
			System.out.println("번호:"+Integer.parseInt(request.getParameter("studygroup_no")));
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (command.equals("groupAcceptUser.do")) {
			action = new GroupAcceptUserAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
