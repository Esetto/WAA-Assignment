package miu.edu.demo.service;


import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.User;

import java.util.List;


public interface UserService {
    List<User> findAll();
    User findById(long id);
    void save(User user);
    void deleteById(long id);
    List<Post> findUserPosts(long id);
}
