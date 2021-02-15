package be.intecbrussel.blogapplication.model;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

public class User {
    private Long id;
    private String email;
    private String password;

    @OneToMany
    private Set<Post> posts = new HashSet<>();
}
