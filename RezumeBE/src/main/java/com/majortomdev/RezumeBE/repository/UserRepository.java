package com.majortomdev.RezumeBE.repository;

import com.majortomdev.RezumeBE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
