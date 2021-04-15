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
	 
		
		System.out.println("테:" + request.getParameter("studygroup_no")); 
		int studygroup_no = Integer.parseInt(request.getParameter("studygroup_no"));
		GroupPageService service = GroupPageService.getInstance();
		service.insertBoard(request);


		 
		forward.setRedirect(true);
		
		forward.setPath("groupBoardList.do?studygroup_no="+studygroup_no);

		return forward;
	}

}

