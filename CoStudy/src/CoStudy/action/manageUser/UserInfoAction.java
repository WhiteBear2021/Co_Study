package CoStudy.action.manageUser;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.UserVO;
import CoStudy.service.UserService;

/**
 * 모든 회원 보여주기 
 * @author KOSTA
 *
 */
public class UserInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		UserService service = UserService.getInstance();
		List<UserVO> list = service.userInfoService(request);
		request.setAttribute("userList", list);
		
		forward.setRedirect(false);
		forward.setPath("/userList.jsp");
		return forward;
	}

}
