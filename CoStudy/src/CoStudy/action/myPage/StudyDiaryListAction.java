package CoStudy.action.myPage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.StudyNoteVO;
import CoStudy.domain.UserVO;
import CoStudy.service.MyPageService;

public class StudyDiaryListAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		HttpSession session=request.getSession();

		if(session.getAttribute("user")!=null) {
			UserVO user=(UserVO) session.getAttribute("user");
			int user_no=user.getUser_no();
			System.out.println("조회할 다이어리 사용자 번호:"+user_no);
			
			MyPageService service=MyPageService.getInstance();
			
			List<StudyNoteVO> studyNoteList=service.studyDiaryList(user_no);
			System.out.println(studyNoteList);
			request.setAttribute("studyNoteList",studyNoteList);
			forward.setPath("/view/myPage/studyDiaryList.jsp");
			forward.setRedirect(false);
		}else {
			forward.setPath("/CoStudy/user/login.do");
			forward.setRedirect(true);
		}
		
		return forward;
		
	}
}
