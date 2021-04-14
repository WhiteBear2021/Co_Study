package CoStudy.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import CoStudy.dao.ManageUserDao;
import CoStudy.domain.UserVO;

public class ManageUserService {
	private static ManageUserService m_service=new ManageUserService();
	private static ManageUserDao m_dao;
	
	public static ManageUserService getInstance() {
		m_dao=m_dao.getInstance();
		return m_service;
	}
	
	public List<UserVO> userInfoService(HttpServletRequest request) throws Exception {
		return m_dao.userInfo();
	}
	
	public List<UserVO> newUserService(HttpServletRequest request) throws Exception {
		String dateString = null;
		SimpleDateFormat sd = new SimpleDateFormat("yy/MM/dd");
		dateString=sd.format(new Date()); //여기 바꿔야함
		System.out.println(dateString);
		return m_dao.newUserInfo(dateString);
	}
}
