package CoStudy.action.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;

public class MyPageAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		HttpSession session=request.getSession();
		if(session.getAttribute("user")!=null) {
			forward.setPath("../view/myPage/userProfile.jsp");
			forward.setRedirect(true);
		}else {
			forward.setPath("../view/user/loginForm.jsp");
			forward.setRedirect(true);
		}
		return forward;
	}

}
