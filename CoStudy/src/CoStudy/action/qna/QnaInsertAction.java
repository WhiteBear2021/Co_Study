package CoStudy.action.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.service.QnaService;

public class QnaInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward actionForward=new ActionForward();
		QnaService service=QnaService.getInstance();
		
		service.QnaUserInsertService(request);
		
		actionForward.setRedirect(true);
		actionForward.setPath("QnaInfoAction.do");
		return actionForward;
	}

}
