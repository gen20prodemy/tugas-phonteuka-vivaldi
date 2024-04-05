package com.dev.pos.controller;

import com.dev.pos.dto.PersonDTORedis;
import com.dev.pos.service.PersonServiceRedis;
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

/*

    @PostMapping
    public PersonEntity save(@RequestBody PersonEntity personEntity){
        return personRepoRedis.save(personEntity);
    }

    @GetMapping
    public List<PersonEntity> getAllPerson(){
        return personRepoRedis.findAll();
    }

    @GetMapping("/{id}")
    public PersonEntity findById(@PathVariable int id){
        return personRepoRedis.findPerson(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id){
        return personRepoRedis.delete(id);
    }

*/



}
