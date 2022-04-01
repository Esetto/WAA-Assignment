package miu.edu.demo.service;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.User;
import miu.edu.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {

        userRepository.save(user);
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById((int) id);
    }

    @Override
    public List<Post> findUserPosts(long id) {
        return userRepository.findUserPosts(id);
    }
}
