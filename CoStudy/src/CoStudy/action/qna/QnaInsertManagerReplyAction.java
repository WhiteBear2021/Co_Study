package CoStudy.action.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.service.QnaService;

public class QnaInsertManagerReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward actionForward=new ActionForward();
		QnaService service=QnaService.getInstance();
		
		service.QnaInsertManagerReplyService(request);

		int qna_no=Integer.parseInt(request.getParameter("qna_no"));
		request.setAttribute("qna_no", qna_no);
		System.out.println(Integer.parseInt(request.getParameter("qna_no")));
		
		actionForward.setRedirect(false);
		actionForward.setPath("QnaDetailAction.do");
		
		return actionForward;
	}

}
