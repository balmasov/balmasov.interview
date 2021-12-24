package balmasov.com.interview.web.controller;

import balmasov.com.interview.service.UserService;
import balmasov.com.interview.web.response.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

import static balmasov.com.interview.web.PathConstant.USERS_URL;
import static balmasov.com.interview.web.PathConstant.VER_1;

@RestController
@RequestMapping(value = VER_1 + USERS_URL, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponseDto> getUserByLogin(
            @RequestParam(value = "logins", required = false) List<@NotBlank String> logins) {
        return userService.findUsersByLogin(logins);
    }

    @PostMapping(value = "/adreses")
    public List<?> getUserAdreses() {
        return null;
    }
}
