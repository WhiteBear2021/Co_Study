package CoStudy.mapper;

import java.util.List;

import CoStudy.domain.ManagerVO;

public interface ManagerMapper {
	int insertManager(ManagerVO manager);
	List<ManagerVO> managerList();
}
