package be.intecbrussel.blogapplication.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;
    private String title;
    private LocalDate postDate;

    @Lob
    private String textPost;

    @Lob
    private Byte[] image;


}
