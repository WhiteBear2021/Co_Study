package CoStudy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.main.MainPageAction;
import CoStudy.action.myPage.ApplyQuitUserAction;

/**
 * Servlet implementation class MainController
 */
@WebServlet({ "/main", "/" })
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MainController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	CoStudy.action.Action action = new MainPageAction();
    	CoStudy.action.ActionForward forward=null;
    	System.out.println("mainController 실행");
		try {
			forward = action.execute(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block+
			e.printStackTrace();
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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}