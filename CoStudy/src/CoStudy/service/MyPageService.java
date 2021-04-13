package CoStudy.service;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import CoStudy.dao.MyPageDao;
import CoStudy.dao.UserDao;
import CoStudy.domain.StudyNoteVO;
import CoStudy.domain.UserVO;

public class MyPageService {
	private static MyPageService myService=new MyPageService();
	private static MyPageDao myDao;
	public static MyPageService getInstance() {
		myDao=MyPageDao.getInstance();
		return myService;
	}
	
	public int updateUser(UserVO user) {
		return myDao.updateUser(user);
	}
	
	public int writeStudyDiary(StudyNoteVO diary) {
		return myDao.writeStudyDiary(diary);
	}
	
	public List<StudyNoteVO> studyDiaryList(int user_no){
		return myDao.studyDiaryList(user_no);		
	}
}
