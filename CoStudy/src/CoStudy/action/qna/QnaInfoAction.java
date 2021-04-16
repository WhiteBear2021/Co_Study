package CoStudy.action.qna;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.QnaPageVo;
import CoStudy.domain.QnaVO;
import CoStudy.service.QnaService;

public class QnaInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward actionForward=new ActionForward();
		QnaService service=QnaService.getInstance();
		
		QnaPageVo qnaPage= service.QnaInfoService(request);
		request.setAttribute("qnaPage", qnaPage);
		
		actionForward.setRedirect(false);
		actionForward.setPath("/view/qna/manager_qna_list.jsp");
		
		return actionForward;
	}

}
