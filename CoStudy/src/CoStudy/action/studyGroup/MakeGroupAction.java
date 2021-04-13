package CoStudy.action.studyGroup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.StudyGroupVO;
import CoStudy.service.StudyGroupService;

public class MakeGroupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		forward.setPath("studyGroupListAction.do");
		forward.setRedirect(false);
		StudyGroupService service=StudyGroupService.getInstance();
		String studygroup_name=request.getParameter("studygroup_name");
		String studygroup_info=request.getParameter("studygroup_info");
		String studygroup_location=request.getParameter("studygroup_location");
		String isface=request.getParameter("isface");
		int user_no=Integer.parseInt(request.getParameter("user_no"));
		StudyGroupVO studyGroup=new StudyGroupVO();
		studyGroup.setStudygroup_name(studygroup_name);
		studyGroup.setStudygroup_info(studygroup_info);
		studyGroup.setStudygroup_location(studygroup_location);
		studyGroup.setIsface(isface);		
		studyGroup.setUser_no(user_no);
		System.out.println(studyGroup);
		service.insertStudyGroup(studyGroup);
		return forward;
	}

}
