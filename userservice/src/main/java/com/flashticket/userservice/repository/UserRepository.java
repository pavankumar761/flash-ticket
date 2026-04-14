package com.flashticket.userservice.repository;

import com.flashticket.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author : Pavan Kumar
 * @created : 14/04/26, Tuesday
 */

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
