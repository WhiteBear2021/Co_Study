package CoStudy.action.manager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.service.ManagerService;

public class DeleteManagerAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ManagerService service = ManagerService.getInstance();
		int manager_no= Integer.parseInt(request.getParameter("manager_no"));
		System.out.println("삭제할 seq: "+manager_no);
		service.deleteManagerService(manager_no);
		forward.setRedirect(false);
		forward.setPath("managerList.do");
		
		return forward;
	}
}
