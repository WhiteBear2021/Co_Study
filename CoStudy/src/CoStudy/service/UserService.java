package CoStudy.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import CoStudy.dao.UserDao;
import CoStudy.domain.UserVO;

public class UserService {
	private static UserService u_service=new UserService();
	private static UserDao u_dao;

	
	
	public static UserService getInstance() {
		u_dao=u_dao.getInstance();
		return u_service;
	}
	
	/**
	* @Method Name : insertUserService
	* @작성일 : 2021. 4. 8.
	* @작성자 : KOSTA
	* @변경이력 :
	* @Method 설명 : user 정보 삽입
	* @param request
	* @return
	* @throws Exception
	 */
	public int insertUserService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		UserVO user= new UserVO();
		user.setUser_no(Integer.parseInt(request.getParameter("user_no")));
		user.setCategory_no(Integer.parseInt(request.getParameter("category_no")));
		user.setUser_id(request.getParameter("user_id"));
		user.setUser_pw(request.getParameter("user_pw"));
		user.setUser_lastName(request.getParameter("user_lastName"));
		user.setUser_firstName(request.getParameter("user_firstName"));
		user.setUser_phoneNo(request.getParameter("user_phoneNo"));
		user.setUser_post(request.getParameter("user_post"));
		user.setUser_address1(request.getParameter("user_address1"));
		user.setUser_address2(request.getParameter("user_address2"));
		user.setUser_birth(request.getParameter("user_birth"));
		user.setUser_email(request.getParameter("user_email"));
		user.setUser_register_date(request.getParameter("user_register_date"));		
		
		return u_dao.insertUser(user);
	}
}
