package CoStudy.service;

import CoStudy.dao.StudyGroupDao;
import CoStudy.domain.StudyGroupVO;

public class StudyGroupService {
	private static StudyGroupService sService=new StudyGroupService();
	private static StudyGroupDao sDao;

	
	
	public static StudyGroupService getInstance() {
		sDao=sDao.getInstance();
		return sService;
	}
	
	public int insertStudyGroup(StudyGroupVO studyGroup) {
		return sDao.insertStudyGroup(studyGroup);
	}
}
