package com.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.user.service.entiries.User;

public interface UserRepository extends JpaRepository<User, String> {
}
