package CoStudy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.GroupReplyVO;
import CoStudy.domain.NoticeVO;
import CoStudy.mapper.GroupReplyMapper;
import CoStudy.mapper.NoticeMapper;

public class GroupReplyDao {
	private static GroupReplyDao groupReplyDao=new GroupReplyDao();
	
	public static GroupReplyDao getInstance() {
		return groupReplyDao;
	}
	
	public List<GroupReplyVO> listGroupReply(){
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<GroupReplyVO> list=null;
		try {
			list = sqlSession.getMapper(GroupReplyMapper.class).listGroupReply();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;		
	}
	public int insertGroupReply(GroupReplyVO groupReplyVO) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(GroupReplyMapper.class).insertGroupReply(groupReplyVO);
			if (re > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
				System.out.println("오류");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (sqlSession!=null) {
				sqlSession.close();
			}
		}
		return re;
	}
	
}
