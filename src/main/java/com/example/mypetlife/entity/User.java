package com.example.mypetlife.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String username;
    private String email;
    private String password;
    private String phone;
    private String birthDate;
    private String petSpices;
    private LocalDate created_at;

    @OneToMany(mappedBy = "userId")
    private List<Calendar> calendars = new ArrayList<>();

    @OneToMany(mappedBy = "userId")
    private List<Review> reviews = new ArrayList<>();

    //==생성 메서드==//
    public static User createUser(String username, String email, String password, String phone, String birthDate, String petSpices) {

        User user = new User();
        user.username = username;
        user.email = email;
        user.password = password;
        user.phone = phone;
        user.birthDate = birthDate;
        user.petSpices = petSpices;
        user.created_at = LocalDate.now();

        return user;
    }
}
