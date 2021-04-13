package CoStudy.action.studyGroup;
//package CoStudy.action.groupList;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.swing.ListModel;
//
//import CoStudy.action.Action;
//import CoStudy.action.ActionForward;
//
//public class groupListAction implements Action {
//
//   @Override
//   public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
//      ActionForward forward = new ActionForward();
//      BoardService service = BoardService.getInstance();
//      
//      ListModel listModel = service.listBoardService(request);
//      request.setAttribute("listModel", listModel);
//      
//      forward.setRedirect(false);
//      forward.setPath("/list.jsp");
//      
//      return forward;
//   }
//
//}