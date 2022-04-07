package miu.edu.demo.service;

import miu.edu.demo.domain.Comment;
import miu.edu.demo.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentRepo commentRepo;

    @Override
    public void addComment(Comment c) {
        commentRepo.save(c);

    }

    @Override
    public List<Comment> getAll() {
        return (List<Comment>) commentRepo.findAll();


    }
}
