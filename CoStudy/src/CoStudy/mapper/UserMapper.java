package CoStudy.mapper;

import java.util.List;

import CoStudy.domain.LoginVO;
import CoStudy.domain.UserVO;

public interface UserMapper {
	UserVO selectUser();
	int insertUser(UserVO user);
	List<UserVO> userInfo();
	UserVO login(LoginVO login);
}
