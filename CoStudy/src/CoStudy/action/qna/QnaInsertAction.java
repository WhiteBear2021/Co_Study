package CoStudy.action.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.QnaVO;
import CoStudy.domain.UserVO;
import CoStudy.service.QnaService;

public class QnaInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		HttpSession session=request.getSession();
		forward.setRedirect(true);
		forward.setPath("QnaInfoAction.do");
		
		UserVO user=(UserVO)session.getAttribute("user");
		
		QnaService service=QnaService.getInstance();
		String qna_no = request.getParameter("qna_no");
		String qna_title = request.getParameter("qna_title");
		String qna_content = request.getParameter("qna_content");
		
		QnaVO qna = new QnaVO();
		
		
		
		
		service.QnaUserInsertService(request);
		
		
		return forward;
	}

}
