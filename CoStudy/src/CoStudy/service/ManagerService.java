package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import CoStudy.dao.ManagerDao;
import CoStudy.domain.ManagerVO;
import CoStudy.domain.UserVO;

public class ManagerService {
	private static ManagerService mgservice = new ManagerService();
	private static ManagerDao mgdao;
	
	public static ManagerService getInstance() {
		mgdao = mgdao.getInstance();
		return mgservice;
	}
	
	public int addManagerService(HttpServletRequest request) throws Exception{
		ManagerVO manager = new ManagerVO();
		
		manager.setManager_id("manager_id");
		manager.setManager_pw("manager_pw");
		
		return mgdao.insertManager(manager);
	}
	
	public List<ManagerVO> userInfoService(HttpServletRequest request) throws Exception {
		return mgdao.managerList();
	}
	

}
