package CoStudy.action.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.service.UserService;

public class SignUpFormAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward = new ActionForward();
		UserService service = UserService.getInstance();
		forward.setRedirect(false);
		forward.setPath("/view/user/signUpform.jsp");
		return forward;
	}

}
