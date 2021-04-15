package CoStudy.action.group;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoStudy.action.Action;
import CoStudy.action.ActionForward;
import CoStudy.domain.GroupPageBoardVO;
import CoStudy.service.GroupPageService;

public class GroupWritingAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward = new ActionForward();
	
		
		String page_board_content = request.getParameter("page_board_content");
		String page_board_writer = request.getParameter("page_board_writer");
		
		GroupPageBoardVO groupPageBoardVO = new GroupPageBoardVO();
		
		groupPageBoardVO.setPage_board_writer(page_board_writer);
		groupPageBoardVO.setPage_board_content(page_board_content);
		
		GroupPageService service = GroupPageService.getInstance();
		service.insertBoard(groupPageBoardVO);
		
		
		forward.setRedirect(false);
		forward.setPath("groupBoardList.do");
		return forward;
	}

}
