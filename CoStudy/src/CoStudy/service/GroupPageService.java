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
	
	public int insertBoard(GroupPageBoardVO groupPageBoardVO) {
	
		return gpDao.insertBoard(groupPageBoardVO);
	}
	
	public List<GroupPageBoardVO> groupBoardService(HttpServletRequest request) throws Exception {
		return gpDao.groupBoardList();
	}
}
