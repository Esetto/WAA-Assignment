package miu.edu.demo.service;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.dto.PostDto;

import java.util.List;

public interface PostService {
    List<Post> findAll();
    Post findById(int id);
    void addPost(Post post);

    void delete(long id);

    void update(long id, Post newPost);
}
