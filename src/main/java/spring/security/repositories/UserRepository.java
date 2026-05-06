package spring.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import spring.security.models.User;

public interface UserRepository extends JpaRepository<User,Long> {

    UserDetails findByLogin(String role);

}
