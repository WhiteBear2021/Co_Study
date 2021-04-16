package CoStudy.action.myPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.UserVO;
import CoStudy.service.UserService;

public class ApplyQuitUserCheckAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		UserService service = UserService.getInstance();	     		
		UserVO user = service.login(request);
		
//		System.out.println(user);
		if(user!=null) {
			forward.setRedirect(true);
			forward.setPath("applyQuitUserFormAction.do");
			System.out.println("user의 비밀번호 확인 성공!");
		}else {
			forward.setRedirect(true);
			forward.setPath("applyQuitUserCheckFormAction.do");
			System.out.println("!!user의 비밀번호 확인 실패--");
		}
		return forward;
	}

}
