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
import CoStudy.action.qna.QnaDetailAction;
import CoStudy.action.qna.QnaInfoAction;
import CoStudy.action.qna.QnaInsertManagerReplyAction;
import CoStudy.action.qna.QnaInsertUserReplyAction;
import CoStudy.action.qna.QnaInsertAction;
import CoStudy.action.qna.QnaInsertFormAction;

@WebServlet("/Qna/*")
public class QnaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public QnaController() {
		super();
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		System.out.println("요청:" + requestURI);

		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 5);
		System.out.println("최종요청" + command);

		Action action = null;
		ActionForward actionForward = null;

		if (command.equals("QnaInfoAction.do")) {
			action = new QnaInfoAction();

			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("QnaInsertFormAction.do")) {
			action = new QnaInsertFormAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("QnaDetailAction.do")) {
			action = new QnaDetailAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("QnaUserInsertAction.do")) {
			action = new QnaInsertAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("QnaInsertManagerReplyAction.do")) {
			action = new QnaInsertManagerReplyAction();
			try {
				actionForward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("QnaInsertUserReplyAction.do")) {
			action = new QnaInsertUserReplyAction();
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
