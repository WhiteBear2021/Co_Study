package CoStudy.action.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;

public class noticeAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward actionForward=new ActionForward();
		actionForward.setRedirect(false);
		actionForward.setPath("/notice/manager_notice_form.jsp");
		return actionForward;
	}

}
