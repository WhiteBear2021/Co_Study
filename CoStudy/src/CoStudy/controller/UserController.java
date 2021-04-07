package CoStudy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.dao.UserDao;
import CoStudy.domain.UserVO;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/User/*")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao u_dao=new UserDao();
		UserVO user=u_dao.selectUser();
		System.out.println(user);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
