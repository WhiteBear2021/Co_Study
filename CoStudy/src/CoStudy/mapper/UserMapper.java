package CoStudy.mapper;

import CoStudy.domain.UserVO;

public interface UserMapper {
	UserVO selectUser();
	int insertUser(UserVO user);
}
