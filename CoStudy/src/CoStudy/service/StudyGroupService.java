package CoStudy.service;

import CoStudy.dao.StudyGroupDao;

public class StudyGroupService {
	private static StudyGroupService s_service=new StudyGroupService();
	private static StudyGroupDao s_dao;

	
	
	public static StudyGroupService getInstance() {
		s_dao=s_dao.getInstance();
		return s_service;
	}
}
