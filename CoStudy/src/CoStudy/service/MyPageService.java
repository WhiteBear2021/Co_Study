package CoStudy.service;

import CoStudy.dao.MyPageDao;
import CoStudy.dao.UserDao;
import CoStudy.domain.UserVO;

public class MyPageService {
	private static MyPageService myService=new MyPageService();
	private static MyPageDao myDao;
	public static MyPageService getInstance() {
		myDao=MyPageDao.getInstance();
		return myService;
	}
	
	public int updateUser(UserVO user) {
		return myDao.updateUser(user);
	}
}
