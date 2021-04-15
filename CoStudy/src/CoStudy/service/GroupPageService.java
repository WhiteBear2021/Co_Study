package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;




import CoStudy.dao.GroupPageDao;
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
		/* int studyGroup_no=Integer.parseInt(request.getParameter("studyGroup_no")); */
		/*
		 * int studyGroup_no=1; System.out.println("studyGroup_no:"+studyGroup_no);
		 */
		int studygroup_no=Integer.parseInt(request.getParameter("studygroup_no"));
		
		System.out.println("스터디그룹번호:"+studygroup_no);
		return gpDao.selectGroupBoard(studygroup_no);
	}
}
