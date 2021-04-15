package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Group;

import CoStudy.dao.GroupPageDao;
import CoStudy.domain.ApplyGroupMemberVO;
import CoStudy.domain.GroupPageBoardVO;


public class GroupPageService {
	private static GroupPageService gpService=new GroupPageService();
	private static GroupPageDao gpDao;
	
	public static GroupPageService getInstance() {
		gpDao=GroupPageDao.getInstance();
		return gpService;
	}
	
	public int insertBoard(HttpServletRequest request) {
		String page_board_content = request.getParameter("page_board_content");
		GroupPageBoardVO groupPageBoardVO = new GroupPageBoardVO();
		groupPageBoardVO.setPage_board_content(page_board_content);
		System.out.println(page_board_content);
		return gpDao.insertBoard(groupPageBoardVO);
	}
	
	public List<GroupPageBoardVO> groupBoardService(HttpServletRequest request) throws Exception {
		
		int studygroup_no=Integer.parseInt(request.getParameter("studygroup_no"));
		
		System.out.println("스터디그룹번호:"+studygroup_no);
		return gpDao.selectGroupBoard(studygroup_no);
	}
	
	public List<ApplyGroupMemberVO> applyListService(HttpServletRequest request) throws Exception{
		return gpDao.selectApplyList();
	}
	
	public int acceptMemberService(ApplyGroupMemberVO vo) throws Exception {
		return gpDao.acceptMember(vo);
	}
	public int insertAcceptMemberService(ApplyGroupMemberVO vo) throws Exception {
		return gpDao.insertAcceptMember(vo);
	}
	public int refuseMemberService(int user_no) throws Exception {
		return gpDao.refuseMember(user_no);
	}

	
}


