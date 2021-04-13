package CoStudy.action.qna;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.QnaVO;
import CoStudy.service.QnaService;

public class QnaDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward actionForward=new ActionForward();
		QnaService service=QnaService.getInstance();
		
		List<QnaVO> list=service.QnaDetailService(request);
		request.setAttribute("qnalist", list);
		
		actionForward.setRedirect(false);
		actionForward.setPath("/view/qna/manager_qna_detail.jsp");
		return actionForward;
	}

}
