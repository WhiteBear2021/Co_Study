package CoStudy.mapper;

import java.util.List;

import CoStudy.domain.LoginVO;
import CoStudy.domain.ManagerVO;

public interface ManagerMapper {
	int insertManager(ManagerVO manager);
	List<ManagerVO> managerList();
	int deleteManager(int manager_no);
	ManagerVO managerLogin(LoginVO login);
}
