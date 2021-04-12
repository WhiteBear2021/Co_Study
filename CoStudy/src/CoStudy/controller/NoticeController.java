package CoStudy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.action.notice.noticeAction;
import CoStudy.action.notice.noticeCreateAction;
import CoStudy.action.notice.noticeDeleteAction;
import CoStudy.action.notice.noticeDetailAction;
import CoStudy.action.notice.noticeInfoAction;
import CoStudy.action.notice.noticeUpdateAction;
import CoStudy.action.notice.noticeUpdateFormAction;

@WebServlet("/Notice/*")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NoticeController() {
		super();
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		System.out.println("요청:" + requestURI);

		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 8);
		System.out.println("최종요청" + command);

		Action action = null;
		ActionForward actionForward = null;

		if (command.equals("noticeInfoAction.do")) {
			action = new noticeInfoAction();

			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (command.equals("noticeAction.do")) {
			action = new noticeAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("noticeCreateAction.do")) {
			action = new noticeCreateAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("noticeDetailAction.do")) {
			action = new noticeDetailAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("noticeUpdateAction.do")) {
			action = new noticeUpdateAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("noticeUpdateFormAction.do")) {
			action = new noticeUpdateFormAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("noticeDeleteAction.do")) {
			action = new noticeDeleteAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		
		
		
		if (actionForward != null) {
			if (actionForward.isRedirect()) {
				response.sendRedirect(actionForward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(actionForward.getPath());
				dispatcher.forward(request, response);
			}
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
