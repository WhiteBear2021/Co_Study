package CoStudy.action.studyGroup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.StudyGroupListVO;
import CoStudy.service.StudyGroupService;

public class StudyGroupListInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();	
		StudyGroupService service = StudyGroupService.getInstance();

		StudyGroupListVO listPage=service.studyGroupListInpo(request);
		request.setAttribute("listPage", listPage);
		
		forward.setPath("/view/studyGroup/studyGroupList.jsp");
		forward.setRedirect(false);
		
		return forward;
	}


}
