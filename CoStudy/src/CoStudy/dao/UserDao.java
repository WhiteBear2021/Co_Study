package CoStudy.dao;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.UserVO;
import CoStudy.mapper.UserMapper;

public class UserDao {
	
	public static UserDao u_dao=new UserDao();
	
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
	}//selectMember() 끝
}
