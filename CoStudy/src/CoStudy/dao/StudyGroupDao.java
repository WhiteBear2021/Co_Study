package CoStudy.dao;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.StudyGroupVO;
import CoStudy.mapper.StudyGroupMapper;

public class StudyGroupDao {
	
	private static StudyGroupDao sDao=new StudyGroupDao();
	
	public static StudyGroupDao getInstance() {
		return sDao;
	}
	
	public int insertStudyGroup(StudyGroupVO studyGroup) {
		int re=-1;
		SqlSession sqlSession=MySqlSessionFactory.getSession();
		System.out.println("dao:"+studyGroup);
		try {
			re=sqlSession.getMapper(StudyGroupMapper.class).insertStudyGroup(studyGroup);
			
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
