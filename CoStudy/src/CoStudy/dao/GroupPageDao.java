package CoStudy.dao;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.GroupPageBoardVO;
import CoStudy.mapper.GroupPageMapper;
import CoStudy.mapper.UserMapper;

public class GroupPageDao {
	private static GroupPageDao gpDao=new GroupPageDao();
	
	public static GroupPageDao getInstance() {
		return gpDao;
	}
			
	public int insertBoard(GroupPageBoardVO groupPageBoardVO) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(GroupPageMapper.class).insertGroupBoard(groupPageBoardVO);
			if (re > 0) {
				sqlSession.commit(); 
			} else {
				sqlSession.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return re;
	}
}
