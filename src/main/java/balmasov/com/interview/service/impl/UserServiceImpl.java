package balmasov.com.interview.service.impl;

import balmasov.com.interview.entity.postgres.User;
import balmasov.com.interview.repository.UserRepository;
import balmasov.com.interview.service.UserService;
import balmasov.com.interview.web.response.UserResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    @Override
    public List<UserResponseDto> findUsersByLogin(List<String> logins) {
        log.info("Search users by logins: {}", logins);
        List<User> userByLogin = userRepo.findUserByLogin(logins);

        log.debug("FOUND USERS: {} \n BY LOGINS: {}", userByLogin, logins);

        return userByLogin.stream()
                .map(user -> new UserResponseDto()
                        .setLogin(user.getLogin())
                        .setEmail(user.getEmail())
                        .setFullName(user.getFullName())
                        .setPhone(user.getPhoneNumber()))
                .collect(Collectors.toList());
    }
}
