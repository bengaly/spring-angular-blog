package com.bklabo.springboot.springangularblog.repository;

import com.bklabo.springboot.springangularblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
