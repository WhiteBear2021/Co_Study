package CoStudy.action.manageUser;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.UserVO;
import CoStudy.service.ManageUserService;

public class NewUserAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ManageUserService service = ManageUserService.getInstance();
		List<UserVO> list = service.newUserService(request);
		request.setAttribute("newUserList", list);
		
		forward.setRedirect(false);
		forward.setPath("../view/manager/newUserList.jsp");
		return forward;
	}

}
