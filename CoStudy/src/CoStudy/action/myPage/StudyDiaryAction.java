package CoStudy.action.myPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.StudyNoteVO;
import CoStudy.service.MyPageService;

public class StudyDiaryAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		String studyNote_keyword=request.getParameter("studyNote_keyword");
		String studyNote_content=request.getParameter("studyNote_content");
		String studyNote_file=request.getParameter("studyNote_file");
		int user_no=Integer.parseInt(request.getParameter("user_no"));
		StudyNoteVO diary=new StudyNoteVO();
		diary.setStudyNote_keyword(studyNote_keyword);
		diary.setStudyNote_content(studyNote_content);
		diary.setStudyNote_file(studyNote_file);
		diary.setUser_no(user_no);
		MyPageService service=MyPageService.getInstance();
		int re=service.writeStudyDiary(diary);
//		System.out.println(re);
		forward.setPath("studyDiaryListAction.do");
		forward.setRedirect(false);
		return forward;
		
	}
}
