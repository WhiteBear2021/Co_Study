package CoStudy.action.group;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.service.GroupReplyService;

public class insertGroupReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward actionForward = new ActionForward();
		GroupReplyService service = GroupReplyService.getInstance();
		service.insertGroupReplyService(request);
		int studyGroup_no = Integer.parseInt(request.getParameter("studyGroup_no"));
		System.out.println("ccc:" + studyGroup_no);
		actionForward.setRedirect(false);

		actionForward.setPath("groupBoardList.do?studygroup_no=" + studyGroup_no);

		return actionForward;
	}

}
