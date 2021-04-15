package CoStudy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import CoStudy.dao.ManagerDao;
import CoStudy.domain.LoginVO;
import CoStudy.domain.ManagerVO;

public class ManagerService {
	private static ManagerService mgservice = new ManagerService();
	private static ManagerDao mgdao;

	public static ManagerService getInstance() {
		mgdao = mgdao.getInstance();
		return mgservice;
	}

	public int addManagerService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		ManagerVO manager = new ManagerVO();

		manager.setManager_id(request.getParameter("manager_id"));
		manager.setManager_pw(request.getParameter("manager_pw"));

		return mgdao.insertManager(manager);
	}

	public ManagerVO login(HttpServletRequest request) throws Exception {

		LoginVO login = new LoginVO();

		login.setUserId(request.getParameter("userId"));
		login.setUserPw(request.getParameter("userPw"));
		return mgdao.login(login);
	}

	public List<ManagerVO> managerListService(HttpServletRequest request) throws Exception {
		return mgdao.managerList();
	}

	public int deleteManagerService(int manager_no) throws Exception {
		return mgdao.deleteManager(manager_no);
	}

}
