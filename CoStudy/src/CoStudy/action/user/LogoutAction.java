package CoStudy.action.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.UserVO;

public class LogoutAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		HttpSession session = request.getSession();
		UserVO user=(UserVO)session.getAttribute("user");
		System.out.println(user);
	    session.removeAttribute("user");
		session.invalidate();

		forward.setRedirect(true);
		forward.setPath("/CoStudy/main/mainPage.do");
		return forward;
	}

}
