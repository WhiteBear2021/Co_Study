package CoStudy.service;

import java.util.List;

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
	
	public List<StudyGroupVO> studyGroupList() {
		return sDao.studyGroupList();
	}
	
	public StudyGroupVO studyGroupDetail(int studygroup_no) {
		return sDao.studyGroupDetail(studygroup_no);
	}
}
