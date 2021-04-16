package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import CoStudy.dao.QnaDao;
import CoStudy.domain.ManagerVO;
import CoStudy.domain.QnaPageVo;
import CoStudy.domain.QnaVO;
import CoStudy.domain.UserVO;

public class QnaService {
	private static QnaService qnaService=new QnaService();
	private static QnaDao qnaDao;
	private static final int PAGE_SIZE = 5;
	
	public static QnaService getInstance() {
		qnaDao=qnaDao.getInstance();
		
		return qnaService;
	}
	public QnaPageVo QnaInfoService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		int totalCount=qnaDao.countQna();
		//총 페이지 수
		int totalPageCount=totalCount/PAGE_SIZE;
		if (totalPageCount%PAGE_SIZE>0) {
			totalPageCount++;
		}
		//현재 페이지
		String pageNum=request.getParameter("pageNum");
		if (pageNum==null) {
			pageNum="1";
		}
		//현제페이지(숫자)
		int requestPage=Integer.parseInt(pageNum);
		//startpage
		int startPage=requestPage-(requestPage-1)%3;
		//endPage
		int endPage=startPage+2;
		if (endPage>totalPageCount) {
			endPage=totalPageCount;
		}
		//
		int startRow=(requestPage-1)*PAGE_SIZE;
		
		List<QnaVO> list=qnaDao.QnaInfo(startRow);
		
		QnaPageVo qnaPage=new QnaPageVo(list, requestPage, totalPageCount, startPage, endPage);
		
		return qnaPage;
	}
	
	public List<QnaVO> QnaDetailService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		int qna_no=Integer.parseInt(request.getParameter("qna_no"));
		request.setAttribute("qna_number", qna_no);
		
		List<QnaVO> list=qnaDao.QnaDetail(qna_no);
		
		
		return list;
	}
	public int QnaUserInsertService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		QnaVO qna=new QnaVO();
		qna.setQna_title(request.getParameter("qna_title"));
		qna.setQna_content(request.getParameter("qna_content"));
//		HttpSession session=request.getSession();
//		ManagerVO manager=(ManagerVO) session.getAttribute("manager");
//		qna.setManager_no(manager.getManager_no());
//		UserVO user = (UserVO) session.getAttribute("use");
//		qna.setUser_no(user.getUser_no());
		return qnaDao.QnaUserInsert(qna);
		
	}
	public int QnaInsertManagerReplyService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		QnaVO qna=new QnaVO();
		qna.setQna_title(request.getParameter("qna_title"));
		qna.setQna_content(request.getParameter("qna_content"));
		qna.setParentNo(Integer.parseInt(request.getParameter("qna_no")));
		
		HttpSession session=request.getSession();
		ManagerVO manager=(ManagerVO) session.getAttribute("manager");
		qna.setManager_no(manager.getManager_no());
		return qnaDao.QnaInsertManagerReply(qna);
		
	}
	
	public int QnaInsertUserReplyService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		QnaVO qna=new QnaVO();
		qna.setQna_title(request.getParameter("qna_title"));
		qna.setQna_content(request.getParameter("qna_content"));
		qna.setParentNo(Integer.parseInt(request.getParameter("qna_no")));
		
		return qnaDao.QnaInsertUserReply(qna);
		
	}
}
