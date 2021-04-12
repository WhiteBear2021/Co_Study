package CoStudy.dao;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.StudyGroupVO;
import CoStudy.mapper.StudyGroupMapper;

public class StudyGroupDao {
	
	private static StudyGroupDao s_dao=new StudyGroupDao();
	
	public static StudyGroupDao getInstance() {
		return s_dao;
	}
	
	
	public StudyGroupVO selectStudyGroup() {
		StudyGroupVO studygroup=null;
		SqlSession sqlSession=MySqlSessionFactory.getSession();
		try {
			studygroup=sqlSession.getMapper(StudyGroupMapper.class).selectStudyGroup();
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
		return studygroup;
	}//selectMember() 끝
}
