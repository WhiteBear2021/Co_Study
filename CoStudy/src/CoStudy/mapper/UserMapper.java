package CoStudy.mapper;

import java.util.List;

import CoStudy.domain.UserVO;

public interface UserMapper {
	UserVO selectUser();
	int insertUser(UserVO user);
	List<UserVO> userInfo();
}
