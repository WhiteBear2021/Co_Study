package CoStudy.action.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.NoticeVO;
import CoStudy.service.NoticeService;

public class noticeDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward actionForward=new ActionForward();
		NoticeService service=NoticeService.getInstance();
		
		NoticeVO notice=service.noticeDetailService(request);
		request.setAttribute("notice", notice);
		actionForward.setRedirect(false);
		actionForward.setPath("/view/notice/manager_notice_detail.jsp");
		
		return actionForward;
	}

}
