package CoStudy.action.group;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.GroupPageBoardVO;
import CoStudy.domain.GroupReplyVO;
import CoStudy.service.GroupPageService;
import CoStudy.service.GroupReplyService;

public class GroupBoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		GroupPageService service=GroupPageService.getInstance();
		
		List<GroupPageBoardVO> list=service.groupBoardService(request);
		request.setAttribute("list", list);
		request.setAttribute("studygroup_no", Integer.parseInt(request.getParameter("studygroup_no")));
		request.setAttribute("roomNo", request.getParameter("studygroup_no"));
		
		System.out.println("되낭:"+Integer.parseInt(request.getParameter("studygroup_no")));

		GroupReplyService replyService=GroupReplyService.getInstance();
		List<GroupReplyVO> relist=replyService.listGroupReply(request);
		
		request.setAttribute("relist", relist);
		
		
		forward.setPath("/view/group/groupMain.jsp");
		forward.setRedirect(false);

		return forward;
	}

}
