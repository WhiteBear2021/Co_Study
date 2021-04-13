package CoStudy.service;

import CoStudy.dao.ChattingDao;

public class ChattingService {
	private static ChattingService service=new ChattingService();
	private static ChattingDao dao;
	
	public static ChattingService getInstance() {
		dao = ChattingDao.getInstance();
		return service;
	}
	

}
