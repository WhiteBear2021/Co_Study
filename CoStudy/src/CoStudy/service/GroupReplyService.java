package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import CoStudy.dao.GroupReplyDao;
import CoStudy.domain.GroupReplyVO;

public class GroupReplyService {
	private static GroupReplyService groupReplyService=new GroupReplyService();
	private static GroupReplyDao groupReplyDao;
	
	public static GroupReplyService getInstance() {
		groupReplyDao=groupReplyDao.getInstance();
		
		return groupReplyService;
	}
	public List<GroupReplyVO> listGroupReply(HttpServletRequest request){
		List<GroupReplyVO> list=groupReplyDao.listGroupReply();
		
		return list;
		
	}
	
	public int insertGroupReplyService(HttpServletRequest request) {

		GroupReplyVO groupReplyVO=new GroupReplyVO();
		groupReplyVO.setGroup_reply_content(request.getParameter("group_reply_content"));
		groupReplyVO.setGroup_reply_writer(request.getParameter("group_reply_writer"));
		groupReplyVO.setPage_board_no(Integer.parseInt(request.getParameter("page_board_no")));
		
		return groupReplyDao.insertGroupReply(groupReplyVO);
		
	}
}
