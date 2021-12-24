package balmasov.com.interview.entity.postgres;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Accessors(chain = true)
@ToString(exclude = "user")
@EqualsAndHashCode(exclude = "user")
@Table(name = "addresses", schema = "test")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "building_number")
    private Integer buildingNumber;

    @Column(name = "structure")
    private Integer structure;

    @Column(name = "zip_code")
    private Integer zipCode;

    @Column(name = "entrance_number")
    private Integer entranceNumber;

    @Column(name = "flour")
    private Integer flour;

    @Column(name = "suite")
    private Integer suite;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
