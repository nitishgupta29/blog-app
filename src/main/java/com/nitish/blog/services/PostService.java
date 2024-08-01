package com.nitish.blog.services;

import com.nitish.blog.entities.Post;
import com.nitish.blog.payloads.PostDto;
import java.util.List;

public interface PostService {

    // Create
    PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

    // Update
    PostDto updatePost(PostDto postDto, Integer postId);

    //delete
    void deletePost(Integer postId);

    // Get All Posts
    List<PostDto> getAllPosts();

    // Get Single Post
    PostDto getPostById(Integer postId);

    // Get All Posts by Category
    List<PostDto> getPostsByCategory(Integer categoryId);

    // Get All Posts by User
    List<PostDto> getPostsByUser(Integer userId);
}
