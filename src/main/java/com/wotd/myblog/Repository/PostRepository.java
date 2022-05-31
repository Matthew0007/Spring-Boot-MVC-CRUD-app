package com.wotd.myblog.Repository;

import com.wotd.myblog.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Integer>{



}
