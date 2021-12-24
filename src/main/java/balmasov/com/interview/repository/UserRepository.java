package balmasov.com.interview.repository;

import balmasov.com.interview.entity.postgres.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT user " +
            "FROM User user " +
            "WHERE user.login IN (:login)")
    List<User> findUserByLogin(@Param("login") List<String> login);
}
