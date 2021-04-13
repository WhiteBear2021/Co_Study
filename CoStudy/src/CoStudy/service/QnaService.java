package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import CoStudy.dao.QnaDao;
import CoStudy.domain.QnaPageVo;
import CoStudy.domain.QnaVO;

public class QnaService {
	private static QnaService qnaService=new QnaService();
	private static QnaDao qnaDao;
	private static final int PAGE_SIZE = 5;
	
	public static QnaService getInstance() {
		qnaDao=qnaDao.getInstance();
		
		return qnaService;
	}
	public QnaPageVo QnaInfoService(HttpServletRequest request) throws Exception{
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
		int qna_no=Integer.parseInt(request.getParameter("qna_no"));
		request.setAttribute("qna_number", qna_no);
		
		List<QnaVO> list=qnaDao.QnaDetail(qna_no);
		
		
		return list;
	}
	public int QnaUserInsertService(HttpServletRequest request) throws Exception{
		QnaVO qna=new QnaVO();
		qna.setQna_title(request.getParameter("qna_title"));
		qna.setQna_content(request.getParameter("qna_content"));
		
		System.out.println(request.getParameter("qna_title"));
		System.out.println(request.getParameter("qna_content"));
		return qnaDao.QnaUserInsert(qna);
		
	}
	public int QnaInsertManagerReplyService(HttpServletRequest request) throws Exception{
		QnaVO qna=new QnaVO();
		qna.setQna_title(request.getParameter("qna_title"));
		qna.setQna_content(request.getParameter("qna_content"));
		qna.setParentNo(Integer.parseInt(request.getParameter("qna_no")));
		
		System.out.println("qna_no:"+Integer.parseInt(request.getParameter("qna_no")));
		System.out.println("제목:"+request.getParameter("qna_title"));
		return qnaDao.QnaInsertManagerReply(qna);
		
	}
	
	public int QnaInsertUserReplyService(HttpServletRequest request) throws Exception{
		QnaVO qna=new QnaVO();
		qna.setQna_title(request.getParameter("qna_title"));
		qna.setQna_content(request.getParameter("qna_content"));
		qna.setParentNo(Integer.parseInt(request.getParameter("qna_no")));
		
		return qnaDao.QnaInsertUserReply(qna);
		
	}
}
