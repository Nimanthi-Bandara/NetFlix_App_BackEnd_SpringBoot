package com.Springboot.NetflixApp.Repository;

import com.Springboot.NetflixApp.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContaining(String title);

    @Modifying
    @Transactional
    @Query(value = "TRUNCATE TABLE movie",nativeQuery = true)
    Void truncateTable();
}

