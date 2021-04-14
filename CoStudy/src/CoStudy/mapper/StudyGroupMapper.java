package CoStudy.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import CoStudy.domain.StudyGroupVO;

public interface StudyGroupMapper {
	int insertStudyGroup(StudyGroupVO studyGroup);
	List<StudyGroupVO> studyGroupList(RowBounds row);
	StudyGroupVO studyGroupDetail(int studygroup_no);
	int countstudyGroupList();
}
