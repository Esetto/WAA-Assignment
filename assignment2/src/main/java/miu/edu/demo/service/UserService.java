package miu.edu.demo.service;


import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.AUser;

import java.util.List;


public interface UserService {
    List<AUser> findAll();
    AUser findById(long id);
    void save(AUser user);
    void deleteById(long id);
    List<Post> findUserPosts(long id);
}
