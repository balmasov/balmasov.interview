package balmasov.com.interview.service;

import balmasov.com.interview.web.response.UserResponseDto;

import java.util.List;

public interface UserService {

    List<UserResponseDto> findUsersByLogin(List<String> logins);
}
