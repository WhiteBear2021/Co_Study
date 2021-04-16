package CoStudy.action.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.QnaPageVo;
import CoStudy.service.QnaService;

public class QnaUserListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		QnaService service = QnaService.getInstance();
		
		QnaPageVo qnaPage= service.QnaInfoService(request);
		request.setAttribute("qnaPage", qnaPage);
		
		forward.setRedirect(false);
		forward.setPath("/view/qna/list.jsp");
		
		return forward;
	}

}
