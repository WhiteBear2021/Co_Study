package CoStudy.action.studyGroup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.StudyGroupVO;
import CoStudy.service.StudyGroupService;

public class StudyGroupDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		HttpSession session=request.getSession();
	
		
		StudyGroupService service=StudyGroupService.getInstance();
		int studygroup_no = Integer.parseInt(request.getParameter("studygroup_no"));
		System.out.println("studygroup번호: " + studygroup_no);
		StudyGroupVO studyGroupDetail = service.studyGroupDetail(studygroup_no);
		request.setAttribute("studyGroupDetail", studyGroupDetail);
		session.setAttribute("studyGroup", studyGroupDetail);
		
		forward.setPath("/view/studyGroup/studyGroupDetail.jsp");
		forward.setRedirect(false);
		

		System.out.println("user session"+session.getAttribute("user"));
		
		return forward;
		
		
		
	}

}
