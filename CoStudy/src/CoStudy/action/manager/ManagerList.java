package CoStudy.action.manager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.service.ManagerService;

public class ManagerList implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward();
		forward.setRedirect(false);
		forward.setPath("../view/manager/ManagerList.jsp");
		return forward;
	}

}
