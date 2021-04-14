package CoStudy.action.chatting;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.UserVO;
import CoStudy.service.ManageUserService;
import CoStudy.service.UserService;

public class ChattingListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		ManageUserService userService = ManageUserService.getInstance();
		List<UserVO> list = userService.userInfoService(request);
		request.setAttribute("userList", list);

		forward.setRedirect(false);
		forward.setPath("/view/chatting/chattingList.jsp");
		return forward;
	}

}
