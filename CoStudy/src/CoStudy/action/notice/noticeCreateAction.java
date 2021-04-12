package CoStudy.action.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.service.NoticeService;

public class noticeCreateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward actionForward=new ActionForward();
		NoticeService service=NoticeService.getInstance();
		
		service.noticeCreateService(request);
		actionForward.setRedirect(true);
		actionForward.setPath("noticeInfoAction.do");
		return actionForward;
	}

}
