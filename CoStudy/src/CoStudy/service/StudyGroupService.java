package CoStudy.service;

import CoStudy.dao.GroupListDao;

public class StudyGroupService {
	private static StudyGroupService s_service=new StudyGroupService();
	private static GroupListDao s_dao;

	
	
	public static StudyGroupService getInstance() {
		s_dao=s_dao.getInstance();
		return s_service;
	}
}
