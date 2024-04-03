/*
package com.dev.pos.controller;

import com.dev.pos.dto.PersonDTORedis;
import com.dev.pos.service.PersonServiceRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class PersonControllerRedis {

    @Autowired
    private PersonServiceRedis personServiceRedis;

    @PostMapping
    public ResponseEntity<String> savePerson(@RequestBody PersonDTORedis person){
        boolean result = personServiceRedis.savePerson(person);
        if(result)
            return ResponseEntity.ok("Data Person Saved Sucess");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping
    public ResponseEntity<List<PersonDTORedis>> fetchAllPerson(){
        List<PersonDTORedis> person;
        person = personServiceRedis.fetchAllPerson();
        return ResponseEntity.ok(person);
    }


}
*/
