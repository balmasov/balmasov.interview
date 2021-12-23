package balmasov.com.interview.web.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserResponseDto {

    private String login;
    private String fullName;
    private String phone;
    private String email;

}
