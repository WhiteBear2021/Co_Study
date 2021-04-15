package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import CoStudy.dao.NoticeDao;
import CoStudy.domain.ManagerVO;
import CoStudy.domain.NoticePageVO;
import CoStudy.domain.NoticeVO;

public class NoticeService {
	private static NoticeService noticeService = new NoticeService();
	private static NoticeDao noticeDao;
	private static final int PAGE_SIZE = 5;
	
	public static NoticeService getInstance() {
		noticeDao = noticeDao.getInstance();

		return noticeService;
	}

	public NoticePageVO noticeInfoService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		//총 글갯수
		int totalCount=noticeDao.countNotice();
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
		
		List<NoticeVO> list = noticeDao.noticeInfo(startRow);
		
		NoticePageVO listPage=
				new NoticePageVO(list, requestPage, totalPageCount, startPage, endPage);
		
		return listPage;
	}

	public int noticeCreateService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		NoticeVO notice = new NoticeVO();
		notice.setNotice_title(request.getParameter("notice_title"));
		notice.setNotice_content(request.getParameter("notice_content"));

		HttpSession session=request.getSession();
		ManagerVO manager=(ManagerVO) session.getAttribute("manager");
		System.out.println("manager:"+manager);
		notice.setManager_no(manager.getManager_no());
		

		return noticeDao.noticeCreate(notice);
	}
	public NoticeVO noticeDetailService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		int notice_no=Integer.parseInt(request.getParameter("notice_no"));
		NoticeVO notice=noticeDao.noticeDetail(notice_no);
		
		return notice;
		
	}
	public int noticeUpdateService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		NoticeVO notice=new NoticeVO();
		notice.setNotice_no(Integer.parseInt(request.getParameter("notice_no")));
		notice.setNotice_title(request.getParameter("notice_title"));
		notice.setNotice_content(request.getParameter("notice_content"));
		
		return noticeDao.noticeUpdate(notice);
	}
	
	public int noticeDeleteService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		int notice_no=Integer.parseInt(request.getParameter("notice_no"));
		System.out.println(Integer.parseInt(request.getParameter("notice_no")));
		return noticeDao.noticeDelete(notice_no);
	}

}
