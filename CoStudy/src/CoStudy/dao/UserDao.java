package CoStudy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.LoginVO;
import CoStudy.domain.UserVO;
import CoStudy.mapper.UserMapper;

public class UserDao {

	private static UserDao u_dao = new UserDao();

	public static UserDao getInstance() {
		return u_dao;
	}

	public int insertUser(UserVO user) {

		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(UserMapper.class).insertUser(user);
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

	}// insertUser함수 끝

	public List<UserVO> userInfo() {

		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<UserVO> list = null;
		try {
			list = sqlSession.getMapper(UserMapper.class).userInfo();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}

		return list;
	}// userInfo 함수 끝
	
	public List<UserVO> newUserInfo() {

		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<UserVO> list = null;
		try {
			list = sqlSession.getMapper(UserMapper.class).newUserInfo();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}

		return list;
	}// userInfo 함수 끝

	public UserVO login(LoginVO login) throws Exception {

		SqlSession sqlSession = MySqlSessionFactory.getSession();
		return sqlSession.getMapper(UserMapper.class).login(login);

	}// login 함수 끝

	

}
