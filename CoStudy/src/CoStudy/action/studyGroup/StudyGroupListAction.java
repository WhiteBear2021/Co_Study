package CoStudy.action.studyGroup;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.StudyGroupListVO;
import CoStudy.domain.StudyGroupVO;
import CoStudy.service.StudyGroupService;

public class StudyGroupListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		forward.setPath("/view/studyGroup/studyGroupList.jsp");
		forward.setRedirect(false);
		
		StudyGroupService service = StudyGroupService.getInstance();

		StudyGroupListVO listPage=service.studyGroupListInpo(request);
		request.setAttribute("listPage", listPage);
		
		return forward;
	}


}
