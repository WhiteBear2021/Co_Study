package CoStudy.dao;

import java.util.List;

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
		}finally {
			try {
				if(sqlSession!=null)sqlSession.close();
			} catch (Exception e2) {
				e2.printStackTrace();
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
	
public List<UserVO> userInfo() {
		
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<UserVO> list = null;
		try {
			list = sqlSession.getMapper(UserMapper.class).userInfo();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null)
				sqlSession.close();
		}
	
		return list;
	}//userInfo 함수 끝
}
