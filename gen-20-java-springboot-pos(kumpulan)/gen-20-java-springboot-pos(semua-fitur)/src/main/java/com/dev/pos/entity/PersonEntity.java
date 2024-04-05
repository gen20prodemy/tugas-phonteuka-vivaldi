package com.dev.pos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Entity
@Table(name="person")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PersonEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
}
