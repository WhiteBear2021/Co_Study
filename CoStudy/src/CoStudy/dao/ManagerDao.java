package CoStudy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.LoginVO;
import CoStudy.domain.ManagerVO;
import CoStudy.mapper.ManagerMapper;

public class ManagerDao {
	private static ManagerDao mg_dao = new ManagerDao();
	
	public static ManagerDao getInstance() {
		return mg_dao;
	}
	
	public int insertManager(ManagerVO manager) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(ManagerMapper.class).insertManager(manager);
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
	
	public ManagerVO login(LoginVO login) throws Exception {

		SqlSession sqlSession = MySqlSessionFactory.getSession();
		return sqlSession.getMapper(ManagerMapper.class).managerLogin(login);

	}
	
	public List<ManagerVO> managerList() {

		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<ManagerVO> list = null;
		try {
			list = sqlSession.getMapper(ManagerMapper.class).managerList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}

		return list;
	}
	
	public int deleteManager(int manager_no) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		
		try {
			re = sqlSession.getMapper(ManagerMapper.class).deleteManager(manager_no);
			if (re > 0) {
				sqlSession.commit(); 
			} else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession!=null) {
				sqlSession.close();
			}
		}
		return re;
	}
	
}
