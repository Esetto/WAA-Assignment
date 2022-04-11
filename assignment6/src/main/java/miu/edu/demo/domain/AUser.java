package miu.edu.demo.domain;



import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Table(name = "users")
@Entity
public class AUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private List<Post> posts;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    private List<Role> roles;

}
