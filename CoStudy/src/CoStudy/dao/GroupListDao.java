package CoStudy.dao;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.GroupListVO;
import CoStudy.mapper.StudyGroupMapper;

public class GroupListDao {
	
	private static GroupListDao s_dao=new GroupListDao();
	
	public static GroupListDao getInstance() {
		return s_dao;
	}
	
	
	public GroupListVO selectStudyGroup() {
		GroupListVO grouplist=null;
		SqlSession sqlSession=MySqlSessionFactory.getSession();
		try {
			grouplist=sqlSession.getMapper(StudyGroupMapper.class).selectStudyGroup();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				if(sqlSession!=null)sqlSession.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		return grouplist;
	}//selectMember() 끝
}
