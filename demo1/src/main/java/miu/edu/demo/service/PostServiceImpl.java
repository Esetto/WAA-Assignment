package miu.edu.demo.service;

import lombok.RequiredArgsConstructor;
import miu.edu.demo.domain.Post;
import miu.edu.demo.repo.PostRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{
    private final PostRepo postRepo;
    @Override
    public void save(Post p) {
        postRepo.save(p);
    }

    @Override
    public void delete(int i) {
        postRepo.delete(i);
    }

    @Override
    public Post getById(int id) {
        return postRepo.getById(id);
    }
}
