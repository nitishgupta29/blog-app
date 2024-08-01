package com.nitish.blog.repositories;

import com.nitish.blog.entities.Category;
import com.nitish.blog.entities.Post;
import com.nitish.blog.entities.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
}
