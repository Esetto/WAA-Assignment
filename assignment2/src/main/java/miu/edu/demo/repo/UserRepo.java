package miu.edu.demo.repo;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends CrudRepository<User,Integer> {
    List<User> findAll();
    User findById(long id);

    @Query("select u.posts from User u where u.id= :id")
    List<Post> findUserPosts(@Param("id") long id);
}
