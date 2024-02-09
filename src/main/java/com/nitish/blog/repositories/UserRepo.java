package com.nitish.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitish.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
