package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import CoStudy.dao.StudyGroupDao;
import CoStudy.domain.ApplyGroupMemberVO;
import CoStudy.domain.StudyGroupListVO;
import CoStudy.domain.StudyGroupVO;

public class StudyGroupService {
   private static StudyGroupService sService=new StudyGroupService();
   private static StudyGroupDao sDao;
   private static final int PAGE_SIZE = 5;
   
   
   public static StudyGroupService getInstance() {
      sDao=sDao.getInstance();
      
      return sService;
   }
   
   public StudyGroupListVO studyGroupListInpo(HttpServletRequest request) throws Exception{
      //총 글갯수
            int totalCount=sDao.countstudyGroupList();
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
            
            List<StudyGroupVO> list = sDao.studyGroupListInfo(startRow);
            
            StudyGroupListVO listPage=
                  new StudyGroupListVO(list, requestPage, totalPageCount, startPage, endPage);
            
            return listPage;
   }
   
   public StudyGroupVO studyGroupDetail(int studygroup_no) {
      return sDao.studyGroupDetail(studygroup_no);
   }
   
   public int insertStudyGroup(StudyGroupVO studyGroup) {
      return sDao.insertStudyGroup(studyGroup);
   }
   
   public int insertApplyGroupStudy(ApplyGroupMemberVO ApplystudyGroup) {
      return sDao.insertApplyGroupStudy(ApplystudyGroup);
   }
   public int getGroupNo(String studygroup_name) {
      return sDao.getGroupNo(studygroup_name);
   }

}
