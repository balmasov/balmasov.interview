package balmasov.com.interview.repository;

import balmasov.com.interview.entity.postgres.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdressRepository extends JpaRepository<Adress, Long> {

    @Query(value = "SELECT DISTINCT address FROM test.addresses address " +
            "WHERE address.user_id like (:userLogins)",
    nativeQuery = true)
    List<?> findUserByLogin(@Param("userLogins") List<String> userLogins);

}
