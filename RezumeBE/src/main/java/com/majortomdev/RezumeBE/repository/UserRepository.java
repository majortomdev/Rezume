package com.majortomdev.RezumeBE.repository;

import com.majortomdev.RezumeBE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/* Created by JKinahan */
public interface UserRepository extends JpaRepository<User, Long> {
}
