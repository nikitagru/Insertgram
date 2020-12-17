package com.nikitagru.insertgram.repos;

import com.nikitagru.insertgram.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
