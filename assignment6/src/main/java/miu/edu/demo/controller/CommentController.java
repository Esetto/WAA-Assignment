package miu.edu.demo.controller;

import miu.edu.demo.domain.Comment;
import miu.edu.demo.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    CommentService commentService;
    @PostMapping
    public void save(@RequestBody Comment c){
        commentService.addComment( c);

    }
    @GetMapping
    public List<Comment> getComments(){
        return commentService.getAll();
    }
    @PutMapping("/{id}")
    public void addComment(@PathVariable("id") long id, @RequestBody Comment c){
        commentService.addComment(c);
    }
}
