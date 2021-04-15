package CoStudy.action.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.NoticePageVO;
import CoStudy.domain.NoticeVO;
import CoStudy.service.NoticeService;

public class noticeUserListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward Forward=new ActionForward();
		NoticeService service=NoticeService.getInstance();
		
		NoticePageVO listPage=service.noticeInfoService(request);
		request.setAttribute("listPage", listPage);
		
		Forward.setRedirect(false);
		Forward.setPath("/view/notice/user_notice_list.jsp");
	
		return Forward;
	}

}
