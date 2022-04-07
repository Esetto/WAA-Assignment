package miu.edu.demo.repo;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.AUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends CrudRepository<AUser,Integer> {
    List<AUser> findAll();
    AUser findById(long id);

    @Query("select u.posts from AUser u where u.id= :id")
    List<Post> findUserPosts(@Param("id") long id);
}
