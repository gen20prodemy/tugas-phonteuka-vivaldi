package com.dev.pos.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonDTORedis implements Serializable {
    private Long id;
    private String name;
    private int age;
}
