package miu.edu.demo.service;

import lombok.RequiredArgsConstructor;
import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.dto.PostDto;
import miu.edu.demo.helper.ListMapper;
import miu.edu.demo.repo.PostRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{
    @Autowired
    PostRepo postRepository;


    ModelMapper modelMapper;

    @Override
    public List<Post> findAll() {
//        var allPosts= postRepository.findAll();
//        return allPosts.stream().map(post->modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
        return postRepository.findAll();
    }

    @Override
    public Post findById(int id) {
//        var post= postRepository.findById((int) id);
//
//        Post post1= modelMapper.map(post, Post.class);
//        return post1;
        return postRepository.findById(id);
    }

    @Override
    public void addPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public void delete(long id) {

        postRepository.deleteById((int) id);
    }

    @Override
    public void update(long id, Post newPost) {
        postRepository.deleteById((int) id);
        postRepository.save(newPost);
    }
}
