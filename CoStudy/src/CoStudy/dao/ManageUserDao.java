package CoStudy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.UserVO;
import CoStudy.mapper.UserMapper;

public class ManageUserDao {
	private static ManageUserDao m_dao= new ManageUserDao();
	
	public static ManageUserDao getInstance() {
		return m_dao;
	}
	
	/**
	* @Method Name : userInfo
	* @작성일 : 2021. 4. 13.
	* @작성자 : KOSTA
	* @변경이력 :
	* @Method 설명 : 사용자 정보 전체 출력
	* @return
	 */
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
	
	/**
	* @param dateString 
	 * @Method Name : newUserInfo
	* @작성일 : 2021. 4. 13.
	* @작성자 : KOSTA
	* @변경이력 :
	* @Method 설명 : 오늘 가입한 사용자 출력
	* @return
	 */
	public List<UserVO> newUserInfo(String dateString) {

		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<UserVO> list = null;
		try {
			list = sqlSession.getMapper(UserMapper.class).newUserInfo(dateString);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}

		return list;
	}// userInfo 함수 끝
}
