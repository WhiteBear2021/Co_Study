package CoStudy.action.studyGroup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.ApplyGroupMemberVO;
import CoStudy.domain.StudyGroupVO;
import CoStudy.domain.UserVO;
import CoStudy.service.StudyGroupService;

public class ApplyStudyGroupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		HttpSession session=request.getSession();
		
		UserVO user=(UserVO)session.getAttribute("user");
		StudyGroupVO studyGroup=(StudyGroupVO)session.getAttribute("studyGroup");
		
		if(session.getAttribute("user")!=null) {
			StudyGroupService service=StudyGroupService.getInstance();
			ApplyGroupMemberVO applyStudyGroup =new ApplyGroupMemberVO();
			applyStudyGroup.setUser_no(user.getUser_no());
			applyStudyGroup.setStudyGroup_no(studyGroup.getStudygroup_no());
			service.insertApplyGroupStudy(applyStudyGroup);
			forward.setPath("studyGroupListInfoAction.do");
			forward.setRedirect(false);
		}else {
			forward.setPath("/CoStudy/user/login.do");
			forward.setRedirect(true);
		}
		
		
		return forward;
	}

}