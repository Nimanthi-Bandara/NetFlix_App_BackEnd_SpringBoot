package com.Springboot.NetflixApp.Repository;

import com.Springboot.NetflixApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

        Optional<User> findUserByEmail(String email);

        @Modifying
        @Transactional
        @Query(value = "TRUNCATE TABLE user",nativeQuery = true)
        Void truncateTable();

    }

