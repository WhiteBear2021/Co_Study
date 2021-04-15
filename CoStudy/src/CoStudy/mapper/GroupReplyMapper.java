package CoStudy.mapper;

import java.util.List;

import CoStudy.domain.GroupReplyVO;

public interface GroupReplyMapper {
	List<GroupReplyVO> listGroupReply();
	int insertGroupReply(GroupReplyVO groupReplyVO);
}
