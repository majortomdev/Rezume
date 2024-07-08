package com.majortomdev.RezumeBE.repository;

import com.majortomdev.RezumeBE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/* Created by JKinahan */
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail (String email);

    @Query("SELECT u FROM User u WHERE u.email = :email AND u.password= :password")
    public User checkIfUser(@Param("email") String email, @Param("password") String password);
}
