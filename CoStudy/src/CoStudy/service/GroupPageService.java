package CoStudy.service;

import CoStudy.dao.GroupPageDao;

public class GroupPageService {
	private static GroupPageService gpService=new GroupPageService();
	private static GroupPageDao gpDao;
	
	public static GroupPageService getInstance() {
		gpDao=GroupPageDao.getInstance();
		return gpService;
	}
	
}
