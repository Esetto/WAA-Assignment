package miu.edu.demo.service;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> findAll();
    Post findById(long id);
    void addPost(Post post);

    void delete(long id);

    void update(long id, Post newPost);
}
