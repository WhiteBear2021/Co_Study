package CoStudy.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.UserVO;
import CoStudy.mapper.myPageMapper;

public class MyPageDao {
	private static MyPageDao myDao=new MyPageDao();
	
	public static MyPageDao getInstance() {
		return myDao;
	}
	
	public int updateUser(UserVO user) {
		int re=-1;
		SqlSession sqlSession=MySqlSessionFactory.getSession();
		try {
			re=sqlSession.getMapper(myPageMapper.class).updateUser(user);
			if(re==-1) {
				sqlSession.rollback();
			}else {
				sqlSession.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return re;
	}
}
