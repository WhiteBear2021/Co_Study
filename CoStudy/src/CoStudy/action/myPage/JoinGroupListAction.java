package CoStudy.action.myPage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.StudyGroupVO;
import CoStudy.domain.StudyNoteVO;
import CoStudy.domain.UserVO;
import CoStudy.service.MyPageService;

public class JoinGroupListAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/view/myPage/joinGroupList.jsp");
		
		HttpSession session=request.getSession();
		UserVO user=(UserVO) session.getAttribute("user");
		int user_no=user.getUser_no();
		System.out.println("study그룹조회 할 사용자 번호:"+user_no);
		
		MyPageService service=MyPageService.getInstance();
		
		List<StudyGroupVO> joinGroupList=null;
		System.out.println(joinGroupList);
		request.setAttribute("joinGroupList",joinGroupList);
		return forward;
		
	}
}
