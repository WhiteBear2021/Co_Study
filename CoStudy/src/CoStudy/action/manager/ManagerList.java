package CoStudy.action.manager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.ManagerVO;
import CoStudy.service.ManagerService;

public class ManagerList implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward();
		ManagerService service = ManagerService.getInstance();
		List<ManagerVO> list= service.managerListService(request);
		request.setAttribute("managerList", list);
		
		forward.setRedirect(false);
		forward.setPath("../view/manager/ManagerList.jsp");
		return forward;
	}

}
