package CoStudy.action.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.LoginVO;
import CoStudy.domain.UserVO;
import CoStudy.service.UserService;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		UserService service = UserService.getInstance();	     
		forward.setRedirect(true);
		forward.setPath("../manageUser/userInfo");
		UserVO user = service.login(request);
		System.out.println(user);
		return forward;
	}

}
