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
    public List<PostDto> findAll() {
        var allPosts= postRepository.findAll();
        return allPosts.stream().map(post->modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
    }

    @Override
    public Post findById(long id) {
        var post= postRepository.findById((int) id);

        Post post1= modelMapper.map(post, Post.class);
        return post1;
    }

    @Override
    public void addPost(Post post) {
        postRepository.save(modelMapper.map(post, Post.class));
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
