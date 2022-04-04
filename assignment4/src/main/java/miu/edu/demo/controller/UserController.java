package miu.edu.demo.controller;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.AUser;
import miu.edu.demo.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

    @GetMapping
    public List<AUser> findAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public AUser findUserById(@PathVariable("id") long id){
        return userService.findById(id);
    }

    @PostMapping
    public void addUser(@RequestBody AUser user){
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
