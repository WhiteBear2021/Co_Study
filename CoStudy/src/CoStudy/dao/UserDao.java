package CoStudy.dao;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.UserVO;
import CoStudy.mapper.UserMapper;

public class UserDao {
	
	private static UserDao u_dao=new UserDao();
	
	public static UserDao getInstance() {
		return u_dao;
	}
	
	
	public UserVO selectUser() {
		UserVO user=null;
		SqlSession sqlSession=MySqlSessionFactory.getSession();
		try {
			user=sqlSession.getMapper(UserMapper.class).selectUser();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				if(sqlSession!=null)sqlSession.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		return user;
	}//selectUser() 끝
	
	public int insertUser(UserVO user) {
		
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(UserMapper.class).insertUser(user);
			if(re>0) {
				sqlSession.commit(); //이거 해줘야 insert됨...
			}else {
				sqlSession.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null)
				sqlSession.close();
		}
		return re;
		
	}//insertUser함수 끝
}
