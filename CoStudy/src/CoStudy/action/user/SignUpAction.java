package CoStudy.action.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.service.UserService;

/**
 * 회원가입 user 등록 
 * @author KOSTA
 *
 */
public class SignUpAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward();
		UserService service = UserService.getInstance();
		int re=service.insertUserService(request);
		System.out.println("insert 갯수:"+re);
		forward.setRedirect(true);
		forward.setPath("login");
		return forward;
	}

}
