package miu.edu.demo.controller;

import miu.edu.demo.domain.Post;
import miu.edu.demo.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;
    public PostController(PostService postService){
        this.postService = postService;
    }
    @PostMapping
    public void save (@RequestBody Post p){
        postService.addPost(p);
    }
    @GetMapping
    public List<Post> getAll(){
        return postService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Post> getById(@PathVariable int id){
        var post = postService.findById(id);
        return  ResponseEntity.ok(post);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        postService.delete(id);
    }
}
