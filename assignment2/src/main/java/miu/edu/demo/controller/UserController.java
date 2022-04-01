package miu.edu.demo.controller;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.User;
import miu.edu.demo.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
   // @Autowired
    UserService userService;

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") long id){
        return userService.findById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.save(user);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") long id){
        userService.deleteById(id);
    }
    @GetMapping("/{id}/posts")
    public List<Post> findUserPosts(@PathVariable("id") long id){
        return userService.findUserPosts(id);
    }

}
