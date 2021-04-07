package CoStudy.service;

import CoStudy.dao.UserDao;

public class UserService {
	private static UserService m_service=new UserService();
	private static UserDao m_dao;

	
	
	public static UserService getInstance() {
		m_dao=m_dao.getInstance();
		return m_service;
	}
}
