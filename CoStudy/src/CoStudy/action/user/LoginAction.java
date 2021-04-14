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
		HttpSession session = request.getSession();
		UserService service = UserService.getInstance();	     		
		UserVO user = service.login(request);
		session.setAttribute("user", user);
		System.out.println(user);
		if(user!=null) {
			forward.setRedirect(true);
			forward.setPath("/CoStudy/main/mainPage.do");
		}else {
			forward.setRedirect(true);
			forward.setPath("login.do");
		}

		return forward;
	}

}
