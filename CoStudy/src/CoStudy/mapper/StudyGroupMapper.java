package CoStudy.mapper;

import java.util.List;

import CoStudy.domain.StudyGroupVO;

public interface StudyGroupMapper {
	int insertStudyGroup(StudyGroupVO studyGroup);
	List<StudyGroupVO> studyGroupList();
}
