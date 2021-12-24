package balmasov.com.interview.entity.postgres;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Accessors(chain = true)
@ToString(exclude = "adresses")
@EqualsAndHashCode(exclude = "adresses")
@Table(name = "users", schema = "test")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<Adress> adresses;
}
