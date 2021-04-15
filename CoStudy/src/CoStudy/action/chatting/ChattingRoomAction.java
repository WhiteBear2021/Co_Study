package CoStudy.action.chatting;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.UserVO;
import CoStudy.service.UserService;

public class ChattingRoomAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession();
		String room = request.getParameter("roomNo");
		
		UserVO me = (UserVO) session.getAttribute("user");
		String myName = me.getUser_lastName() + me.getUser_firstName();

		forward.setRedirect(true);
		
		forward.setPath("http://localhost:3000?room="+room+"&myName="+myName);
		return forward;
	}

}
