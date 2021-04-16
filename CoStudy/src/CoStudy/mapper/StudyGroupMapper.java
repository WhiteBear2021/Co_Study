package CoStudy.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import CoStudy.domain.ApplyGroupMemberVO;
import CoStudy.domain.StudyGroupVO;

public interface StudyGroupMapper {
	int insertStudyGroup(StudyGroupVO studyGroup);
	StudyGroupVO studyGroupDetail(int studygroup_no);
	int countstudyGroupList();
	int insertApplyGroupStudy(ApplyGroupMemberVO applyGroupMember);
	
	
	
	List<StudyGroupVO> studyGroupListInfo(RowBounds row);
}
