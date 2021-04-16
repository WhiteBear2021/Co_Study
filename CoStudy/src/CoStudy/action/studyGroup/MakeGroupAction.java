package CoStudy.action.studyGroup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.StudyGroupVO;
import CoStudy.domain.UserVO;
import CoStudy.service.StudyGroupService;

public class MakeGroupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		HttpSession session=request.getSession();
		forward.setPath("studyGroupListAction.do");
		forward.setRedirect(false);

		UserVO user=(UserVO)session.getAttribute("user");
		
		StudyGroupService service=StudyGroupService.getInstance();
		String studygroup_name=request.getParameter("studygroup_name");
		String studygroup_info=request.getParameter("studygroup_info");
		String studygroup_location=request.getParameter("studygroup_location");
		String isface=request.getParameter("isface");
		int max_user_number=Integer.parseInt(request.getParameter("max_user_number"));
		int category_no=Integer.parseInt(request.getParameter("studygroup_category"));
		
		
		
		StudyGroupVO studyGroup=new StudyGroupVO();
		studyGroup.setStudygroup_name(studygroup_name);
		studyGroup.setStudygroup_info(studygroup_info);
		studyGroup.setStudygroup_location(studygroup_location);
		studyGroup.setIsface(isface);
		studyGroup.setMax_user_number(max_user_number);
		studyGroup.setcategory_no(category_no);
		studyGroup.setUser_no(user.getUser_no());
		System.out.println(studyGroup);
		service.insertStudyGroup(studyGroup);
		return forward;
	}

}
