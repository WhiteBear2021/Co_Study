package CoStudy.action.group;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.ApplyGroupMemberVO;
import CoStudy.service.GroupPageService;

public class GroupAcceptUserAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		GroupPageService service = GroupPageService.getInstance();
		List<ApplyGroupMemberVO> list = service.applyListService(request);
		request.setAttribute("applyUserList", list);
		
		request.setAttribute("studygroup_no", Integer.parseInt(request.getParameter("studygroup_no")));
		forward.setRedirect(false);
		forward.setPath("/view/group/groupSetting.jsp");
		
		return forward;
	}

}
