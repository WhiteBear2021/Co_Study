package CoStudy.action.manager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.service.ManagerService;

public class AddManagerAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward();
		ManagerService service = ManagerService.getInstance();
		int re=service.addManagerService(request);
		System.out.println("insert 갯수:"+re);
		forward.setRedirect(false);
		forward.setPath("managerList.do");
		return forward;
	}

}
