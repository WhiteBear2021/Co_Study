package CoStudy.dao;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.ApplyGroupMemberVO;
import CoStudy.domain.GroupPageBoardVO;
import CoStudy.domain.GroupUserVO;
import CoStudy.mapper.GroupPageMapper;



public class GroupPageDao {
	private static GroupPageDao gpDao=new GroupPageDao();
	
	public static GroupPageDao getInstance() {
		return gpDao;
	}
			
	public int insertBoard(GroupPageBoardVO groupPageBoardVO) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(GroupPageMapper.class).insertGroupBoard(groupPageBoardVO);
			if (re > 0) {
				sqlSession.commit(); 
			} else {
				sqlSession.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return re;
	}
	

	public List<GroupPageBoardVO> selectGroupBoard(int studygroup_no){
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<GroupPageBoardVO> list=null;
		try {
			list = sqlSession.getMapper(GroupPageMapper.class).selectGroupBoard(studygroup_no);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;
	}
	

	public List<ApplyGroupMemberVO> selectApplyList(){
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<ApplyGroupMemberVO> list=null;
		try {
			list = sqlSession.getMapper(GroupPageMapper.class).selectApplyList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;
	}
	public int acceptMember(ApplyGroupMemberVO vo) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(GroupPageMapper.class).acceptMember(vo);
			if (re > 0) {
				sqlSession.commit(); 
			} else {
				sqlSession.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return re;
	}
	
	public int refuseMember(int user_no) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(GroupPageMapper.class).refuseMember(user_no);
			if (re > 0) {
				sqlSession.commit(); 
			} else {
				sqlSession.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return re;
	}
	public int insertAcceptMember(ApplyGroupMemberVO vo) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(GroupPageMapper.class).insertAcceptMember(vo);
			if (re > 0) {
				sqlSession.commit(); 
			} else {
				sqlSession.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return re;
	}
	

}
