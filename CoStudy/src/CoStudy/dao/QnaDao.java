package CoStudy.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import CoStudy.config.MySqlSessionFactory;
import CoStudy.domain.NoticeVO;
import CoStudy.domain.QnaVO;
import CoStudy.mapper.NoticeMapper;
import CoStudy.mapper.QnaMapper;

public class QnaDao {
	private static QnaDao qnaDao = new QnaDao();

	public static QnaDao getInstance() {
		return qnaDao;
	}

	public List<QnaVO> QnaInfo(int startRow) {
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<QnaVO> list = null;
		try {
			list = sqlSession.getMapper(QnaMapper.class).QnaInfo(new RowBounds(startRow,5));
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

	public List<QnaVO> QnaDetail(int qna_no) {
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		List<QnaVO> list = null;
		try {
			list = sqlSession.getMapper(QnaMapper.class).QnaDetail(qna_no);
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

	public int QnaUserInsert(QnaVO qna) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(QnaMapper.class).QnaUserInsert(qna);
			if (re > 0) {
				sqlSession.commit();
				System.out.println("commit됨");
			} else {
				sqlSession.rollback();
				System.out.println("오류");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return re;
	}

	public int QnaInsertManagerReply(QnaVO qna) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(QnaMapper.class).QnaInsertManagerReply(qna);
			if (re > 0) {
				sqlSession.commit();
				System.out.println("commit됨");
			} else {
				sqlSession.rollback();
				System.out.println("오류");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return re;
	}

	public int QnaInsertUserReply(QnaVO qna) {
		int re = -1;
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		try {
			re = sqlSession.getMapper(QnaMapper.class).QnaInsertUserReply(qna);
			if (re > 0) {
				sqlSession.commit();
				System.out.println("commit됨");
			} else {
				sqlSession.rollback();
				System.out.println("오류");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return re;
	}

	public int countQna() {
		SqlSession sqlSession = MySqlSessionFactory.getSession();
		int re = 0;
		try {
			re = sqlSession.getMapper(QnaMapper.class).countQna();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return re;

	}

}
