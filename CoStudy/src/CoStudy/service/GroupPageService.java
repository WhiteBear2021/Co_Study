package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Group;

import CoStudy.dao.GroupPageDao;
import CoStudy.domain.GroupPageBoardVO;


public class GroupPageService {
	private static GroupPageService gpService=new GroupPageService();
	private static GroupPageDao gpDao;
	
	public static GroupPageService getInstance() {
		gpDao=GroupPageDao.getInstance();
		return gpService;
	}
	
	public int insertBoard(GroupPageBoardVO groupPageBoardVO) {
	
		return gpDao.insertBoard(groupPageBoardVO);
	}
	
	public List<GroupPageBoardVO> groupBoardService(HttpServletRequest request) throws Exception {
		/* int studyGroup_no=Integer.parseInt(request.getParameter("studyGroup_no")); */
		int studyGroup_no=1;
		System.out.println("studyGroup_no:"+studyGroup_no);
		return gpDao.selectGroupBoard(studyGroup_no);
		
	}
	
}
