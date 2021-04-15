package CoStudy.action.group;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.ApplyGroupMemberVO;
import CoStudy.service.GroupPageService;

public class AcceptMemberAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		GroupPageService service = GroupPageService.getInstance();
		
		
		ApplyGroupMemberVO vo = new ApplyGroupMemberVO();
		vo.setStudyGroup_no(Integer.parseInt(request.getParameter("studyGroup_no")));
		vo.setUser_no(Integer.parseInt(request.getParameter("user_no")));
		vo.setIsAccept(request.getParameter("isAccept").charAt(0));
		
		int accept = service.acceptMemberService(vo);
		if(accept == 1) {
			 service.insertAcceptMemberService(vo);
		}
		
		forward.setPath("/view/group/groupMain.jsp");
		forward.setRedirect(false);

		return null;
	}

}
