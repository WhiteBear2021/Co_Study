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
		
		//UserVO me = (UserVO) session.getAttribute("user");
		//String myName = me.getUser_firstName()+me.getUser_lastName();
		//System.out.println(myName+"1111");
		forward.setRedirect(true);
		
		forward.setPath("http://localhost:3000?room="+room);
		return forward;
	}

}
