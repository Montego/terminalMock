package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
    Optional<User> findByLoginAndActive(String username, Boolean active);

//    User findByActivationCode(String code);
}
