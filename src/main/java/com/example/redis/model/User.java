package com.example.redis.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import java.time.LocalDateTime;


@RedisHash("User")
@Data
public class User {

    @Id
    private String id; // Redis requires a string ID

    private int age;
    private String firstName;
    private String lastName;
    private LocalDateTime creationTime;
    private Long salary;

    // Constructors
    public User() {
        this.creationTime = LocalDateTime.now();
    }

    public User(String id, int age, String firstName, String lastName, Long salary) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationTime = LocalDateTime.now();
        this.salary = salary;
    }



}
