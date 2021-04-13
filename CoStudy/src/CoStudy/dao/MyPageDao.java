package CoStudy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.StudyGroupVO;
import CoStudy.domain.StudyNoteVO;
import CoStudy.domain.UserVO;
import CoStudy.mapper.MyPageMapper;

public class MyPageDao {
	private static MyPageDao myDao=new MyPageDao();
	
	public static MyPageDao getInstance() {
		return myDao;
	}
	
	public int updateUser(UserVO user) {
		int re=-1;
		SqlSession sqlSession=MySqlSessionFactory.getSession();
		try {
			re=sqlSession.getMapper(MyPageMapper.class).updateUser(user);
			if(re==-1) {
				sqlSession.rollback();
			}else {
				sqlSession.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
		return re;
	}
	
	public int writeStudyDiary(StudyNoteVO diary) {
		int re=-1;
		SqlSession sqlSession=MySqlSessionFactory.getSession();
		try {
			re=sqlSession.getMapper(MyPageMapper.class).writeStudyDiary(diary);
			if(re==-1) {
				sqlSession.rollback();
			}else {
				sqlSession.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
		return re;
	}
	
	public List<StudyNoteVO> studyDiaryList(int user_no){
		List<StudyNoteVO> studyNoteList=null;
		SqlSession sqlSession=MySqlSessionFactory.getSession();
		try {
			studyNoteList=sqlSession.getMapper(MyPageMapper.class).studyDiaryList(user_no);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
		return studyNoteList;
	}
	
	//참여중인 스터디 그룹 조회
	public List<StudyGroupVO> joinGroupList(int user_no){
		return null;
	}
}
