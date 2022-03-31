package miu.edu.demo.service;

import miu.edu.demo.domain.Post;

public interface PostService {
    void save (Post p);
    void delete(int i);
    Post getById(int id);
}
