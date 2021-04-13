package CoStudy.action.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.NoticePageVO;
import CoStudy.domain.NoticeVO;
import CoStudy.service.NoticeService;

public class noticeInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward actionForward=new ActionForward();
		NoticeService service=NoticeService.getInstance();
		
		NoticePageVO listPage=service.noticeInfoService(request);
		request.setAttribute("listPage", listPage);
		
		actionForward.setRedirect(false);
		actionForward.setPath("/view/notice/manager_notice_list.jsp");
	
		return actionForward;
	}

}
