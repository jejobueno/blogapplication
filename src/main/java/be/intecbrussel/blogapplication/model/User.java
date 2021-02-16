package be.intecbrussel.blogapplication.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Entity
@Table(name = "users")
public class User {

    public User(Long id, String userEmail, String password, String firstName, String lastName, Byte[] profileImage,
                String userBio) {
        this.id = id;
        this.userEmail = userEmail;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profileImage = profileImage;
        this.userBio = userBio;
    }

    public User(Long id, String userEmail, String password, String firstName, String lastName, Byte[] profileImage,
                String userBio, LocalDateTime birthDate, Gender gender, Collection<Role> roles) {
        this.id = id;
        this.userEmail = userEmail;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profileImage = profileImage;
        this.userBio = userBio;
        this.birthDate = birthDate;
        this.gender = gender;
        this.roles = roles;
    }

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_email", unique = true)
    private String userEmail;

    @Column(name="password")
    private String password;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Lob
    @Column(name="profile_image")
    private Byte[] profileImage;

    @Lob
    @Column(name="user_bio")
    private String userBio;

    @Column(name="birth_date")
    private LocalDateTime birthDate;

    @Column(name="gender")
    private Gender gender;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;


}
