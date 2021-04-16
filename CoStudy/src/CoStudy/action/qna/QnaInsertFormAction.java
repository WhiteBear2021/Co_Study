package CoStudy.action.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;

public class QnaInsertFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		HttpSession session=request.getSession();
		if(session.getAttribute("user")!=null) {
			forward.setRedirect(false);
			forward.setPath("/view/qna/insert_form.jsp");
		}else {
			forward.setPath("/CoStudy/user/login.do");
			forward.setRedirect(true);
		}
		
		return forward;
	}

}
