package CoStudy.service;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.dao.GroupPageDao;
import CoStudy.domain.GroupPageBoardVO;
import CoStudy.mapper.GroupPageMapper;

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
	
}
