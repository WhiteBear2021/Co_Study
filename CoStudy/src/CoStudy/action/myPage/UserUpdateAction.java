package CoStudy.action.myPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.UserVO;
import CoStudy.service.MyPageService;

public class UserUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		int user_no=Integer.parseInt(request.getParameter("user_no"));
		String user_pw=request.getParameter("user_pw");
		String user_lastName=request.getParameter("user_lastName");
		String user_firstName=request.getParameter("user_firstName");
		String user_phoneNo=request.getParameter("user_phoneNo");
		String user_post=request.getParameter("user_post");
		String user_address1=request.getParameter("user_address1");
		String user_address2=request.getParameter("user_address2");
		String user_email=request.getParameter("user_email");
		HttpSession session=request.getSession();
		UserVO user=(UserVO)session.getAttribute("user");
		user.setUser_no(user_no);
		user.setUser_pw(user_pw);
		user.setUser_lastName(user_lastName);
		user.setUser_firstName(user_firstName);
		user.setUser_phoneNo(user_phoneNo);
		user.setUser_post(user_post);
		user.setUser_address1(user_address1);
		user.setUser_address2(user_address2);
		user.setUser_email(user_email);
		MyPageService service=MyPageService.getInstance();
		int re=service.updateUser(user);
		if(re>0) {
			session.setAttribute("user", user);
		}
		System.out.println("update 갯수:"+re);
		forward.setPath("/CoStudy/user/myPageAction.do");
		forward.setRedirect(true);
		return forward;

	}


}
