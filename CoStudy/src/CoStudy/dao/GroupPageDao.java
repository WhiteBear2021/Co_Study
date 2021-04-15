package CoStudy.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.GroupPageBoardVO;
import CoStudy.domain.QnaVO;
import CoStudy.mapper.GroupPageMapper;
import CoStudy.mapper.QnaMapper;



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
	
	public List<GroupPageBoardVO> selectGroupBoard(int studyGroup_no){
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<GroupPageBoardVO> list=null;
		try {
			list = sqlSession.getMapper(GroupPageMapper.class).selectGroupBoard(studyGroup_no);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;
	}
	
	public List<GroupPageBoardVO> groupAcceptUser(int user_no){
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<GroupPageBoardVO> list=null;
		try {
			list = sqlSession.getMapper(GroupPageMapper.class).groupAcceptUser(user_no);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;
	}
}
