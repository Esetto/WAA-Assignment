package miu.edu.demo.service;

import miu.edu.demo.domain.Comment;

import java.util.List;

public interface CommentService {
    void addComment(Comment c);
    List<Comment> getAll();

}
