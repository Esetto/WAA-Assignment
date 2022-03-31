package miu.edu.demo.repo;

import miu.edu.demo.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepo {
   private static List<Post> posts;
    static{
        posts = new ArrayList<>();
        Post p1 = new Post(11,"Rich Dad poor dad","business","Esei");
        Post p2 = new Post(12,"Head first","Computer","Kahsai");
        posts.add(p1);
        posts.add(p2);

    }
    public void save(Post p){
        posts.add(p);
    }
    public void delete(int i){
        posts.stream()
                .filter(l -> l.getId() == i)
                .forEach(l -> posts.remove(l));
    }
    public Post getById(int id){
        return posts.stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
