package CoStudy.action.group;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;

public class GroupWritingFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/view/group/groupMain.jsp");
		
		return forward;
	}

}
