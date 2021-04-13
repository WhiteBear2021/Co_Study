package CoStudy.action.studyGroup;
//package CoStudy.action.groupList;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import CoStudy.action.Action;
//import CoStudy.action.ActionForward;
//import kosta.service.BoardService;
//
//public class groupListInsertAction implements Action {
//
//   @Override
//   public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
//      ActionForward forward = new ActionForward();
//      BoardService service = BoardService.getInstance();
//      
//      service.insertBoardService(request);
//            
//      forward.setRedirect(true);
//      forward.setPath("groupListAction.do");
//      
//      return forward;
//   }
//
//}
