package CoStudy.mapper;

import java.util.List;

import CoStudy.domain.GroupPageBoardVO;

public interface GroupPageMapper {
	int insertGroupBoard(GroupPageBoardVO groupPageBoardVO);
	List<GroupPageBoardVO> groupBoardList();
	List<GroupPageBoardVO> selectGroupBoard(int studyGroup_no);
	
}


