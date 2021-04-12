package CoStudy.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.NoticeVO;
import CoStudy.mapper.NoticeMapper;

public class NoticeDao {
	private static NoticeDao noticeDao = new NoticeDao();

	public static NoticeDao getInstance() {
		return noticeDao;
	}

	public List<NoticeVO> noticeInfo(int startRow) {
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<NoticeVO> list = null;
		try {
			list = sqlSession.getMapper(NoticeMapper.class).noticeInfo(new RowBounds(startRow,5));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;

	}

	public int noticeCreate(NoticeVO notice) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(NoticeMapper.class).noticeCreate(notice);
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
	
	public int countNotice() {
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		int re=0;
		try {
			re=sqlSession.getMapper(NoticeMapper.class).countNotice();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return re;
	}
	public NoticeVO noticeDetail(int notice_no) {
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		NoticeVO notice=null;
		try {
			notice=sqlSession.getMapper(NoticeMapper.class).noticeDetail(notice_no);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return notice;
	}
	public int noticeUpdate(NoticeVO notice) {
		int re=-1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(NoticeMapper.class).noticeUpdate(notice);
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
	
	public int noticeDelete(int notice_no) {
		int re=-1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(NoticeMapper.class).noticeDelete(notice_no);
			if (re > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
				System.out.println("오류"+re);
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
