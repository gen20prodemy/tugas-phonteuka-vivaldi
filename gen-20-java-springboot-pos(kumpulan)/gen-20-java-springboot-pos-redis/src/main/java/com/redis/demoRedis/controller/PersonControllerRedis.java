package com.redis.demoRedis.controller;

import com.redis.demoRedis.dto.PersonDTORedis;
import com.redis.demoRedis.service.PersonServiceRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class PersonControllerRedis {
    @Autowired
    private PersonServiceRedis personServiceRedis;


    @GetMapping("/getall")
    public List<PersonDTORedis> getAllCategoriesFromRedis() {
        return personServiceRedis.getCategoryRedis();
    }

    @PostMapping("/add")
    public PersonDTORedis addCategoryToRedis(@RequestBody PersonDTORedis personDTORedis) {
        return personServiceRedis.createCategoryRedis(personDTORedis);
    }
}
